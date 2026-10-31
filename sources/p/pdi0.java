package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pdi0 implements rdi0 {
    public final String a;
    public final String b;

    public pdi0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdi0)) {
            return false;
        }
        pdi0 pdi0Var = (pdi0) obj;
        return this.a.equals(pdi0Var.a) && this.b.equals(pdi0Var.b);
    }

    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
