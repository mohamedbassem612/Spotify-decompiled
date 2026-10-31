package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hie0 implements iie0 {
    public final String a;
    public final vgb0 b;

    public hie0(String str, vgb0 vgb0Var) {
        this.a = str;
        this.b = vgb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hie0)) {
            return false;
        }
        hie0 hie0Var = (hie0) obj;
        return this.a.equals(hie0Var.a) && this.b.equals(hie0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
