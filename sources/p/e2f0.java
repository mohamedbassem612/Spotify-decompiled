package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e2f0 {
    public final String a;

    public e2f0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2f0) && this.a.equals(((e2f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
