package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class quv0 implements tuv0 {
    public final String a;

    public quv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quv0) && this.a.equals(((quv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
