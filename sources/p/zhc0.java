package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zhc0 implements wpw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final mqw d;
    public final rqw e;
    public final rsw f;

    public zhc0(dw01 dw01Var, vyq0 vyq0Var, vgm vgmVar, fgx fgxVar, lo60 lo60Var, tq01 tq01Var, kly0 kly0Var, bpb1 bpb1Var, boolean z, agc0 agc0Var, t2j0 t2j0Var, boolean z2, boolean z3, r860 r860Var, boolean z4, gw70 gw70Var, i3h i3hVar) {
        this.a = (byte) 1;
        this.b = kly0Var;
        this.c = z4 ? new rwj(lo60Var, vgmVar, agc0Var, bpb1Var, gw70Var, i3hVar, z3) : q1o1.u(new rt01(fgxVar, lo60Var, vgmVar, agc0Var, bpb1Var, z3), (qim0) null, (FrameLayout.LayoutParams) null, 7);
        rq01 rq01Var = new rq01(dw01Var, tq01Var, vyq0Var, t2j0Var, z2, r860Var);
        this.d = w3p1.q(new hbz0(rq01Var, (byte) 4), new ldz0(rq01Var, (byte) 11), new nsm0(rq01Var), (o8n) null, (iu30) null, 24);
        this.e = n3o1.q(this).a(bnx0.e, kxz0.a1);
        this.f = f6o1.j((ViewGroup.LayoutParams) null, apo.j(699909051, new pq01(this, z), true), 7);
    }

    @Override // p.avl1
    public final rqw a() {
        switch (this.a) {
            case 0:
                return (eih1) this.e;
            case 1:
                return (ia00) this.e;
            default:
                return (ia00) this.e;
        }
    }

    @Override // p.laa
    public final rsw c() {
        switch (this.a) {
            case 0:
                return (nsw) this.f;
            case 1:
                return (osw) this.f;
            default:
                return (nsw) this.f;
        }
    }

    @Override // p.laa
    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (rey0) this.d;
            case 1:
                return (js20) this.d;
            default:
                return (rey0) this.d;
        }
    }

    public zhc0(gw70 gw70Var, nww0 nww0Var) {
        this.a = (byte) 0;
        this.b = gw70Var;
        this.c = nww0Var;
        this.d = ila0.D();
        this.e = b3o1.A();
        this.f = jch0.j(new bt70(this, (byte) 24));
    }

    public zhc0(Context context, gw70 gw70Var, epb1 epb1Var, lzn0 lzn0Var, l0x0 l0x0Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, idd1 idd1Var5, y441 y441Var, hvp0 hvp0Var, aru0 aru0Var, Flowable flowable, kko kkoVar, klv0 klv0Var, vgm vgmVar, mr20 mr20Var, iu30 iu30Var, Function0 function0, Function0 function1, lc81 lc81Var, uu00 uu00Var, tbw0 tbw0Var, yqg yqgVar, cua cuaVar, dnc dncVar, iac0 iac0Var, r961 r961Var, ggl gglVar, boolean z, t2j0 t2j0Var, krh krhVar, ov20 ov20Var, llm llmVar, nwt nwtVar, int i) {
        this.a = (byte) 2;
        this.b = r961Var;
        this.c = f6o1.A(new hd81(context, gw70Var, epb1Var, lzn0Var, l0x0Var, idd1Var, idd1Var2, idd1Var3, idd1Var4, idd1Var5, y441Var, hvp0Var, aru0Var, flowable, kkoVar, klv0Var, vgmVar, mr20Var, iu30Var, function0, function1, lc81Var, uu00Var, tbw0Var, yqgVar, cuaVar, dncVar, iac0Var, gglVar, z, t2j0Var, krhVar, ov20Var, llmVar, nwtVar, i), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        this.e = n3o1.q(this).a(c781.g, c781.h);
        this.f = jch0.j(new ge81(this, i));
        this.d = ila0.D();
    }
}
