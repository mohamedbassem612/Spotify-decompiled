package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kl51 {
    public final String a;
    public final String b;

    public kl51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl51)) {
            return false;
        }
        kl51 kl51Var = (kl51) obj;
        return u890.j(this.a, kl51Var.a) && u890.j(this.b, kl51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
