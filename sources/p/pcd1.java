package p;

import com.spotify.offline_esperanto.proto.EsOffline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pcd1 extends rcd1 {
    public final EsOffline.Progress a;
    public final boolean b;

    public pcd1(EsOffline.Progress progress, boolean z) {
        this.a = progress;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcd1)) {
            return false;
        }
        pcd1 pcd1Var = (pcd1) obj;
        return this.a.equals(pcd1Var.a) && this.b == pcd1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
