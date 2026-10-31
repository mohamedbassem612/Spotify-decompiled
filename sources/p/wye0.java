package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wye0 extends d7e {
    public final Intent c;

    public wye0(Intent intent) {
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wye0) && u890.j(this.c, ((wye0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
