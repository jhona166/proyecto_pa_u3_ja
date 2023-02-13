package com.example.demo.uce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante est = this.buscar(id);
		this.entityManager.remove(est);
	}
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre ='Jhonatan' ---->SQL
		//select e from Estudiante e where e.nombre =:datoNombre  ---->JPQL
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre=:datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido=:datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre=:datoNombre",Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre",Estudiante.class);//Sentencia SQL
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	
	
	
	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre=:datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return  jpqlQuery.getResultList();
		
	}

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager
				.createQuery("select NEW com.example.demo.uce.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula,e.genero) from Estudiante e where e.nombre = :datoNombre ", EstudianteDTO.class);
		//Con provincia se sigue el proce con un new p
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder= this.entityManager.getCriteriaBuilder();		
		//Especificamos el tipo de retorno de mi Query 
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		//Aqui empezamos a crear el SQL
		//Definiendo el FROM-Root
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);//FROM Estudiante
		
		//Las condiciones WHERE se conocen en CriteriaAPIQuery como predicados
		//e.nombre =:datoNombre
		
		Predicate condicion1=myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		myQuery.select(miTablaFrom).where(condicion1);
		//Declarado/armado myQuery
		//La ejecucion del query lo realizamos con cualquier tipo ya conocido: TypedQuery
		TypedQuery<Estudiante> mySQL =this.entityManager.createQuery(myQuery);
		return mySQL.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder= this.entityManager.getCriteriaBuilder();		
		//Especificamos el tipo de retorno de mi Query 
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		//Aqui empezamos a crear el SQL
		//Definiendo el FROM-Root
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);//FROM Estudiante
		
		
		//M: e.nombre= AND e.apellido
		//F: e.nombre= OR e.apellido
		//Creamos los predicados
		//Predicado del nombre
		Predicate p1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		
		//Predicado del apellido
		Predicate p2 = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		Predicate predicadoFinal = null;
		if(genero.equals("M")) {
			
			predicadoFinal=myBuilder.and(p1,p2);
		}else {
			
			predicadoFinal=myBuilder.or(p1,p2);
		}
		myQuery.select(miTablaFrom).where(predicadoFinal);
		TypedQuery<Estudiante> mySQL =this.entityManager.createQuery(myQuery);
		
		return mySQL.getResultList();
		
		
				
	}

	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//DELETE FROM estudiante WHERE estu_apellido='Teran'
		Query query = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.apellido=:apellido");
		query.setParameter("apellido", apellido);
		
		
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		//UPDATE estudiante set estu_nombre='Edison' WHERE estu_apellido='Cayambe'
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre=:datoNombre WHERE e.apellido=:datoApellido");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoApellido", apellido);
		
		return query.executeUpdate();
	}
	
	@Override
	public int actualizarPorCedula(String cedula, String apellido) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.apellido=:datoApellido WHERE e.cedula=:datoCedula");
		query.setParameter("datoApellido", apellido);
		query.setParameter("datoCedula", cedula);
		
		return query.executeUpdate();
	
	}

	@Override
	public int actualizarPorCiudad(String ciudad, String cedula) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.cedula=:datoCedula WHERE e.ciudad=:datoCiudad");
		query.setParameter("datoCedula", cedula);
		query.setParameter("datoCiudad", ciudad);
		
		return query.executeUpdate();
	}

	@Override
	public int eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		//DELETE FROM estudiante WHERE estu_apellido='Teran'
		Query query = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.cedula=:cedula");
		query.setParameter("cedula", cedula);
				
		return query.executeUpdate();
	}

	@Override
	public int eliminarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		//DELETE FROM estudiante WHERE estu_apellido='Teran'
		Query query = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.ciudad=:ciudad");
		query.setParameter("ciudad", ciudad);
				
		return query.executeUpdate();
	}
	
	
	


	
	
	
		
	
}
