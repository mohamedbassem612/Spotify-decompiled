package p;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.comscore.streaming.ContentMediaFormat;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class akc1 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ pbq h;

    public akc1(pbq pbqVar, int i) {
        this.h = pbqVar;
        this.a = i;
    }

    public final void a() {
        pbq pbqVar = this.h;
        wdd1 wdd1Var = (wdd1) pbqVar.t;
        yo00 yo00Var = (yo00) pbqVar.f;
        if (!yo00Var.i()) {
            if (this.f) {
                wdd1Var.i(2);
            }
            this.f = false;
            return;
        }
        sqe1 sqe1VarD0 = yo00Var.d0();
        Object objL = sqe1VarD0.p() ? null : sqe1VarD0.l(yo00Var.v0());
        int iX = yo00Var.X();
        int iD0 = yo00Var.D0();
        long jV = yo00Var.v();
        if (objL != null && iX == -1) {
            jV -= zoi1.n0(sqe1VarD0.g(objL, (dqe1) pbqVar.i).e);
        }
        ((rdd1) pbqVar.h).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iX == this.c && iD0 == this.d && jV == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((so00) pbqVar.g).a.E1(new ExoPlaybackException(2, new StuckPlayerException(2, i), ContentMediaFormat.FULL_CONTENT_MOVIE));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iX;
        this.d = iD0;
        this.e = jV;
        wdd1Var.i(2);
        wdd1Var.k(2, i);
    }
}
