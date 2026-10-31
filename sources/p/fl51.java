package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fl51 {
    public final String a;
    public final String b;

    public fl51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl51)) {
            return false;
        }
        fl51 fl51Var = (fl51) obj;
        return u890.j(this.a, fl51Var.a) && u890.j(this.b, fl51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
