package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v111 extends x111 {
    public final String a;
    public final srt0 b;

    public v111(String str, srt0 srt0Var) {
        this.a = str;
        this.b = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v111)) {
            return false;
        }
        v111 v111Var = (v111) obj;
        return u890.j(this.a, v111Var.a) && this.b.equals(v111Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
