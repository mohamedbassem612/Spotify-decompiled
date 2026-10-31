package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wab0 {
    public final String a;
    public final String b;

    public wab0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wab0)) {
            return false;
        }
        wab0 wab0Var = (wab0) obj;
        return u890.j(this.a, wab0Var.a) && u890.j(this.b, wab0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
