package p;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e8o0 {
    public static final /* synthetic */ int b = 0;
    public final Object a;

    static {
        qs10.c("NetworkRequestCompat");
    }

    public e8o0(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8o0) && u890.j(this.a, ((e8o0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
