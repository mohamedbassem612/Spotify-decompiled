package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nvy {
    public final List a;
    public final String b;

    public nvy(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvy)) {
            return false;
        }
        nvy nvyVar = (nvy) obj;
        return u890.j(this.a, nvyVar.a) && u890.j(this.b, nvyVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ nvy() {
        this(z6x.a, null);
    }
}
