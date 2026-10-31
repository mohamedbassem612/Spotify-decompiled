package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yam implements zam {
    public final int a;
    public final c380 b;

    public yam(int i, c9 c9Var) {
        this.a = i;
        this.b = c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yam)) {
            return false;
        }
        yam yamVar = (yam) obj;
        return this.a == yamVar.a && this.b.equals(yamVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
