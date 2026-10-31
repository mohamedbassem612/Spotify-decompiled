package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bl90 {
    public final String a;
    public final y1i b;

    public bl90(String str, y1i y1iVar) {
        this.a = str;
        this.b = y1iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl90)) {
            return false;
        }
        bl90 bl90Var = (bl90) obj;
        return this.a.equals(bl90Var.a) && this.b.equals(bl90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
