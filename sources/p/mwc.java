package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mwc implements nwc {
    public final Set a;
    public final String b;

    public mwc(String str, Set set) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwc)) {
            return false;
        }
        mwc mwcVar = (mwc) obj;
        return u890.j(this.a, mwcVar.a) && this.b.equals(mwcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
