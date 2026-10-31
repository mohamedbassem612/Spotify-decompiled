package p;

import android.view.View;
import com.spotify.transcript.commons.views.ElementContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ba01 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s59 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba01(s59 s59Var, byte b) {
        super(0);
        this.a = b;
        this.b = s59Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s59 s59Var = this.b;
        switch (b) {
            case 0:
                return (ElementContainer) ((View) s59Var.b).findViewById(2131427888);
            default:
                return ((View) s59Var.b).findViewById(2131430656);
        }
    }
}
