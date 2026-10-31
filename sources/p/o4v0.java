package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o4v0 implements sg60 {
    public final String a;
    public final chy b;
    public final idd1 c;

    public o4v0(Activity activity, ut71 ut71Var, String str) {
        this.a = str;
        this.b = new chy("follow_podcast_education", nik1.M0.a, activity.getString(2131964076), activity.getString(2131964077), activity.getString(2131964074), activity.getString(2131964075), null, activity.getString(2131964073), null);
        this.c = new idd1(new d4v0(ut71Var, activity, this, (byte) 1));
    }

    @Override // p.sg60
    public final void a(mfu mfuVar) {
        hma1 hma1VarEdit = ((dma1) this.c.getValue()).edit();
        hma1VarEdit.a(t0c0.n, true);
        hma1VarEdit.h();
    }

    @Override // p.sg60
    public final Observable b(tg60 tg60Var) {
        return ha71.D((dma1) this.c.getValue(), t0c0.n).map(new swm0(tg60Var, (byte) 26)).map(new hvp0(this, (byte) 14));
    }
}
