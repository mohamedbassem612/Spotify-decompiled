package p;

import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x0p {
    public final yb7 a;
    public final ub7 b;
    public final q7r0 c;
    public final zuj d;
    public final jly0 e = xqu.b(new fwo(this, 0, (byte) 25));
    public final jly0 f = iy81.a(new fwo(this, 4, (byte) 25));
    public final jly0 g = iy81.a(new fwo(this, 6, (byte) 25));
    public final jly0 h = iy81.a(new fwo(this, 5, (byte) 25));
    public final fwo i = new fwo(this, 7, (byte) 25);
    public final fwo j = new fwo(this, 8, (byte) 25);
    public final jly0 k = xqu.b(new fwo(this, 3, (byte) 25));
    public final jly0 l = xqu.b(new fwo(this, 11, (byte) 25));
    public final jly0 m = iy81.a(new fwo(this, 10, (byte) 25));
    public final jly0 n = xqu.b(new fwo(this, 9, (byte) 25));
    public final jly0 o = xqu.b(new fwo(this, 12, (byte) 25));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f76p = xqu.b(new fwo(this, 13, (byte) 25));
    public final jly0 q = xqu.b(new fwo(this, 15, (byte) 25));
    public final jly0 r = xqu.b(new fwo(this, 14, (byte) 25));
    public final jly0 s = xqu.b(new fwo(this, 16, (byte) 25));
    public final jly0 t = iy81.a(new fwo(this, 17, (byte) 25));
    public final jly0 u = iy81.a(new fwo(this, 2, (byte) 25));
    public final jly0 v = xqu.b(new fwo(this, 19, (byte) 25));
    public final fwo w = new fwo(this, 18, (byte) 25);
    public final fwo x = new fwo(this, 20, (byte) 25);
    public final fwo y = new fwo(this, 21, (byte) 25);
    public final jly0 z = iy81.a(new fwo(this, 23, (byte) 25));
    public final jly0 A = iy81.a(new fwo(this, 22, (byte) 25));
    public final jly0 B = iy81.a(new fwo(this, 24, (byte) 25));
    public final jly0 C = xqu.b(new fwo(this, 26, (byte) 25));
    public final jly0 D = iy81.a(new fwo(this, 25, (byte) 25));
    public final jly0 E = iy81.a(new fwo(this, 27, (byte) 25));
    public final jly0 F = iy81.a(new fwo(this, 28, (byte) 25));
    public final jly0 G = iy81.a(new fwo(this, 29, (byte) 25));
    public final jly0 H = iy81.a(new fwo(this, 1, (byte) 25));

    public x0p(ub7 ub7Var, zuj zujVar, yb7 yb7Var, q7r0 q7r0Var) {
        this.a = yb7Var;
        this.b = ub7Var;
        this.c = q7r0Var;
        this.d = zujVar;
    }

    public final String a() {
        String str = this.a.c;
        c8o.m(str);
        return str;
    }

    public final lik1 b() {
        Parcelable.Creator creator = lik1.CREATOR;
        Set set = s4b1.f;
        String strZ = uic.x(this.a.a).z();
        if (strZ != null) {
            return new lik1(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }
}
