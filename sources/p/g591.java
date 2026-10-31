package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g591 extends hm5 {
    public final Intent n;

    public g591(Intent intent) {
        this.n = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g591) && this.n.equals(((g591) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }
}
