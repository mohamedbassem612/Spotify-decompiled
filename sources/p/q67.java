package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q67 implements r67 {
    public final int a;
    public final String b;

    public q67(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q67)) {
            return false;
        }
        q67 q67Var = (q67) obj;
        return this.a == q67Var.a && u890.j(this.b, q67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
