package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tg7 {
    public final String a;
    public final boolean b;

    public tg7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg7)) {
            return false;
        }
        tg7 tg7Var = (tg7) obj;
        return u890.j(this.a, tg7Var.a) && this.b == tg7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
