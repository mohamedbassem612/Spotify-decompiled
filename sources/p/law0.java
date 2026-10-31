package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class law0 extends e4i1 {
    public static final z9w0 v = new z9w0();
    public static final ScheduledExecutorService w = x2g0.A();
    public haw0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f85p;
    public va61 q;
    public g280 r;
    public n3d1 s;
    public j4d1 t;
    public wa61 u;

    public final void B() {
        wa61 wa61Var = this.u;
        if (wa61Var != null) {
            wa61Var.b();
            this.u = null;
        }
        g280 g280Var = this.r;
        if (g280Var != null) {
            g280Var.a();
            this.r = null;
        }
        n3d1 n3d1Var = this.s;
        if (n3d1Var != null) {
            n3d1Var.b();
            this.s = null;
        }
        this.t = null;
    }

    public final void C(haw0 haw0Var) {
        w8p1.m();
        if (haw0Var == null) {
            this.o = null;
            this.c = 2;
            o();
            return;
        }
        this.o = haw0Var;
        this.f85p = w;
        i29 i29Var = this.g;
        if ((i29Var != null ? i29Var.a : null) != null) {
            D((qbw0) this.f, i29Var);
            n();
        }
        m();
    }

    public final void D(qbw0 qbw0Var, i29 i29Var) {
        w8p1.m();
        n3d n3dVarB = b();
        Objects.requireNonNull(n3dVarB);
        B();
        o0c.q((String) null, this.s == null);
        Matrix matrix = this.j;
        boolean zN = n3dVarB.n();
        Size size = i29Var.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int iG = g(n3dVarB, k(n3dVarB));
        cx70 cx70Var = (cx70) this.f;
        sy8 sy8Var = cx70.O;
        n3d1 n3d1Var = new n3d1(1, 34, i29Var, matrix, zN, rect, iG, ((Integer) cx70Var.h(sy8Var, -1)).intValue(), n3dVarB.n() && k(n3dVarB));
        this.s = n3d1Var;
        gv40 gv40Var = new gv40(this, (byte) 25);
        w8p1.m();
        n3d1Var.a();
        n3d1Var.m.add(gv40Var);
        j4d1 j4d1VarC = this.s.c(n3dVarB, true);
        this.t = j4d1VarC;
        this.r = j4d1VarC.k;
        if (this.o != null) {
            n3d n3dVarB2 = b();
            n3d1 n3d1Var2 = this.s;
            if (n3dVarB2 != null && n3d1Var2 != null) {
                w8p1.y(new jym0(n3d1Var2, g(n3dVarB2, k(n3dVarB2)), ((Integer) ((cx70) this.f).h(sy8Var, -1)).intValue(), (byte) 2));
            }
            haw0 haw0Var = this.o;
            haw0Var.getClass();
            j4d1 j4d1Var = this.t;
            j4d1Var.getClass();
            this.f85p.execute(new zyh0((Object) haw0Var, (Object) j4d1Var, (byte) 15));
        }
        va61 va61VarD = va61.d(qbw0Var, i29Var.a);
        vnd vndVar = va61VarD.b;
        ((xdn0) vndVar.d).r(wnd.j, i29Var.c);
        int iT = qbw0Var.t();
        if (iT != 0 && iT != 0) {
            ((xdn0) vndVar.d).r(i4i1.J0, Integer.valueOf(iT));
        }
        qsk qskVar = i29Var.d;
        if (qskVar != null) {
            vndVar.i(qskVar);
        }
        if (this.o != null) {
            va61VarD.b(this.r, i29Var.b, ((Integer) ((cx70) this.f).h(cx70.P, -1)).intValue());
        }
        wa61 wa61Var = this.u;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new pq70(this, (byte) 3));
        this.u = wa61Var2;
        va61VarD.f = wa61Var2;
        this.q = va61VarD;
        Object[] objArr = {va61VarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
    }

    @Override // p.e4i1
    public final i4i1 e(boolean z, l4i1 l4i1Var) {
        v.getClass();
        qbw0 qbw0Var = z9w0.a;
        qsk qskVarA = l4i1Var.a(qbw0Var.x(), 1);
        if (z) {
            qskVarA = qsk.B(qskVarA, qbw0Var);
        }
        if (qskVarA == null) {
            return null;
        }
        return new qbw0(eqq0.b((xdn0) j(qskVarA).b));
    }

    @Override // p.e4i1
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p.e4i1
    public final h4i1 j(qsk qskVar) {
        return new rpv0(xdn0.n(qskVar));
    }

    @Override // p.e4i1
    public final i4i1 r(l3d l3dVar, h4i1 h4i1Var) {
        h4i1Var.e().r(st70.K, 34);
        return h4i1Var.h();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // p.e4i1
    public final i29 u(qsk qskVar) {
        this.q.a(qskVar);
        Object[] objArr = {this.q.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        zwg zwgVarA = this.g.a();
        zwgVarA.d = qskVar;
        return zwgVarA.i();
    }

    @Override // p.e4i1
    public final i29 v(i29 i29Var, i29 i29Var2) {
        D((qbw0) this.f, i29Var);
        return i29Var;
    }

    @Override // p.e4i1
    public final void w() {
        B();
    }

    @Override // p.e4i1
    public final void y(Rect rect) {
        this.i = rect;
        n3d n3dVarB = b();
        n3d1 n3d1Var = this.s;
        if (n3dVarB == null || n3d1Var == null) {
            return;
        }
        w8p1.y(new jym0(n3d1Var, g(n3dVarB, k(n3dVarB)), ((Integer) ((cx70) this.f).h(cx70.O, -1)).intValue(), (byte) 2));
    }
}
