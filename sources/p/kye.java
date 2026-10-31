package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kye implements nye {
    public final String a;
    public final boolean b;

    public kye(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kye)) {
            return false;
        }
        kye kyeVar = (kye) obj;
        return u890.j(this.a, kyeVar.a) && this.b == kyeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
