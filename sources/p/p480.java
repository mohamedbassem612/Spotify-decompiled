package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p480 implements Serializable {
    public final String a;

    public p480(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p480) && this.a.equals(((p480) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
