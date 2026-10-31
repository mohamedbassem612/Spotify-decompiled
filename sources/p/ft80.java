package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ft80 implements gt80 {
    public final Intent a;

    public ft80(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft80) && this.a.equals(((ft80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
