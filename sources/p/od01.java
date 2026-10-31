package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class od01 implements pd01 {
    public final String a;

    public od01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od01) && this.a.equals(((od01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
