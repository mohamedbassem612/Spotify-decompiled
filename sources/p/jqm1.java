package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqm1 {
    public final String a;

    public jqm1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqm1) && this.a.equals(((jqm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
