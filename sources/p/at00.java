package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class at00 implements d5t0 {
    public final oxp a;

    public at00(oxp oxpVar) {
        this.a = oxpVar;
    }

    public final void a(d0r d0rVar, ji50 ji50Var, sjq0 sjq0Var) {
        lzn0 lzn0Var = (lzn0) ((y4t0) ((h72) this.a.a.c).b).f.get();
        c8o.l(lzn0Var);
        wzq wzqVar = new wzq(fdg1.m0(new jd6(lzn0Var, d0rVar, (byte) 9), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fa00.Y0);
        ji50Var.b.put(s4t0.class, new r3r(wzqVar, yty.T0, (vu30) null));
        ((LinkedHashMap) sjq0Var.b).put(s4t0.class, wzqVar);
        sjq0Var.c = d0rVar;
    }
}
