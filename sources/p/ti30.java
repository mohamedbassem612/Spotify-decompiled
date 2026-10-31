package p;

import android.os.Bundle;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ti30 {
    public static final Field e;
    public final Class a;
    public final yf30 b;
    public final Bundle c;
    public int d;

    static {
        try {
            Field declaredField = yf30.class.getDeclaredField("a");
            e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            eg.f(e2);
        }
    }

    public ti30(Class cls, yf30 yf30Var, Bundle bundle, int i) {
        this.a = cls;
        this.b = yf30Var;
        this.c = bundle;
        this.d = i;
    }

    public final String a() {
        return this.a.toString();
    }

    public final nmr0 b() {
        Bundle bundle = new Bundle();
        Class cls = this.a;
        bundle.putSerializable("class", cls);
        bundle.putParcelable("saved_state", this.b);
        bundle.putParcelable("arguments", this.c);
        int iU = this.d;
        if (iU == -1) {
            try {
                iU = nho1.u(bundle);
                this.d = iU;
            } catch (Throwable th) {
                throw new IllegalStateException("Unable to parcel state for " + cls + ": " + bundle, th);
            }
        }
        bundle.putInt("size", iU);
        return new nmr0(bundle, Integer.valueOf(this.d));
    }
}
