package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rrc1 {
    public final List a;

    public rrc1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrc1) && this.a.equals(((rrc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
