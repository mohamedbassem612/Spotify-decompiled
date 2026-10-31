package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g32 {
    public final List a;

    public g32(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g32) && u890.j(this.a, ((g32) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
