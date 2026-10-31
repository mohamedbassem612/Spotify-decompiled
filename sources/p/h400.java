package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h400 implements y600 {
    public final String a;

    public h400(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h400) && u890.j(this.a, ((h400) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
