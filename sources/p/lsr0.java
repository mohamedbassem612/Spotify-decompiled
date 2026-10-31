package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lsr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nsr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lsr0(nsr0 nsr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = nsr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nsr0 nsr0Var = this.b;
        switch (b) {
            case 0:
                nsr0Var.a.a(ixb.c);
                break;
            case 1:
                ((lzn0) nsr0Var.e.get()).f(new dwn0("spotify:internal:parental-control:remove-parent", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                break;
            default:
                z710.d((z710) nsr0Var.f.get(), "https://spotify.com/account", false, 6);
                break;
        }
        return rih1Var;
    }
}
