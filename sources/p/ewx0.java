package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ewx0 {
    public final String a;
    public final String b;

    public ewx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewx0)) {
            return false;
        }
        ewx0 ewx0Var = (ewx0) obj;
        return this.a.equals(ewx0Var.a) && this.b.equals(ewx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
