package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class g370 {
    public final qo21 a;
    public final cxc b;
    public final t2n c;

    public g370(qo21 qo21Var, cxc cxcVar, t2n t2nVar) {
        this.a = qo21Var;
        this.b = cxcVar;
        this.c = t2nVar;
    }

    /* JADX WARN: Code duplicated, block: B:384:0x08d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:385:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:587:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static g370 b(gc31 gc31Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        rpr0 rpr0Var;
        int i;
        int i2;
        fho1[] fho1VarArr;
        int i3;
        int i4;
        rpr0 wpr0Var;
        rpr0 rpr0VarN;
        po21 po21Var = new po21(gc31Var, cls, method);
        Annotation[] annotationArr = po21Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            rpr0 rpr0Var2 = null;
            if (i6 >= length) {
                if (po21Var.o == null) {
                    throw m5n1.M(method, (Exception) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!po21Var.f65p) {
                    if (po21Var.r) {
                        throw m5n1.M(method, (Exception) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (po21Var.q) {
                        throw m5n1.M(method, (Exception) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = po21Var.e;
                int length2 = annotationArr2.length;
                po21Var.w = new fho1[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    fho1[] fho1VarArr2 = po21Var.w;
                    Type type = po21Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        rpr0Var = rpr0Var2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof g3i1) {
                                po21Var.c(i8, type);
                                if (po21Var.n) {
                                    throw m5n1.O(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (po21Var.j) {
                                    throw m5n1.O(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (po21Var.k) {
                                    throw m5n1.O(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (po21Var.l) {
                                    throw m5n1.O(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (po21Var.m) {
                                    throw m5n1.O(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (po21Var.s != null) {
                                    throw m5n1.O(method, i8, "@Url cannot be used with @%s URL", new Object[]{po21Var.o});
                                }
                                po21Var.n = true;
                                if (type != l370.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw m5n1.O(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                wpr0Var = new rpr0(method, i8, (byte) 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof t8s0;
                                gc31 gc31Var2 = po21Var.a;
                                if (z5) {
                                    po21Var.c(i8, type);
                                    if (po21Var.k) {
                                        throw m5n1.O(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (po21Var.l) {
                                        throw m5n1.O(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (po21Var.m) {
                                        throw m5n1.O(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (po21Var.n) {
                                        throw m5n1.O(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (po21Var.s == null) {
                                        throw m5n1.O(method, i8, "@Path can only be used with relative url on @%s", new Object[]{po21Var.o});
                                    }
                                    po21Var.j = true;
                                    t8s0 t8s0Var = (t8s0) annotation;
                                    String strValue = t8s0Var.value();
                                    if (!po21.z.matcher(strValue).matches()) {
                                        throw m5n1.O(method, i8, "@Path parameter name must match %s. Found: %s", new Object[]{po21.y.pattern(), strValue});
                                    }
                                    if (!po21Var.v.contains(strValue)) {
                                        throw m5n1.O(method, i8, "URL \"%s\" does not contain \"{%s}\".", new Object[]{po21Var.s, strValue});
                                    }
                                    gc31Var2.e(type, annotationArr3);
                                    wpr0Var = new tpr0(po21Var.c, i8, strValue, t8s0Var.encoded());
                                } else {
                                    i2 = i10;
                                    fho1VarArr = fho1VarArr2;
                                    if (annotation instanceof u0z0) {
                                        po21Var.c(i8, type);
                                        u0z0 u0z0Var = (u0z0) annotation;
                                        String strValue2 = u0z0Var.value();
                                        boolean zEncoded = u0z0Var.encoded();
                                        i3 = i9;
                                        Class clsB = m5n1.B(type);
                                        i4 = length3;
                                        po21Var.k = true;
                                        if (Iterable.class.isAssignableFrom(clsB)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw m5n1.O(method, i8, clsB.getSimpleName() + " must include generic type (e.g., " + clsB.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            gc31Var2.e(m5n1.A(0, (ParameterizedType) type), annotationArr3);
                                            wpr0Var = new qpr0(strValue2, zEncoded, (byte) 1).r();
                                        } else if (clsB.isArray()) {
                                            gc31Var2.e(po21.a(clsB.getComponentType()), annotationArr3);
                                            wpr0Var = new qpr0(strValue2, zEncoded, (byte) 1).n();
                                        } else {
                                            gc31Var2.e(type, annotationArr3);
                                            wpr0Var = new qpr0(strValue2, zEncoded, (byte) 1);
                                        }
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof d1z0) {
                                            po21Var.c(i8, type);
                                            boolean zEncoded2 = ((d1z0) annotation).encoded();
                                            Class clsB2 = m5n1.B(type);
                                            po21Var.l = true;
                                            if (Iterable.class.isAssignableFrom(clsB2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw m5n1.O(method, i8, clsB2.getSimpleName() + " must include generic type (e.g., " + clsB2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                gc31Var2.e(m5n1.A(0, (ParameterizedType) type), annotationArr3);
                                                wpr0Var = new upr0(zEncoded2).r();
                                            } else if (clsB2.isArray()) {
                                                gc31Var2.e(po21.a(clsB2.getComponentType()), annotationArr3);
                                                wpr0Var = new upr0(zEncoded2).n();
                                            } else {
                                                gc31Var2.e(type, annotationArr3);
                                                wpr0Var = new upr0(zEncoded2);
                                            }
                                        } else if (annotation instanceof c1z0) {
                                            po21Var.c(i8, type);
                                            Class clsB3 = m5n1.B(type);
                                            po21Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsB3)) {
                                                throw m5n1.O(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeE = m5n1.E(type, clsB3);
                                            if (!(typeE instanceof ParameterizedType)) {
                                                throw m5n1.O(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeE;
                                            Type typeA = m5n1.A(0, parameterizedType);
                                            if (String.class != typeA) {
                                                throw m5n1.O(method, i8, "@QueryMap keys must be of type String: " + typeA, new Object[0]);
                                            }
                                            gc31Var2.e(m5n1.A(1, parameterizedType), annotationArr3);
                                            wpr0Var = new ppr0(method, i8, ((c1z0) annotation).encoded(), (byte) 2);
                                        } else {
                                            str = str;
                                            if (annotation instanceof dv50) {
                                                po21Var.c(i8, type);
                                                dv50 dv50Var = (dv50) annotation;
                                                String strValue3 = dv50Var.value();
                                                Class clsB4 = m5n1.B(type);
                                                if (Iterable.class.isAssignableFrom(clsB4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw m5n1.O(method, i8, clsB4.getSimpleName() + " must include generic type (e.g., " + clsB4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    gc31Var2.e(m5n1.A(0, (ParameterizedType) type), annotationArr3);
                                                    wpr0Var = new qpr0(strValue3, dv50Var.allowUnsafeNonAsciiValues(), (byte) 0).r();
                                                } else if (clsB4.isArray()) {
                                                    gc31Var2.e(po21.a(clsB4.getComponentType()), annotationArr3);
                                                    wpr0Var = new qpr0(strValue3, dv50Var.allowUnsafeNonAsciiValues(), (byte) 0).n();
                                                } else {
                                                    gc31Var2.e(type, annotationArr3);
                                                    wpr0Var = new qpr0(strValue3, dv50Var.allowUnsafeNonAsciiValues(), (byte) 0);
                                                }
                                            } else if (annotation instanceof o160) {
                                                if (type == v360.class) {
                                                    wpr0Var = new rpr0(method, i8, (byte) 0);
                                                } else {
                                                    po21Var.c(i8, type);
                                                    Class clsB5 = m5n1.B(type);
                                                    if (!Map.class.isAssignableFrom(clsB5)) {
                                                        throw m5n1.O(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeE2 = m5n1.E(type, clsB5);
                                                    if (!(typeE2 instanceof ParameterizedType)) {
                                                        throw m5n1.O(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeE2;
                                                    Type typeA2 = m5n1.A(0, parameterizedType2);
                                                    if (String.class != typeA2) {
                                                        throw m5n1.O(method, i8, "@HeaderMap keys must be of type String: " + typeA2, new Object[0]);
                                                    }
                                                    gc31Var2.e(m5n1.A(1, parameterizedType2), annotationArr3);
                                                    wpr0Var = new ppr0(method, i8, ((o160) annotation).allowUnsafeNonAsciiValues(), (byte) 1);
                                                }
                                            } else if (annotation instanceof o120) {
                                                po21Var.c(i8, type);
                                                if (!po21Var.q) {
                                                    throw m5n1.O(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                o120 o120Var = (o120) annotation;
                                                String strValue4 = o120Var.value();
                                                boolean zEncoded3 = o120Var.encoded();
                                                po21Var.g = true;
                                                Class clsB6 = m5n1.B(type);
                                                if (Iterable.class.isAssignableFrom(clsB6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw m5n1.O(method, i8, clsB6.getSimpleName() + " must include generic type (e.g., " + clsB6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    gc31Var2.e(m5n1.A(0, (ParameterizedType) type), annotationArr3);
                                                    wpr0Var = new opr0(strValue4, zEncoded3).r();
                                                } else if (clsB6.isArray()) {
                                                    gc31Var2.e(po21.a(clsB6.getComponentType()), annotationArr3);
                                                    wpr0Var = new opr0(strValue4, zEncoded3).n();
                                                } else {
                                                    gc31Var2.e(type, annotationArr3);
                                                    wpr0Var = new opr0(strValue4, zEncoded3);
                                                }
                                            } else if (annotation instanceof g220) {
                                                po21Var.c(i8, type);
                                                if (!po21Var.q) {
                                                    throw m5n1.O(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsB7 = m5n1.B(type);
                                                if (!Map.class.isAssignableFrom(clsB7)) {
                                                    throw m5n1.O(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeE3 = m5n1.E(type, clsB7);
                                                if (!(typeE3 instanceof ParameterizedType)) {
                                                    throw m5n1.O(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeE3;
                                                Type typeA3 = m5n1.A(0, parameterizedType3);
                                                if (String.class != typeA3) {
                                                    throw m5n1.O(method, i8, "@FieldMap keys must be of type String: " + typeA3, new Object[0]);
                                                }
                                                gc31Var2.e(m5n1.A(1, parameterizedType3), annotationArr3);
                                                po21Var.g = true;
                                                wpr0Var = new ppr0(method, i8, ((g220) annotation).encoded(), (byte) 0);
                                            } else if (annotation instanceof wzr0) {
                                                po21Var.c(i8, type);
                                                if (!po21Var.r) {
                                                    throw m5n1.O(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                wzr0 wzr0Var = (wzr0) annotation;
                                                po21Var.h = true;
                                                String strValue5 = wzr0Var.value();
                                                Class clsB8 = m5n1.B(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsB8);
                                                    rpr0 rpr0Var3 = vpr0.d;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw m5n1.O(method, i8, clsB8.getSimpleName() + " must include generic type (e.g., " + clsB8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!jwm0.class.isAssignableFrom(m5n1.B(m5n1.A(0, (ParameterizedType) type)))) {
                                                            throw m5n1.O(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        wpr0Var = rpr0Var3.r();
                                                    } else if (clsB8.isArray()) {
                                                        if (!jwm0.class.isAssignableFrom(clsB8.getComponentType())) {
                                                            throw m5n1.O(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        wpr0Var = rpr0Var3.n();
                                                    } else {
                                                        if (!jwm0.class.isAssignableFrom(clsB8)) {
                                                            throw m5n1.O(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        wpr0Var = rpr0Var3;
                                                    }
                                                } else {
                                                    v360 v360VarV = dm5.V(new String[]{"Content-Disposition", f4i1.f("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", wzr0Var.encoding()});
                                                    if (Iterable.class.isAssignableFrom(clsB8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw m5n1.O(method, i8, clsB8.getSimpleName() + " must include generic type (e.g., " + clsB8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeA4 = m5n1.A(0, (ParameterizedType) type);
                                                        if (jwm0.class.isAssignableFrom(m5n1.B(typeA4))) {
                                                            throw m5n1.O(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        rpr0VarN = new spr0(method, i8, v360VarV, gc31Var2.c(typeA4, annotationArr3, annotationArr)).r();
                                                    } else if (clsB8.isArray()) {
                                                        Class clsA = po21.a(clsB8.getComponentType());
                                                        if (jwm0.class.isAssignableFrom(clsA)) {
                                                            throw m5n1.O(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        rpr0VarN = new spr0(method, i8, v360VarV, gc31Var2.c(clsA, annotationArr3, annotationArr)).n();
                                                    } else {
                                                        if (jwm0.class.isAssignableFrom(clsB8)) {
                                                            throw m5n1.O(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        wpr0Var = new spr0(method, i8, v360VarV, gc31Var2.c(type, annotationArr3, annotationArr));
                                                    }
                                                    wpr0Var = rpr0VarN;
                                                }
                                            } else if (annotation instanceof xzr0) {
                                                po21Var.c(i8, type);
                                                if (!po21Var.r) {
                                                    throw m5n1.O(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                po21Var.h = true;
                                                Class clsB9 = m5n1.B(type);
                                                if (!Map.class.isAssignableFrom(clsB9)) {
                                                    throw m5n1.O(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeE4 = m5n1.E(type, clsB9);
                                                if (!(typeE4 instanceof ParameterizedType)) {
                                                    throw m5n1.O(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeE4;
                                                Type typeA5 = m5n1.A(0, parameterizedType4);
                                                if (String.class != typeA5) {
                                                    throw m5n1.O(method, i8, "@PartMap keys must be of type String: " + typeA5, new Object[0]);
                                                }
                                                Type typeA6 = m5n1.A(1, parameterizedType4);
                                                if (jwm0.class.isAssignableFrom(m5n1.B(typeA6))) {
                                                    throw m5n1.O(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                wpr0Var = new spr0(method, i8, gc31Var2.c(typeA6, annotationArr3, annotationArr), ((xzr0) annotation).encoding());
                                            } else if (annotation instanceof elb) {
                                                po21Var.c(i8, type);
                                                if (po21Var.q || po21Var.r) {
                                                    throw m5n1.O(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (po21Var.i) {
                                                    throw m5n1.O(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    t2n t2nVarC = gc31Var2.c(type, annotationArr3, annotationArr);
                                                    po21Var.i = true;
                                                    wpr0Var = new npr0(method, i8, t2nVarC);
                                                } catch (RuntimeException e) {
                                                    throw m5n1.P(method, e, i8, "Unable to create @Body converter for %s", new Object[]{type});
                                                }
                                            } else if (annotation instanceof rod1) {
                                                po21Var.c(i8, type);
                                                Class clsA2 = po21.a(m5n1.B(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    fho1 fho1Var = po21Var.w[i12];
                                                    if ((fho1Var instanceof wpr0) && ((wpr0) fho1Var).d.equals(clsA2)) {
                                                        throw m5n1.O(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + oct0.b.f(method, i12) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                wpr0Var = new wpr0(clsA2);
                                            } else {
                                                wpr0Var = null;
                                            }
                                        }
                                    }
                                    str = str;
                                }
                                if (wpr0Var != null) {
                                    if (rpr0Var == null) {
                                        throw m5n1.O(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    rpr0Var = wpr0Var;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                fho1VarArr2 = fho1VarArr;
                                length3 = i4;
                                str = str;
                            }
                            i2 = i10;
                            fho1VarArr = fho1VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (wpr0Var != null) {
                                if (rpr0Var == null) {
                                    throw m5n1.O(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                rpr0Var = wpr0Var;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            fho1VarArr2 = fho1VarArr;
                            length3 = i4;
                            str = str;
                        }
                    } else {
                        rpr0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    fho1[] fho1VarArr3 = fho1VarArr2;
                    int i15 = i9;
                    if (rpr0Var == null) {
                        if (i15 != 0) {
                            try {
                                if (m5n1.B(type) == lnm.class) {
                                    po21Var.x = true;
                                    rpr0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw m5n1.O(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    fho1VarArr3[i8] = rpr0Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    rpr0Var2 = null;
                }
                String str3 = str;
                if (po21Var.s == null && !po21Var.n) {
                    throw m5n1.M(method, (Exception) null, "Missing either @%s URL or @Url parameter.", new Object[]{po21Var.o});
                }
                boolean z6 = po21Var.q;
                if (!z6 && !po21Var.r && !po21Var.f65p && po21Var.i) {
                    throw m5n1.M(method, (Exception) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !po21Var.g) {
                    throw m5n1.M(method, (Exception) null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (po21Var.r && !po21Var.h) {
                    throw m5n1.M(method, (Exception) null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                qo21 qo21Var = new qo21(po21Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (m5n1.F(genericReturnType2)) {
                    throw m5n1.M(method, (Exception) null, "Method return type must not include a type variable or wildcard: %s", new Object[]{genericReturnType2});
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw m5n1.M(method, (Exception) null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = qo21Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeA7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeA7 instanceof WildcardType) {
                        typeA7 = ((WildcardType) typeA7).getLowerBounds()[0];
                    }
                    if (m5n1.B(typeA7) == sy21.class && (typeA7 instanceof ParameterizedType)) {
                        typeA7 = m5n1.A(0, (ParameterizedType) typeA7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (m5n1.B(typeA7) == dxc.class) {
                            throw m5n1.M(method, (Exception) null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", new Object[]{m5n1.A(0, (ParameterizedType) typeA7)});
                        }
                        z3 = m5n1.g && typeA7 == rih1.class;
                        z2 = false;
                    }
                    genericReturnType = new kpi1(null, dxc.class, typeA7);
                    if (!m5n1.I(annotations, h591.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = i591.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    fxc fxcVarA = gc31Var.a(genericReturnType, annotations);
                    Type typeB = fxcVarA.b();
                    if (typeB == ry21.class) {
                        throw m5n1.M(method, (Exception) null, "'" + m5n1.B(typeB).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeB == sy21.class) {
                        throw m5n1.M(method, (Exception) null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (qo21Var.d.equals(str3) && !Void.class.equals(typeB) && (!m5n1.g || typeB != rih1.class)) {
                        throw m5n1.M(method, (Exception) null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        t2n t2nVarD = gc31Var.d(typeB, method.getAnnotations());
                        cxc cxcVar = gc31Var.b;
                        if (z7) {
                            return z2 ? new e370(qo21Var, cxcVar, t2nVarD, fxcVarA, (byte) 1) : new f370(qo21Var, cxcVar, t2nVarD, fxcVarA, z);
                        }
                        return new e370(qo21Var, cxcVar, t2nVarD, fxcVarA, (byte) 0);
                    } catch (RuntimeException e2) {
                        throw m5n1.M(method, e2, "Unable to create converter for %s", new Object[]{typeB});
                    }
                } catch (RuntimeException e3) {
                    throw m5n1.M(method, e3, "Unable to create call adapter for %s", new Object[]{genericReturnType});
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof juo) {
                po21Var.b("DELETE", ((juo) annotation2).value(), false);
            } else if (annotation2 instanceof ay30) {
                po21Var.b("GET", ((ay30) annotation2).value(), false);
            } else if (annotation2 instanceof nr50) {
                po21Var.b("HEAD", ((nr50) annotation2).value(), false);
            } else if (annotation2 instanceof yxq0) {
                po21Var.b("PATCH", ((yxq0) annotation2).value(), true);
            } else if (annotation2 instanceof wyq0) {
                po21Var.b("POST", ((wyq0) annotation2).value(), true);
            } else if (annotation2 instanceof yyq0) {
                po21Var.b("PUT", ((yyq0) annotation2).value(), true);
            } else if (annotation2 instanceof bfp0) {
                po21Var.b("OPTIONS", ((bfp0) annotation2).value(), false);
            } else if (annotation2 instanceof pr50) {
                pr50 pr50Var = (pr50) annotation2;
                po21Var.b(pr50Var.method(), pr50Var.path(), pr50Var.hasBody());
            } else if (annotation2 instanceof u360) {
                u360 u360Var = (u360) annotation2;
                String[] strArrValue = u360Var.value();
                if (strArrValue.length == 0) {
                    throw m5n1.M(method, (Exception) null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = u360Var.allowUnsafeNonAsciiValues();
                t360 t360Var = new t360();
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw m5n1.M(method, (Exception) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[]{str4});
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            se11 se11Var = r8i0.e;
                            po21Var.u = bmq0.w(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw m5n1.M(method, e4, "Malformed content type: %s", new Object[]{strTrim});
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        m5n1.G(strSubstring);
                        m5n1.f(t360Var, strSubstring, strTrim);
                    } else {
                        t360Var.b(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                po21Var.t = m5n1.g(t360Var);
            } else if (annotation2 instanceof iwm0) {
                if (po21Var.q) {
                    throw m5n1.M(method, (Exception) null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                po21Var.r = true;
            } else if (!(annotation2 instanceof fe30)) {
                continue;
            } else {
                if (po21Var.r) {
                    throw m5n1.M(method, (Exception) null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                po21Var.q = true;
            }
            i6++;
        }
    }

    public abstract Object a(wyp0 wyp0Var, Object[] objArr);
}
