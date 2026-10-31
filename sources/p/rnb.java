package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rnb implements snb {
    public final String a;
    public final int b;

    public rnb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnb)) {
            return false;
        }
        rnb rnbVar = (rnb) obj;
        return u890.j(this.a, rnbVar.a) && this.b == rnbVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
