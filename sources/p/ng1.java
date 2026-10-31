package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ng1 implements qg1 {
    public final String a;

    public ng1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1) && this.a.equals(((ng1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
