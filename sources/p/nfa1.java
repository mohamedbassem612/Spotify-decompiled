package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nfa1 implements ofa1 {
    public final Uri a;

    public nfa1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfa1) && this.a.equals(((nfa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
