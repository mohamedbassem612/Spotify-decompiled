package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n740 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextTrack b;
    public final /* synthetic */ String c;

    public /* synthetic */ n740(ContextTrack contextTrack, String str, byte b) {
        this.a = b;
        this.b = contextTrack;
        this.c = str;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        ContextTrack contextTrack = this.b;
        switch (b) {
            case 0:
                return new fxo0(contextTrack.uri(), this.c);
            default:
                return new gef0((a9h) obj, contextTrack.uri(), this.c, (String) sqg0.G(ContextTrack$Metadata.KEY_TITLE, contextTrack.metadata()), l4o1.l(contextTrack), (String) sqg0.G("image_url", contextTrack.metadata()));
        }
    }
}
