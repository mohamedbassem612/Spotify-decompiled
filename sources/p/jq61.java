package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jq61 implements kq61 {
    public final int a;
    public final String b;

    public jq61(int i, String str) {
        this.a = i;
        this.b = str;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("A non-empty URL must be provided.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq61)) {
            return false;
        }
        jq61 jq61Var = (jq61) obj;
        return this.a == jq61Var.a && this.b.equals(jq61Var.b);
    }

    @Override // p.kq61
    public final int g() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
