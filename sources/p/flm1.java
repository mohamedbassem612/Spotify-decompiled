package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class flm1 implements glm1 {
    public final List a;

    public flm1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flm1) && this.a.equals(((flm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
