package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lak1 implements xpx0 {
    public final List a;

    public lak1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lak1) && this.a.equals(((lak1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
