package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a5r0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ahi0 c;
    public final /* synthetic */ g5r0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5r0(ahi0 ahi0Var, g5r0 g5r0Var, boolean z, Function0 function0) {
        super(1);
        this.c = ahi0Var;
        this.d = g5r0Var;
        this.b = z;
        this.e = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                ahi0 ahi0Var = this.c;
                g5r0 g5r0Var = this.d;
                ahi0Var.l(rtb0Var, g5r0Var);
                rtb0.c(rtb0Var, (Object) null, new j2i(-588665871, new y4r0(ahi0Var, g5r0Var, (byte) 0), true), 3);
                boolean z = this.b;
                rtb0.c(rtb0Var, (Object) null, new j2i(-496807640, new z4r0(ahi0Var, g5r0Var, z, this.e, (byte) 0), true), 3);
                if (!z) {
                    ahi0Var.m(rtb0Var, g5r0Var);
                }
                break;
            default:
                rtb0 rtb0Var2 = (rtb0) obj;
                ahi0 ahi0Var2 = this.c;
                g5r0 g5r0Var2 = this.d;
                rtb0.c(rtb0Var2, "SharedContent", new j2i(200316744, new y4r0(ahi0Var2, g5r0Var2, (byte) 3), true), 2);
                boolean z2 = this.b;
                rtb0.c(rtb0Var2, "GroupableDevices", new j2i(1947937393, new z4r0(ahi0Var2, g5r0Var2, z2, this.e, (byte) 2), true), 2);
                if (!z2) {
                    ahi0Var2.m(rtb0Var2, g5r0Var2);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5r0(boolean z, ahi0 ahi0Var, g5r0 g5r0Var, Function0 function0) {
        super(1);
        this.b = z;
        this.c = ahi0Var;
        this.d = g5r0Var;
        this.e = function0;
    }
}
