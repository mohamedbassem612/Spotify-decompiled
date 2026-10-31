package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lsx0 extends ktx0 {
    public final List a;

    public lsx0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsx0) && this.a.equals(((lsx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
