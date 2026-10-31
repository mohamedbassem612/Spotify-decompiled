package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sko0 extends wko0 {
    public final float a;
    public final String b;
    public final int c;
    public final int d;

    public sko0(float f, int i, int i2, String str) {
        this.a = f;
        this.b = dko0.e(str);
        o0c.m(i >= 0 && i <= 6, "Invalid minFractionDigits: %s", new Object[]{Integer.valueOf(i)});
        o0c.m(i2 >= 0 && i2 <= 6, "Invalid maxFractionDigits: %s", new Object[]{Integer.valueOf(i2)});
        o0c.m(i <= i2, "Invalid minFractionDigits/maxFractionDigits: %s/%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        this.c = i;
        this.d = i2;
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        bundle.putFloat("value", this.a);
        bundle.putString("unit", this.b);
        bundle.putInt("minDigits", this.c);
        bundle.putInt("maxDigits", this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sko0)) {
            return false;
        }
        sko0 sko0Var = (sko0) obj;
        if (this == sko0Var) {
            return true;
        }
        return this.a == sko0Var.a && Objects.equals(this.b, sko0Var.b) && this.c == sko0Var.c && this.d == sko0Var.d;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(sko0.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        sb.append(this.b);
        sb.append(", mMinFractionDigits=");
        sb.append(this.c);
        sb.append(", mMaxFractionDigits=");
        return gvg.j(sb, this.d, "}");
    }
}
