package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kfn implements ugn {
    public final String a;

    public kfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfn) && this.a.equals(((kfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
