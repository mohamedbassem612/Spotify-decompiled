package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sjm1 extends ujm1 {
    public final String a;

    public sjm1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjm1) && this.a.equals(((sjm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
