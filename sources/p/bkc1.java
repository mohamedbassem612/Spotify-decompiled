package p;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.comscore.streaming.ContentMediaFormat;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bkc1 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ pbq g;

    public bkc1(pbq pbqVar, int i) {
        this.g = pbqVar;
        this.a = i;
    }

    public final void a() {
        long duration;
        pbq pbqVar = this.g;
        dqe1 dqe1Var = (dqe1) pbqVar.i;
        wdd1 wdd1Var = (wdd1) pbqVar.t;
        yo00 yo00Var = (yo00) pbqVar.f;
        sqe1 sqe1VarD0 = yo00Var.d0();
        Object objL = sqe1VarD0.p() ? null : sqe1VarD0.l(yo00Var.v0());
        int iX = yo00Var.X();
        int iD0 = yo00Var.D0();
        long jV = yo00Var.v();
        if (objL == null || iX != -1) {
            duration = iX != -1 ? yo00Var.getDuration() : -9223372036854775807L;
        } else {
            sqe1VarD0.g(objL, dqe1Var);
            jV -= zoi1.n0(dqe1Var.e);
            duration = zoi1.n0(dqe1Var.d);
        }
        boolean zI = yo00Var.i();
        if (!zI || duration == -9223372036854775807L || jV < duration) {
            wdd1Var.i(3);
            if (zI && duration != -9223372036854775807L) {
                wdd1Var.k(3, (int) Math.ceil((duration - jV) / yo00Var.l().a));
            }
            this.e = false;
            return;
        }
        ((rdd1) pbqVar.h).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iX == this.c && iD0 == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                ((so00) pbqVar.g).a.E1(new ExoPlaybackException(2, new StuckPlayerException(3, i), ContentMediaFormat.FULL_CONTENT_MOVIE));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iX;
        this.d = iD0;
        wdd1Var.i(3);
        wdd1Var.k(3, i);
    }
}
