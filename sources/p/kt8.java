package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kt8 {
    public static final bma1 e;
    public static final bma1 f;
    public static final t3v0 g;
    public static final EnumSet h;
    public final mt8 a;
    public final x3v0 b;
    public final idd1 c;
    public final idd1 d;

    static {
        nbc nbcVar = bma1.b;
        e = nbcVar.u("PodcastAutoDownload.onboarding-snackbar-shown");
        f = nbcVar.u("PodcastAutoDownload.video-download-dialog-shown");
        Boolean bool = Boolean.TRUE;
        g = new t3v0((Map) null, (Map) null, sqg0.J(new mmr0[]{oqn1.n("isBook", bool), oqn1.n("isMusicAndTalk", bool)}), (List) null, (List) null, 221);
        h = EnumSet.of(blc0.ld, blc0.Pg);
    }

    public kt8(Context context, ut71 ut71Var, Observable observable, o241 o241Var, mt8 mt8Var, x3v0 x3v0Var) {
        this.a = mt8Var;
        this.b = x3v0Var;
        this.c = new idd1(new hh(observable, ut71Var, context, (byte) 26));
        this.d = new idd1(new i26(o241Var, (byte) 29));
    }

    public final Single a() {
        return ((Single) this.c.getValue()).map(qzs0.X).map(rzs0.t);
    }
}
