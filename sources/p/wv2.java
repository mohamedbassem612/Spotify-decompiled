package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class wv2 {
    public static final vv2 Companion = new vv2();
    public final jq2 a;

    public /* synthetic */ wv2(int i, jq2 jq2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = jq2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv2) && u890.j(this.a, ((wv2) obj).a);
    }

    public final int hashCode() {
        jq2 jq2Var = this.a;
        if (jq2Var == null) {
            return 0;
        }
        return jq2Var.hashCode();
    }
}
