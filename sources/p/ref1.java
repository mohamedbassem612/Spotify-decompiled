package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ref1 {
    public final String a;

    public ref1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ref1) && this.a.equals(((ref1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
