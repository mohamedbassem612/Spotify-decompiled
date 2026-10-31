package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nsf implements osf {
    public final List a;

    public nsf(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsf) && this.a.equals(((nsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
