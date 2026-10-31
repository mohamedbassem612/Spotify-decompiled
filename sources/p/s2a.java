package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2a implements z2a {
    public final List a;

    public s2a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2a) && this.a.equals(((s2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
