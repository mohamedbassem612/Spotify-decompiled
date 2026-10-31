package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class il11 implements owo0 {
    public final /* synthetic */ byte a;
    public final lv4 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ il11(Object obj, Object obj2, Object obj3, lv4 lv4Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = lv4Var;
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(wxo0.class);
            default:
                return rc11.a.b(ayo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        k811 k811Var;
        nm1 nm1Var;
        s7a1 s7a1Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        lv4 lv4Var = this.b;
        switch (b) {
            case 0:
                kko kkoVar = (kko) obj2;
                LinkedHashMap linkedHashMap = ji50Var.b;
                if (!lv4Var.h()) {
                    rvp rvpVar = (rvp) obj;
                    switch (rvpVar.a) {
                        case 0:
                            nwp nwpVar = (nwp) ((gbp) rvpVar.b).c;
                            k811Var = new k811(new rpv0((svp) nwpVar.X0.get(), (byte) 18), new rk11((tvp) nwpVar.Y0.get()), kkoVar, (byte) 7);
                            break;
                        default:
                            v5q v5qVar = (v5q) ((thq) rvpVar.b).c;
                            k811Var = new k811(new rpv0((svp) v5qVar.q9.get(), (byte) 18), (rk11) v5qVar.s9.get(), kkoVar, (byte) 7);
                            break;
                    }
                    bpb1 bpb1VarB = gio1.b(w7x.a);
                    ziz0 ziz0Var = new ziz0(k811Var, (byte) 24);
                    Set setU = l1d.u(jo70.class);
                    ((rk11) k811Var.d).getClass();
                    linkedHashMap.put(wxo0.class, r4o1.Q(new gcv(bpb1VarB, (byte) 3), dm61.y0(setU, rk11.b(1)), ziz0Var, h211.Q0));
                } else {
                    uvp uvpVar = (uvp) obj3;
                    d0r d0rVar = ji50Var.a;
                    xho xhoVar = new xho(kkoVar);
                    switch (uvpVar.a) {
                        case 0:
                            nwp nwpVar2 = (nwp) ((gbp) uvpVar.b).c;
                            gw70 gw70VarA0 = nwpVar2.a.a0();
                            c8o.l(gw70VarA0);
                            nm1Var = new nm1(gw70VarA0, (vvp) nwpVar2.a1.get(), d0rVar, xhoVar);
                            break;
                        default:
                            thq thqVar = (thq) uvpVar.b;
                            nm1Var = new nm1((gw70) thqVar.b.d8.get(), (vvp) ((v5q) thqVar.c).u9.get(), d0rVar, xhoVar);
                            break;
                    }
                    linkedHashMap.put(wxo0.class, new r3r(new wzq(fdg1.m0(nm1Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ej11.Z), h211.P0, (vu30) null));
                }
                break;
            default:
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                if (!lv4Var.i()) {
                    wh91 wh91Var = new wh91(this, (byte) 8);
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) ((r2a1) obj).b;
                    linkedHashMap2.put(ayo0.class, new vw21(new qd81(this, (byte) 5), linkedHashMap3, new fc3(wh91Var, (byte) 5), h9a1.i, (vu30) null));
                } else {
                    d0r d0rVar2 = ji50Var.a;
                    ojm ojmVar = (ojm) obj2;
                    awp awpVar = (awp) ((zb91) obj3).b;
                    switch (awpVar.a) {
                        case 0:
                            gw70 gw70VarA1 = ((nwp) ((gbp) awpVar.b).c).a.a0();
                            c8o.l(gw70VarA1);
                            s7a1Var = new s7a1(gw70VarA1, d0rVar2, ojmVar);
                            break;
                        default:
                            s7a1Var = new s7a1((gw70) ((thq) awpVar.b).b.d8.get(), d0rVar2, ojmVar);
                            break;
                    }
                    linkedHashMap2.put(ayo0.class, new r3r(new wzq(fdg1.m0(s7a1Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), y8a1.d1), h9a1.h, (vu30) null));
                }
                break;
        }
    }
}
