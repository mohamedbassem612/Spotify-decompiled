package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w4m implements y4m {
    public final u4m a;
    public final boolean b;

    public w4m(u4m u4mVar, boolean z) {
        this.a = u4mVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4m)) {
            return false;
        }
        w4m w4mVar = (w4m) obj;
        return this.a.equals(w4mVar.a) && this.b == w4mVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
