package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c040 extends d040 {
    public final String a;

    public c040(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c040) && u890.j(this.a, ((c040) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
