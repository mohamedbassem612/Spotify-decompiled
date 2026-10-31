package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ih31 {
    public final List a;

    public ih31(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih31) && this.a.equals(((ih31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
