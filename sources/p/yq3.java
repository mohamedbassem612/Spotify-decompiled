package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yq3 extends hr3 {
    public final Set a;

    public yq3(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq3) && this.a.equals(((yq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
