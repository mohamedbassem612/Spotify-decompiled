package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cdm {
    public final wcm a;
    public final int b;
    public final boolean c;

    public cdm(wcm wcmVar, int i, boolean z) {
        this.a = wcmVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdm)) {
            return false;
        }
        cdm cdmVar = (cdm) obj;
        return this.a.equals(cdmVar.a) && this.b == cdmVar.b && this.c == cdmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
