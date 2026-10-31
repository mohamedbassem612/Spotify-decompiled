package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r4g {
    public final List a;

    public r4g(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4g) && this.a.equals(((r4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
