package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class udf implements bef {
    public final String a;
    public final t7q0 b;

    public udf(String str, t7q0 t7q0Var) {
        this.a = str;
        this.b = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udf)) {
            return false;
        }
        udf udfVar = (udf) obj;
        return u890.j(this.a, udfVar.a) && u890.j(this.b, udfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
