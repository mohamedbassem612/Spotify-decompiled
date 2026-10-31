package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lo50 {
    public final tqw a;

    public lo50(tqw tqwVar) {
        this.a = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo50) && u890.j(this.a, ((lo50) obj).a);
    }

    public final int hashCode() {
        tqw tqwVar = this.a;
        if (tqwVar == null) {
            return 0;
        }
        return tqwVar.hashCode();
    }
}
