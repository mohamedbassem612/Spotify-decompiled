package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t111 extends x111 {
    public final String a;

    public t111(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t111) && u890.j(this.a, ((t111) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
