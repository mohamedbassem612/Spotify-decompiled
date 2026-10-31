package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qb31 extends vbe {
    public final String e;

    public qb31(String str) {
        super((byte) 14);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb31) && u890.j(this.e, ((qb31) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
