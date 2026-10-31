package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vxo0 implements eyo0 {
    public final String a;

    public vxo0(String str) {
        this.a = str;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxo0) || !this.a.equals(((vxo0) obj).a)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1;
    }
}
