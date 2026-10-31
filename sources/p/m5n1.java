package p;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m5n1 {
    public static yrg0 a = null;
    public static final int[] b = {2131429734, 2131429948, 2131430482, 2131431371, 2131431125, 2131431502, 2131428635};
    public static final int[] c = {2131427732, 2131428936, 2131428632};
    public static final int[] d = {2131429948, 2131429734};
    public static final int[] e = {2131431371, 2131430482, 2131431125, 2131431502};
    public static final Type[] f = new Type[0];
    public static boolean g = true;

    public static Type A(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbR = cy30.r(i, "Index ", " not in range [0,");
        sbR.append(actualTypeArguments.length);
        sbR.append(") for ");
        sbR.append(parameterizedType);
        throw new IllegalArgumentException(sbR.toString());
    }

    public static Class B(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            bhn0.q();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) B(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return B(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        hhg1.j(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static final String C(String str) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            uri = null;
        }
        if (uri != null) {
            return uri.getQueryParameter("shortlink_session_id");
        }
        return null;
    }

    public static long D(double d2) {
        dm5.n(J(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static Type E(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return U(type, cls, w(type, cls, Map.class));
        }
        bhn0.q();
        return null;
    }

    public static boolean F(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return F(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            hhg1.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (F(type2)) {
                return true;
            }
        }
        return false;
    }

    public static final void G(String str) {
        if (str.length() <= 0) {
            hhg1.n("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                eth.h(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void H(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                eth.h(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(w4n1.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static boolean I(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final boolean K(oma0 oma0Var, oma0 oma0Var2) {
        if (oed1.c()) {
            return rzn1.x(((rgt) oma0Var).D(), ((rgt) oma0Var2).D());
        }
        return p9w.k(p9w.c, new teb(false, false, false, e4x0.f, qa.b, ra.b), (b7) oma0Var, (b7) oma0Var2);
    }

    public static String L(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbT = l1d.t("<", str2, " threw ");
                    sbT.append(e2.getClass().getName());
                    sbT.append(">");
                    string = sbT.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static IllegalArgumentException M(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbG = dv20.g(String.format(str, objArr), "\n    for method ");
        sbG.append(method.getDeclaringClass().getSimpleName());
        sbG.append(".");
        sbG.append(method.getName());
        return new IllegalArgumentException(sbG.toString(), exc);
    }

    public static final ArrayList N(Map map, iu30 iu30Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            dnn0 dnn0Var = (dnn0) entry.getValue();
            Boolean boolValueOf = dnn0Var != null ? Boolean.valueOf(dnn0Var.b()) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !dnn0Var.a()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) iu30Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static IllegalArgumentException O(Method method, int i, String str, Object... objArr) {
        return M(method, null, gvg.h(str, " (", oct0.b.f(method, i), ")"), objArr);
    }

    public static IllegalArgumentException P(Method method, Exception exc, int i, String str, Object... objArr) {
        return M(method, exc, gvg.h(str, " (", oct0.b.f(method, i), ")"), objArr);
    }

    public static String Q(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int iJ = zod.J(encoded, -1234567890);
        zod.u(encoded.length, 0L, iJ);
        byte[] bArrZ = f46.Z(0, encoded, iJ);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrZ, 0, bArrZ.length);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        sb.append(new rhc(bArrDigest).b());
        return sb.toString();
    }

    public static String R(Intent intent) {
        da71 da71Var = da71.X0;
        Uri data = intent.getData();
        if (data == null) {
            hhg1.n("Intent data is null, cannot add shortlink_session_id");
            return null;
        }
        String str = (String) da71Var.invoke();
        intent.setData(X(data, str));
        return str;
    }

    public static final kbf0 S(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(2024497114);
        x340Var.j0(-610207850);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new kbf0();
            x340Var.s0(objT);
        }
        kbf0 kbf0Var = (kbf0) objT;
        x340Var.r(false);
        x340Var.r(false);
        return kbf0Var;
    }

    public static String T(int i, String str) {
        if (i <= 1) {
            dm5.l("invalid count: %s", i, i >= 0);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(l1d.l(j, "Required array size too large: "));
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type U(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeU;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeU2 = U(type, cls, componentType);
                        return componentType == typeU2 ? cls2 : new hpi1(typeU2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeU3 = U(type, cls, genericComponentType);
                    return genericComponentType == typeU3 ? genericArrayType : new hpi1(typeU3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeU4 = U(type, cls, ownerType);
                    boolean z = typeU4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeU5 = U(type, cls, actualTypeArguments[i]);
                        if (typeU5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeU5;
                        }
                        i++;
                    }
                    return z ? new kpi1(typeU4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeU6 = U(type, cls, lowerBounds[0]);
                        if (typeU6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new lpi1(new Type[]{Object.class}, new Type[]{typeU6});
                        }
                    } else if (upperBounds.length == 1 && (typeU = U(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new lpi1(new Type[]{typeU}, f);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeW = w(type, cls, cls3);
                if (typeW instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            hhg1.k();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeW).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static void V(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String W(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final Uri X(Uri uri, String str) {
        String string = uri.toString();
        l370 l370VarB = null;
        try {
            k370 k370Var = new k370();
            k370Var.f((l370) null, string);
            l370VarB = k370Var.b();
        } catch (IllegalArgumentException unused) {
        }
        if (l370VarB != null) {
            k370 k370VarG = l370VarB.g();
            k370VarG.j("shortlink_session_id", str);
            return Uri.parse(k370VarG.b().i);
        }
        if (!uri.isHierarchical()) {
            return uri;
        }
        k370 k370Var2 = new k370();
        k370Var2.i("https");
        k370Var2.e("localhost");
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            k370Var2.d(encodedQuery);
        }
        k370 k370VarG2 = k370Var2.b().g();
        k370VarG2.j("shortlink_session_id", str);
        return uri.buildUpon().encodedQuery(k370VarG2.b().d()).build();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c7 A[PHI: r22
      0x01c7: PHI (r22v3 boolean) = (r22v1 boolean), (r22v4 boolean) binds: [B:111:0x01c5, B:109:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0204  */
    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x021f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0232  */
    /* JADX WARN: Code duplicated, block: B:136:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f  */
    public static final void a(Class cls, qim0 qim0Var, pi30 pi30Var, Bundle bundle, w8c0 w8c0Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        pi30 pi30VarO;
        iu30 iu30Var2;
        boolean z;
        w8c0 w8c0Var2;
        pi30 pi30Var2;
        h311 h311VarV;
        w8c0 w8c0Var3;
        int i4;
        iu30 iu30Var3;
        pi30 pi30Var3;
        w8c0 w8c0Var4;
        Object objT;
        ven0 ven0VarV;
        int iK;
        View view;
        boolean zG;
        Object objT2;
        th30 th30Var;
        Context context;
        Object objT3;
        pg30 pg30Var;
        boolean zI;
        int i5;
        boolean z2;
        boolean z3;
        boolean zG2;
        Object objT4;
        pg30 pg30Var2;
        int i6;
        th30 th30Var2;
        boolean zI2;
        Object objT5;
        int i7;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1148251591);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(cls) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                pi30VarO = pi30Var;
                int i8 = x340Var.g(pi30VarO) ? 256 : 128;
                i3 |= i8;
            } else {
                pi30VarO = pi30Var;
            }
            i3 |= i8;
        } else {
            pi30VarO = pi30Var;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(bundle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i7 = 8192;
            } else {
                if (x340Var.e(w8c0Var == null ? -1 : w8c0Var.ordinal())) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
            }
            i3 |= i7;
        }
        int i9 = i2 & 32;
        if (i9 == 0) {
            if ((196608 & i) == 0) {
                iu30Var2 = iu30Var;
                i3 |= x340Var.i(iu30Var2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        pi30VarO = bbp1.o(x340Var);
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        w8c0Var3 = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
                        i3 &= -57345;
                    } else {
                        w8c0Var3 = w8c0Var;
                    }
                    if (i9 != 0) {
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = new z9((byte) 12);
                            x340Var.s0(objT);
                        }
                        pi30Var3 = pi30VarO;
                        w8c0Var4 = w8c0Var3;
                        i4 = i3;
                        iu30Var3 = (iu30) objT;
                    } else {
                        pi30 pi30Var4 = pi30VarO;
                        i4 = i3;
                        iu30Var3 = iu30Var2;
                        pi30Var3 = pi30Var4;
                        w8c0Var4 = w8c0Var3;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    pi30 pi30Var5 = pi30VarO;
                    i4 = i3;
                    iu30Var3 = iu30Var2;
                    pi30Var3 = pi30Var5;
                    w8c0Var4 = w8c0Var;
                }
                x340Var.s();
                ven0VarV = xto.v(iu30Var3, x340Var);
                iK = tgp1.k(x340Var);
                view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                zG = x340Var.g(view);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = th30.H(view);
                    x340Var.s0(objT2);
                }
                th30Var = (th30) objT2;
                context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new pg30(iK);
                    x340Var.s0(objT3);
                }
                pg30Var = (pg30) objT3;
                dm5.a(pg30Var, qim0Var, null, x340Var, i4 & 112, 4);
                Object[] objArr = {th30Var, pg30Var, cls, pi30Var3};
                iu30 iu30Var4 = iu30Var3;
                zI = ((((i4 & 896) ^ 384) <= 256 && x340Var.g(pi30Var3)) || (i4 & 384) == 256) | x340Var.i(th30Var) | x340Var.i(pg30Var) | x340Var.i(context) | x340Var.i(cls) | x340Var.i(bundle) | x340Var.e(iK);
                i5 = (57344 & i4) ^ 24576;
                if (i5 > 16384 || !x340Var.e(w8c0Var4.ordinal())) {
                    z2 = zI;
                    if ((i4 & 24576) != 16384) {
                        z3 = false;
                    }
                    zG2 = z2 | z3 | x340Var.g(ven0VarV);
                    objT4 = x340Var.T();
                    if (!zG2 || objT4 == m4cVar) {
                        pg30Var2 = pg30Var;
                        i6 = 16384;
                        th30Var2 = th30Var;
                        objT4 = new qj4(th30Var2, pg30Var2, context, cls, ven0VarV, pi30Var3, bundle, iK, w8c0Var4);
                        x340Var.s0(objT4);
                    } else {
                        pg30Var2 = pg30Var;
                        th30Var2 = th30Var;
                        i6 = 16384;
                    }
                    qxd0.j(objArr, (iu30) objT4, x340Var);
                    zI2 = x340Var.i(th30Var2) | x340Var.i(pg30Var2) | ((i5 <= i6 && x340Var.e(w8c0Var4.ordinal())) || (i4 & 24576) == i6);
                    objT5 = x340Var.T();
                    if (zI2 || objT5 == m4cVar) {
                        objT5 = new pg(th30Var2, pg30Var2, w8c0Var4, (byte) 1);
                        x340Var.s0(objT5);
                    }
                    qxd0.i(w8c0Var4, (iu30) objT5, x340Var);
                    pi30Var2 = pi30Var3;
                    w8c0Var2 = w8c0Var4;
                    iu30Var2 = iu30Var4;
                } else {
                    z2 = zI;
                }
                z3 = true;
                zG2 = z2 | z3 | x340Var.g(ven0VarV);
                objT4 = x340Var.T();
                if (zG2) {
                    pg30Var2 = pg30Var;
                    i6 = 16384;
                    th30Var2 = th30Var;
                    objT4 = new qj4(th30Var2, pg30Var2, context, cls, ven0VarV, pi30Var3, bundle, iK, w8c0Var4);
                    x340Var.s0(objT4);
                } else {
                    pg30Var2 = pg30Var;
                    i6 = 16384;
                    th30Var2 = th30Var;
                    objT4 = new qj4(th30Var2, pg30Var2, context, cls, ven0VarV, pi30Var3, bundle, iK, w8c0Var4);
                    x340Var.s0(objT4);
                }
                qxd0.j(objArr, (iu30) objT4, x340Var);
                zI2 = x340Var.i(th30Var2) | x340Var.i(pg30Var2) | ((i5 <= i6 && x340Var.e(w8c0Var4.ordinal())) || (i4 & 24576) == i6);
                objT5 = x340Var.T();
                if (zI2) {
                    objT5 = new pg(th30Var2, pg30Var2, w8c0Var4, (byte) 1);
                    x340Var.s0(objT5);
                } else {
                    objT5 = new pg(th30Var2, pg30Var2, w8c0Var4, (byte) 1);
                    x340Var.s0(objT5);
                }
                qxd0.i(w8c0Var4, (iu30) objT5, x340Var);
                pi30Var2 = pi30Var3;
                w8c0Var2 = w8c0Var4;
                iu30Var2 = iu30Var4;
            } else {
                x340Var.b0();
                w8c0Var2 = w8c0Var;
                pi30Var2 = pi30VarO;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rj4(cls, qim0Var, pi30Var2, bundle, w8c0Var2, iu30Var2, i, i2);
            }
        }
        i3 |= 196608;
        iu30Var2 = iu30Var;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    pi30VarO = bbp1.o(x340Var);
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    w8c0Var3 = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
                    i3 &= -57345;
                } else {
                    w8c0Var3 = w8c0Var;
                }
                if (i9 != 0) {
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = new z9((byte) 12);
                        x340Var.s0(objT);
                    }
                    pi30Var3 = pi30VarO;
                    w8c0Var4 = w8c0Var3;
                    i4 = i3;
                    iu30Var3 = (iu30) objT;
                } else {
                    pi30 pi30Var6 = pi30VarO;
                    i4 = i3;
                    iu30Var3 = iu30Var2;
                    pi30Var3 = pi30Var6;
                    w8c0Var4 = w8c0Var3;
                }
            } else {
                if ((i2 & 4) != 0) {
                    pi30VarO = bbp1.o(x340Var);
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    w8c0Var3 = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
                    i3 &= -57345;
                } else {
                    w8c0Var3 = w8c0Var;
                }
                if (i9 != 0) {
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = new z9((byte) 12);
                        x340Var.s0(objT);
                    }
                    pi30Var3 = pi30VarO;
                    w8c0Var4 = w8c0Var3;
                    i4 = i3;
                    iu30Var3 = (iu30) objT;
                } else {
                    pi30 pi30Var7 = pi30VarO;
                    i4 = i3;
                    iu30Var3 = iu30Var2;
                    pi30Var3 = pi30Var7;
                    w8c0Var4 = w8c0Var3;
                }
            }
            x340Var.s();
            ven0VarV = xto.v(iu30Var3, x340Var);
            iK = tgp1.k(x340Var);
            view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            zG = x340Var.g(view);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = th30.H(view);
                x340Var.s0(objT2);
            } else {
                objT2 = th30.H(view);
                x340Var.s0(objT2);
            }
            th30Var = (th30) objT2;
            context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new pg30(iK);
                x340Var.s0(objT3);
            }
            pg30Var = (pg30) objT3;
            dm5.a(pg30Var, qim0Var, null, x340Var, i4 & 112, 4);
            Object[] objArr2 = {th30Var, pg30Var, cls, pi30Var3};
            iu30 iu30Var5 = iu30Var3;
            zI = ((((i4 & 896) ^ 384) <= 256 && x340Var.g(pi30Var3)) || (i4 & 384) == 256) | x340Var.i(th30Var) | x340Var.i(pg30Var) | x340Var.i(context) | x340Var.i(cls) | x340Var.i(bundle) | x340Var.e(iK);
            i5 = (57344 & i4) ^ 24576;
            if (i5 > 16384) {
                z2 = zI;
                if ((i4 & 24576) != 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z2 = zI;
                if ((i4 & 24576) != 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            zG2 = z2 | z3 | x340Var.g(ven0VarV);
            objT4 = x340Var.T();
            if (zG2) {
                pg30Var2 = pg30Var;
                i6 = 16384;
                th30Var2 = th30Var;
                objT4 = new qj4(th30Var2, pg30Var2, context, cls, ven0VarV, pi30Var3, bundle, iK, w8c0Var4);
                x340Var.s0(objT4);
            } else {
                pg30Var2 = pg30Var;
                i6 = 16384;
                th30Var2 = th30Var;
                objT4 = new qj4(th30Var2, pg30Var2, context, cls, ven0VarV, pi30Var3, bundle, iK, w8c0Var4);
                x340Var.s0(objT4);
            }
            qxd0.j(objArr2, (iu30) objT4, x340Var);
            zI2 = x340Var.i(th30Var2) | x340Var.i(pg30Var2) | ((i5 <= i6 && x340Var.e(w8c0Var4.ordinal())) || (i4 & 24576) == i6);
            objT5 = x340Var.T();
            if (zI2) {
                objT5 = new pg(th30Var2, pg30Var2, w8c0Var4, (byte) 1);
                x340Var.s0(objT5);
            } else {
                objT5 = new pg(th30Var2, pg30Var2, w8c0Var4, (byte) 1);
                x340Var.s0(objT5);
            }
            qxd0.i(w8c0Var4, (iu30) objT5, x340Var);
            pi30Var2 = pi30Var3;
            w8c0Var2 = w8c0Var4;
            iu30Var2 = iu30Var5;
        } else {
            x340Var.b0();
            w8c0Var2 = w8c0Var;
            pi30Var2 = pi30VarO;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj4(cls, qim0Var, pi30Var2, bundle, w8c0Var2, iu30Var2, i, i2);
        }
    }

    public static final void b(boolean z, Function0 function0, String str, qim0 qim0Var, idn0 idn0Var, max maxVar, vu30 vu30Var, hw61 hw61Var, ga80 ga80Var, int i, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        idn0 idn0Var2;
        max maxVar2;
        vu30 vu30Var2;
        hw61 hw61Var2;
        ga80 ga80Var2;
        int i6;
        hw61 hw61VarL;
        ga80 ga80VarO;
        int i7;
        vu30 vu30Var3;
        idn0 idn0Var3;
        qim0 qim0Var3;
        max maxVar3;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-356952923);
        int i9 = i2 | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | 316238848;
        int i10 = i4 & 1024;
        if (i10 != 0) {
            i5 = 6;
        } else if ((i3 & 6) == 0) {
            i5 = i3 | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (x340Var.Y(i9 & 1, ((306783379 & i9) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                idn0 idn0VarY = zso1.Y(x340Var);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = lgx.Y;
                    x340Var.s0(objT);
                }
                vu30 vu30Var4 = (vu30) objT;
                hw61VarL = rno1.l(x340Var);
                ga80VarO = vno1.o(hw61VarL, x340Var, 0);
                int i11 = i9 & (-2114387969);
                nim0 nim0Var = nim0.a;
                jax jaxVar = jax.a;
                if (i10 != 0) {
                    i7 = i11;
                    vu30Var3 = vu30Var4;
                    idn0Var3 = idn0VarY;
                    i8 = 1;
                    maxVar3 = jaxVar;
                    qim0Var3 = nim0Var;
                } else {
                    i7 = i11;
                    vu30Var3 = vu30Var4;
                    idn0Var3 = idn0VarY;
                    qim0Var3 = nim0Var;
                    maxVar3 = jaxVar;
                    i8 = i;
                }
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                idn0Var3 = idn0Var;
                maxVar3 = maxVar;
                hw61VarL = hw61Var;
                ga80VarO = ga80Var;
                i8 = i;
                i7 = i9 & (-2114387969);
                vu30Var3 = vu30Var;
            }
            x340Var.s();
            x340Var.i0(355333145);
            x340Var.r(false);
            vu30 vu30Var5 = vu30Var3;
            c(z, function0, apo.r(-341743899, new qeu(str, (byte) 18), x340Var), qim0Var3, null, idn0Var3, maxVar3, vu30Var5, hw61VarL, ga80VarO, i8, x340Var, (i7 & 112) | (i7 & 14) | 384 | 14158848, i5 & 14, 0);
            qim0Var2 = qim0Var3;
            idn0Var2 = idn0Var3;
            maxVar2 = maxVar3;
            vu30Var2 = vu30Var5;
            hw61Var2 = hw61VarL;
            ga80Var2 = ga80VarO;
            i6 = i8;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
            maxVar2 = maxVar;
            vu30Var2 = vu30Var;
            hw61Var2 = hw61Var;
            ga80Var2 = ga80Var;
            i6 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new txx(z, function0, str, qim0Var2, idn0Var2, maxVar2, vu30Var2, hw61Var2, ga80Var2, i6, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x013c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:139:0x019b A[PHI: r2 r8 r9 r10 r11 r13 r15 r16 r17
      0x019b: PHI (r2v37 p.qim0) = (r2v20 p.qim0), (r2v42 p.qim0) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r8v9 p.vu30) = (r8v5 p.vu30), (r8v10 p.vu30) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r9v13 p.idn0) = (r9v7 p.idn0), (r9v14 p.idn0) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r10v12 p.max) = (r10v8 p.max), (r10v13 p.max) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r11v13 p.vu30) = (r11v6 p.vu30), (r11v14 p.vu30) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r13v15 int) = (r13v12 int), (r13v16 int) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r15v10 p.ga80) = (r15v4 p.ga80), (r15v11 p.ga80) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r16v12 int) = (r16v7 int), (r16v13 int) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r17v4 p.hw61) = (r17v2 p.hw61), (r17v5 p.hw61) binds: [B:168:0x01f0, B:138:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01de  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:172:0x0200  */
    /* JADX WARN: Code duplicated, block: B:175:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:181:0x02de  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void c(boolean z, Function0 function0, j2i j2iVar, qim0 qim0Var, vu30 vu30Var, idn0 idn0Var, max maxVar, vu30 vu30Var2, hw61 hw61Var, ga80 ga80Var, int i, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        Function0 function1;
        qim0 qim0Var2;
        int i6;
        vu30 vu30Var3;
        int i7;
        idn0 idn0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iC;
        int i14;
        boolean z2;
        x340 x340Var;
        max maxVar2;
        vu30 vu30Var4;
        ga80 ga80Var2;
        qim0 qim0Var3;
        vu30 vu30Var5;
        idn0 idn0Var3;
        hw61 hw61Var2;
        int i15;
        h311 h311VarV;
        int i16;
        jax jaxVar;
        qim0 qim0Var4;
        vu30 vu30Var6;
        idn0 idn0VarY;
        max maxVar3;
        vu30 vu30Var7;
        hw61 hw61VarL;
        ga80 ga80VarO;
        hw61 hw61Var3;
        int i17;
        int i18;
        int i19;
        Object objT;
        boolean z3;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2036930470);
        if ((i2 & 6) == 0) {
            i5 = (x340Var2.h(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function1 = function0;
            i5 |= x340Var2.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i2 & 384) == 0) {
            i5 |= x340Var2.i(j2iVar) ? 256 : 128;
        }
        int i20 = i4 & 8;
        if (i20 == 0) {
            if ((i2 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var2.g(qim0Var2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    vu30Var3 = vu30Var;
                    if (x340Var2.i(vu30Var3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0) {
                        idn0Var2 = idn0Var;
                        int i21 = x340Var2.g(idn0Var2) ? 131072 : 65536;
                        i5 |= i21;
                    } else {
                        idn0Var2 = idn0Var;
                    }
                    i5 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (x340Var2.g(maxVar)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (x340Var2.i(vu30Var2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((i2 & 100663296) != 0) {
                    i5 |= ((i4 & 256) == 0 || !x340Var2.g(hw61Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) != 0) {
                    i5 |= ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(ga80Var)) ? 268435456 : 536870912;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (i == 0) {
                        iC = -1;
                    } else {
                        iC = l1d.C(i);
                    }
                    if (x340Var2.e(iC)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i3 | i14;
                } else {
                    i13 = i3;
                }
                if ((306783379 & i5) == 306783378 || (i13 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i5 & 1, z2)) {
                    x340Var2.d0();
                    i16 = i2 & 1;
                    jaxVar = jax.a;
                    if (i16 != 0 || x340Var2.E()) {
                        if (i20 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i6 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32) != 0) {
                            idn0VarY = zso1.Y(x340Var2);
                            i5 &= -458753;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if (i8 != 0) {
                            maxVar3 = jaxVar;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = lgx.X;
                                x340Var2.s0(objT);
                            }
                            vu30Var7 = (vu30) objT;
                        } else {
                            vu30Var7 = vu30Var2;
                        }
                        if ((i4 & 256) != 0) {
                            hw61VarL = rno1.l(x340Var2);
                            i5 &= -234881025;
                        } else {
                            hw61VarL = hw61Var;
                        }
                        if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                            i5 &= -1879048193;
                        } else {
                            ga80VarO = ga80Var;
                        }
                        hw61Var3 = hw61VarL;
                        i17 = 8388608;
                        i18 = i5;
                        if (i12 != 0) {
                            i19 = 1;
                        }
                        x340Var2.s();
                        qim0 qim0Var5 = qim0Var4;
                        z3 = (i18 & 29360128) == i17;
                        objT2 = x340Var2.T();
                        if (z3 || objT2 == m4cVar) {
                            objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                            x340Var2.s0(objT2);
                        }
                        pgx pgxVar = (pgx) objT2;
                        idn0 idn0Var4 = idn0VarY;
                        ga80 ga80Var3 = ga80VarO;
                        qim0 qim0VarP = dgo1.p(u291.u(qim0Var5, 0.0f, rjx.f(x340Var2, i19), 0.0f, 0.0f, 13), z, idn0Var4, ga80Var3, u890.j(maxVar3, jaxVar), new pm31(4), function1);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        x340Var = x340Var2;
                        max maxVar4 = maxVar3;
                        cwl1.b(qim0VarP, null, hw61Var3, pgxVar, uyn1.g(16.0f), maxVar4, z, idn0Var4, null, null, null, apo.r(-670541425, new cex(vu30Var6, j2iVar, (byte) 1), x340Var2), x340Var, ((i18 >> 18) & 896) | 100663296 | ((i18 >> 3) & 458752) | (3670016 & (i18 << 18)) | ((i18 << 6) & 29360128), 48, 1538);
                        ga80Var2 = ga80Var3;
                        qim0Var3 = qim0Var5;
                        vu30Var5 = vu30Var6;
                        vu30Var4 = vu30Var7;
                        hw61Var2 = hw61Var3;
                        maxVar2 = maxVar4;
                        i15 = i19;
                        idn0Var3 = idn0Var4;
                    } else {
                        x340Var2.b0();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            i5 &= -1879048193;
                        }
                        maxVar3 = maxVar;
                        hw61Var3 = hw61Var;
                        ga80VarO = ga80Var;
                        qim0Var4 = qim0Var2;
                        vu30Var6 = vu30Var3;
                        idn0VarY = idn0Var2;
                        i17 = 8388608;
                        vu30Var7 = vu30Var2;
                        i18 = i5;
                    }
                    i19 = i;
                    x340Var2.s();
                    qim0 qim0Var6 = qim0Var4;
                    if ((i18 & 29360128) == i17) {
                    }
                    objT2 = x340Var2.T();
                    if (z3) {
                        objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                        x340Var2.s0(objT2);
                    }
                    pgx pgxVar2 = (pgx) objT2;
                    idn0 idn0Var5 = idn0VarY;
                    ga80 ga80Var4 = ga80VarO;
                    qim0 qim0VarP2 = dgo1.p(u291.u(qim0Var6, 0.0f, rjx.f(x340Var2, i19), 0.0f, 0.0f, 13), z, idn0Var5, ga80Var4, u890.j(maxVar3, jaxVar), new pm31(4), function1);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    x340Var = x340Var2;
                    max maxVar5 = maxVar3;
                    cwl1.b(qim0VarP2, null, hw61Var3, pgxVar2, uyn1.g(16.0f), maxVar5, z, idn0Var5, null, null, null, apo.r(-670541425, new cex(vu30Var6, j2iVar, (byte) 1), x340Var2), x340Var, ((i18 >> 18) & 896) | 100663296 | ((i18 >> 3) & 458752) | (3670016 & (i18 << 18)) | ((i18 << 6) & 29360128), 48, 1538);
                    ga80Var2 = ga80Var4;
                    qim0Var3 = qim0Var6;
                    vu30Var5 = vu30Var6;
                    vu30Var4 = vu30Var7;
                    hw61Var2 = hw61Var3;
                    maxVar2 = maxVar5;
                    i15 = i19;
                    idn0Var3 = idn0Var5;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    maxVar2 = maxVar;
                    vu30Var4 = vu30Var2;
                    ga80Var2 = ga80Var;
                    qim0Var3 = qim0Var2;
                    vu30Var5 = vu30Var3;
                    idn0Var3 = idn0Var2;
                    hw61Var2 = hw61Var;
                    i15 = i;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new sxx(z, function0, j2iVar, qim0Var3, vu30Var5, idn0Var3, maxVar2, vu30Var4, hw61Var2, ga80Var2, i15, i2, i3, i4);
                }
            }
            i5 |= 24576;
            vu30Var3 = vu30Var;
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var2.g(idn0Var2)) {
                    }
                    i5 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                i5 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (x340Var2.g(maxVar)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (x340Var2.i(vu30Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((i2 & 100663296) != 0) {
                i5 |= ((i4 & 256) == 0 || !x340Var2.g(hw61Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(ga80Var)) ? 268435456 : 536870912;
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
                i13 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var2.e(iC)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            if ((306783379 & i5) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i5 & 1, z2)) {
                x340Var2.d0();
                i16 = i2 & 1;
                jaxVar = jax.a;
                if (i16 != 0) {
                    if (i20 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i6 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -458753;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if (i8 != 0) {
                        maxVar3 = jaxVar;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = lgx.X;
                            x340Var2.s0(objT);
                        }
                        vu30Var7 = (vu30) objT;
                    } else {
                        vu30Var7 = vu30Var2;
                    }
                    if ((i4 & 256) != 0) {
                        hw61VarL = rno1.l(x340Var2);
                        i5 &= -234881025;
                    } else {
                        hw61VarL = hw61Var;
                    }
                    if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                        i5 &= -1879048193;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    hw61Var3 = hw61VarL;
                    i17 = 8388608;
                    i18 = i5;
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                } else {
                    if (i20 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i6 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -458753;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if (i8 != 0) {
                        maxVar3 = jaxVar;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = lgx.X;
                            x340Var2.s0(objT);
                        }
                        vu30Var7 = (vu30) objT;
                    } else {
                        vu30Var7 = vu30Var2;
                    }
                    if ((i4 & 256) != 0) {
                        hw61VarL = rno1.l(x340Var2);
                        i5 &= -234881025;
                    } else {
                        hw61VarL = hw61Var;
                    }
                    if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                        i5 &= -1879048193;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    hw61Var3 = hw61VarL;
                    i17 = 8388608;
                    i18 = i5;
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                }
                x340Var2.s();
                qim0 qim0Var7 = qim0Var4;
                if ((i18 & 29360128) == i17) {
                }
                objT2 = x340Var2.T();
                if (z3) {
                    objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                    x340Var2.s0(objT2);
                }
                pgx pgxVar3 = (pgx) objT2;
                idn0 idn0Var6 = idn0VarY;
                ga80 ga80Var5 = ga80VarO;
                qim0 qim0VarP3 = dgo1.p(u291.u(qim0Var7, 0.0f, rjx.f(x340Var2, i19), 0.0f, 0.0f, 13), z, idn0Var6, ga80Var5, u890.j(maxVar3, jaxVar), new pm31(4), function1);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                cvx cvxVar6 = cbx.b(x340Var2).b;
                x340Var = x340Var2;
                max maxVar6 = maxVar3;
                cwl1.b(qim0VarP3, null, hw61Var3, pgxVar3, uyn1.g(16.0f), maxVar6, z, idn0Var6, null, null, null, apo.r(-670541425, new cex(vu30Var6, j2iVar, (byte) 1), x340Var2), x340Var, ((i18 >> 18) & 896) | 100663296 | ((i18 >> 3) & 458752) | (3670016 & (i18 << 18)) | ((i18 << 6) & 29360128), 48, 1538);
                ga80Var2 = ga80Var5;
                qim0Var3 = qim0Var7;
                vu30Var5 = vu30Var6;
                vu30Var4 = vu30Var7;
                hw61Var2 = hw61Var3;
                maxVar2 = maxVar6;
                i15 = i19;
                idn0Var3 = idn0Var6;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                maxVar2 = maxVar;
                vu30Var4 = vu30Var2;
                ga80Var2 = ga80Var;
                qim0Var3 = qim0Var2;
                vu30Var5 = vu30Var3;
                idn0Var3 = idn0Var2;
                hw61Var2 = hw61Var;
                i15 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sxx(z, function0, j2iVar, qim0Var3, vu30Var5, idn0Var3, maxVar2, vu30Var4, hw61Var2, ga80Var2, i15, i2, i3, i4);
            }
        }
        i5 |= 3072;
        qim0Var2 = qim0Var;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                vu30Var3 = vu30Var;
                if (x340Var2.i(vu30Var3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var2.g(idn0Var2)) {
                    }
                    i5 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                i5 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (x340Var2.g(maxVar)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (x340Var2.i(vu30Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((i2 & 100663296) != 0) {
                i5 |= ((i4 & 256) == 0 || !x340Var2.g(hw61Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(ga80Var)) ? 268435456 : 536870912;
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
                i13 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var2.e(iC)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            if ((306783379 & i5) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i5 & 1, z2)) {
                x340Var2.d0();
                i16 = i2 & 1;
                jaxVar = jax.a;
                if (i16 != 0) {
                    if (i20 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i6 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -458753;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if (i8 != 0) {
                        maxVar3 = jaxVar;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = lgx.X;
                            x340Var2.s0(objT);
                        }
                        vu30Var7 = (vu30) objT;
                    } else {
                        vu30Var7 = vu30Var2;
                    }
                    if ((i4 & 256) != 0) {
                        hw61VarL = rno1.l(x340Var2);
                        i5 &= -234881025;
                    } else {
                        hw61VarL = hw61Var;
                    }
                    if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                        i5 &= -1879048193;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    hw61Var3 = hw61VarL;
                    i17 = 8388608;
                    i18 = i5;
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                } else {
                    if (i20 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i6 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -458753;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if (i8 != 0) {
                        maxVar3 = jaxVar;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = lgx.X;
                            x340Var2.s0(objT);
                        }
                        vu30Var7 = (vu30) objT;
                    } else {
                        vu30Var7 = vu30Var2;
                    }
                    if ((i4 & 256) != 0) {
                        hw61VarL = rno1.l(x340Var2);
                        i5 &= -234881025;
                    } else {
                        hw61VarL = hw61Var;
                    }
                    if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                        i5 &= -1879048193;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    hw61Var3 = hw61VarL;
                    i17 = 8388608;
                    i18 = i5;
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                }
                x340Var2.s();
                qim0 qim0Var8 = qim0Var4;
                if ((i18 & 29360128) == i17) {
                }
                objT2 = x340Var2.T();
                if (z3) {
                    objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                    x340Var2.s0(objT2);
                }
                pgx pgxVar4 = (pgx) objT2;
                idn0 idn0Var7 = idn0VarY;
                ga80 ga80Var6 = ga80VarO;
                qim0 qim0VarP4 = dgo1.p(u291.u(qim0Var8, 0.0f, rjx.f(x340Var2, i19), 0.0f, 0.0f, 13), z, idn0Var7, ga80Var6, u890.j(maxVar3, jaxVar), new pm31(4), function1);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                x340Var = x340Var2;
                max maxVar7 = maxVar3;
                cwl1.b(qim0VarP4, null, hw61Var3, pgxVar4, uyn1.g(16.0f), maxVar7, z, idn0Var7, null, null, null, apo.r(-670541425, new cex(vu30Var6, j2iVar, (byte) 1), x340Var2), x340Var, ((i18 >> 18) & 896) | 100663296 | ((i18 >> 3) & 458752) | (3670016 & (i18 << 18)) | ((i18 << 6) & 29360128), 48, 1538);
                ga80Var2 = ga80Var6;
                qim0Var3 = qim0Var8;
                vu30Var5 = vu30Var6;
                vu30Var4 = vu30Var7;
                hw61Var2 = hw61Var3;
                maxVar2 = maxVar7;
                i15 = i19;
                idn0Var3 = idn0Var7;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                maxVar2 = maxVar;
                vu30Var4 = vu30Var2;
                ga80Var2 = ga80Var;
                qim0Var3 = qim0Var2;
                vu30Var5 = vu30Var3;
                idn0Var3 = idn0Var2;
                hw61Var2 = hw61Var;
                i15 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sxx(z, function0, j2iVar, qim0Var3, vu30Var5, idn0Var3, maxVar2, vu30Var4, hw61Var2, ga80Var2, i15, i2, i3, i4);
            }
        }
        i5 |= 24576;
        vu30Var3 = vu30Var;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var2.g(idn0Var2)) {
                }
                i5 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            i5 |= i21;
        } else {
            idn0Var2 = idn0Var;
        }
        i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (x340Var2.g(maxVar)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i5 |= i9;
        }
        i10 = i4 & 128;
        if (i10 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (x340Var2.i(vu30Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        if ((i2 & 100663296) != 0) {
            i5 |= ((i4 & 256) == 0 || !x340Var2.g(hw61Var)) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) != 0) {
            i5 |= ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(ga80Var)) ? 268435456 : 536870912;
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
            i13 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var2.e(iC)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i3 | i14;
        } else {
            i13 = i3;
        }
        if ((306783379 & i5) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i5 & 1, z2)) {
            x340Var2.d0();
            i16 = i2 & 1;
            jaxVar = jax.a;
            if (i16 != 0) {
                if (i20 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i6 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var3;
                }
                if ((i4 & 32) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i5 &= -458753;
                } else {
                    idn0VarY = idn0Var2;
                }
                if (i8 != 0) {
                    maxVar3 = jaxVar;
                } else {
                    maxVar3 = maxVar;
                }
                if (i10 != 0) {
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = lgx.X;
                        x340Var2.s0(objT);
                    }
                    vu30Var7 = (vu30) objT;
                } else {
                    vu30Var7 = vu30Var2;
                }
                if ((i4 & 256) != 0) {
                    hw61VarL = rno1.l(x340Var2);
                    i5 &= -234881025;
                } else {
                    hw61VarL = hw61Var;
                }
                if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                    i5 &= -1879048193;
                } else {
                    ga80VarO = ga80Var;
                }
                hw61Var3 = hw61VarL;
                i17 = 8388608;
                i18 = i5;
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i;
                }
            } else {
                if (i20 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i6 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var3;
                }
                if ((i4 & 32) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i5 &= -458753;
                } else {
                    idn0VarY = idn0Var2;
                }
                if (i8 != 0) {
                    maxVar3 = jaxVar;
                } else {
                    maxVar3 = maxVar;
                }
                if (i10 != 0) {
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = lgx.X;
                        x340Var2.s0(objT);
                    }
                    vu30Var7 = (vu30) objT;
                } else {
                    vu30Var7 = vu30Var2;
                }
                if ((i4 & 256) != 0) {
                    hw61VarL = rno1.l(x340Var2);
                    i5 &= -234881025;
                } else {
                    hw61VarL = hw61Var;
                }
                if ((i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    ga80VarO = vno1.o(hw61VarL, x340Var2, (i5 >> 24) & 14);
                    i5 &= -1879048193;
                } else {
                    ga80VarO = ga80Var;
                }
                hw61Var3 = hw61VarL;
                i17 = 8388608;
                i18 = i5;
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i;
                }
            }
            x340Var2.s();
            qim0 qim0Var9 = qim0Var4;
            if ((i18 & 29360128) == i17) {
            }
            objT2 = x340Var2.T();
            if (z3) {
                objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                x340Var2.s0(objT2);
            } else {
                objT2 = new kgx(0, lgx.Z, null, vu30Var7, 5);
                x340Var2.s0(objT2);
            }
            pgx pgxVar5 = (pgx) objT2;
            idn0 idn0Var8 = idn0VarY;
            ga80 ga80Var7 = ga80VarO;
            qim0 qim0VarP5 = dgo1.p(u291.u(qim0Var9, 0.0f, rjx.f(x340Var2, i19), 0.0f, 0.0f, 13), z, idn0Var8, ga80Var7, u890.j(maxVar3, jaxVar), new pm31(4), function1);
            uwr uwrVar5 = cbx.a;
            cvx cvxVar9 = cbx.b(x340Var2).b;
            cvx cvxVar10 = cbx.b(x340Var2).b;
            x340Var = x340Var2;
            max maxVar8 = maxVar3;
            cwl1.b(qim0VarP5, null, hw61Var3, pgxVar5, uyn1.g(16.0f), maxVar8, z, idn0Var8, null, null, null, apo.r(-670541425, new cex(vu30Var6, j2iVar, (byte) 1), x340Var2), x340Var, ((i18 >> 18) & 896) | 100663296 | ((i18 >> 3) & 458752) | (3670016 & (i18 << 18)) | ((i18 << 6) & 29360128), 48, 1538);
            ga80Var2 = ga80Var7;
            qim0Var3 = qim0Var9;
            vu30Var5 = vu30Var6;
            vu30Var4 = vu30Var7;
            hw61Var2 = hw61Var3;
            maxVar2 = maxVar8;
            i15 = i19;
            idn0Var3 = idn0Var8;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            maxVar2 = maxVar;
            vu30Var4 = vu30Var2;
            ga80Var2 = ga80Var;
            qim0Var3 = qim0Var2;
            vu30Var5 = vu30Var3;
            idn0Var3 = idn0Var2;
            hw61Var2 = hw61Var;
            i15 = i;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxx(z, function0, j2iVar, qim0Var3, vu30Var5, idn0Var3, maxVar2, vu30Var4, hw61Var2, ga80Var2, i15, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z, gbx gbxVar, j2i j2iVar, qim0 qim0Var, idn0 idn0Var, max maxVar, long j, long j2, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        int i4;
        boolean z2;
        x340 x340Var;
        idn0 idn0Var2;
        max maxVar2;
        long j3;
        long j4;
        h311 h311VarV;
        qim0 qim0Var3;
        int i5;
        qim0 qim0Var4;
        idn0 idn0Var3;
        max maxVar3;
        boolean zF;
        Object objT;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1937033379);
        int i6 = (x340Var2.h(z) ? 4 : 2) | i | (x340Var2.g(gbxVar) ? 32 : 16);
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i6 |= x340Var2.g(qim0Var2) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i6 |= 24576;
            } else if ((i & 24576) == 0) {
                if (x340Var2.i(null)) {
                    i3 = 16384;
                } else {
                    i3 = 8192;
                }
                i6 |= i3;
            }
            i4 = i6 | 39387136;
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i4 & 1, z2)) {
                x340Var2.d0();
                if ((i & 1) != 0 || x340Var2.E()) {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    idn0 idn0VarY = zso1.Y(x340Var2);
                    uwr uwrVar = cbx.a;
                    j3 = cbx.a(x340Var2).b.a;
                    j4 = cbx.a(x340Var2).b.b;
                    i5 = i4 & (-264699905);
                    qim0Var4 = qim0Var3;
                    idn0Var3 = idn0VarY;
                    maxVar3 = jax.a;
                } else {
                    x340Var2.b0();
                    i5 = i4 & (-264699905);
                    idn0Var3 = idn0Var;
                    maxVar3 = maxVar;
                    j3 = j;
                    j4 = j2;
                    qim0Var4 = qim0Var2;
                }
                x340Var2.s();
                Function0 function0 = gbxVar.b;
                zF = x340Var2.f(j4) | x340Var2.f(j3);
                objT = x340Var2.T();
                if (zF || objT == fkj0.X) {
                    objT = new kz0((byte) 2, j4, j3);
                    x340Var2.s0(objT);
                }
                x340Var = x340Var2;
                c(z, function0, j2iVar, qim0Var4, null, idn0Var3, maxVar3, (vu30) objT, null, null, 0, x340Var, i5 & 4194190, 0, 1792);
                qim0Var2 = qim0Var4;
                idn0Var2 = idn0Var3;
                maxVar2 = maxVar3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                idn0Var2 = idn0Var;
                maxVar2 = maxVar;
                j3 = j;
                j4 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uxx(z, gbxVar, j2iVar, qim0Var2, idn0Var2, maxVar2, j3, j4, i, i2);
            }
        }
        i6 |= 3072;
        qim0Var2 = qim0Var;
        if ((i2 & 16) != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            if (x340Var2.i(null)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i6 |= i3;
        }
        i4 = i6 | 39387136;
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i4 & 1, z2)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                idn0 idn0VarY2 = zso1.Y(x340Var2);
                uwr uwrVar2 = cbx.a;
                j3 = cbx.a(x340Var2).b.a;
                j4 = cbx.a(x340Var2).b.b;
                i5 = i4 & (-264699905);
                qim0Var4 = qim0Var3;
                idn0Var3 = idn0VarY2;
                maxVar3 = jax.a;
            } else {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                idn0 idn0VarY3 = zso1.Y(x340Var2);
                uwr uwrVar3 = cbx.a;
                j3 = cbx.a(x340Var2).b.a;
                j4 = cbx.a(x340Var2).b.b;
                i5 = i4 & (-264699905);
                qim0Var4 = qim0Var3;
                idn0Var3 = idn0VarY3;
                maxVar3 = jax.a;
            }
            x340Var2.s();
            Function0 function1 = gbxVar.b;
            zF = x340Var2.f(j4) | x340Var2.f(j3);
            objT = x340Var2.T();
            if (zF) {
                objT = new kz0((byte) 2, j4, j3);
                x340Var2.s0(objT);
            } else {
                objT = new kz0((byte) 2, j4, j3);
                x340Var2.s0(objT);
            }
            x340Var = x340Var2;
            c(z, function1, j2iVar, qim0Var4, null, idn0Var3, maxVar3, (vu30) objT, null, null, 0, x340Var, i5 & 4194190, 0, 1792);
            qim0Var2 = qim0Var4;
            idn0Var2 = idn0Var3;
            maxVar2 = maxVar3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            idn0Var2 = idn0Var;
            maxVar2 = maxVar;
            j3 = j;
            j4 = j2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uxx(z, gbxVar, j2iVar, qim0Var2, idn0Var2, maxVar2, j3, j4, i, i2);
        }
    }

    public static void e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            bhn0.q();
        }
    }

    public static final void f(t360 t360Var, String str, String str2) {
        ArrayList arrayList = t360Var.a;
        arrayList.add(str);
        arrayList.add(ihc1.e1(str2).toString());
    }

    public static final v360 g(t360 t360Var) {
        return new v360((String[]) t360Var.a.toArray(new String[0]));
    }

    public static final String h(v360 v360Var, int i) {
        String str = (String) f46.n0(i * 2, v360Var.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final t360 i(v360 v360Var) {
        t360 t360Var = new t360();
        t360Var.a.addAll(f46.H(v360Var.a));
        return t360Var;
    }

    public static final String j(v360 v360Var, int i) {
        String str = (String) f46.n0((i * 2) + 1, v360Var.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static ObjectAnimator k(View view, omg1 omg1Var, int i, int i2, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator, tjk1 tjk1Var) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) omg1Var.b.getTag(2131431520);
        if (iArr != null) {
            f2 = (iArr[0] - i) + translationX;
            f3 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        if (f2 == f4 && f3 == f5) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f2, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f3, f5));
        bng1 bng1Var = new bng1(view, omg1Var.b, translationX, translationY);
        tjk1Var.a(bng1Var);
        objectAnimatorOfPropertyValuesHolder.addListener(bng1Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static final CompletableCreate l(en31 en31Var, iu30 iu30Var) {
        return j2h1.D(en31Var.j().C(fkj0.W0), new duo((byte) 1, (lnm) null, iu30Var, en31Var));
    }

    public static void m(i520 i520Var, s8s0 s8s0Var) {
        if (ero1.j(i520Var, s8s0Var)) {
            return;
        }
        try {
            i520Var.i(s8s0Var, false).close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final MaybeCreate n(en31 en31Var, iu30 iu30Var) {
        return cwl1.e0(en31Var.j().C(fkj0.W0), new k53(en31Var, iu30Var, null, (byte) 25));
    }

    public static final Observable o(en31 en31Var, String[] strArr, iu30 iu30Var) {
        return yoi1.i(f5p1.n(zno1.h(en31Var, false, strArr, iu30Var)), en31Var.j());
    }

    public static final Single p(en31 en31Var, iu30 iu30Var) {
        return rqt0.F(en31Var.j().C(fkj0.W0), new duo((byte) 2, (lnm) null, iu30Var, en31Var));
    }

    public static final void q(i520 i520Var, s8s0 s8s0Var) throws IOException {
        try {
            IOException iOException = null;
            for (s8s0 s8s0Var2 : i520Var.f(s8s0Var)) {
                try {
                    if (ero1.k(i520Var, s8s0Var2).c) {
                        q(i520Var, s8s0Var2);
                    }
                    i520Var.e(s8s0Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void r(DrawScope drawScope, be50 be50Var) {
        be50Var.c(drawScope.a1().p(), drawScope.a1().s());
    }

    public static boolean s(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return s(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static View t(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static long u(int i, int i2, int i3, int i4) throws KotlinNothingValueException {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    jjl.l(i6);
                    jah.d();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return jjl.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static long v(int i, int i2, int i3, int i4) throws KotlinNothingValueException {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    jjl.l(i6);
                    jah.d();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return jjl.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static Type w(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return w(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return w(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final Field x(mma0 mma0Var) {
        ic11 ic11VarC = bpi1.c(mma0Var);
        if (ic11VarC != null) {
            return ic11VarC.q();
        }
        return null;
    }

    public static final Method y(nla0 nla0Var) {
        rzc caller;
        dc11 dc11VarB = bpi1.b(nla0Var);
        Member memberB = (dc11VarB == null || (caller = dc11VarB.getCaller()) == null) ? null : caller.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final nma0 z(nma0 nma0Var) {
        return nma0Var.getDescriptor().b() ? nma0Var : new mep0(nma0Var);
    }
}
