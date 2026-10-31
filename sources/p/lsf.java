package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lsf implements osf {
    public final List a;

    public lsf(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsf) && this.a.equals(((lsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
