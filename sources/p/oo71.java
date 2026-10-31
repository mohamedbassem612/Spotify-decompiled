package p;

import android.net.Uri;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oo71 implements ppa {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ qo71 b;
    public final /* synthetic */ String c;

    public oo71(ssw0 ssw0Var, qo71 qo71Var, String str) {
        this.a = ssw0Var;
        this.b = qo71Var;
        this.c = str;
    }

    public final void b(long j, long j2) {
        this.b.h = j2;
        this.a.l(new g8g1((int) j));
    }

    public final void c(long j, int i, String str) {
        int iC = l1d.C(i);
        ssw0 ssw0Var = this.a;
        if (iC == 2) {
            ssw0Var.l(new h8g1(str));
            return;
        }
        if (iC == 3) {
            ssw0Var.l(new e8g1(Uri.parse(this.c.concat(".mp4"))));
            ssw0Var.H((Throwable) null);
        } else {
            if (iC != 4) {
                return;
            }
            ssw0Var.l(d8g1.a);
            ssw0Var.H((Throwable) null);
        }
    }

    public final void g(BetamaxTranscoderException betamaxTranscoderException, long j) {
        f8g1 f8g1Var = new f8g1(betamaxTranscoderException);
        ssw0 ssw0Var = this.a;
        ssw0Var.l(f8g1Var);
        ssw0Var.H((Throwable) null);
    }

    public final void f(long j, boolean z) {
    }

    public final void a(int i, long j, long j2) {
    }
}
