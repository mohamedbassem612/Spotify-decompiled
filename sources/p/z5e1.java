package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z5e1 {
    public static final nfb f = new nfb((byte) 27, false);
    public final ggg1 a;
    public final lee1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public z5e1(ggg1 ggg1Var, lee1 lee1Var, boolean z, boolean z2, boolean z3) {
        this.a = ggg1Var;
        this.b = lee1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        sb.append(this.c);
        sb.append(", softWrap=");
        sb.append(this.d);
        sb.append(", isKeyboardTypePhone=");
        return l1d.r(sb, this.e, ")");
    }
}
