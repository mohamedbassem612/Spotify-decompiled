package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdi0 implements rdi0 {
    public final String a;
    public final String b;
    public final String c;

    public qdi0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdi0)) {
            return false;
        }
        qdi0 qdi0Var = (qdi0) obj;
        return this.a.equals(qdi0Var.a) && this.b.equals(qdi0Var.b) && this.c.equals(qdi0Var.c);
    }

    @Override // p.rdi0
    public final String getText() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
