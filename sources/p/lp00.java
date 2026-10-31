package p;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lp00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp00(np00 np00Var, String str, l6u0 l6u0Var, boolean z, long j) {
        super(1);
        this.d = np00Var;
        this.e = str;
        this.f = l6u0Var;
        this.b = z;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np00 np00Var = (np00) this.d;
                sbu0 sbu0VarG = ((ExoPlayer) obj).G(new kp00(np00Var, (l6u0) this.f, (byte) 0));
                String str = (String) this.e;
                boolean z = this.b;
                long j = this.c;
                Looper looper = np00Var.b.getLooper();
                dm5.y(!sbu0VarG.j);
                sbu0VarG.f = looper;
                sbu0VarG.c(str);
                dm5.y(!sbu0VarG.j);
                sbu0VarG.i = z;
                dm5.y(!sbu0VarG.j);
                sbu0VarG.h = j;
                np00Var.c.put(str, sbu0VarG);
                sbu0VarG.b();
                break;
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                boolean z2 = this.b;
                oot0 oot0Var = (oot0) this.d;
                if (z2) {
                    long j2 = oot0Var.a;
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    exoPlayer.W0(new dpg((qba) this.e, timeUnit.convert(j2, timeUnit2), timeUnit.convert(((oot0) this.d).b, timeUnit2)));
                } else {
                    long j3 = oot0Var.a;
                    qba qbaVar = (qba) this.e;
                    if (j3 > 0) {
                        exoPlayer.N(qbaVar, j3);
                    } else {
                        exoPlayer.C0(qbaVar);
                    }
                }
                exoPlayer.M(((oot0) this.d).c);
                exoPlayer.e();
                ((r390) this.f).N0 = this.c;
                break;
        }
        return rih1.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp00(boolean z, oot0 oot0Var, qba qbaVar, r390 r390Var, long j) {
        super(1);
        this.b = z;
        this.d = oot0Var;
        this.e = qbaVar;
        this.f = r390Var;
        this.c = j;
    }
}
