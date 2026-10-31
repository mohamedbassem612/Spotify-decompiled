package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fwu implements hwu {
    public final String a;
    public final String b;

    public fwu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwu)) {
            return false;
        }
        fwu fwuVar = (fwu) obj;
        return u890.j(this.a, fwuVar.a) && this.b.equals(fwuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
