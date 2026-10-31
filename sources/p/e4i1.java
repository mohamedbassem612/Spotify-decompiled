package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import app.p000rive.semantics.SemanticState;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class e4i1 {
    public i4i1 d;
    public final i4i1 e;
    public i4i1 f;
    public i29 g;
    public i4i1 h;
    public Rect i;
    public n3d k;
    public n3d l;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public Matrix j = new Matrix();
    public bb61 m = bb61.a();
    public bb61 n = bb61.a();

    public e4i1(i4i1 i4i1Var) {
        this.e = i4i1Var;
        this.f = i4i1Var;
    }

    public final void A(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.m = (bb61) list.get(0);
        if (list.size() > 1) {
            this.n = (bb61) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (j2t j2tVar : ((bb61) it.next()).b()) {
                if (j2tVar.j == null) {
                    j2tVar.j = getClass();
                }
            }
        }
    }

    public final void a(n3d n3dVar, n3d n3dVar2, i4i1 i4i1Var, i4i1 i4i1Var2) {
        synchronized (this.b) {
            this.k = n3dVar;
            this.l = n3dVar2;
            this.a.add(n3dVar);
            if (n3dVar2 != null) {
                this.a.add(n3dVar2);
            }
        }
        this.d = i4i1Var;
        this.h = i4i1Var2;
        this.f = l(n3dVar.g(), this.d, this.h);
        p();
    }

    public final n3d b() {
        n3d n3dVar;
        synchronized (this.b) {
            n3dVar = this.k;
        }
        return n3dVar;
    }

    public final c3d c() {
        synchronized (this.b) {
            try {
                n3d n3dVar = this.k;
                if (n3dVar == null) {
                    return c3d.a;
                }
                return n3dVar.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        n3d n3dVarB = b();
        o0c.p(n3dVarB, "No camera attached to use case: " + this);
        return n3dVarB.g().b();
    }

    public abstract i4i1 e(boolean z, l4i1 l4i1Var);

    public final String f() {
        String str = (String) this.f.h(jrd1.r0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int g(n3d n3dVar, boolean z) {
        int iJ = n3dVar.g().j(((cx70) this.f).p());
        return (n3dVar.n() || !z) ? iJ : pfg1.f(-iJ);
    }

    public final n3d h() {
        n3d n3dVar;
        synchronized (this.b) {
            n3dVar = this.l;
        }
        return n3dVar;
    }

    public Set i() {
        return Collections.EMPTY_SET;
    }

    public h4i1 j(qsk qskVar) {
        return new fey(xdn0.n(qskVar));
    }

    public final boolean k(n3d n3dVar) {
        int iIntValue = ((Integer) ((cx70) this.f).h(cx70.P, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return n3dVar.g().d() == 0;
        }
        eg.f(f4i1.c(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final i4i1 l(l3d l3dVar, i4i1 i4i1Var, i4i1 i4i1Var2) {
        xdn0 xdn0VarD;
        if (i4i1Var2 != null) {
            xdn0VarD = xdn0.n(i4i1Var2);
            xdn0VarD.a.remove(jrd1.r0);
        } else {
            xdn0VarD = xdn0.d();
        }
        TreeMap treeMap = xdn0VarD.a;
        sy8 sy8Var = cx70.M;
        i4i1 i4i1Var3 = this.e;
        if (i4i1Var3.g(sy8Var) || i4i1Var3.g(cx70.Q)) {
            sy8 sy8Var2 = cx70.U;
            if (treeMap.containsKey(sy8Var2)) {
                treeMap.remove(sy8Var2);
            }
        }
        sy8 sy8Var3 = cx70.U;
        if (i4i1Var3.g(sy8Var3)) {
            sy8 sy8Var4 = cx70.S;
            if (treeMap.containsKey(sy8Var4) && ((ft21) i4i1Var3.e(sy8Var3)).b != null) {
                treeMap.remove(sy8Var4);
            }
        }
        Iterator it = i4i1Var3.c().iterator();
        while (it.hasNext()) {
            qsk.o(xdn0VarD, xdn0VarD, i4i1Var3, (sy8) it.next());
        }
        if (i4i1Var != null) {
            for (sy8 sy8Var5 : i4i1Var.c()) {
                if (!sy8Var5.a.equals(jrd1.r0.a)) {
                    qsk.o(xdn0VarD, xdn0VarD, i4i1Var, sy8Var5);
                }
            }
        }
        if (treeMap.containsKey(cx70.Q)) {
            sy8 sy8Var6 = cx70.M;
            if (treeMap.containsKey(sy8Var6)) {
                treeMap.remove(sy8Var6);
            }
        }
        sy8 sy8Var7 = cx70.U;
        if (treeMap.containsKey(sy8Var7) && ((ft21) xdn0VarD.e(sy8Var7)).c) {
            xdn0VarD.r(i4i1.G0, Boolean.TRUE);
        }
        return r(l3dVar, j(xdn0VarD));
    }

    public final void m() {
        this.c = 1;
        o();
    }

    public final void n() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((d4i1) it.next()).e(this);
        }
    }

    public final void o() {
        int iC = l1d.C(this.c);
        HashSet hashSet = this.a;
        if (iC == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d4i1) it.next()).i(this);
            }
        } else {
            if (iC != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((d4i1) it2.next()).b(this);
            }
        }
    }

    public i4i1 r(l3d l3dVar, h4i1 h4i1Var) {
        Object objE;
        Object objE2;
        Object objE3;
        Integer numValueOf = Integer.valueOf(SemanticState.Hidden);
        if (l3dVar.f().l(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            xdn0 xdn0VarE = h4i1Var.e();
            sy8 sy8Var = qr70.g;
            Object objE4 = Boolean.TRUE;
            xdn0VarE.getClass();
            try {
                objE4 = xdn0VarE.e(sy8Var);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objE4)) {
                j2h1.M("ImageCapture");
            } else {
                j2h1.z(4, j2h1.J("ImageCapture"));
                h4i1Var.e().r(qr70.g, Boolean.TRUE);
            }
        }
        xdn0 xdn0VarE2 = h4i1Var.e();
        Boolean bool2 = Boolean.TRUE;
        sy8 sy8Var2 = qr70.g;
        Object objE5 = Boolean.FALSE;
        xdn0VarE2.getClass();
        try {
            objE5 = xdn0VarE2.e(sy8Var2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objE5);
        Object objE6 = null;
        boolean z = false;
        if (zEquals) {
            if (b() != null) {
                b().d().q();
            }
            try {
                objE3 = xdn0VarE2.e(qr70.d);
            } catch (IllegalArgumentException unused3) {
                objE3 = null;
            }
            Integer num = (Integer) objE3;
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                j2h1.M("ImageCapture");
            }
            if (!z) {
                j2h1.M("ImageCapture");
                xdn0VarE2.r(qr70.g, Boolean.FALSE);
            }
        }
        xdn0 xdn0VarE3 = h4i1Var.e();
        sy8 sy8Var3 = qr70.d;
        xdn0VarE3.getClass();
        try {
            objE = xdn0VarE3.e(sy8Var3);
        } catch (IllegalArgumentException unused4) {
            objE = null;
        }
        Integer num2 = (Integer) objE;
        if (num2 != null) {
            if (b() != null) {
                b().d().q();
            }
            h4i1Var.e().r(st70.K, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            xdn0 xdn0VarE4 = h4i1Var.e();
            sy8 sy8Var4 = qr70.e;
            xdn0VarE4.getClass();
            try {
                objE2 = xdn0VarE4.e(sy8Var4);
            } catch (IllegalArgumentException unused5) {
                objE2 = null;
            }
            if (Objects.equals(objE2, 1)) {
                h4i1Var.e().r(st70.K, 4101);
                h4i1Var.e().r(st70.L, liv.c);
            } else if (z) {
                h4i1Var.e().r(st70.K, 35);
            } else {
                xdn0 xdn0VarE5 = h4i1Var.e();
                sy8 sy8Var5 = cx70.T;
                xdn0VarE5.getClass();
                try {
                    objE6 = xdn0VarE5.e(sy8Var5);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) objE6;
                if (list == null || pr70.E(SemanticState.Hidden, list)) {
                    h4i1Var.e().r(st70.K, numValueOf);
                } else if (pr70.E(35, list)) {
                    h4i1Var.e().r(st70.K, 35);
                }
            }
        }
        return h4i1Var.h();
    }

    public abstract i29 u(qsk qskVar);

    public abstract i29 v(i29 i29Var, i29 i29Var2);

    public abstract void w();

    public void x(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public void y(Rect rect) {
        this.i = rect;
    }

    public final void z(n3d n3dVar) {
        w();
        synchronized (this.b) {
            try {
                n3d n3dVar2 = this.k;
                if (n3dVar == n3dVar2) {
                    this.a.remove(n3dVar2);
                    this.k = null;
                }
                n3d n3dVar3 = this.l;
                if (n3dVar == n3dVar3) {
                    this.a.remove(n3dVar3);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }
}
