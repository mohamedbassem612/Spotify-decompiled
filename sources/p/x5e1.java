package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x5e1 extends cqb1 {
    public CharSequence c;
    public List d;
    public nbe1 e;
    public lee1 f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public flb0 k;
    public f930 l;
    public long m;
    public y9e1 n;

    public x5e1() {
        super(pv91.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = jjl.b(0, 0, 0, 0, 15);
    }

    public final void a(cqb1 cqb1Var) {
        x5e1 x5e1Var = (x5e1) cqb1Var;
        this.c = x5e1Var.c;
        this.d = x5e1Var.d;
        this.e = x5e1Var.e;
        this.f = x5e1Var.f;
        this.g = x5e1Var.g;
        this.h = x5e1Var.h;
        this.i = x5e1Var.i;
        this.j = x5e1Var.j;
        this.k = x5e1Var.k;
        this.l = x5e1Var.l;
        this.m = x5e1Var.m;
        this.n = x5e1Var.n;
    }

    public final cqb1 b() {
        return new x5e1();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        List list = this.d;
        nbe1 nbe1Var = this.e;
        lee1 lee1Var = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        float f = this.i;
        float f2 = this.j;
        flb0 flb0Var = this.k;
        f930 f930Var = this.l;
        String strM = hjl.m(this.m);
        y9e1 y9e1Var = this.n;
        StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object) charSequence);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", composition=");
        sb.append(nbe1Var);
        sb.append(", textStyle=");
        sb.append(lee1Var);
        sb.append(", singleLine=");
        sb.append(z);
        sb.append(", softWrap=");
        sb.append(z2);
        sb.append(", densityValue=");
        gvg.t(sb, f, ", fontScale=", f2, ", layoutDirection=");
        sb.append(flb0Var);
        sb.append(", fontFamilyResolver=");
        sb.append(f930Var);
        sb.append(", constraints=");
        sb.append(strM);
        sb.append(", layoutResult=");
        sb.append(y9e1Var);
        sb.append(")");
        return sb.toString();
    }
}
