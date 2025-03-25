/*
 * Авторское право принадлежит Антону Александровичу Астафьеву <anton@astafiev.me> ѱ 2025.
 * Все права защищены и охраняются законом.
 * Copyright (c) 2025 Anton Astafiev <anton@astafiev.me>. All rights reserved.
 *
 * Собственная лицензия Астафьева
 * Данный программный код является собственностью Астафьева Антона Александровича
 * и может быть использован только с его личного разрешения
 */

package dk.mada.jaxrs.model.api;

import java.util.List;
import java.util.Optional;

/**
 * @author Антон А. Астафьев {@literal <anton@astafiev.me>} (Anton A. Astafiev)
 * @version 0.3 (2025)
 */
public interface OperationBase {
	Optional<String> operationId();

	HttpMethod httpMethod();

	List<String> tags();
}
