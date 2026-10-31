package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jk3 implements kk3, lk3 {
    public final String a;

    public jk3(String str) {
        this.a = str;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk3) && this.a.equals(((jk3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
