package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x2a implements z2a {
    public final List a;

    public x2a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2a) && this.a.equals(((x2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
