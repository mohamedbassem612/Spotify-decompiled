package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pyv0 extends ryv0 {
    public final String a;

    public pyv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyv0) && this.a.equals(((pyv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
