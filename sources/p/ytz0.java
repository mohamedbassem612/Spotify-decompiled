package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ytz0 {
    public final boolean a;
    public final String b;
    public final int c;

    public ytz0(String str, int i, boolean z) {
        this.a = z;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytz0)) {
            return false;
        }
        ytz0 ytz0Var = (ytz0) obj;
        return this.a == ytz0Var.a && u890.j(this.b, ytz0Var.b) && this.c == ytz0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
