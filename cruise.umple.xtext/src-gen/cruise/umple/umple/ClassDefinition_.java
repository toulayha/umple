/**
 * <copyright>
 * </copyright>
 *
 */
package cruise.umple.umple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cruise.umple.umple.ClassDefinition_#getName_1 <em>Name 1</em>}</li>
 *   <li>{@link cruise.umple.umple.ClassDefinition_#getClassContent_1 <em>Class Content 1</em>}</li>
 * </ul>
 * </p>
 *
 * @see cruise.umple.umple.UmplePackage#getClassDefinition_()
 * @model
 * @generated
 */
public interface ClassDefinition_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Name 1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name 1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name 1</em>' attribute.
   * @see #setName_1(String)
   * @see cruise.umple.umple.UmplePackage#getClassDefinition__Name_1()
   * @model
   * @generated
   */
  String getName_1();

  /**
   * Sets the value of the '{@link cruise.umple.umple.ClassDefinition_#getName_1 <em>Name 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name 1</em>' attribute.
   * @see #getName_1()
   * @generated
   */
  void setName_1(String value);

  /**
   * Returns the value of the '<em><b>Class Content 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.ClassContent_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Content 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Content 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getClassDefinition__ClassContent_1()
   * @model containment="true"
   * @generated
   */
  EList<ClassContent_> getClassContent_1();

} // ClassDefinition_
