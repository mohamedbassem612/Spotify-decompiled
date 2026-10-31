package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ojv implements ynb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ojv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((cyp) obj).a();
            case 1:
                return (PlayOrigin) obj;
            case 2:
                return (r8e0) obj;
            default:
                return ((tau0) obj).a();
        }
    }
}
