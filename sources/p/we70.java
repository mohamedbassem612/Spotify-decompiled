package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class we70 {
    public final int a;
    public final int b;

    public we70(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final ve70 a(Context context, String str) {
        se11 se11Var = xe70.a;
        String strC = xe70.c(context, context.getString(this.a), str);
        return new ve70(strC.concat("..."), xe70.c(context, context.getString(this.b), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we70)) {
            return false;
        }
        we70 we70Var = (we70) obj;
        return this.a == we70Var.a && this.b == we70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
