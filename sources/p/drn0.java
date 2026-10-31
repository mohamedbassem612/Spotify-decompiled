package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class drn0 extends irn0 {
    public final Intent a;

    public drn0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drn0) && u890.j(this.a, ((drn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
