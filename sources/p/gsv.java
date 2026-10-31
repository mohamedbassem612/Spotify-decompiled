package p;

import com.spotify.playlistmixing.endpoints.MixingReorderingError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gsv implements usv {
    public final MixingReorderingError a;
    public final int b;

    public gsv(MixingReorderingError mixingReorderingError, int i) {
        this.a = mixingReorderingError;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsv)) {
            return false;
        }
        gsv gsvVar = (gsv) obj;
        return u890.j(this.a, gsvVar.a) && this.b == gsvVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
