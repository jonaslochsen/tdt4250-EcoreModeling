/**
 */
package course;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Employment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see course.CoursePackage#getTypeOfEmployment()
 * @model
 * @generated
 */
public enum TypeOfEmployment implements Enumerator {
	/**
	 * The '<em><b>Student</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT(1, "Student", "Student"),

	/**
	 * The '<em><b>TA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TA_VALUE
	 * @generated
	 * @ordered
	 */
	TA(2, "TA", "TA"),

	/**
	 * The '<em><b>Lecturer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LECTURER_VALUE
	 * @generated
	 * @ordered
	 */
	LECTURER(3, "Lecturer", "Lecturer"),

	/**
	 * The '<em><b>Course Coordinator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURSE_COORDINATOR_VALUE
	 * @generated
	 * @ordered
	 */
	COURSE_COORDINATOR(4, "CourseCoordinator", "CourseCoordinator");

	/**
	 * The '<em><b>Student</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Student</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STUDENT
	 * @model name="Student"
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_VALUE = 1;

	/**
	 * The '<em><b>TA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TA_VALUE = 2;

	/**
	 * The '<em><b>Lecturer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lecturer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LECTURER
	 * @model name="Lecturer"
	 * @generated
	 * @ordered
	 */
	public static final int LECTURER_VALUE = 3;

	/**
	 * The '<em><b>Course Coordinator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Course Coordinator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COURSE_COORDINATOR
	 * @model name="CourseCoordinator"
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_COORDINATOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Of Employment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfEmployment[] VALUES_ARRAY =
		new TypeOfEmployment[] {
			STUDENT,
			TA,
			LECTURER,
			COURSE_COORDINATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Employment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfEmployment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Employment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfEmployment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfEmployment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Employment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfEmployment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfEmployment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Employment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfEmployment get(int value) {
		switch (value) {
			case STUDENT_VALUE: return STUDENT;
			case TA_VALUE: return TA;
			case LECTURER_VALUE: return LECTURER;
			case COURSE_COORDINATOR_VALUE: return COURSE_COORDINATOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeOfEmployment(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeOfEmployment
