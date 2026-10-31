package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class puo {
    public final ouo a;
    public final boolean b;

    public puo(ouo ouoVar, boolean z) {
        this.a = ouoVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puo)) {
            return false;
        }
        puo puoVar = (puo) obj;
        return this.a.equals(puoVar.a) && this.b == puoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
