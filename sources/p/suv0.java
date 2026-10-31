package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class suv0 implements tuv0 {
    public final String a;

    public suv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suv0) && this.a.equals(((suv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
