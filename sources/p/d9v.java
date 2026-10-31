package p;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d9v implements f9v {
    @Override // p.f9v
    public final int g(ie30 ie30Var) {
        return ie30Var.t != null ? 1 : 0;
    }

    @Override // p.f9v
    public final y8v i(b9v b9vVar, ie30 ie30Var) {
        if (ie30Var.t == null) {
            return null;
        }
        return new ljz(new DrmSession.DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // p.f9v
    public final void h(Looper looper, dbu0 dbu0Var) {
    }
}
