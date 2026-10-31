package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nto extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nto(pto ptoVar, byte b) {
        super(2);
        this.a = b;
        this.b = ptoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ult0 tlt0Var;
        ui01 ui01Var;
        switch (this.a) {
            case 0:
                ks6 ks6Var = this.b.m;
                return new jpg0(f6o1.A(new xho((kko) ((AtomicReference) ks6Var.N0).updateAndGet(new xcr0(ks6Var, (byte) 0))), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.R0);
            case 1:
                pto ptoVar = this.b;
                vyo vyoVar = ptoVar.d;
                ks6 ks6Var2 = ptoVar.m;
                wxu wxuVar = (wxu) ((AtomicReference) ks6Var2.P0).updateAndGet(new xcr0(ks6Var2, (byte) 1));
                List list = ((oyu) ((AtomicReference) ks6Var2.Q0).updateAndGet(new ycr0(ks6Var2, (y1c1) obj, (byte) 0))).o;
                if (list != null) {
                    return new jpg0(f6o1.A(vyo.b(vyoVar, wxuVar, list), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.S0);
                }
                u890.C("_gates");
                throw null;
            case 2:
                return new jpg0(this.b.l.a(), eno.T0);
            case 3:
                return new jpg0(f6o1.A(ycm.a(this.b.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new x98(rcm.a, (byte) 1));
            case 4:
                y1c1 y1c1Var = (y1c1) obj;
                iac0 iac0Var = (iac0) obj2;
                pto ptoVar2 = this.b;
                boolean z = ptoVar2.f;
                ynb0 ynb0Var = ptoVar2.r;
                ks6 ks6Var3 = ptoVar2.m;
                if (!z) {
                    k740 k740VarD = ks6Var3.d(y1c1Var);
                    ozc0 ozc0Var = ptoVar2.v;
                    foc0 foc0Var = ozc0Var != null ? new foc0(ptoVar2.u.a(iac0Var, k740VarD, (PlayOrigin) ynb0Var.get()), ozc0Var, ptoVar2.w, ptoVar2.x, ptoVar2.y, (PlayOrigin) ynb0Var.get()) : null;
                    zet0 zet0Var = ptoVar2.c;
                    btt0 btt0Var = (btt0) ((AtomicReference) ks6Var3.R0).updateAndGet(new ycr0(ks6Var3, y1c1Var, (byte) 3));
                    zrt0 zrt0Var = (zrt0) ((AtomicReference) ks6Var3.S0).updateAndGet(new ycr0(ks6Var3, y1c1Var, (byte) 2));
                    PlayOrigin playOrigin = (PlayOrigin) ynb0Var.get();
                    zet0Var.a.getClass();
                    r0s0 r0s0Var = new r0s0(k740VarD, btt0Var, zrt0Var, (byte) 16);
                    if (foc0Var == null) {
                        foc0Var = zet0Var.b.a(iac0Var, k740VarD, playOrigin);
                    }
                    return new jpg0(f6o1.A(new ngs0(r0s0Var, foc0Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.U0);
                }
                cp31 cp31Var = ptoVar2.e;
                idd1 idd1Var = (idd1) cp31Var.f;
                ozc0 ozc0Var2 = (ozc0) cp31Var.e;
                if (ozc0Var2 != null) {
                    b0d0 b0d0Var = (b0d0) cp31Var.b;
                    String str = ozc0Var2.a;
                    ruz ruzVarA = ((cyp) idd1Var.getValue()).a();
                    huz huzVar = new huz(Collections.singleton("mft"), (byte) 10);
                    EsPlayOrigin.PlayOrigin playOriginA = tot0.a((PlayOrigin) ((ynb0) cp31Var.d).get());
                    trc0 trc0Var = ozc0Var2.c;
                    b7x b7xVar = b7x.a;
                    huz huzVar2 = new huz(b7xVar, (byte) 10);
                    huz huzVar3 = new huz(b7xVar, (byte) 10);
                    b0d0Var.getClass();
                    huz huzVar4 = new huz(trc0Var.c, (byte) 10);
                    huz huzVar5 = new huz(trc0Var.i, (byte) 10);
                    byp bypVar = (byp) ((toj0) b0d0Var.a.a.c).b;
                    xrc0 xrc0Var = (xrc0) bypVar.d;
                    c8o.l(xrc0Var);
                    ov20 ov20Var = (ov20) bypVar.f;
                    c8o.l(ov20Var);
                    evz evzVar = (evz) new dp5(xrc0Var, ov20Var, str).b;
                    g3d0 g3d0Var = trc0Var.b;
                    tlt0Var = new ult0(b0d0Var.c(str, new t4u0(g3d0Var, trc0Var.c, trc0Var.i, trc0Var.g == prc0.b ? xzc0.b : xzc0.c, trc0Var.e, 488), huzVar4, huzVar5, iac0Var, ruzVarA, evzVar, new huz(g3d0Var, (byte) 10), huzVar, playOriginA, huzVar2, huzVar3, new huz(trc0Var.e, (byte) 10)));
                } else {
                    tlt0Var = new tlt0(((cyp) idd1Var.getValue()).d(), ((cyp) idd1Var.getValue()).a());
                }
                return fdg1.m0(new xzq(((zwp) cp31Var.a).a((d0r) cp31Var.c, tlt0Var), new rr6(cp31Var, (byte) 20)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 5:
                return new jpg0(f6o1.A(ycm.a(this.b.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new x98(tcm.a, (byte) 1));
            case 6:
                pto ptoVar3 = this.b;
                return new jpg0(f6o1.A(new ve51(ptoVar3.o, ptoVar3.g, ptoVar3.h, ptoVar3.i, ptoVar3.j), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.V0);
            case 7:
                pto ptoVar4 = this.b;
                eap eapVar = ptoVar4.n;
                k740 k740VarD2 = ptoVar4.m.d((y1c1) obj);
                ks6 ks6Var4 = this.b.m;
                synchronized (((rck1) ks6Var4.d)) {
                    try {
                        xbk1 xbk1Var = (xbk1) ((rck1) ks6Var4.d).a.get("recaps_player_view_model");
                        ucr0 ucr0Var = xbk1Var instanceof ucr0 ? (ucr0) xbk1Var : null;
                        if (ucr0Var == null) {
                            ucr0Var = new ucr0((ki01) ks6Var4.X, (String) ks6Var4.b, (PlayOrigin) ((ynb0) ks6Var4.Y).get(), (iac0) ks6Var4.c);
                            xbk1 xbk1Var2 = (xbk1) ((rck1) ks6Var4.d).a.put("recaps_player_view_model", ucr0Var);
                            if (xbk1Var2 != null) {
                                xbk1Var2.Q();
                            }
                        }
                        ui01Var = ucr0Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                pto ptoVar5 = this.b;
                String str2 = ptoVar5.q;
                d0r d0rVar = ptoVar5.o;
                eapVar.getClass();
                eto etoVar = (eto) ((f0a) eapVar.a.c).b;
                kdy0 kdy0Var = etoVar.R;
                h9d0 h9d0Var = etoVar.S;
                p410 p410Var = etoVar.e0;
                sjq0 sjq0Var = etoVar.d0;
                lls0 lls0Var = etoVar.Q;
                String str3 = etoVar.r0;
                c8o.l(str3);
                return new wzq(fdg1.m0(new cnb(kdy0Var, h9d0Var, p410Var, sjq0Var, lls0Var, str3, k740VarD2, ui01Var, str2, d0rVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.W0);
            default:
                return new jpg0(f6o1.A(new xnb(this.b.o, (byte) 0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), eno.X0);
        }
    }
}
