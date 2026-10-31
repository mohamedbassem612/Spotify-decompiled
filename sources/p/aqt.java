package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqt {
    public final ypt a;

    public aqt(ypt yptVar) {
        this.a = yptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqt) && this.a.equals(((aqt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
