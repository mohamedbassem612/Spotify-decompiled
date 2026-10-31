package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t0c0 implements pg60 {
    public static final bma1 l;
    public static final bma1 m;
    public static final bma1 n;
    public static final bma1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bma1 f42p;
    public final String a;
    public final evm1 b;
    public final r6c0 c;
    public final Scheduler d;
    public final yqg e;
    public final idd1 f;
    public final chy g;
    public final chy h;
    public final chy i;
    public final chy j;
    public final idd1 k;

    static {
        nbc nbcVar = bma1.b;
        l = nbcVar.n("YourLibraryX.create_playlist_hint_dismissed");
        m = nbcVar.n("YourLibraryX.follow_podcast_hint_dismissed");
        n = nbcVar.n("YourLibraryX.follow_podcast_education_hint_dismissed");
        o = nbcVar.n("YourLibraryX.offboard_new_episodes_to_following_feed_hint_dismissed");
        f42p = nbcVar.n("YourLibraryX.offboard_new_episodes_to_following_feed_shown_date");
    }

    public t0c0(Activity activity, ut71 ut71Var, String str, evm1 evm1Var, r6c0 r6c0Var, Scheduler scheduler, yqg yqgVar) {
        this.a = str;
        this.b = evm1Var;
        this.c = r6c0Var;
        this.d = scheduler;
        this.e = yqgVar;
        this.f = new idd1(new dt90(ut71Var, activity, this, (byte) 5));
        this.g = new chy("create_playlist", nik1.C1.a, activity.getString(2131964057), activity.getString(2131964058), activity.getString(2131964053), activity.getString(2131964054), activity.getString(2131964055), activity.getString(2131964056), null);
        lik1 lik1Var = nik1.M0;
        this.h = new chy("follow_podcast", lik1Var.a, activity.getString(2131964080), activity.getString(2131964081), activity.getString(2131964078), activity.getString(2131964079), null, activity.getString(2131964073), null);
        this.i = new chy("follow_podcast_education", lik1Var.a, activity.getString(2131964076), activity.getString(2131964077), activity.getString(2131964074), activity.getString(2131964075), null, activity.getString(2131964073), null);
        this.j = new chy("offboard_new_episodes", "spotify:home?facet=podcasts-following-chip", activity.getString(2131964114), activity.getString(2131964118), activity.getString(2131964115), activity.getString(2131964116), activity.getString(2131964117), activity.getString(2131964113), 0);
        this.k = new idd1(new nzb0(this, (byte) 1));
    }

    @Override // p.pg60
    public final ObservableTransformer a() {
        return (ObservableTransformer) this.k.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p.pg60
    public final void b(String str, mfu mfuVar) {
        if (mfuVar instanceof gfu) {
            this.c.d = ((gfu) mfuVar).a;
            return;
        }
        hma1 hma1VarEdit = c().edit();
        switch (str.hashCode()) {
            case -1614049793:
                if (str.equals("offboard_new_episodes")) {
                    if (!mfuVar.equals(efu.a)) {
                        hma1VarEdit.a(o, false);
                    } else {
                        hma1VarEdit.a(o, true);
                    }
                }
                break;
            case -1499107915:
                if (str.equals("create_playlist")) {
                    hma1VarEdit.a(l, true);
                }
                break;
            case -995744650:
                if (str.equals("follow_podcast")) {
                    hma1VarEdit.a(m, true);
                }
                break;
            case 228584223:
                if (str.equals("follow_podcast_education")) {
                    hma1VarEdit.a(n, true);
                }
                break;
        }
        hma1VarEdit.h();
    }

    public final dma1 c() {
        return (dma1) this.f.getValue();
    }

    public final Observable d(bma1 bma1Var) {
        return yoi1.i(c().q(bma1Var), o6x.a).map(new x390(this, bma1Var, (byte) 23)).startWith(Observable.fromCallable(new e71((Object) this, (Object) bma1Var, (byte) 12)));
    }
}
