package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m051 implements r151 {
    public final String a;

    public m051(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m051) && u890.j(this.a, ((m051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
