package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p7w implements Serializable {
    public final String a;
    public final String b;

    public p7w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7w)) {
            return false;
        }
        p7w p7wVar = (p7w) obj;
        return u890.j(this.a, p7wVar.a) && u890.j(this.b, p7wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
