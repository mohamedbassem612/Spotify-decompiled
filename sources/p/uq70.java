package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uq70 extends e4i1 {
    public static final sq70 u = new sq70();
    public final vq70 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f153p;
    public qq70 q;
    public va61 r;
    public g280 s;
    public wa61 t;

    public uq70(xq70 xq70Var) {
        vq70 wq70Var;
        super(xq70Var);
        this.f153p = new Object();
        if (((Integer) ((xq70) this.f).h(xq70.b, 0)).intValue() == 1) {
            wq70Var = new wq70();
            this.o = wq70Var;
        } else {
            ar70 ar70Var = new ar70((Executor) xq70Var.h(xfe1.t0, g960.a()));
            this.o = ar70Var;
            wq70Var = ar70Var;
        }
        wq70Var.d = C();
        wq70Var.e = ((Boolean) ((xq70) this.f).h(xq70.g, Boolean.FALSE)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    public final va61 B(xq70 xq70Var, i29 i29Var) {
        boolean z;
        w8p1.m();
        Size size = i29Var.a;
        Executor executor = (Executor) xq70Var.h(xfe1.t0, g960.a());
        executor.getClass();
        Executor executor2 = executor;
        byte b = 0;
        boolean z2 = true;
        int iIntValue = ((Integer) ((xq70) this.f).h(xq70.b, 0)).intValue() == 1 ? ((Integer) ((xq70) this.f).h(xq70.c, 6)).intValue() : 4;
        if (xq70Var.h(xq70.d, (Object) null) != null) {
            bhn0.d();
            return null;
        }
        vnd vndVar = new vnd(anm1.r(size.getWidth(), size.getHeight(), this.f.m(), iIntValue));
        if (b() != null) {
            n3d n3dVarB = b();
            if (!((Boolean) ((xq70) this.f).h(xq70.g, Boolean.FALSE)).booleanValue() || g(n3dVarB, false) % 180 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        int height = z ? size.getHeight() : size.getWidth();
        int width = z ? size.getWidth() : size.getHeight();
        int i = C() == 2 ? 1 : 35;
        boolean z3 = this.f.m() == 35 && C() == 2;
        if (this.f.m() != 35 || ((b() == null || g(b(), false) == 0) && !Boolean.TRUE.equals((Boolean) ((xq70) this.f).h(xq70.f, (Object) null)))) {
            z2 = false;
        }
        vnd vndVar2 = (z3 || z2) ? new vnd(anm1.r(height, width, i, vndVar.h())) : null;
        if (vndVar2 != null) {
            vq70 vq70Var = this.o;
            synchronized (vq70Var.R0) {
                vq70Var.h = vndVar2;
            }
        }
        n3d n3dVarB2 = b();
        if (n3dVarB2 != null) {
            this.o.b = g(n3dVarB2, false);
        }
        vndVar.g(this.o, executor2);
        va61 va61VarD = va61.d(xq70Var, i29Var.a);
        qsk qskVar = i29Var.d;
        if (qskVar != null) {
            va61VarD.b.i(qskVar);
        }
        g280 g280Var = this.s;
        if (g280Var != null) {
            g280Var.a();
        }
        g280 g280Var2 = new g280(vndVar.getSurface(), size, this.f.m());
        this.s = g280Var2;
        poz0.F(g280Var2.e).b(new ag20(vndVar, vndVar2, (byte) 7), x2g0.A());
        ((xdn0) va61VarD.b.d).r(wnd.j, i29Var.c);
        va61VarD.b(this.s, i29Var.b, -1);
        wa61 wa61Var = this.t;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new pq70(this, b));
        this.t = wa61Var2;
        va61VarD.f = wa61Var2;
        return va61VarD;
    }

    public final int C() {
        return ((Integer) ((xq70) this.f).h(xq70.e, 1)).intValue();
    }

    public final void D(ExecutorService executorService, qq70 qq70Var) {
        synchronized (this.f153p) {
            try {
                vq70 vq70Var = this.o;
                bf70 bf70Var = new bf70(qq70Var, (byte) 1);
                synchronized (vq70Var.R0) {
                    vq70Var.a = bf70Var;
                    vq70Var.g = executorService;
                }
                if (this.q == null) {
                    m();
                }
                this.q = qq70Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.e4i1
    public final i4i1 e(boolean z, l4i1 l4i1Var) {
        u.getClass();
        xq70 xq70Var = sq70.a;
        qsk qskVarA = l4i1Var.a(xq70Var.x(), 1);
        if (z) {
            qskVarA = qsk.B(qskVarA, xq70Var);
        }
        if (qskVarA == null) {
            return null;
        }
        return new xq70(eqq0.b((xdn0) ((fey) j(qskVarA)).b));
    }

    @Override // p.e4i1
    public final void p() {
        this.o.S0 = true;
    }

    @Override // p.e4i1
    public final i4i1 r(l3d l3dVar, h4i1 h4i1Var) {
        Boolean bool = (Boolean) ((xq70) this.f).h(xq70.f, (Object) null);
        boolean zL = l3dVar.f().l(OnePixelShiftQuirk.class);
        vq70 vq70Var = this.o;
        if (bool != null) {
            zL = bool.booleanValue();
        }
        vq70Var.f = zL;
        synchronized (this.f153p) {
        }
        return h4i1Var.h();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // p.e4i1
    public final i29 u(qsk qskVar) {
        this.r.a(qskVar);
        Object[] objArr = {this.r.c()};
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
        xq70 xq70Var = (xq70) this.f;
        d();
        va61 va61VarB = B(xq70Var, i29Var);
        this.r = va61VarB;
        Object[] objArr = {va61VarB.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        return i29Var;
    }

    @Override // p.e4i1
    public final void w() {
        w8p1.m();
        wa61 wa61Var = this.t;
        if (wa61Var != null) {
            wa61Var.b();
            this.t = null;
        }
        g280 g280Var = this.s;
        if (g280Var != null) {
            g280Var.a();
            this.s = null;
        }
        vq70 vq70Var = this.o;
        vq70Var.S0 = false;
        vq70Var.c();
    }

    @Override // p.e4i1
    public final void x(Matrix matrix) {
        super.x(matrix);
        vq70 vq70Var = this.o;
        synchronized (vq70Var.R0) {
            vq70Var.Y = matrix;
            vq70Var.Z = new Matrix(vq70Var.Y);
        }
    }

    @Override // p.e4i1
    public final void y(Rect rect) {
        this.i = rect;
        vq70 vq70Var = this.o;
        synchronized (vq70Var.R0) {
            vq70Var.t = rect;
            vq70Var.X = new Rect(vq70Var.t);
        }
    }
}
