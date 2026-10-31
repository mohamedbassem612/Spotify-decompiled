package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e8g1 extends i8g1 {
    public final Uri a;

    public e8g1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8g1) && this.a.equals(((e8g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
