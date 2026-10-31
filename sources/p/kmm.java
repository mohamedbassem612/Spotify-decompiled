package p;

import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kmm implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextualAudioFragment b;

    public /* synthetic */ kmm(ContextualAudioFragment contextualAudioFragment, byte b) {
        this.a = b;
        this.b = contextualAudioFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        ContextualAudioFragment contextualAudioFragment = this.b;
        switch (b) {
            case 0:
                return contextualAudioFragment.N0().o();
            default:
                return contextualAudioFragment.N0().O();
        }
    }
}
