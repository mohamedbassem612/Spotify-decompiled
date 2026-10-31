package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x401 implements f501 {
    public final String a;

    public x401(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x401) && this.a.equals(((x401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
