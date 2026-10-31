package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oz implements m10 {
    public final fde1 a;
    public final int b;
    public final int c;
    public final int d;

    public oz(fde1 fde1Var, int i, int i2, int i3) {
        this.a = fde1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        return this.a == ozVar.a && this.b == ozVar.b && this.c == ozVar.c && this.d == ozVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
