package p;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.comscore.streaming.ContentMediaFormat;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zjc1 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ pbq i;

    public zjc1(pbq pbqVar, int i) {
        this.i = pbqVar;
        this.a = i;
    }

    public final void a() {
        Object obj;
        pbq pbqVar = this.i;
        wdd1 wdd1Var = (wdd1) pbqVar.t;
        yo00 yo00Var = (yo00) pbqVar.f;
        if (yo00Var.getPlaybackState() != 2 || !yo00Var.q() || yo00Var.c0() != 0) {
            if (this.g) {
                wdd1Var.i(1);
            }
            this.g = false;
            return;
        }
        sqe1 sqe1VarD0 = yo00Var.d0();
        Object objL = sqe1VarD0.p() ? null : sqe1VarD0.l(yo00Var.v0());
        int iX = yo00Var.X();
        int iD0 = yo00Var.D0();
        long jN0 = yo00Var.N0();
        long jMax = Math.max(0L, yo00Var.p() - Math.max(0L, jN0 - yo00Var.v()));
        if (objL != null && iX == -1) {
            jN0 -= zoi1.n0(sqe1VarD0.g(objL, (dqe1) pbqVar.i).e);
        }
        ((rdd1) pbqVar.h).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iX == this.c && iD0 == this.d) {
            obj = objL;
            if (jN0 == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i) {
                    ((so00) pbqVar.g).a.E1(new ExoPlaybackException(2, new StuckPlayerException(1, i), ContentMediaFormat.FULL_CONTENT_MOVIE));
                    return;
                }
                return;
            }
        } else {
            obj = objL;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = obj;
        this.c = iX;
        this.d = iD0;
        this.e = jN0;
        this.f = jMax;
        wdd1Var.i(1);
        wdd1Var.k(1, i);
    }
}
