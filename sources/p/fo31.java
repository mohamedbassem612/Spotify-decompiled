package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fo31 implements r7c0 {
    public final /* synthetic */ byte a;
    public final evm1 b;

    public /* synthetic */ fo31(evm1 evm1Var, byte b) {
        this.a = b;
        this.b = evm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        evm1 evm1Var = this.b;
        switch (b) {
            case 0:
                q7c0 q7c0Var = (q7c0) obj;
                fab0 fab0Var = q7c0Var.a;
                tr80 tr80Var = q7c0Var.b;
                int i = ((rr80) tr80Var).a;
                dia1 dia1Var = q7c0Var.d;
                List list = q7c0Var.e;
                List list2 = q7c0Var.g;
                int i2 = (((rr80) tr80Var).b + 1) - i;
                boolean z = q7c0Var.f;
                boolean z2 = q7c0Var.i;
                return new p7c0(i, i2, fab0Var, evm1Var.l(), evm1Var.h(), dia1Var, z, true, q7c0Var.h, null, list, list2, z2, 512);
            case 1:
                q7c0 q7c0Var2 = (q7c0) obj;
                fab0 fab0Var2 = q7c0Var2.a;
                tr80 tr80Var2 = q7c0Var2.b;
                int i3 = ((rr80) tr80Var2).a;
                mml mmlVar = q7c0Var2.c;
                int i4 = (((rr80) tr80Var2).b + 1) - i3;
                boolean zL = evm1Var.l();
                boolean zH = evm1Var.h();
                boolean z3 = q7c0Var2.f;
                boolean z4 = q7c0Var2.i;
                dia1 dia1Var2 = dia1.RECENTLY_PLAYED_OR_ADDED;
                z6x z6xVar = z6x.a;
                return new p7c0(i3, i4, fab0Var2, zL, zH, dia1Var2, z3, true, false, mmlVar, z6xVar, z6xVar, z4);
            default:
                q7c0 q7c0Var3 = (q7c0) obj;
                fab0 fab0Var3 = q7c0Var3.a;
                tr80 tr80Var3 = q7c0Var3.b;
                int i5 = ((rr80) tr80Var3).a;
                mml mmlVar2 = q7c0Var3.c;
                dia1 dia1Var3 = q7c0Var3.d;
                List list3 = q7c0Var3.e;
                List list4 = q7c0Var3.g;
                return new p7c0(i5, (((rr80) tr80Var3).b + 1) - i5, fab0Var3, evm1Var.l(), evm1Var.h(), dia1Var3, q7c0Var3.f, true, q7c0Var3.h, mmlVar2, list3, list4, q7c0Var3.i);
        }
    }
}
