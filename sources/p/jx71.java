package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jx71 implements vx71 {
    public final String a;

    public jx71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx71) && u890.j(this.a, ((jx71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
