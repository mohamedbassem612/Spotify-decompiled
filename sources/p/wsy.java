package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wsy {
    public final ktl a;
    public final String b;

    public wsy(String str, ktl ktlVar) {
        this.a = ktlVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsy)) {
            return false;
        }
        wsy wsyVar = (wsy) obj;
        return this.a == wsyVar.a && u890.j(this.b, wsyVar.b);
    }

    public final int hashCode() {
        ktl ktlVar = this.a;
        int iHashCode = (ktlVar == null ? 0 : ktlVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
