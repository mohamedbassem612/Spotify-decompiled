package p;

import android.content.Context;
import com.spotify.endless.sessionstarter.EndlessActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o5y {
    public static final bma1 c = bma1.b.u("key_was_your_dj_ever_added_to_rootlist");
    public final dma1 a;
    public final boolean b;

    public o5y(Context context, vji1 vji1Var, ut71 ut71Var) {
        String stringExtra = ((EndlessActivity) vji1Var).getIntent().getStringExtra("com.spotify.endless.sessionstarter.KEY_USERNAME");
        dma1 dma1VarB = ut71Var.b(context, stringExtra == null ? "" : stringExtra);
        this.a = dma1VarB;
        this.b = dma1VarB.i(c);
    }
}
