package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ps90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ts90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps90(ts90 ts90Var, byte b) {
        super(1);
        this.a = b;
        this.b = ts90Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ts90 ts90Var = this.b;
        switch (b) {
            case 0:
                String str = ((ls90) obj).a.a;
                c9c0 c9c0Var = ts90Var.c;
                return Build.VERSION.SDK_INT >= 31 ? h5p1.s(ts90Var.a.g, new ht20(yoi1.g(ts90Var.b.d.map(rh20.g)), new ss90(ts90Var, null, (byte) 0)), new ry50(c9c0Var.d.b(), (byte) 16), new sv8(ts90Var, str, null, (byte) 4)) : new ld2(c9c0Var.d.b(), str, (byte) 18);
            default:
                ls90 ls90Var = (ls90) obj;
                String str2 = ls90Var.a.a;
                m4o0 m4o0Var = ls90Var.b;
                boolean zA = ts90Var.b.a();
                xo90 xo90Var = ((ap90) ts90Var.c.d.b().getValue()).a.a;
                return (u890.j(m4o0Var, l4o0.a) || Build.VERSION.SDK_INT < 31) ? new ms90(str2, xo90Var) : new ns90(m4o0Var, zA, str2, xo90Var);
        }
    }
}
