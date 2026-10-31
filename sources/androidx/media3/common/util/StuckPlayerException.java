package androidx.media3.common.util;

import p.bhn0;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final byte a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public StuckPlayerException(int i, int i2) {
        String strE;
        if (i == 0) {
            strE = gvg.e(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strE = gvg.e(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strE = gvg.e(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strE = gvg.e(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                bhn0.w();
                throw null;
            }
            strE = gvg.e(i2, "Player stuck suppressed for ", " ms");
        }
        super(strE);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.a == stuckPlayerException.a && this.b == stuckPlayerException.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
