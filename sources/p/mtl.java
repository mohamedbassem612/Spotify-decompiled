package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mtl implements ez00 {
    public final ktl a;

    public mtl(ktl ktlVar) {
        this.a = ktlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtl) && this.a == ((mtl) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ mtl() {
        this(ktl.a);
    }
}
