package p;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pr70 extends e4i1 {
    public static final mr70 x = new mr70();
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f115p;
    public final int q;
    public final fp41 r;
    public va61 s;
    public st60 t;
    public hpd1 u;
    public wa61 v;
    public final jxa w;

    public pr70(qr70 qr70Var) {
        super(qr70Var);
        this.f115p = new AtomicReference(null);
        this.q = -1;
        this.w = new jxa(this, (byte) 13);
        qr70 qr70Var2 = (qr70) this.f;
        sy8 sy8Var = qr70.b;
        if (qr70Var2.g(sy8Var)) {
            this.o = ((Integer) qr70Var2.e(sy8Var)).intValue();
        } else {
            this.o = 1;
        }
        ((Integer) qr70Var2.h(qr70.h, 0)).getClass();
        this.r = new fp41((nr70) qr70Var2.h(qr70.i, (Object) null));
    }

    public static boolean E(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z) {
        hpd1 hpd1Var;
        w8p1.m();
        wa61 wa61Var = this.v;
        if (wa61Var != null) {
            wa61Var.b();
            this.v = null;
        }
        st60 st60Var = this.t;
        if (st60Var != null) {
            st60Var.n();
            this.t = null;
        }
        if (z || (hpd1Var = this.u) == null) {
            return;
        }
        hpd1Var.b();
        this.u = null;
    }

    public final va61 C(String str, qr70 qr70Var, i29 i29Var) {
        w8p1.m();
        Objects.toString(i29Var);
        Size size = i29Var.a;
        n3d n3dVarB = b();
        Objects.requireNonNull(n3dVarB);
        byte b = 1;
        boolean z = !n3dVarB.n();
        if (this.t != null) {
            o0c.q((String) null, z);
            this.t.n();
        }
        if (((Boolean) this.f.h(qr70.t, Boolean.FALSE)).booleanValue()) {
            b().d().q();
        }
        this.t = new st60(qr70Var, size, z);
        hpd1 hpd1Var = this.u;
        if (hpd1Var == null) {
            hpd1Var = new hpd1(this.w);
            this.u = hpd1Var;
        }
        st60 st60Var = this.t;
        w8p1.m();
        hpd1Var.b = st60Var;
        st60Var.getClass();
        w8p1.m();
        aod aodVar = (aod) st60Var.b;
        w8p1.m();
        o0c.q("The ImageReader is not initialized.", ((vnd) aodVar.b) != null);
        vnd vndVar = (vnd) aodVar.b;
        synchronized (vndVar.c) {
            vndVar.f = hpd1Var;
        }
        st60 st60Var2 = this.t;
        va61 va61VarD = va61.d((qr70) st60Var2.d, i29Var.a);
        ny8 ny8Var = (ny8) st60Var2.c;
        g280 g280Var = ny8Var.a;
        Objects.requireNonNull(g280Var);
        liv livVar = liv.d;
        ajq0 ajq0VarA = b29.a(g280Var);
        ajq0VarA.e = livVar;
        va61VarD.a.add(ajq0VarA.j());
        g280 g280Var2 = ny8Var.b;
        if (g280Var2 != null) {
            va61VarD.h = b29.a(g280Var2).j();
        }
        if (this.o == 2 && !i29Var.e) {
            c().e(va61VarD);
        }
        qsk qskVar = i29Var.d;
        if (qskVar != null) {
            va61VarD.b.i(qskVar);
        }
        wa61 wa61Var = this.v;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new pq70(this, b));
        this.v = wa61Var2;
        va61VarD.f = wa61Var2;
        return va61VarD;
    }

    public final int D() {
        int iIntValue;
        synchronized (this.f115p) {
            iIntValue = this.q;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((qr70) this.f).h(qr70.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    @Override // p.e4i1
    public final i4i1 e(boolean z, l4i1 l4i1Var) {
        x.getClass();
        qr70 qr70Var = mr70.a;
        qsk qskVarA = l4i1Var.a(qr70Var.x(), this.o);
        if (z) {
            qskVarA = qsk.B(qskVarA, qr70Var);
        }
        if (qskVarA == null) {
            return null;
        }
        return new qr70(eqq0.b((xdn0) j(qskVarA).b));
    }

    @Override // p.e4i1
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // p.e4i1
    public final h4i1 j(qsk qskVar) {
        return new h0y(xdn0.n(qskVar));
    }

    @Override // p.e4i1
    public final void p() {
        o0c.p(b(), "Attached camera cannot be null");
        if (D() == 3) {
            n3d n3dVarB = b();
            if ((n3dVarB != null ? n3dVarB.g().d() : -1) == 0) {
                return;
            }
            hhg1.n("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // p.e4i1
    public final void q() {
        j2h1.o("ImageCapture");
        synchronized (this.f115p) {
            try {
                if (this.f115p.get() == null) {
                    c().b(D());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().f(this.r);
    }

    @Override // p.e4i1
    public final void t() {
        fp41 fp41Var = this.r;
        fp41Var.b();
        fp41Var.a();
        hpd1 hpd1Var = this.u;
        if (hpd1Var != null) {
            hpd1Var.b();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // p.e4i1
    public final i29 u(qsk qskVar) {
        this.s.a(qskVar);
        Object[] objArr = {this.s.c()};
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
        va61 va61VarC = C(d(), (qr70) this.f, i29Var);
        this.s = va61VarC;
        Object[] objArr = {va61VarC.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        m();
        return i29Var;
    }

    @Override // p.e4i1
    public final void w() {
        fp41 fp41Var = this.r;
        fp41Var.b();
        fp41Var.a();
        hpd1 hpd1Var = this.u;
        if (hpd1Var != null) {
            hpd1Var.b();
        }
        B(false);
        c().f(null);
    }
}
