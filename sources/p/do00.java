package p;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.transformer.ExportException;
import com.comscore.streaming.ContentMediaFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class do00 implements o8u0 {
    public final a67 a;
    public final /* synthetic */ fo00 b;

    public do00(fo00 fo00Var, a67 a67Var) {
        this.b = fo00Var;
        this.a = a67Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void C(o3g1 o3g1Var) {
        a67 a67Var = this.a;
        boolean z = true;
        try {
            ?? A = o3g1Var.a(1);
            ?? r2 = A;
            if (o3g1Var.a(2)) {
                r2 = A + 1;
            }
            for (int i = 0; i < o3g1Var.a.size(); i++) {
                int i2 = ((n3g1) o3g1Var.a.get(i)).b.c;
                if (i2 != 1 && i2 != 2) {
                    td6.p(i2, "Unsupported track type: ");
                }
            }
            fo00 fo00Var = this.b;
            if (r2 > 0) {
                a67Var.a((int) r2);
                ((yo00) fo00Var.f).M(true);
                return;
            }
            String strB = mue1.B((Context) fo00Var.c, ((e4w) fo00Var.d).a);
            if (strB == null || !asj0.m(strB)) {
                z = false;
            }
            a67Var.b(ExportException.a(ContentMediaFormat.FULL_CONTENT_GENERIC, new IllegalStateException(z ? "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems." : "The asset loader has no audio or video track to output.")));
        } catch (RuntimeException e) {
            a67Var.b(ExportException.a(1000, e));
        }
    }

    public final void C0(sqe1 sqe1Var, int i) {
        a67 a67Var = this.a;
        fo00 fo00Var = this.b;
        try {
            oqe1 oqe1Var = new oqe1();
            sqe1Var.m(0, oqe1Var);
            if (oqe1Var.k) {
                return;
            }
            if (fo00Var.a == 1) {
                long j = oqe1Var.m;
                fo00Var.b = j;
                fo00Var.a = (j <= 0 || j == -9223372036854775807L) ? 3 : 2;
                a67Var.f(j);
                return;
            }
            long j2 = fo00Var.b;
            if (j2 != -9223372036854775807L) {
                dm5.w(fo00Var.b, oqe1Var.m, "Unexpected duration change: old=%s, new=%s", Math.abs(j2 - oqe1Var.m) <= 20000);
            }
        } catch (RuntimeException e) {
            a67Var.b(ExportException.a(1000, e));
        }
    }

    public final void n(PlaybackException playbackException) {
        Throwable cause = playbackException.getCause();
        if ((cause instanceof ExoTimeoutException) && ((ExoTimeoutException) cause).a == 1) {
            oon1.w("Releasing the player timed out.", playbackException);
        } else {
            Object obj = ExportException.b.get(playbackException.b());
            this.a.b(ExportException.a(((Integer) (obj != null ? obj : 1000)).intValue(), playbackException));
        }
    }
}
