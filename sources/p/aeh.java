package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aeh implements geh {
    public final fey a;

    public aeh(fey feyVar) {
        this.a = feyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeh) && this.a == ((aeh) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
