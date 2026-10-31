package p;

import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oxb implements ewc1, byf0 {
    public ccb1 X;
    public String Y;
    public String Z;
    public final fvc1 a;
    public final l8s b;
    public final jur c;
    public final e831 d;
    public final tla e;
    public final ed4 f;
    public final jut g;
    public final mwb h;
    public r2a1 i;
    public final vku t = new vku();
    public final AtomicInteger N0 = new AtomicInteger(0);

    public oxb(fvc1 fvc1Var, l8s l8sVar, jur jurVar, e831 e831Var, tla tlaVar, ed4 ed4Var, jut jutVar, mwb mwbVar) {
        this.a = fvc1Var;
        this.b = l8sVar;
        this.c = jurVar;
        this.d = e831Var;
        this.e = tlaVar;
        this.f = ed4Var;
        this.g = jutVar;
        this.h = mwbVar;
    }

    @Override // p.ewc1
    public final void a(bxt bxtVar, Map map, ccb1 ccb1Var) throws Throwable {
        oxb oxbVar;
        Objects.toString(bxtVar.getType());
        String strE = bxtVar.e();
        String strD = bxtVar.d();
        Object obj = map.get("instrumentationId");
        w4l0 w4l0Var = obj instanceof w4l0 ? (w4l0) obj : null;
        if (w4l0Var == null) {
            n57.s("BottomSheetRenderer missing required param: instrumentationId");
            ccb1Var.invoke(new md21(ffu.a));
            return;
        }
        synchronized (this) {
            try {
                this.t.c();
                e();
                this.X = ccb1Var;
                oxbVar = this;
                try {
                    this.t.a(this.b.c(new gjo0(new cab(this, bxtVar, w4l0Var, (byte) 2), new mgc(this, this.N0.incrementAndGet(), w4l0Var, (byte) 8))).subscribe(new y43(oxbVar, strE, strD, w4l0Var, ccb1Var)));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                oxbVar = this;
            }
        }
    }

    @Override // p.ewc1
    public final void b() {
        synchronized (this) {
            if (this.Y == null) {
                return;
            }
            this.t.c();
            this.h.b(this.Z);
            e();
        }
    }

    public final void c() {
        this.i = this.a.d(this);
    }

    public final void d() {
        r2a1 r2a1Var = this.i;
        if (r2a1Var != null) {
            r2a1Var.e();
        }
        this.i = null;
        synchronized (this) {
            f(lfu.a);
            this.t.c();
        }
    }

    public final void e() {
        String str = this.Y;
        if (str != null) {
            this.t.a(this.b.a(str).subscribe());
        }
        this.Y = null;
        this.Z = null;
        this.X = null;
    }

    public final void f(nfu nfuVar) {
        Objects.toString(nfuVar);
        ccb1 ccb1Var = this.X;
        if (ccb1Var != null) {
            ccb1Var.invoke(new md21(nfuVar));
        }
        e();
    }

    @Override // p.ewc1
    public final jwc1 getSurface() {
        return pyb.a;
    }

    public final void g(ViewGroup viewGroup) {
    }
}
