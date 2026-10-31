package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i7l extends k7l {
    public final l7l a;

    public i7l(l7l l7lVar) {
        this.a = l7lVar;
    }

    public final l7l a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7l) && this.a == ((i7l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
