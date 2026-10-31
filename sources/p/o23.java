package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o23 {
    public final String a;

    public o23(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o23) && u890.j(this.a, ((o23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
