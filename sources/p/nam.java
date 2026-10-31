package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nam extends qam {
    public final String a;
    public final int b;

    public nam(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nam)) {
            return false;
        }
        nam namVar = (nam) obj;
        return this.a.equals(namVar.a) && this.b == namVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
