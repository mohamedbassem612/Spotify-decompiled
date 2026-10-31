package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pc60 {
    public final String a;
    public final String b;

    public pc60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc60)) {
            return false;
        }
        pc60 pc60Var = (pc60) obj;
        return this.a.equals(pc60Var.a) && this.b.equals(pc60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
