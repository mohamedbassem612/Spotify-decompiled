package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fwa0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gwa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwa0(gwa0 gwa0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gwa0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gwa0 gwa0Var = this.b;
        switch (b) {
            case 0:
                ((c8w) gwa0Var.d).b("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                break;
            default:
                ((c8w) gwa0Var.d).c("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                break;
        }
        return rih1Var;
    }
}
