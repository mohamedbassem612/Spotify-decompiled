package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ifw {
    public final String a;
    public final boolean b;

    public ifw(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifw)) {
            return false;
        }
        ifw ifwVar = (ifw) obj;
        return u890.j(this.a, ifwVar.a) && this.b == ifwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
