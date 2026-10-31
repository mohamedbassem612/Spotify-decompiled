package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kgn implements ugn {
    public final String a;

    public kgn(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgn) && this.a.equals(((kgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
