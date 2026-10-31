package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ooi0 implements voi0 {
    public final ywf a;

    public ooi0(ywf ywfVar) {
        this.a = ywfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ooi0) && u890.j(this.a, ((ooi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
