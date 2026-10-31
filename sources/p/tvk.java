package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tvk implements fxk {
    public final f27 a;
    public final int b;

    public tvk(f27 f27Var, int i) {
        this.a = f27Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvk)) {
            return false;
        }
        tvk tvkVar = (tvk) obj;
        return this.a.equals(tvkVar.a) && this.b == tvkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
