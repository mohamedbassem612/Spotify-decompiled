package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ck41 {
    public final j2i a;

    public ck41(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck41) && this.a == ((ck41) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(3000) * 31);
    }
}
