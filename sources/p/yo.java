package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yo implements ap {
    public final Intent a;

    public yo(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo) && this.a.equals(((yo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
