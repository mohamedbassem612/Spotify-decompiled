package p;

import android.app.Activity;
import android.view.ViewGroup;
import com.spotify.home.evopage.structureapi.a;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g0y0 implements mj00 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public g0y0(lbp lbpVar, tzr0 tzr0Var, n0v0 n0v0Var, wk00 wk00Var, lwp lwpVar, uk00 uk00Var) {
        this.a = (byte) 0;
        this.b = lbpVar;
        this.c = tzr0Var;
        this.d = n0v0Var;
        this.e = wk00Var;
        this.f = lwpVar;
    }

    public static final /* synthetic */ uk00 b(g0y0 g0y0Var) {
        return (uk00) g0y0Var.f;
    }

    public static final /* synthetic */ tiv0 c(g0y0 g0y0Var) {
        return (tiv0) g0y0Var.e;
    }

    public static final boolean d(g0y0 g0y0Var) {
        return !((w25) g0y0Var.e).l();
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        byte b = this.a;
        byte b2 = 27;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                y6w0 y6w0Var = new y6w0(this, (byte) 14);
                fft0 fft0Var = fft0.Y;
                ibi0 ibi0Var = ibi0.P0;
                ji50Var.b.put(lzx0.class, new vw21(fft0Var, b7x.a, new fc3(y6w0Var, (byte) 5), ibi0Var, (vu30) null));
                break;
            case 1:
                d0r d0rVar = ji50Var.a;
                a aVar = xk00Var.d;
                wgp wgpVar = (wgp) ((wfp) obj3).a.c;
                gw70 gw70VarK = wgpVar.a.k();
                c8o.l(gw70VarK);
                kt91 kt91Var = (kt91) wgpVar.a.n0.get();
                c8o.l(kt91Var);
                Activity activityA = wgpVar.a.a();
                c8o.l(activityA);
                t2j0 t2j0VarF = wgpVar.a.f();
                c8o.l(t2j0VarF);
                gd11 gd11Var = new gd11(gw70VarK, kt91Var, activityA, new u210(t2j0VarF), d0rVar, aVar);
                ji50Var.b.put(wc11.class, new r3r(new bso(fdg1.m0(new pbi0((lg51) obj2, gd11Var, new ozu0(this, gd11Var, xk00Var, b2)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new dw81(this, (byte) 28)), ibi0.V0, (vu30) null));
                break;
            case 2:
                d0r d0rVar2 = ji50Var.a;
                wh1 wh1Var = (wh1) obj2;
                idd1 idd1Var = new idd1(new ft0(this, xk00Var, (byte) 25));
                wgp wgpVar2 = (wgp) ((yfp) obj3).a.c;
                gw70 gw70VarK2 = wgpVar2.a.k();
                c8o.l(gw70VarK2);
                lo60 lo60VarU = wgpVar2.u();
                myq0 myq0VarV = wgpVar2.v();
                lwp lwpVar = (lwp) wgpVar2.a.O1.get();
                c8o.l(lwpVar);
                Flowable flowable = (Flowable) wgpVar2.a.j.get();
                c8o.l(flowable);
                xh71 xh71Var = (xh71) wgpVar2.a.O.get();
                c8o.l(xh71Var);
                wzq wzqVar = new wzq(fdg1.m0(new xdf1(gw70VarK2, lo60VarU, myq0VarV, lwpVar, flowable, xh71Var, (ycm) wgpVar2.f0.get(), (yqg) wgpVar2.f.get(), d0rVar2, wh1Var, idd1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), v7f1.W0);
                z691 z691Var = z691.f;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(kdf1.class, new r3r(wzqVar, z691Var, (vu30) null));
                d0r d0rVar3 = ji50Var.a;
                idd1 idd1Var2 = new idd1(new x0e1(this, xk00Var, (byte) 21));
                boolean zA0 = ((w25) this.f).a0();
                wgp wgpVar3 = (wgp) ((zfp) obj).a.c;
                gw70 gw70VarK3 = wgpVar3.a.k();
                c8o.l(gw70VarK3);
                lo60 lo60VarU2 = wgpVar3.u();
                myq0 myq0VarV2 = wgpVar3.v();
                lwp lwpVar2 = (lwp) wgpVar3.a.O1.get();
                c8o.l(lwpVar2);
                mr20 mr20Var = (mr20) wgpVar3.a.k.get();
                c8o.l(mr20Var);
                linkedHashMap.put(wef1.class, new r3r(new wzq(fdg1.m0(new uef1(gw70VarK3, lo60VarU2, myq0VarV2, lwpVar2, mr20Var, (yqg) wgpVar3.f.get(), d0rVar3, wh1Var, idd1Var2, zA0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), v7f1.X0), ppd1.d1, (vu30) null));
                break;
            default:
                bso bsoVar = new bso(fdg1.m0(new xzq(new nm1(ji50Var.a, (Function0) new sjf1(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 16), (b8l1) obj3, (Function0) obj, (iac0) obj2), new hbz0(this, (byte) 28)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new mzg1(this, (byte) 1));
                u5l1 u5l1Var = u5l1.f;
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                linkedHashMap2.put(ral1.class, new r3r(bsoVar, u5l1Var, (vu30) null));
                eii1 eii1Var = new eii1(this, xk00Var, (byte) 27);
                v5l1 v5l1Var = v5l1.Q0;
                u5l1 u5l1Var2 = u5l1.g;
                linkedHashMap2.put(r6l1.class, new vw21(v5l1Var, b7x.a, new fc3(eii1Var, (byte) 5), u5l1Var2, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public /* synthetic */ g0y0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
