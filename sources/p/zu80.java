package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zu80 extends lm5 {
    public final String d;
    public final int e;

    public zu80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu80)) {
            return false;
        }
        zu80 zu80Var = (zu80) obj;
        return u890.j(this.d, zu80Var.d) && this.e == zu80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
