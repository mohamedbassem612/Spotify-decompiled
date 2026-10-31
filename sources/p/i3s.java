package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i3s {
    public w611 a;
    public w611 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public i3s(w611 w611Var, w611 w611Var2, int i, int i2, int i3, int i4) {
        this.a = w611Var;
        this.b = w611Var2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.a);
        sb.append(", newHolder=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        return l1d.o(sb, this.f, '}');
    }
}
