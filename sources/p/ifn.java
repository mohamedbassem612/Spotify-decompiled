package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ifn implements ugn {
    public final String a;

    public ifn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifn) && this.a.equals(((ifn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
