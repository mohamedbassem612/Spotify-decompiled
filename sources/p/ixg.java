package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ixg implements az70 {
    public static final AtomicLong j = new AtomicLong(0);
    public final rf01 a;
    public final vy70 b;
    public final nq80 c;
    public lku d;
    public lku e;
    public boolean f = true;
    public boolean g = true;
    public Map h = new LinkedHashMap();
    public final String i;

    public ixg(rf01 rf01Var, vy70 vy70Var, nq80 nq80Var) {
        this.a = rf01Var;
        this.b = vy70Var;
        this.c = nq80Var;
        String strValueOf = String.valueOf(j.getAndIncrement());
        this.i = strValueOf;
        vy70Var.b().a(h4o1.a, new cp21(strValueOf));
    }

    public final zy70 a() {
        boolean z = this.g;
        jc10 jc10Var = dz70.a;
        vy70 vy70Var = this.b;
        vy70Var.b().a(dz70.f, Boolean.valueOf(z));
        vy70Var.e = new axg(this.c, (ird1) null, this.h, this.i);
        return vy70Var.a();
    }

    public final ixg b() {
        lku lkuVar = this.d;
        if (lkuVar != null) {
            lkuVar.dispose();
        }
        return this;
    }

    public final void c() {
        lku lkuVar = this.e;
        if (lkuVar != null) {
            lkuVar.dispose();
        }
        if (this.d == this.e) {
            this.d = null;
        }
        this.e = null;
    }

    public final ixg d() {
        this.b.o = dg41.a;
        return this;
    }

    public final ixg e() {
        this.b.n = zod.e(k291.c);
        return this;
    }

    public final ixg f(Drawable drawable) {
        this.b.m = new gv20(x2p1.h(drawable), (byte) 7);
        return this;
    }

    public final void g(iu30 iu30Var, iu30 iu30Var2) {
        this.g = false;
        j(new cce((Object) null, iu30Var, iu30Var2, (byte) 20));
    }

    public final ixg h() {
        this.b.o = dg41.b;
        return this;
    }

    public final Single i() {
        return Single.create(new mp8(this, (byte) 19));
    }

    public final void j(f080 f080Var) {
        fxg fxgVar = new fxg(f080Var);
        vy70 vy70Var = this.b;
        vy70Var.d = fxgVar;
        boolean z = this.g;
        jc10 jc10Var = dz70.a;
        vy70Var.b().a(dz70.f, Boolean.valueOf(z));
        vy70Var.e = new gxg(this, f080Var, (byte) 0);
        lku lkuVarA = this.a.a(vy70Var.a());
        this.d = lkuVarA;
        this.e = lkuVarA;
    }

    public final void k(ImageView imageView, ird1 ird1Var) {
        h180 h180Var = this.f ? new h180(imageView) : new dbo0(imageView);
        vy70 vy70Var = this.b;
        vy70Var.d = h180Var;
        boolean z = this.g;
        jc10 jc10Var = dz70.a;
        vy70Var.b().a(dz70.f, Boolean.valueOf(z));
        vy70Var.e = new axg(this.c, ird1Var, this.h, this.i);
        this.d = this.a.a(vy70Var.a());
    }

    public final ixg l(int i) {
        jc10 jc10Var = dz70.a;
        p94 p94Var = new p94(i, (byte) 7);
        vy70 vy70Var = this.b;
        vy70Var.l = p94Var;
        vy70Var.m = new p94(i, (byte) 6);
        return this;
    }

    public final ixg m(Drawable drawable) {
        this.b.l = new gv20(x2p1.h(drawable), (byte) 7);
        f(drawable);
        return this;
    }

    public final void n() {
        this.a.a(this.b.a());
    }

    public final CompletableCreate o() {
        return new CompletableCreate(new zwa(this, (byte) 13));
    }

    public final ixg p(int i, int i2, int i3) {
        if (i > 0 && i2 > 0) {
            ag01 ag01VarE = zod.e(eth.c(i, i2));
            vy70 vy70Var = this.b;
            vy70Var.n = ag01VarE;
            int iC = l1d.C(i3);
            if (iC != 0) {
                if (iC == 1) {
                    vy70Var.p = 2;
                    return this;
                }
                if (iC == 2) {
                    vy70Var.p = 1;
                    return this;
                }
                eg.o();
                return null;
            }
            vy70Var.p = 2;
        }
        return this;
    }

    public final ixg q(Context context, int i, int i2, int i3) {
        Resources resources = context.getResources();
        p(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2), i3);
        return this;
    }

    public final ixg r(String str) {
        this.b.b().a(new jc10(str.getClass()), str);
        return this;
    }

    public final ixg s(ufg1 ufg1Var) {
        List listX = k4p1.x(new hxg(ufg1Var));
        jc10 jc10Var = cz70.a;
        vy70 vy70Var = this.b;
        vy70Var.b().a(cz70.a, ila0.F(listX));
        String strY0 = o7h.y0(listX, null, null, null, new gv20(new n811(), (byte) 8), 31);
        Map mapX = vy70Var.g;
        if (!u890.j(mapX, Boolean.valueOf(vy70Var.f))) {
            if (mapX == null) {
                hhg1.c();
                return null;
            }
            mapX = sqg0.X(mapX);
            vy70Var.g = mapX;
            vy70Var.f = true;
        }
        w0h1.k(mapX).put("coil#transformations", strY0);
        return this;
    }
}
