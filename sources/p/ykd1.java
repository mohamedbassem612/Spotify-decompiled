package p;

import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ykd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zkd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ykd1(zkd1 zkd1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zkd1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zkd1 zkd1Var = this.c;
        switch (b) {
            case 0:
                return new ykd1(zkd1Var, lnmVar, (byte) 0);
            default:
                return new ykd1(zkd1Var, lnmVar, (byte) 1);
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
        zkd1 zkd1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableMap flowableMap = zkd1Var.h;
                vbm[] vbmVarArr = q601.a;
                plu pluVarW = rqt0.w(new kge(flowableMap), vkd1.e, rqt0.b);
                xkd1 xkd1Var = new xkd1(zkd1Var, (byte) 0);
                this.b = true;
                return pluVarW.collect(xkd1Var, this) == d9nVar ? d9nVar : rih1Var;
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
                OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = zkd1Var.y1;
                if (overlayHidingGradientBackgroundView == null) {
                    u890.C("modeRootView");
                    throw null;
                }
                Flowable<nwq0> overlayState = overlayHidingGradientBackgroundView.getOverlayState();
                vbm[] vbmVarArr2 = q601.a;
                mr20 mr20VarR = o4p1.r(new kge(overlayState), zkd1Var.s1);
                xkd1 xkd1Var2 = new xkd1(zkd1Var, (byte) 1);
                this.b = true;
                return mr20VarR.collect(xkd1Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
