package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yd6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd6(String str, tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.b = str;
        this.c = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        String str = this.b;
        tob1 tob1Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                StoryCard storyCard = ((wgm1) tob1Var.getValue()).a;
                return Boolean.valueOf(u890.j(storyCard != null ? storyCard.getId() : null, str));
            case 1:
                return f4i1.e((String) tob1Var.getValue(), str != null ? " - ".concat(str) : "");
            case 2:
                if (str != null && ((Set) tob1Var.getValue()).contains(str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (str != null && ((Set) tob1Var.getValue()).contains(str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((Set) tob1Var.getValue()).contains(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd6(tob1 tob1Var, String str, byte b) {
        super(0);
        this.a = b;
        this.c = tob1Var;
        this.b = str;
    }
}
