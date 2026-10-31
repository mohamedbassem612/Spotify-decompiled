package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lo91 {
    public final List a;

    public lo91(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo91) && this.a.equals(((lo91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
