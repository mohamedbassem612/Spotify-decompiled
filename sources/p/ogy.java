package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ogy extends pgy {
    public final String a;
    public final y6l1 b;

    public ogy(String str, y6l1 y6l1Var) {
        this.a = str;
        this.b = y6l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogy)) {
            return false;
        }
        ogy ogyVar = (ogy) obj;
        return u890.j(this.a, ogyVar.a) && this.b.equals(ogyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
