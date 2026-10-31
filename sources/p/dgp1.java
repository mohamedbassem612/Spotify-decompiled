package p;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dgp1 {
    public static final pun1 b;
    public final String a;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        b = new pun1(objArr, (byte) 1);
    }

    public dgp1(Context context, ot71 ot71Var, lzm1 lzm1Var, String str) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        dth.a(context);
        vgp1.d();
        this.a = str;
        x6o0.k();
        x6o0.t(new u1o1(this, (byte) 4));
        x6o0.k();
        Objects.requireNonNull(ot71Var);
        x6o0.t(new wvo1(ot71Var, (byte) 3));
        pun1 pun1Var = b;
        if (pun1Var.containsKey(str)) {
            gjv.d(context, (String) pun1Var.get(str), false);
        }
    }
}
