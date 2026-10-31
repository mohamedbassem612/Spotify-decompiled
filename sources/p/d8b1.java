package p;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d8b1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final zgv f32p = new zgv((byte) 1);
    public static final zgv q = new zgv((byte) 2);
    public static final zgv r = new zgv((byte) 3);
    public static final zgv s = new zgv((byte) 4);
    public static final zgv t = new zgv((byte) 5);
    public static final zgv u = new zgv((byte) 0);
    public float a;
    public float b;
    public boolean c;
    public final jot d;
    public final l3p1 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public e8b1 m;
    public float n;
    public boolean o;

    public d8b1(jot jotVar) {
        zgv zgvVar = jot.Q0;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = jotVar;
        this.e = zgvVar;
        if (zgvVar == r || zgvVar == s || zgvVar == t) {
            this.j = 0.1f;
        } else if (zgvVar == u || zgvVar == f32p || zgvVar == q) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        e8b1 e8b1Var = this.m;
        if (e8b1Var == null) {
            e8b1Var = new e8b1(f);
            this.m = e8b1Var;
        }
        e8b1Var.i = f;
        e();
    }

    public final void b(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        ThreadLocal threadLocal = pd5.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new pd5());
        }
        pd5 pd5Var = (pd5) threadLocal.get();
        pd5Var.a.remove(this);
        ArrayList arrayList2 = pd5Var.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            pd5Var.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((chv) arrayList.get(i)).a(this, z, this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.z(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((dhv) arrayList.get(i)).h(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.b <= 0.0d) {
            hhg1.h("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.f) {
                this.o = true;
            }
        }
    }

    public final void e() {
        e8b1 e8b1Var = this.m;
        if (e8b1Var == null) {
            hhg1.h("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) e8b1Var.i;
        if (d > this.g) {
            hhg1.h("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d < this.h) {
            hhg1.h("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        e8b1Var.d = dAbs;
        e8b1Var.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.s(this.d);
        }
        float f = this.b;
        if (f > this.g || f < this.h) {
            hhg1.n("Starting value need to be in between min value and max value");
            return;
        }
        ThreadLocal threadLocal = pd5.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new pd5());
        }
        pd5 pd5Var = (pd5) threadLocal.get();
        ArrayList arrayList = pd5Var.b;
        if (arrayList.size() == 0) {
            g23 g23Var = pd5Var.d;
            if (g23Var == null) {
                g23Var = new g23(pd5Var.c);
                pd5Var.d = g23Var;
            }
            ((Choreographer) g23Var.c).postFrameCallback((od5) g23Var.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public d8b1(ir20 ir20Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new ahv(ir20Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
