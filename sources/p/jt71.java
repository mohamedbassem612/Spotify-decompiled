package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jt71 implements mt71 {
    public final sju a;

    public jt71(sju sjuVar) {
        this.a = sjuVar;
    }

    @Override // p.mt71
    public final sju a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt71) && u890.j(this.a, ((jt71) obj).a);
    }

    public final int hashCode() {
        sju sjuVar = this.a;
        if (sjuVar == null) {
            return 0;
        }
        return sjuVar.hashCode();
    }
}
