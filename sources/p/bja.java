package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bja {
    public final dja a;

    public bja(dja djaVar) {
        this.a = djaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bja) && this.a == ((bja) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
