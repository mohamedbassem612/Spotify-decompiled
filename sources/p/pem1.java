package p;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource;
import com.spotify.base.java.logging.Logger;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pem1 implements o8u0 {
    public final /* synthetic */ qem1 a;

    public pem1(qem1 qem1Var) {
        this.a = qem1Var;
    }

    public final void H(int i) {
        bpb1 bpb1Var = this.a.g;
        if (u890.j(bpb1Var.getValue(), nem1.a) || u890.j(bpb1Var.getValue(), kem1.a)) {
            return;
        }
        if (i == 2) {
            bpb1Var.m((Object) null, iem1.a);
        } else if (i == 3) {
            bpb1Var.m((Object) null, mem1.a);
        } else {
            if (i != 4) {
                return;
            }
            bpb1Var.m((Object) null, jem1.a);
        }
    }

    public final void R() {
        qem1 qem1Var = this.a;
        xab1 xab1Var = qem1Var.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        qem1Var.i = null;
        qem1Var.h.m((Object) null, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    public final void n(PlaybackException playbackException) {
        Object obj;
        int i;
        Logger.e(playbackException, "Places panorama playback error: %s", new Object[]{playbackException.b()});
        qem1 qem1Var = this.a;
        xab1 xab1Var = qem1Var.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        qem1Var.i = null;
        bpb1 bpb1Var = qem1Var.g;
        Uri uri = qem1Var.c;
        int i2 = playbackException.a;
        if (i2 == 2004) {
            Set set = rem1.a;
            HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) z561.W(z561.T(j141.V0, z561.j0(z561.c0(gbm1.Z, playbackException.getCause()), 10)));
            if (invalidResponseCodeException != null && (((i = invalidResponseCodeException.d) == 404 || i == 410) && u890.j(((HttpDataSource.HttpDataSourceException) invalidResponseCodeException).b.a, uri))) {
                obj = kem1.a;
            } else {
                obj = nem1.a;
            }
        } else if (rem1.a.contains(Integer.valueOf(i2))) {
            obj = kem1.a;
        } else {
            obj = nem1.a;
        }
        bpb1Var.m((Object) null, obj);
    }
}
