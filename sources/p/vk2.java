package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vk2 {
    public final s2j1 a;
    public final String b;
    public final int c;

    public vk2(s2j1 s2j1Var, String str, int i) {
        this.a = s2j1Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk2)) {
            return false;
        }
        vk2 vk2Var = (vk2) obj;
        return this.a == vk2Var.a && this.b.equals(vk2Var.b) && this.c == vk2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
