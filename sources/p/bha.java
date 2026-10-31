package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bha extends fha {
    public final cga a;

    public bha(cga cgaVar) {
        this.a = cgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bha) && this.a.equals(((bha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
