 SELECT v.id, v.nombre,v.edad,v.identificacion, MAX (l.no_paginas) as "max_paginas", 
 count(l.id) cant_libros,  v.id id_autor
	FROM public."autor" v JOIN public."libro" l ON 
	v.id = l.id_autor WHERE v.id = 1
	GROUP BY v.id ;
