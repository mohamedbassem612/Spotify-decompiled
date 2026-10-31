package p;

import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import com.spotify.betamax.common.drm.DrmUtil$UnexpectedDrmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp/i9v;", "", "<init>", "()V", "Lp/ao00;", "a", "()Lp/ao00;", "src_main_java_com_spotify_betamax_common-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i9v {
    public static final i9v a = new i9v();

    private i9v() {
    }

    public static final ao00 a() throws DrmUtil$UnexpectedDrmException {
        try {
            return h9v.b();
        } catch (MediaDrm.MediaDrmStateException e) {
            throw new DrmUtil$UnexpectedDrmException(e);
        } catch (MediaDrmResetException e2) {
            throw new DrmUtil$UnexpectedDrmException(e2);
        }
    }
}
