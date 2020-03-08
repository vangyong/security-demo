/**
 * 
 */
package cn.segema.security.demo.validator;

import java.util.List;

import org.springframework.validation.ObjectError;

/**
 * @author wangyong
 *
 */
public class ValidateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7207451175263593487L;
	
	private List<ObjectError> errors;
	
	public ValidateException(List<ObjectError> errors) {
		this.errors = errors;
	}

	public List<ObjectError> getErrors() {
		return errors;
	}

	public void setErrors(List<ObjectError> errors) {
		this.errors = errors;
	}

}
