package p;

import android.net.NetworkRequest;
import com.spotify.puffin.autoupdating.workmanager.FilterUpdateWorker;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cm41 implements Function0 {
    public final hz4 a;
    public final xfb0 b;
    public final uf0 c;

    public cm41(hz4 hz4Var, xfb0 xfb0Var, uf0 uf0Var) {
        this.a = hz4Var;
        this.b = xfb0Var;
        this.c = uf0Var;
    }

    public final Object invoke() {
        if (this.a.a() > this.b.a.l(yfb0.a, 0)) {
            Object obj = awl1.d(this.c.a).c("puffin_filter_update_work", 1, new ciq0(FilterUpdateWorker.class).f(new gjl(new e8o0((NetworkRequest) null), 3, false, false, true, false, -1L, -1L, o7h.p1(new LinkedHashSet()))).b()).b;
        }
        return rih1.a;
    }
}
