package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kmi0 implements lmi0 {
    public final String a;

    public kmi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmi0) && this.a.equals(((kmi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
