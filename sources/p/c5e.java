package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c5e extends j5e {
    public final List a;

    public c5e(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5e) && this.a.equals(((c5e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
