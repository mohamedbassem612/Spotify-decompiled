package p;

import android.content.Context;
import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bsn implements kly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ bsn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new asn((Context) ((kc00) obj).b, new twb((byte) 29), new khc((byte) 28));
            case 1:
                return ((vap) ((bns) obj).c.getValue()).a();
            case 2:
                return Boolean.valueOf(!((SpotifyMainActivity) obj).e0().U());
            case 3:
                return (xpw) ((ynb0) ((o3e0) obj).d).get();
            case 4:
                return ((wk00) ((g0y0) obj).e).a;
            default:
                return ((wk00) ((jbi0) obj).d).a;
        }
    }
}
