package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t171 extends w171 {
    public final String a;
    public final oz61 b;
    public final boolean c;

    public t171(String str, oz61 oz61Var, boolean z) {
        this.a = str;
        this.b = oz61Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t171)) {
            return false;
        }
        t171 t171Var = (t171) obj;
        return this.a.equals(t171Var.a) && this.b.equals(t171Var.b) && this.c == t171Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
