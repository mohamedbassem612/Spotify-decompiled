package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bgx0 implements egx0 {
    public final d0r a;

    public bgx0(d0r d0rVar) {
        this.a = d0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgx0) && u890.j(this.a, ((bgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
