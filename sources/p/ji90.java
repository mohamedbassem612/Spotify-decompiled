package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ji90 {
    public final String a;
    public final String b;

    public ji90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji90)) {
            return false;
        }
        ji90 ji90Var = (ji90) obj;
        return u890.j(this.a, ji90Var.a) && u890.j(this.b, ji90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
