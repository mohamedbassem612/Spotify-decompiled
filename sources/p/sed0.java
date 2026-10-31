package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sed0 implements ted0 {
    public final String a;

    public sed0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sed0) && this.a.equals(((sed0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
