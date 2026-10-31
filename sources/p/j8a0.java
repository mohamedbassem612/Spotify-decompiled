package p;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j8a0 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final heg e;
    public static final kf30 f;
    public static final heg g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final LinkedHashSet n;
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        uv30 uv30Var = uv30.d;
        sb.append(uv30Var.a);
        sb.append('.');
        sb.append(uv30Var.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        vv30 vv30Var = vv30.d;
        sb2.append(vv30Var.a);
        sb2.append('.');
        sb2.append(vv30Var.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        xv30 xv30Var = xv30.d;
        sb3.append(xv30Var.a);
        sb3.append('.');
        sb3.append(xv30Var.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        wv30 wv30Var = wv30.d;
        sb4.append(wv30Var.a);
        sb4.append('.');
        sb4.append(wv30Var.b);
        d = sb4.toString();
        heg hegVarN = mka.n(new kf30("kotlin.jvm.functions.FunctionN"));
        e = hegVarN;
        f = hegVarN.a();
        g = ebb1.r;
        d(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new LinkedHashSet();
        heg hegVarN2 = mka.n(rfb1.B);
        kf30 kf30Var = rfb1.J;
        kf30 kf30Var2 = hegVarN2.a;
        i8a0 i8a0Var = new i8a0(d(Iterable.class), hegVarN2, new heg(kf30Var2, oap1.H(kf30Var, kf30Var2), false));
        heg hegVarN3 = mka.n(rfb1.A);
        kf30 kf30Var3 = rfb1.I;
        kf30 kf30Var4 = hegVarN3.a;
        i8a0 i8a0Var2 = new i8a0(d(Iterator.class), hegVarN3, new heg(kf30Var4, oap1.H(kf30Var3, kf30Var4), false));
        heg hegVarN4 = mka.n(rfb1.C);
        kf30 kf30Var5 = rfb1.K;
        kf30 kf30Var6 = hegVarN4.a;
        i8a0 i8a0Var3 = new i8a0(d(Collection.class), hegVarN4, new heg(kf30Var6, oap1.H(kf30Var5, kf30Var6), false));
        heg hegVarN5 = mka.n(rfb1.D);
        kf30 kf30Var7 = rfb1.L;
        kf30 kf30Var8 = hegVarN5.a;
        i8a0 i8a0Var4 = new i8a0(d(List.class), hegVarN5, new heg(kf30Var8, oap1.H(kf30Var7, kf30Var8), false));
        heg hegVarN6 = mka.n(rfb1.F);
        kf30 kf30Var9 = rfb1.N;
        kf30 kf30Var10 = hegVarN6.a;
        i8a0 i8a0Var5 = new i8a0(d(Set.class), hegVarN6, new heg(kf30Var10, oap1.H(kf30Var9, kf30Var10), false));
        heg hegVarN7 = mka.n(rfb1.E);
        kf30 kf30Var11 = rfb1.M;
        kf30 kf30Var12 = hegVarN7.a;
        i8a0 i8a0Var6 = new i8a0(d(ListIterator.class), hegVarN7, new heg(kf30Var12, oap1.H(kf30Var11, kf30Var12), false));
        kf30 kf30Var13 = rfb1.G;
        heg hegVarN8 = mka.n(kf30Var13);
        kf30 kf30Var14 = rfb1.O;
        kf30 kf30Var15 = hegVarN8.a;
        i8a0 i8a0Var7 = new i8a0(d(Map.class), hegVarN8, new heg(kf30Var15, oap1.H(kf30Var14, kf30Var15), false));
        heg hegVarD = mka.n(kf30Var13).d(rfb1.H.a.g());
        kf30 kf30Var16 = rfb1.P;
        kf30 kf30Var17 = hegVarD.a;
        List<i8a0> listM = p7h.M(i8a0Var, i8a0Var2, i8a0Var3, i8a0Var4, i8a0Var5, i8a0Var6, i8a0Var7, new i8a0(d(Map.Entry.class), hegVarD, new heg(kf30Var17, oap1.H(kf30Var16, kf30Var17), false)));
        o = listM;
        c(Object.class, rfb1.a);
        c(String.class, rfb1.f);
        c(CharSequence.class, rfb1.e);
        a(d(Throwable.class), mka.n(rfb1.k));
        c(Cloneable.class, rfb1.c);
        c(Number.class, rfb1.i);
        a(d(Comparable.class), mka.n(rfb1.l));
        c(Enum.class, rfb1.j);
        a(d(Annotation.class), mka.n(rfb1.s));
        for (i8a0 i8a0Var8 : listM) {
            heg hegVar = i8a0Var8.a;
            heg hegVar2 = i8a0Var8.b;
            heg hegVar3 = i8a0Var8.c;
            a(hegVar, hegVar2);
            b(hegVar3.a(), hegVar);
            l.put(hegVar3, hegVar2);
            m.put(hegVar2, hegVar3);
            kf30 kf30VarA = hegVar2.a();
            kf30 kf30VarA2 = hegVar3.a();
            j.put(hegVar3.a().a, kf30VarA);
            k.put(kf30VarA.a, kf30VarA2);
        }
        for (nja0 nja0Var : nja0.values()) {
            a(mka.n(nja0Var.d), mka.n(sfb1.l.a(nja0Var.c().a)));
        }
        for (heg hegVar4 : hxh.a) {
            a(mka.n(new kf30("kotlin.jvm.internal." + hegVar4.f().b() + "CompanionObject")), hegVar4.d(moa1.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a(mka.n(new kf30(f4i1.c(i2, "kotlin.jvm.functions.Function"))), new heg(sfb1.l, ajn0.e("Function" + i2)));
            b(new kf30(gvg.l(new StringBuilder(), b, i2)), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            b(new kf30(gvg.l(new StringBuilder(), d, i3)), g);
        }
        b(new kf30("kotlin.concurrent.atomics.AtomicInt"), d(AtomicInteger.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicLong"), d(AtomicLong.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicBoolean"), d(AtomicBoolean.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicReference"), d(AtomicReference.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicIntArray"), d(AtomicIntegerArray.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicLongArray"), d(AtomicLongArray.class));
        b(new kf30("kotlin.concurrent.atomics.AtomicArray"), d(AtomicReferenceArray.class));
        b(rfb1.b.i(), d(Void.class));
    }

    public static void a(heg hegVar, heg hegVar2) {
        h.put(hegVar.a().a, hegVar2);
        b(hegVar2.a(), hegVar);
    }

    public static void b(kf30 kf30Var, heg hegVar) {
        n.add(kf30Var);
        i.put(kf30Var.a, hegVar);
    }

    public static void c(Class cls, lf30 lf30Var) {
        a(d(cls), mka.n(lf30Var.i()));
    }

    public static heg d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? mka.n(new kf30(cls.getCanonicalName())) : d(declaringClass).d(ajn0.e(cls.getSimpleName()));
    }

    public static boolean e(lf30 lf30Var, String str, boolean z) {
        String str2 = lf30Var.a;
        if (nhc1.Y(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!ihc1.R0(strSubstring, '0')) {
                Integer numC0 = nhc1.c0(strSubstring);
                int i2 = z ? 22 : 23;
                if (numC0 != null && numC0.intValue() >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static heg f(kf30 kf30Var) {
        return (heg) h.get(kf30Var.a);
    }

    public static heg g(lf30 lf30Var) {
        if (e(lf30Var, a, false) || e(lf30Var, c, true)) {
            return e;
        }
        return (e(lf30Var, b, false) || e(lf30Var, d, true)) ? g : (heg) i.get(lf30Var);
    }

    public static kf30 h(lf30 lf30Var) {
        return (kf30) k.get(lf30Var);
    }
}
