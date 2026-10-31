package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jq8 implements oq8 {
    public final tal a;

    public jq8(tal talVar) {
        this.a = talVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq8) && u890.j(this.a, ((jq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
