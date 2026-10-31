package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class atc1 {
    public final List a;

    public atc1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atc1) && this.a.equals(((atc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
