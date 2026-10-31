package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r2a implements z2a {
    public final List a;

    public r2a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2a) && this.a.equals(((r2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
