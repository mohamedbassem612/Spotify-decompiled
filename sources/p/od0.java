package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class od0 implements pd0 {
    public final String a;

    public od0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od0) && this.a.equals(((od0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
