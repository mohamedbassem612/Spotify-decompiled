package p;

import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bcz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ JamHeaderContainerView b;
    public final /* synthetic */ ccz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcz0(JamHeaderContainerView jamHeaderContainerView, ccz0 ccz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = jamHeaderContainerView;
        this.c = ccz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ccz0 ccz0Var = this.c;
        JamHeaderContainerView jamHeaderContainerView = this.b;
        switch (b) {
            case 0:
                jamHeaderContainerView.getOnAnimationEnd().invoke();
                ccz0Var.d1 = null;
                break;
            default:
                jamHeaderContainerView.removeAllViews();
                jamHeaderContainerView.getOnAnimationEnd().invoke();
                ccz0Var.d1 = null;
                break;
        }
        return rih1Var;
    }
}
