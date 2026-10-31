package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class an7 {
    public final String a;
    public final boolean b;
    public final hux c;

    public an7(hux huxVar, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an7)) {
            return false;
        }
        an7 an7Var = (an7) obj;
        return u890.j(this.a, an7Var.a) && this.b == an7Var.b && u890.j(this.c, an7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
