package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r3x implements i3x {
    public kee1 b;
    public String a = "";
    public int c = Integer.MAX_VALUE;
    public gt40 d = et40.a;

    public final i3x a() {
        r3x r3xVar = new r3x();
        r3xVar.d = this.d;
        r3xVar.a = this.a;
        r3xVar.b = this.b;
        r3xVar.c = this.c;
        return r3xVar;
    }

    public final gt40 b() {
        return this.d;
    }

    public final void c(gt40 gt40Var) {
        this.d = gt40Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return l1d.o(sb, this.c, ')');
    }
}
