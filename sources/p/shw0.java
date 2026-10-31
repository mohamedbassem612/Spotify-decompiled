package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class shw0 implements aiw0 {
    public final int a;
    public final String b;

    public shw0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // p.aiw0
    public final int a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shw0)) {
            return false;
        }
        shw0 shw0Var = (shw0) obj;
        return this.a == shw0Var.a && this.b.equals(shw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
