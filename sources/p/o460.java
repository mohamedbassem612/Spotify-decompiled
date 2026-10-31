package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o460 implements l9c {
    public final String a;
    public final s460 b;

    public o460(String str, s460 s460Var) {
        this.a = str;
        this.b = s460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o460)) {
            return false;
        }
        o460 o460Var = (o460) obj;
        return this.a.equals(o460Var.a) && this.b.equals(o460Var.b);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
