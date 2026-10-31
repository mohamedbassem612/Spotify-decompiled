package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gq00 implements hq00 {
    public final String a;

    public gq00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq00) && this.a.equals(((gq00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
