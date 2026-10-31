package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fi10 {
    public final String a;
    public final String b;

    public fi10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi10)) {
            return false;
        }
        fi10 fi10Var = (fi10) obj;
        return this.a.equals(fi10Var.a) && this.b.equals(fi10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
