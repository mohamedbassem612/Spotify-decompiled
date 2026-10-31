package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xif1 {
    public final String a;
    public final ben b;

    public /* synthetic */ xif1() {
        this("", new ben());
    }

    public final ben a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xif1)) {
            return false;
        }
        xif1 xif1Var = (xif1) obj;
        return u890.j(this.a, xif1Var.a) && u890.j(this.b, xif1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public xif1(String str, ben benVar) {
        this.a = str;
        this.b = benVar;
    }
}
