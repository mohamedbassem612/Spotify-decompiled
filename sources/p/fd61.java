package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fd61 {
    public final String a;
    public final String b;
    public final boolean c;

    public fd61(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd61)) {
            return false;
        }
        fd61 fd61Var = (fd61) obj;
        return u890.j(this.a, fd61Var.a) && this.b.equals(fd61Var.b) && this.c == fd61Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
