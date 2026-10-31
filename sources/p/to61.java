package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class to61 implements wo61 {
    public final String a;
    public final boolean b;

    public to61(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to61)) {
            return false;
        }
        to61 to61Var = (to61) obj;
        return this.a.equals(to61Var.a) && this.b == to61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
