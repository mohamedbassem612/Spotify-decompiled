package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tlv0 extends ulv0 {
    public final pug a;

    public tlv0(pug pugVar) {
        this.a = pugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlv0) && this.a == ((tlv0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
