package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bo9 {
    public final List a;

    public bo9(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo9) && this.a.equals(((bo9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
