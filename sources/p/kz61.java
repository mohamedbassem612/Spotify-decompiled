package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kz61 {
    public final String a;
    public final String b;

    public kz61(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz61)) {
            return false;
        }
        kz61 kz61Var = (kz61) obj;
        return u890.j(this.a, kz61Var.a) && u890.j(this.b, kz61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
