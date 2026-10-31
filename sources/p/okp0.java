package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class okp0 extends tkp0 {
    public final List a;

    public okp0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okp0) && this.a.equals(((okp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
