package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class twc1 implements uwc1 {
    public final List a;

    public twc1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twc1) && this.a.equals(((twc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
