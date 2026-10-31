package p;

import android.view.View;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jmm implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextualAudioFragment b;

    public /* synthetic */ jmm(ContextualAudioFragment contextualAudioFragment, byte b) {
        this.a = b;
        this.b = contextualAudioFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ContextualAudioFragment contextualAudioFragment = this.b;
        switch (b) {
            case 0:
                contextualAudioFragment.Z0().T(contextualAudioFragment.Y0().q());
                break;
            default:
                ptf1 ptf1VarY0 = contextualAudioFragment.Y0();
                i8h1 i8h1Var = (i8h1) ptf1VarY0.b;
                x6h1 x6h1VarC = ((grk0) ptf1VarY0.c).a.c();
                x6h1VarC.i.add(new a7h1("contextual_audio_negative_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                contextualAudioFragment.Z0().U();
                break;
        }
    }
}
