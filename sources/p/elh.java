package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class elh implements hlh {
    public final kkh a;

    public elh(kkh kkhVar) {
        this.a = kkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elh) && this.a.equals(((elh) obj).a);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
