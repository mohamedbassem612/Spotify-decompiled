package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class phq0 implements qhq0 {
    public final String a;

    public phq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phq0) && this.a.equals(((phq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
