package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class re30 {
    public final String a;
    public final String b;

    public re30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re30)) {
            return false;
        }
        re30 re30Var = (re30) obj;
        return this.a.equals(re30Var.a) && this.b.equals(re30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
