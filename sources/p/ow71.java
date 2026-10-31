package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ow71 implements uw71 {
    public final String a;
    public final cqf b;
    public final String c;

    public ow71(String str, cqf cqfVar, String str2) {
        this.a = str;
        this.b = cqfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow71)) {
            return false;
        }
        ow71 ow71Var = (ow71) obj;
        return this.a.equals(ow71Var.a) && this.b == ow71Var.b && this.c.equals(ow71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
