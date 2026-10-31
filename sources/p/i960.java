package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i960 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public i960(float f, float f2, float f3, float f4, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
    }

    public final boolean a(i960 i960Var) {
        return i960Var != null && this.e == i960Var.e && this.a == i960Var.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.a);
        sb.append(", y: ");
        sb.append(this.b);
        sb.append(", dataSetIndex: ");
        return gvg.j(sb, this.e, ", stackIndex (only stacked barentry): -1");
    }
}
