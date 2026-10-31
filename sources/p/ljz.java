package p;

import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljz implements y8v {
    public final DrmSession.DrmSessionException a;

    public ljz(DrmSession.DrmSessionException drmSessionException) {
        this.a = drmSessionException;
    }

    @Override // p.y8v
    public final DrmSession.DrmSessionException a() {
        return this.a;
    }

    @Override // p.y8v
    public final UUID b() {
        return whc.b;
    }

    @Override // p.y8v
    public final boolean d() {
        return false;
    }

    @Override // p.y8v
    public final byte[] e() {
        return null;
    }

    @Override // p.y8v
    public final nco f() {
        return null;
    }

    @Override // p.y8v
    public final int getState() {
        return 1;
    }

    @Override // p.y8v
    public final Map h() {
        return null;
    }

    @Override // p.y8v
    public final boolean i(String str) {
        return false;
    }

    @Override // p.y8v
    public final void c(b9v b9vVar) {
    }

    @Override // p.y8v
    public final void g(b9v b9vVar) {
    }
}
