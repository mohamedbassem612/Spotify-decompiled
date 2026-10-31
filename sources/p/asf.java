package p;

import android.content.Context;
import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class asf implements xpw {
    public final psw X;
    public final String a;
    public final b431 b;
    public final l2a c;
    public final lzn0 d;
    public final vcd0 e;
    public final hfd0 f;
    public final btf1 g;
    public final nqk0 i;
    public final rey0 h = new rey0(new xrf(this, (byte) 0));
    public final u7h1 t = eth.a0((vu30) null, new xrf(this, (byte) 1), 1);

    public asf(Context context, String str, String str2, b431 b431Var, l2a l2aVar, lzn0 lzn0Var, vcd0 vcd0Var, hfd0 hfd0Var, btf1 btf1Var) {
        this.a = str2;
        this.b = b431Var;
        this.c = l2aVar;
        this.d = lzn0Var;
        this.e = vcd0Var;
        this.f = hfd0Var;
        this.g = btf1Var;
        this.i = new nqk0(new uvk0(str));
        j2i j2iVar = new j2i(-1893758921, new gtd(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(ehd0 ehd0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1622237616);
        int i2 = (x340Var.g(ehd0Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (ehd0Var instanceof ahd0) {
            x340Var.i0(-1108667789);
            ahd0 ahd0Var = (ahd0) ehd0Var;
            String str = ahd0Var.a;
            d0p1.g(ahd0Var.e ? nrt0.a : new irt0(grt0.a), ahd0Var.b, str, (qim0) null, x340Var, 0);
            x340Var.r(false);
        } else if (ehd0Var instanceof dhd0) {
            x340Var.i0(102794896);
            d0p1.d(0, ((dhd0) ehd0Var).a, x340Var, (qim0) null);
            x340Var.r(false);
        } else if (ehd0Var instanceof chd0) {
            x340Var.i0(102799108);
            d0p1.c(((chd0) ehd0Var).a, 0, x340Var, (qim0) null);
            x340Var.r(false);
        } else {
            if (!u890.j(ehd0Var, bhd0.a)) {
                throw p3d1.k(x340Var, 102782260, false);
            }
            x340Var.i0(-1108106224);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, ehd0Var, i, (byte) 17);
        }
    }

    public final String f(wrf wrfVar) {
        if (wrfVar instanceof trf) {
            return l1d.m("spotify:listening-activity:details:", Uri.encode(((trf) wrfVar).a.a));
        }
        return wrfVar instanceof urf ? l1d.m("spotify:listening-activity:group-details:", this.a) : "";
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
