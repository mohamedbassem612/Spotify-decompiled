package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mf8 implements mh5 {
    public static final mf8 c;
    public final boolean a;
    public final String b;

    static {
        lf8 lf8Var = new lf8();
        lf8Var.b = Boolean.FALSE;
        c = new mf8(lf8Var);
    }

    public mf8(lf8 lf8Var) {
        this.a = lf8Var.b.booleanValue();
        this.b = lf8Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mf8)) {
            return false;
        }
        mf8 mf8Var = (mf8) obj;
        return k8p1.h(null, null) && this.a == mf8Var.a && k8p1.h(this.b, mf8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
