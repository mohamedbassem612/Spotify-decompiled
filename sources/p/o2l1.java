package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o2l1 {
    public final List a;

    public o2l1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2l1) && this.a.equals(((o2l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
