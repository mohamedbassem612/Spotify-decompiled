package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o2h implements u2h {
    public final t2h a;

    public o2h(t2h t2hVar) {
        this.a = t2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2h) && this.a.equals(((o2h) obj).a);
    }

    @Override // p.u2h
    public final t2h getIdentifier() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
