package p;

import com.spotify.player.model.ContextTrack$Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2i0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zlm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2i0(zlm zlmVar, byte b) {
        super(0);
        this.a = b;
        this.b = zlmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        zlm zlmVar = this.b;
        switch (b) {
            case 0:
                String str = (String) zlmVar.a.metadata().get(ContextTrack$Metadata.KEY_ALBUM_TITLE);
                return str == null ? "" : str;
            default:
                return l4o1.l(zlmVar.a);
        }
    }
}
