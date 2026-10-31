package p;

import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import com.spotify.coremediarenderer.bridge.CmrBridge;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ttg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public boolean f;
    public final /* synthetic */ wtg g;

    public ttg(wtg wtgVar, String str, String str2, String str3, String str4, String str5) {
        this.g = wtgVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final void a(Surface surface) {
        String str = this.a;
        Logger.g("deliverSurface: playback=%s, surface=%s", new Object[]{str, surface});
        ((CmrBridge) this.g.b.b).f(str, this.b, this.c, this.d, this.e, surface);
    }
}
