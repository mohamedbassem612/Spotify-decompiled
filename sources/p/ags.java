package p;

import android.os.Bundle;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ags implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ags(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((dgs) obj2).r.onNext(Boolean.valueOf(z));
                break;
            case 1:
                lik1 lik1Var = NowPlayingActivity.y1;
                ((NowPlayingActivity) obj2).o0(r3p0.class, (Bundle) obj, z);
                break;
            default:
                ((xx91) obj2).p.onNext(new i3a1(z));
                break;
        }
    }
}
