package p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class vin {
    public static final Charset a = Charset.forName("UTF-8");

    public abstract ty8 a();

    public final uy8 b(long j, String str, boolean z) {
        ty8 ty8VarA = a();
        uin uinVar = ((uy8) this).k;
        if (uinVar != null) {
            fz8 fz8VarA = uinVar.a();
            fz8VarA.e = Long.valueOf(j);
            fz8VarA.f = z;
            fz8VarA.m = (byte) (fz8VarA.m | 2);
            if (str != null) {
                gap1 gap1Var = new gap1();
                gap1Var.d(str);
                fz8VarA.h = gap1Var.b();
            }
            ty8VarA.j = fz8VarA.a();
        }
        return ty8VarA.a();
    }
}
