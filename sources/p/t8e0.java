package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8e0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zzz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8e0(iu30 iu30Var, zzz0 zzz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = zzz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zzz0 zzz0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                iu30Var.invoke(new zyz0(zzz0Var.b));
                return rih1Var;
            default:
                y001 y001Var = (z001) obj;
                if (y001Var.equals(x001.a)) {
                    iu30Var.invoke(new bzz0(zzz0Var.k));
                    return rih1Var;
                }
                if (y001Var instanceof y001) {
                    iu30Var.invoke(new hzz0(y001Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
