package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class wrh implements su30 {
    public static final wrh b = new wrh(0);
    public static final wrh c = new wrh(1);
    public static final wrh d = new wrh(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ wrh(byte b2) {
        this.a = b2;
    }

    @Override // p.su30
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((ContextTrack) obj).uri();
            case 1:
                return ((ContextTrack) obj).uri();
            default:
                return ((bn70) obj).b.a;
        }
    }
}
