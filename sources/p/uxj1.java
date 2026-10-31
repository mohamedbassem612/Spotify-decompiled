package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uxj1 {
    public final int a;
    public final String b;

    public uxj1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxj1)) {
            return false;
        }
        uxj1 uxj1Var = (uxj1) obj;
        return this.a == uxj1Var.a && u890.j(this.b, uxj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
