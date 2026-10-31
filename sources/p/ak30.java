package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak30 {
    public final long a;
    public final float b;
    public final String c;

    public ak30(long j, String str, float f) {
        this.a = j;
        this.b = f;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak30)) {
            return false;
        }
        ak30 ak30Var = (ak30) obj;
        return this.a == ak30Var.a && Float.compare(this.b, ak30Var.b) == 0 && u890.j(this.c, ak30Var.c);
    }

    public final int hashCode() {
        int iF = x0d.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
