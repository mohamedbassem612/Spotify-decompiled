package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oxb1 {
    public final List a;

    public oxb1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxb1) && this.a.equals(((oxb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
