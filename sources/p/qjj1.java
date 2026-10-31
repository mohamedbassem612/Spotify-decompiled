package p;

import android.os.Handler;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qjj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hce1 b;
    public final /* synthetic */ m0u0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qjj1(hce1 hce1Var, m0u0 m0u0Var, String str, byte b) {
        super(1);
        this.a = b;
        this.b = hce1Var;
        this.c = m0u0Var;
        this.d = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m0u0 m0u0Var = this.c;
        hce1 hce1Var = this.b;
        switch (b) {
            case 0:
                long jV = ((ExoPlayer) obj).v();
                long jB = ((yqg) hce1Var.c).b();
                Iterator it = ((lgy) ((fgs0) hce1Var.d).b).h(m0u0Var).iterator();
                while (it.hasNext()) {
                    ((Handler) hce1Var.b).post(new sjj1((c0u0) it.next(), this.d, jV, jB));
                }
                break;
            default:
                long jV2 = ((ExoPlayer) obj).v();
                long jB2 = ((yqg) hce1Var.c).b();
                Iterator it2 = ((lgy) ((fgs0) hce1Var.d).b).h(m0u0Var).iterator();
                while (it2.hasNext()) {
                    ((Handler) hce1Var.b).post(new mqh1((c0u0) it2.next(), this.d, jV2, jB2));
                }
                break;
        }
        return rih1Var;
    }
}
