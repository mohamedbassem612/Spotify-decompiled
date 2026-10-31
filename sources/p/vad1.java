package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vad1 {
    public final String a;
    public final String b;

    public vad1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vad1)) {
            return false;
        }
        vad1 vad1Var = (vad1) obj;
        return u890.j(this.a, vad1Var.a) && u890.j(this.b, vad1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
