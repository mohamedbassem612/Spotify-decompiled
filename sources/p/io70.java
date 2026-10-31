package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class io70 {
    public final String a;
    public final String b;

    public io70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io70)) {
            return false;
        }
        io70 io70Var = (io70) obj;
        return u890.j(this.a, io70Var.a) && this.b.equals(io70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
