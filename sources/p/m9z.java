package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m9z extends p9z {
    public final yaz a;

    public m9z(yaz yazVar) {
        this.a = yazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9z) && this.a.equals(((m9z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
