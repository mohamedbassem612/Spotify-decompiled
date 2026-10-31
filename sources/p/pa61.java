package p;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pa61 {
    public static final bg11 d;
    public static final bg11 e;
    public static final bg11 f;
    public static final bg11 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        d = bg11Var;
        e = b380.t(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        i8p1.m(objArr);
        f = b380.l(7, objArr);
        g = bg11Var;
        String str = zoi1.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
    }

    public pa61(int i2) {
        dm5.n(i2 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.a = i2;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static pa61 a(Bundle bundle) {
        int i2 = bundle.getInt(h, 0);
        if (i2 != 0) {
            return new pa61(i2);
        }
        String string = bundle.getString(i);
        string.getClass();
        Bundle bundleP = zoi1.p(bundle.getBundle(j));
        if (bundleP == null) {
            bundleP = Bundle.EMPTY;
        }
        return new pa61(string, bundleP);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putString(i, this.b);
        bundle.putBundle(j, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa61)) {
            return false;
        }
        pa61 pa61Var = (pa61) obj;
        return this.a == pa61Var.a && TextUtils.equals(this.b, pa61Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public pa61(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
