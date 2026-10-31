package p;

import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fbc1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StorytellingContainerFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbc1(StorytellingContainerFragment storytellingContainerFragment, byte b) {
        super(0);
        this.a = b;
        this.b = storytellingContainerFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        StorytellingContainerFragment storytellingContainerFragment = this.b;
        switch (b) {
            case 0:
                ij01 ij01Var = storytellingContainerFragment.I1;
                if (ij01Var == null) {
                    u890.C("shareMenuVisibilityConsumer");
                    throw null;
                }
                ((fb71) ij01Var.b).a.onNext(eb71.b);
                if (((zf30) storytellingContainerFragment).a >= 7) {
                    ewn0 ewn0Var = storytellingContainerFragment.H1;
                    if (ewn0Var == null) {
                        u890.C("pauseStateConsumer");
                        throw null;
                    }
                    ewn0Var.f(kas0.b);
                }
                return rih1Var;
            default:
                ewn0 ewn0Var2 = storytellingContainerFragment.H1;
                if (ewn0Var2 == null) {
                    u890.C("pauseStateConsumer");
                    throw null;
                }
                ewn0Var2.f(kas0.a);
                ij01 ij01Var2 = storytellingContainerFragment.I1;
                if (ij01Var2 != null) {
                    ((fb71) ij01Var2.b).a.onNext(eb71.a);
                    return rih1Var;
                }
                u890.C("shareMenuVisibilityConsumer");
                throw null;
        }
    }
}
