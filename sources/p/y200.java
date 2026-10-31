package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y200 implements y600 {
    public final String a;

    public y200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y200) && u890.j(this.a, ((y200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
