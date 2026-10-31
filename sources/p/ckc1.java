package p;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.comscore.streaming.ContentMediaFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ckc1 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ pbq e;

    public ckc1(pbq pbqVar, int i) {
        this.e = pbqVar;
        this.a = i;
    }

    public final void a() {
        pbq pbqVar = this.e;
        wdd1 wdd1Var = (wdd1) pbqVar.t;
        yo00 yo00Var = (yo00) pbqVar.f;
        int iC0 = yo00Var.c0();
        if (!yo00Var.q() || yo00Var.getPlaybackState() == 1 || yo00Var.getPlaybackState() == 4 || iC0 == 0 || iC0 == 1) {
            if (this.c) {
                wdd1Var.i(4);
            }
            this.c = false;
            return;
        }
        ((rdd1) pbqVar.h).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iC0) {
            if (jElapsedRealtime - this.d >= i) {
                ((so00) pbqVar.g).a.E1(new ExoPlaybackException(2, new StuckPlayerException(4, i), ContentMediaFormat.FULL_CONTENT_MOVIE));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iC0;
        wdd1Var.i(4);
        wdd1Var.k(4, i);
    }
}
