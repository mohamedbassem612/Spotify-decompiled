package p;

import android.widget.FrameLayout;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkt implements hmt {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ jkt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final ji50 a(tkt tktVar, ji50 ji50Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ji50Var.b.put(y8e.class, new r3r(new xzq(new qlb((r3p) ((jly0) ((s3p) ((q3p) obj).a.c).t).get(), ji50Var.a), ket.P0), szr.Z0, 4));
                break;
            case 1:
                ji50Var.b.put(d360.class, new r3r(new xzq(new nm1((d0r) tktVar.c, (l3p) obj), new nit(tktVar, (byte) 2)), szr.e1, 4));
                break;
            case 2:
                i4o i4oVar = new i4o(this, (byte) 27);
                ji50Var.b.put(h460.class, r4o1.P(ket.c1, w7x.a, i4oVar, qlt.b));
                break;
            case 3:
                d0r d0rVar = ji50Var.a;
                s3p s3pVar = (s3p) ((g3p) obj).a.c;
                h3p h3pVar = (h3p) ((jly0) s3pVar.Y).get();
                xrc0 xrc0Var = (xrc0) ((b2p) s3pVar.a1).get();
                iyc0 iyc0Var = (iyc0) ((i7c) s3pVar.X0).y.get();
                c8o.l(iyc0Var);
                ji50Var.b.put(zv70.class, new r3r(new xzq(new nm1(h3pVar, new f7c(xrc0Var, iyc0Var, new cua((byte) 24)), d0rVar), zlt.f), qlt.c, 4));
                break;
            case 4:
                i4o i4oVar2 = new i4o(this, (byte) 28);
                Set setS0 = f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)});
                ji50Var.b.put(bw70.class, r4o1.Q(zlt.h, setS0, i4oVar2, qlt.d));
                break;
            case 5:
                ji50Var.b.put(qox0.class, new r3r(new xzq(new z4r(cgj1.H(((jox0) obj).a(ji50Var.a, eox0.a), (qim0) null, (FrameLayout.LayoutParams) null, 7)), zlt.i), qlt.e, 4));
                break;
            default:
                d0r d0rVar2 = ji50Var.a;
                lzn0 lzn0VarC = ((i7c) ((s3p) ((p3p) obj).a.c).X0).c();
                c8o.l(lzn0VarC);
                ji50Var.b.put(hk51.class, new r3r(new xzq(new jd6(lzn0VarC, d0rVar2, (byte) 16), zlt.t), qlt.f, 4));
                break;
        }
        return ji50Var;
    }
}
