package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h7b {
    public final fq7 a;

    public h7b(int i) {
        this.a = (i & 2) != 0 ? g7b.c : e7b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7b) && this.a.equals(((h7b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }
}
