package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zbm {
    public final int a;
    public final String b;

    public zbm(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbm)) {
            return false;
        }
        zbm zbmVar = (zbm) obj;
        return this.a == zbmVar.a && u890.j(this.b, zbmVar.b);
    }

    public final int hashCode() {
        int i = this.a;
        return xcg1.g(cy30.d((i == 0 ? 0 : l1d.C(i)) * 31, 31, this.b), 31, true);
    }
}
