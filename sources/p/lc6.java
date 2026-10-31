package p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lc6 extends nc6 {
    public final ErrorType a;

    public lc6(ErrorType errorType) {
        this.a = errorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc6) && this.a == ((lc6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
