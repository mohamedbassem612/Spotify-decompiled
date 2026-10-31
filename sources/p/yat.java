package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yat implements wat {
    public final float a;
    public final float b;
    public final z930 c;

    public yat(float f, float f2, z930 z930Var) {
        this.a = f;
        this.b = f2;
        this.c = z930Var;
    }

    @Override // p.wat
    public final float U0() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yat)) {
            return false;
        }
        yat yatVar = (yat) obj;
        return Float.compare(this.a, yatVar.a) == 0 && Float.compare(this.b, yatVar.b) == 0 && this.c.equals(yatVar.c);
    }

    @Override // p.wat
    public final float h() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // p.wat
    public final long s(float f) {
        return fc11.Y(this.c.a(f), 4294967296L);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("DensityWithConverter(density=", this.a, ", fontScale=", this.b, ", converter=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // p.wat
    public final float y(long j) {
        if (wee1.a(TextUnit.b(j), 4294967296L)) {
            return this.c.b(TextUnit.c(j));
        }
        eg.m("Only Sp can convert to Px");
        return 0.0f;
    }
}
