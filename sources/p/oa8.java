package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oa8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tcr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa8(tcr0 tcr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = tcr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kcr0 kcr0Var = kcr0.a;
        tcr0 tcr0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return f6o1.A(new xho((kko) tcr0Var.a(kcr0Var)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
    }
}
