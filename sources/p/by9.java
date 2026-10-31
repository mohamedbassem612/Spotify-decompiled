package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class by9 {
    public final d6b a;

    public by9(d6b d6bVar) {
        this.a = d6bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by9) && u890.j(this.a, ((by9) obj).a);
    }

    public final int hashCode() {
        d6b d6bVar = this.a;
        if (d6bVar == null) {
            return 0;
        }
        return d6bVar.hashCode();
    }
}
