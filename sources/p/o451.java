package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o451 {
    public final List a;

    public o451(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o451) && this.a.equals(((o451) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
