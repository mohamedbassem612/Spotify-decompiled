package p;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class rfb1 {
    public static final kf30 A;
    public static final kf30 B;
    public static final kf30 C;
    public static final kf30 D;
    public static final kf30 E;
    public static final kf30 F;
    public static final kf30 G;
    public static final kf30 H;
    public static final kf30 I;
    public static final kf30 J;
    public static final kf30 K;
    public static final kf30 L;
    public static final kf30 M;
    public static final kf30 N;
    public static final kf30 O;
    public static final kf30 P;
    public static final lf30 Q;
    public static final heg R;
    public static final heg S;
    public static final heg T;
    public static final heg U;
    public static final heg V;
    public static final kf30 W;
    public static final kf30 X;
    public static final kf30 Y;
    public static final kf30 Z;
    public static final kf30 a0;
    public static final kf30 b0;
    public static final kf30 c0;
    public static final lf30 d;
    public static final HashSet d0;
    public static final lf30 e;
    public static final HashSet e0;
    public static final lf30 f;
    public static final HashMap f0;
    public static final lf30 g;
    public static final HashMap g0;
    public static final lf30 h;
    public static final lf30 i;
    public static final lf30 j;
    public static final kf30 k;
    public static final kf30 l;
    public static final kf30 m;
    public static final kf30 n;
    public static final kf30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kf30 f73p;
    public static final kf30 q;
    public static final kf30 r;
    public static final kf30 s;
    public static final kf30 t;
    public static final kf30 u;
    public static final kf30 v;
    public static final kf30 w;
    public static final kf30 x;
    public static final kf30 y;
    public static final kf30 z;
    public static final lf30 a = d("Any").a;
    public static final lf30 b = d("Nothing").a;
    public static final lf30 c = d("Cloneable").a;

    static {
        d("Suppress");
        d = d("Unit").a;
        e = d("CharSequence").a;
        f = d("String").a;
        g = d("Array").a;
        h = d("Boolean").a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").a;
        j = d("Enum").a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        kf30 kf30Var = sfb1.o;
        kf30Var.a(ajn0.e("IntRange"));
        kf30Var.a(ajn0.e("LongRange"));
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        f73p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        kf30 kf30VarD = d("ParameterName");
        r = kf30VarD;
        mka.n(kf30VarD);
        s = d("Annotation");
        kf30 kf30VarA = a("Target");
        t = kf30VarA;
        mka.n(kf30VarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        kf30 kf30VarA2 = a("Retention");
        w = kf30VarA2;
        mka.n(kf30VarA2);
        mka.n(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        sfb1.f80p.a(ajn0.e("AccessibleLateinitPropertyLiteral"));
        kf30 kf30Var2 = new kf30("kotlin.internal.PlatformDependent");
        z = kf30Var2;
        mka.n(kf30Var2);
        d("IntroducedAt");
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        kf30 kf30VarB = b("Map");
        G = kf30VarB;
        H = kf30VarB.a(ajn0.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        kf30 kf30VarB2 = b("MutableMap");
        O = kf30VarB2;
        P = kf30VarB2.a(ajn0.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        lf30 lf30VarE = e("KProperty");
        e("KMutableProperty");
        R = mka.n(lf30VarE.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        kf30 kf30VarD2 = d("UByte");
        kf30 kf30VarD3 = d("UShort");
        kf30 kf30VarD4 = d("UInt");
        kf30 kf30VarD5 = d("ULong");
        S = mka.n(kf30VarD2);
        T = mka.n(kf30VarD3);
        U = mka.n(kf30VarD4);
        V = mka.n(kf30VarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        HashSet hashSetR = h4p1.r(tnw0.values().length);
        for (tnw0 tnw0Var : tnw0.values()) {
            hashSetR.add(tnw0Var.a);
        }
        d0 = hashSetR;
        HashSet hashSetR2 = h4p1.r(tnw0.values().length);
        for (tnw0 tnw0Var2 : tnw0.values()) {
            hashSetR2.add(tnw0Var2.b);
        }
        e0 = hashSetR2;
        HashMap mapQ = h4p1.q(tnw0.values().length);
        for (tnw0 tnw0Var3 : tnw0.values()) {
            mapQ.put(d(tnw0Var3.a.b()).a, tnw0Var3);
        }
        f0 = mapQ;
        HashMap mapQ2 = h4p1.q(tnw0.values().length);
        for (tnw0 tnw0Var4 : tnw0.values()) {
            mapQ2.put(d(tnw0Var4.b.b()).a, tnw0Var4);
        }
        g0 = mapQ2;
    }

    public static kf30 a(String str) {
        return sfb1.m.a(ajn0.e(str));
    }

    public static kf30 b(String str) {
        return sfb1.n.a(ajn0.e(str));
    }

    public static kf30 c(String str) {
        return sfb1.q.a(ajn0.e(str));
    }

    public static kf30 d(String str) {
        return sfb1.l.a(ajn0.e(str));
    }

    public static final lf30 e(String str) {
        return sfb1.i.a(ajn0.e(str)).a;
    }
}
