package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gdz {
    public final String a;
    public final int b;

    public gdz(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdz)) {
            return false;
        }
        gdz gdzVar = (gdz) obj;
        return this.a.equals(gdzVar.a) && this.b == gdzVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
