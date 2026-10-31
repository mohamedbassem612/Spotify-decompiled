package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f011 implements j011 {
    public final String a;

    public f011(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f011) && this.a.equals(((f011) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
