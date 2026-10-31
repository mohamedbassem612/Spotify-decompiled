package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lu60 extends ru60 {
    public final kv60 a;

    public lu60(kv60 kv60Var) {
        this.a = kv60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu60) && u890.j(this.a, ((lu60) obj).a);
    }

    public final int hashCode() {
        kv60 kv60Var = this.a;
        if (kv60Var == null) {
            return 0;
        }
        return kv60Var.hashCode();
    }
}
