package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzg0 implements k0h0 {
    public final List a;

    public nzg0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzg0) && this.a.equals(((nzg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
