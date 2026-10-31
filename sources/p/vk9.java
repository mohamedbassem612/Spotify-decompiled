package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vk9 {
    public final String a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public vk9(long j, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk9)) {
            return false;
        }
        vk9 vk9Var = (vk9) obj;
        return u890.j(this.a, vk9Var.a) && this.b == vk9Var.b && this.c == vk9Var.c && this.d == vk9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }
}
