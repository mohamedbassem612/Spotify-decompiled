package p;

import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lnj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pnj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnj1(pnj1 pnj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pnj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pnj1 pnj1Var = this.c;
        switch (b) {
            case 0:
                return new lnj1(pnj1Var, lnmVar, (byte) 0);
            default:
                return new lnj1(pnj1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        pnj1 pnj1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    long jE = pnj1Var.t.e();
                    Flowable flowable = pnj1Var.D1;
                    vbm[] vbmVarArr = q601.a;
                    kge kgeVar = new kge(flowable);
                    this.b = true;
                    Object objO = rc2.O(jE, new i2p0(kgeVar, null, (byte) 27), this);
                    if (objO != d9nVar) {
                        objO = rih1Var;
                    }
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                pnj1Var.g();
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                OverlayHidingFrameLayout overlayHidingFrameLayout = pnj1Var.T1;
                if (overlayHidingFrameLayout == null) {
                    u890.C("overlayControlsView");
                    throw null;
                }
                Flowable<nwq0> overlayState = overlayHidingFrameLayout.getOverlayState();
                vbm[] vbmVarArr2 = q601.a;
                mr20 mr20VarR = o4p1.r(new kge(overlayState), pnj1Var.H1);
                mnj1 mnj1Var = new mnj1(pnj1Var, (byte) 2);
                this.b = true;
                return mr20VarR.collect(mnj1Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
