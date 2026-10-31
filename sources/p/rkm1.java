package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rkm1 {
    public final String a;

    public rkm1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkm1) && this.a.equals(((rkm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
