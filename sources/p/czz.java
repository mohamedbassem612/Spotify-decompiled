package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class czz implements y600 {
    public final String a;

    public czz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czz) && u890.j(this.a, ((czz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
