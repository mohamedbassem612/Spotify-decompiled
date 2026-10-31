package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hrk implements mj00 {
    public final /* synthetic */ byte a = 1;
    public final boolean b;
    public final w25 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public hrk(sp00 sp00Var, rgp rgpVar, uk00 uk00Var, boolean z, h30 h30Var, w25 w25Var, sgp sgpVar) {
        this.d = sp00Var;
        this.e = rgpVar;
        this.b = z;
        this.f = h30Var;
        this.c = w25Var;
        this.g = sgpVar;
    }

    @Override // p.mj00
    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ji50Var.b;
                if (!this.c.x()) {
                    jjk jjkVar = new jjk(this, xk00Var, (byte) 2);
                    Map mapA = ((h30) this.f).a();
                    linkedHashMap.put(ynd0.class, new vw21(xj.Y0, mapA, r4o1.X(jjkVar), yzj.S0, null));
                } else {
                    sp00 sp00Var = (sp00) this.d;
                    rgp rgpVar = (rgp) this.e;
                    kko kkoVar = xk00Var.a;
                    lbp lbpVar = rgpVar.a;
                    gw70 gw70VarK = lbp.a(lbpVar).a.k();
                    c8o.l(gw70VarK);
                    v1k v1kVar = new v1k(gw70VarK, lbp.a(lbpVar).u(), kkoVar, (byte) 1);
                    ((sgp) obj).getClass();
                    linkedHashMap.put(ynd0.class, new r3r(mth1.D(kyo1.o(new erk(sp00Var, v1kVar, this.b), new rs7(this, (byte) 28)), tqk.X), v30.Z, (vu30) null));
                }
                break;
            default:
                y46 y46Var = new y46(this, xk00Var, ji50Var, (byte) 3);
                h30 h30Var = (h30) obj;
                Map mapA2 = h30Var.a();
                xj xjVar = xj.b1;
                yzj yzjVar = yzj.a1;
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                linkedHashMap2.put(ssl.class, new vw21(xjVar, mapA2, r4o1.X(y46Var), yzjVar, null));
                mzj mzjVar = new mzj(this, xk00Var, ji50Var, (byte) 16);
                linkedHashMap2.put(tsl.class, new vw21(xjVar, h30Var.a(), r4o1.X(mzjVar), yzj.b1, null));
                break;
        }
        return ji50Var;
    }

    public jpg0 b(zob1 zob1Var, iac0 iac0Var, xk00 xk00Var, d0r d0rVar) {
        return new jpg0(kyo1.n(f6o1.A(new e27((kly0) this.d, new vt1(this, d0rVar, xk00Var, zob1Var, iac0Var, (byte) 8), this.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new qrk(this, (byte) 2)), vll.U0);
    }

    public hrk(lbp lbpVar, lbp lbpVar2, lbp lbpVar3, uk00 uk00Var, boolean z, h30 h30Var, w25 w25Var) {
        this.d = lbpVar;
        this.e = lbpVar2;
        this.f = lbpVar3;
        this.b = z;
        this.g = h30Var;
        this.c = w25Var;
    }
}
