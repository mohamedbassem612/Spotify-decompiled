package p;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o8p1 {
    public static final mmn1 b = mmn1.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public o8p1(Context context, ot71 ot71Var) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        dth.a(context);
        synchronized (o9p1.class) {
            if (o9p1.b == null) {
                o9p1.b = new o9p1((byte) 0);
            }
        }
        this.a = "common";
        x6o0.k();
        x6o0.t(new u1o1(this, (byte) 2));
        x6o0.k();
        Objects.requireNonNull(ot71Var);
        x6o0.t(new wvo1(ot71Var, (byte) 1));
        mmn1 mmn1Var = b;
        if (mmn1Var.containsKey("common")) {
            gjv.d(context, (String) mmn1Var.get("common"), false);
        }
    }
}
