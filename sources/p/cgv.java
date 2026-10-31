package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cgv implements egv {
    public final int a;
    public final String b;

    public cgv(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgv)) {
            return false;
        }
        cgv cgvVar = (cgv) obj;
        return this.a == cgvVar.a && u890.j(this.b, cgvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
