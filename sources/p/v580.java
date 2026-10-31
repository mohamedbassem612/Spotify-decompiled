package p;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v580 implements p580 {
    public static v580 I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Class j;
    public final Class k;
    public final Class l;
    public final Class m;
    public final Class n;
    public final Class o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f159p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;
    public static final s580 G = new s580((byte) 1);
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    public v580(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = cls6;
        this.h = cls7;
        this.i = cls8;
        this.j = cls9;
        this.k = cls10;
        this.l = cls11;
        this.m = cls12;
        this.n = cls13;
        this.o = cls14;
        this.f159p = method;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method6;
        this.v = method7;
        this.w = method8;
        this.x = method9;
        this.y = method10;
        this.z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    public static final void b() {
        dhn.a.contains(v580.class);
    }

    @Override // p.p580
    public final void a(b680 b680Var, Runnable runnable) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            c(new c45(this, b680Var, runnable, (byte) 21));
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void c(Runnable runnable) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (H.get()) {
                runnable.run();
            } else {
                l(runnable);
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final Object d() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final String e(String str) {
        if (!dhn.a.contains(this)) {
            try {
                mbh0 mbh0VarM = mno1.m(Pattern.compile("jsonString='(.*?)'").matcher(str), 0, str);
                if (mbh0VarM != null) {
                    return (String) o7h.t0(1, mbh0VarM.a());
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object f(b680 b680Var, ArrayList arrayList) {
        Class cls = this.j;
        Class cls2 = this.l;
        if (!dhn.a.contains(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object objB = c680.B(cls2, c680.B(cls2, c680.B(cls2, c680.B(this.f, (Object) null, this.z, new Object[0]), this.B, new Object[]{(String) it.next()}), this.C, new Object[]{b680Var.a}), this.A, new Object[0]);
                        if (objB != null) {
                            arrayList2.add(objB);
                        }
                    }
                    return c680.B(cls, c680.B(cls, c680.B(this.h, (Object) null, this.w, new Object[0]), this.y, new Object[]{arrayList2}), this.x, new Object[0]);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object g(b680 b680Var) {
        Class cls = this.k;
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return c680.B(cls, c680.B(cls, c680.B(this.i, (Object) null, this.r, new Object[0]), this.t, new Object[]{b680Var.a}), this.s, new Object[0]);
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        if (dhn.a.contains(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (u890.j(c680.B(this.g, objArr2[0], this.F, new Object[0]), 0)) {
                H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        String strE;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Object objN0 = f46.n0(0, objArr);
            Object objN1 = objArr2 != null ? f46.n0(1, objArr2) : null;
            if (objN1 != null && (objN1 instanceof List)) {
                Iterator it = ((List) objN1).iterator();
                while (it.hasNext()) {
                    try {
                        Object objB = c680.B(this.d, it.next(), this.D, new Object[0]);
                        String str = objB instanceof String ? (String) objB : null;
                        if (str != null && (strE = e(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strE);
                            if (jSONObject.has("productId")) {
                                L.put(jSONObject.getString("productId"), jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (objN0 == null || !(objN0 instanceof Runnable)) {
                    return;
                }
                ((Runnable) objN0).run();
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void j(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objN0;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Object objN1 = f46.n0(0, objArr);
            if (objN1 != null && (objN1 instanceof b680)) {
                Object objN2 = f46.n0(1, objArr);
                if (objN2 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objN0 = f46.n0(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objN0 = null;
                    }
                    if (objN0 != null && (objN0 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objN0).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objB = c680.B(this.e, it.next(), this.u, new Object[0]);
                                String str = objB instanceof String ? (String) objB : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        if (!L.containsKey(string)) {
                                            arrayList.add(string);
                                        }
                                        if (objN1 == b680.INAPP) {
                                            J.put(string, jSONObject);
                                        } else {
                                            K.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objN2).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            b680 b680Var = (b680) objN1;
                            Runnable runnable = (Runnable) objN2;
                            try {
                                try {
                                    if (dhn.a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.c(new m2d((Object) this, (Object) runnable, (Object) b680Var, (Object) arrayList, (byte) 7));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                dhn.a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                dhn.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                dhn.a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final void k(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objN0;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Object objN1 = f46.n0(0, objArr);
            if (objN1 != null && (objN1 instanceof b680)) {
                Object objN2 = f46.n0(1, objArr);
                if (objN2 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objN0 = f46.n0(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objN0 = null;
                    }
                    if (objN0 != null && (objN0 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objN0).iterator();
                        while (it.hasNext()) {
                            Object objB = c680.B(this.c, it.next(), this.f159p, new Object[0]);
                            String str = objB instanceof String ? (String) objB : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!L.containsKey(string)) {
                                        arrayList.add(string);
                                    }
                                    if (objN1 == b680.INAPP) {
                                        J.put(string, jSONObject);
                                    } else {
                                        K.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objN2).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            b680 b680Var = (b680) objN1;
                            Runnable runnable = (Runnable) objN2;
                            try {
                                try {
                                    if (dhn.a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.c(new m2d((Object) this, (Object) runnable, (Object) b680Var, (Object) arrayList, (byte) 7));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                dhn.a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                dhn.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                dhn.a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final void l(Runnable runnable) {
        Class cls = this.m;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new t580(this, new Object[]{runnable}, (byte) 1));
            c680.B(this.b, d(), this.E, new Object[]{objNewProxyInstance});
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
