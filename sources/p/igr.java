package p;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Looper;
import app.p000rive.semantics.SemanticState;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class igr implements z57 {
    public final Context a;
    public final dn3 b;
    public final rdd1 c;
    public final o2i0 d;
    public final q2r e;
    public final il00 f;
    public final LogSessionId g;
    public ro30 h;
    public goq i;

    public igr(Context context, dn3 dn3Var, LogSessionId logSessionId) {
        this.a = context.getApplicationContext();
        this.b = dn3Var;
        this.c = rdd1.a;
        BitmapFactory.Options options = null;
        this.d = null;
        this.f = null;
        this.g = logSessionId;
        if (Build.VERSION.SDK_INT >= 26) {
            options = new BitmapFactory.Options();
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        b8p1 b8p1Var = new b8p1(context);
        b8p1Var.d = yoi1.F(Executors.newSingleThreadExecutor());
        b8p1Var.e = options;
        b8p1Var.b = SemanticState.Obscured;
        this.e = new q2r(b8p1Var);
    }

    public final b67 e(e4w e4wVar, Looper looper, a67 a67Var, y57 y57Var) {
        yoh0 yoh0Var = e4wVar.a;
        Context context = this.a;
        String strB = mue1.B(context, yoh0Var);
        if (strB != null && asj0.m(strB)) {
            soh0 soh0Var = yoh0Var.b;
            soh0Var.getClass();
            if (soh0Var.h != -9223372036854775807L) {
                ro30 ro30Var = this.h;
                if (ro30Var == null) {
                    ro30Var = new ro30(context, this.e, (byte) 18);
                    this.h = ro30Var;
                }
                return ro30Var.e(e4wVar, looper, a67Var, y57Var);
            }
        }
        goq goqVar = this.i;
        if (goqVar == null) {
            goq goqVar2 = new goq(this.a, this.b, this.c, this.d, this.f, this.g);
            this.i = goqVar2;
            goqVar = goqVar2;
        }
        return goqVar.e(e4wVar, looper, a67Var, y57Var);
    }

    public igr(Context context, dn3 dn3Var, rdd1 rdd1Var, o2i0 o2i0Var, q2r q2rVar) {
        this.a = context.getApplicationContext();
        this.b = dn3Var;
        this.c = rdd1Var;
        this.d = o2i0Var;
        this.e = q2rVar;
        this.f = null;
        this.g = null;
    }

    public igr(Context context, dn3 dn3Var, rdd1 rdd1Var, o2i0 o2i0Var, q2r q2rVar, il00 il00Var) {
        this.a = context.getApplicationContext();
        this.b = dn3Var;
        this.c = rdd1Var;
        this.d = o2i0Var;
        this.e = q2rVar;
        this.f = il00Var;
        this.g = null;
    }
}
