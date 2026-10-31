package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xot0 extends m1p1 {
    public final Intent c;

    public xot0(Intent intent) {
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xot0) && this.c.equals(((xot0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
