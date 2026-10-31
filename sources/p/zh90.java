package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zh90 implements ai90 {
    public final String a = "";
    public final String b = "";

    @Override // p.ai90
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh90)) {
            return false;
        }
        zh90 zh90Var = (zh90) obj;
        return this.a.equals(zh90Var.a) && this.b.equals(zh90Var.b);
    }

    @Override // p.ai90
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
