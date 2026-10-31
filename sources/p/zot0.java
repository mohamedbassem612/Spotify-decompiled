package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zot0 extends m1p1 {
    public final Intent c;

    public zot0(Intent intent) {
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zot0) && this.c.equals(((zot0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
