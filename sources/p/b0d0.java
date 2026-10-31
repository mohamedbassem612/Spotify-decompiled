package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b0d0 {
    public final upp a;
    public final q8n b;
    public final vpp c;
    public final wpp d;
    public final xpp e;
    public final ypp f;
    public final bo91 g;
    public final hj91 h;

    public b0d0(co91 co91Var, upp uppVar, q8n q8nVar, vpp vppVar, wpp wppVar, xpp xppVar, tp91 tp91Var, ypp yppVar) {
        this.a = uppVar;
        this.b = q8nVar;
        this.c = vppVar;
        this.d = wppVar;
        this.e = xppVar;
        this.f = yppVar;
        this.g = co91Var.a.a(co91Var.b, co91Var.c);
        this.h = tp91Var.a(new pp91((nn61) null, (qp91) null, 1, (ywv0) null, 111));
    }

    public final k0d0 a(String str, mr20 mr20Var, huz huzVar, iac0 iac0Var, w9u0 w9u0Var, mr20 mr20Var2, mr20 mr20Var3, huz huzVar2, EsPlayOrigin.PlayOrigin playOrigin, mr20 mr20Var4, mr20 mr20Var5, huz huzVar3) {
        return c(str, new t4u0((g3d0) null, (Set) null, (List) null, (xzc0) null, (src0) null, 1023), mr20Var, huzVar, iac0Var, w9u0Var, mr20Var2, mr20Var3, huzVar2, playOrigin, mr20Var4, mr20Var5, huzVar3);
    }

    public final k0d0 b(String str, mr20 mr20Var, iac0 iac0Var, w9u0 w9u0Var, mr20 mr20Var2, EsPlayOrigin.PlayOrigin playOrigin, mr20 mr20Var3, mr20 mr20Var4) {
        byp bypVar = (byp) ((toj0) this.a.a.c).b;
        xrc0 xrc0Var = (xrc0) bypVar.d;
        c8o.l(xrc0Var);
        ov20 ov20Var = (ov20) bypVar.f;
        c8o.l(ov20Var);
        dp5 dp5Var = new dp5(xrc0Var, ov20Var, str);
        return a(str, mr20Var, new huz(z6x.a, (byte) 10), iac0Var, w9u0Var, (evz) dp5Var.b, mr20Var2, new huz(w7x.a, (byte) 10), playOrigin, mr20Var3, mr20Var4, new huz(qrc0.a, (byte) 10));
    }

    public final k0d0 c(String str, t4u0 t4u0Var, mr20 mr20Var, huz huzVar, iac0 iac0Var, w9u0 w9u0Var, mr20 mr20Var2, mr20 mr20Var3, huz huzVar2, EsPlayOrigin.PlayOrigin playOrigin, mr20 mr20Var4, mr20 mr20Var5, huz huzVar3) {
        ht20 ht20Var = new ht20(new zx60(yoi1.g(this.h.d(str)), (byte) 13), new s55(2, (lnm) null, (byte) 16));
        this.e.getClass();
        ua91 ua91Var = new ua91(str, playOrigin, this.g, ht20Var);
        this.c.getClass();
        t8r0 t8r0Var = new t8r0();
        evz evzVarR = h5p1.r(h5p1.q(mr20Var2, h5p1.t(u4p1.b0(mr20Var, new pk50((byte) 22)), u4p1.b0(mr20Var3, new pk50((byte) 23)), new poc0()), u4p1.b0(huzVar2, new pk50((byte) 24)), h5p1.t(u4p1.b0(mr20Var4, new pk50((byte) 25)), u4p1.b0(mr20Var5, new pk50((byte) 26)), new x4u0()), u4p1.b0(huzVar3, new pk50((byte) 27)), new y4u0((lnm) null)), ht20Var, u4p1.b0(ua91Var.I(), new pk50((byte) 20)), u4p1.b0(huzVar, new pk50((byte) 21)), new f3());
        t8r0Var.a = evzVarR;
        t8r0Var.b = new h6a(evzVarR, (byte) 10);
        toj0 toj0Var = (toj0) this.d.a.c;
        yqg yqgVar = (yqg) ((byp) toj0Var.b).b;
        c8o.l(yqgVar);
        byp bypVar = (byp) toj0Var.b;
        xrc0 xrc0Var = (xrc0) bypVar.d;
        c8o.l(xrc0Var);
        b7r0 b7r0Var = (b7r0) bypVar.h;
        c8o.l(b7r0Var);
        ur00 ur00Var = new ur00(yqgVar, xrc0Var, b7r0Var, playOrigin, ua91Var, (byte) 20);
        toj0 toj0Var2 = (toj0) this.f.a.c;
        yqg yqgVar2 = (yqg) ((byp) toj0Var2.b).b;
        c8o.l(yqgVar2);
        byp bypVar2 = (byp) toj0Var2.b;
        mr20 mr20Var6 = (mr20) bypVar2.e;
        c8o.l(mr20Var6);
        b7r0 b7r0Var2 = (b7r0) bypVar2.h;
        c8o.l(b7r0Var2);
        k0d0 k0d0Var = new k0d0(str, t4u0Var, t8r0Var, ur00Var, new qkm(yqgVar2, mr20Var6, b7r0Var2, str, w9u0Var), this.b);
        iac0Var.getLifecycle().a(new e72(k0d0Var, (byte) 3));
        return k0d0Var;
    }
}
