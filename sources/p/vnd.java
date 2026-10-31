package p;

import android.util.ArrayMap;
import android.view.Surface;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vnd implements o4e1, ry70 {
    public boolean a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;

    public vnd(wnd wndVar) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.d = xdn0.d();
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = false;
        this.f = yen0.a();
        hashSet.addAll(wndVar.a);
        this.d = xdn0.n(wndVar.b);
        this.b = wndVar.c;
        arrayList.addAll(wndVar.d);
        this.a = wndVar.e;
        tod1 tod1Var = wndVar.f;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tod1Var.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f = new yen0(arrayMap);
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((d2d) it.next());
        }
    }

    public void b(d2d d2dVar) {
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList.contains(d2dVar)) {
            return;
        }
        arrayList.add(d2dVar);
    }

    public zx70 c() {
        zq70 zq70Var;
        synchronized (this.c) {
            zx70 zx70VarC = ((ry70) this.d).c();
            if (zx70VarC != null) {
                this.b++;
                zq70Var = new zq70(zx70VarC);
                zq70Var.a((yq70) this.g);
            } else {
                zq70Var = null;
            }
        }
        return zq70Var;
    }

    public void close() {
        synchronized (this.c) {
            try {
                Surface surface = (Surface) this.e;
                if (surface != null) {
                    surface.release();
                }
                ((ry70) this.d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d() {
        int iD;
        synchronized (this.c) {
            iD = ((ry70) this.d).d();
        }
        return iD;
    }

    public void e() {
        synchronized (this.c) {
            ((ry70) this.d).e();
        }
    }

    public void f(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var;
        boolean z = this.a;
        iu30 iu30Var = (iu30) this.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1711599007);
        int i2 = (x340Var2.g(this) ? 32 : 16) | i;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            String string = ((y7e1) this.c).d().d.toString();
            ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
            qim0 qim0VarB = nim0.a;
            if (z) {
                x340Var2.i0(-394113077);
            } else {
                x340Var2.i0(-394082046);
                boolean zI = x340Var2.i(ven0VarS);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new p6b(ven0VarS, (byte) 5);
                    x340Var2.s0(objT);
                }
                qim0VarB = f8d1.b(qim0VarB, rih1.a, (PointerInputEventHandler) objT);
            }
            x340Var2.r(false);
            idn0 idn0Var = (idn0) this.e;
            u251 u251Var = (u251) this.f;
            int i3 = this.b;
            Function0 function0 = (Function0) this.g;
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            t8e1 t8e1Var = m9x0.X0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            i5x0.Q0.g(string, apo.r(1464709964, new qy90(z, u251Var, string, j2iVar), x340Var2), true, !z, t8e1Var, idn0Var, apo.r(-1294710701, new vx1(i3, (byte) 22), x340Var2), apo.r(-461780140, new d720(iu30Var, (byte) 21), x340Var2), apo.r(2047915426, new ql(string, function0, (byte) 12), x340Var2), (hw61) null, y251.h(x340Var2), new zzq0(8.0f, 12.0f, 8.0f, 8.0f), (vu30) null, x340Var2, 905970096, 6, 161984);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, j2iVar, i, (byte) 14);
        }
    }

    public void g(qy70 qy70Var, Executor executor) {
        synchronized (this.c) {
            ((ry70) this.d).g(new h341((Object) this, (Object) qy70Var, (byte) 2), executor);
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.c) {
            height = ((ry70) this.d).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.c) {
            surface = ((ry70) this.d).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.c) {
            width = ((ry70) this.d).getWidth();
        }
        return width;
    }

    public int h() {
        int iH;
        synchronized (this.c) {
            iH = ((ry70) this.d).h();
        }
        return iH;
    }

    public void i(qsk qskVar) {
        for (sy8 sy8Var : qskVar.c()) {
            xdn0 xdn0Var = (xdn0) this.d;
            xdn0Var.getClass();
            try {
                xdn0Var.e(sy8Var);
            } catch (IllegalArgumentException unused) {
            }
            ((xdn0) this.d).s(sy8Var, qskVar.i(sy8Var), qskVar.e(sy8Var));
        }
    }

    public wnd j() {
        ArrayList arrayList = new ArrayList((HashSet) this.c);
        eqq0 eqq0VarB = eqq0.b((xdn0) this.d);
        int i = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.e);
        boolean z = this.a;
        yen0 yen0Var = (yen0) this.f;
        tod1 tod1Var = tod1.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : yen0Var.a.keySet()) {
            arrayMap.put(str, yen0Var.a.get(str));
        }
        return new wnd(arrayList, eqq0VarB, i, arrayList2, z, new tod1(arrayMap), (j2d) this.g);
    }

    public void k() {
        synchronized (this.c) {
            try {
                this.a = true;
                ((ry70) this.d).e();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zx70 m() {
        zq70 zq70Var;
        synchronized (this.c) {
            zx70 zx70VarM = ((ry70) this.d).m();
            if (zx70VarM != null) {
                this.b++;
                zq70Var = new zq70(zx70VarM);
                zq70Var.a((yq70) this.g);
            } else {
                zq70Var = null;
            }
        }
        return zq70Var;
    }

    public vnd(ry70 ry70Var) {
        this.c = new Object();
        this.b = 0;
        this.a = false;
        this.g = new yq70(this, (byte) 1);
        this.d = ry70Var;
        this.e = ry70Var.getSurface();
    }

    public vnd() {
        this.c = new HashSet();
        this.d = xdn0.d();
        this.b = -1;
        this.e = new ArrayList();
        this.a = false;
        this.f = yen0.a();
    }

    public vnd(y7e1 y7e1Var, iu30 iu30Var, boolean z, idn0 idn0Var, u251 u251Var, int i, Function0 function0) {
        this.c = y7e1Var;
        this.d = iu30Var;
        this.a = z;
        this.e = idn0Var;
        this.f = u251Var;
        this.b = i;
        this.g = function0;
    }
}
