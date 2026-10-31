package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tel1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tel1(boolean z, dpo dpoVar, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = dpoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dpo dpoVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                if (z) {
                    hrr0 hrr0Var = dpoVar.c;
                    xoo xooVar = (xoo) hrr0Var.getValue();
                    hrr0Var.setValue(xooVar != null ? new xoo(ijf1.a, j, xooVar.c) : null);
                }
                break;
            default:
                long j2 = ((Offset) obj).a;
                if (z) {
                    hrr0 hrr0Var2 = dpoVar.c;
                    xoo xooVar2 = (xoo) hrr0Var2.getValue();
                    hrr0Var2.setValue(xooVar2 != null ? new xoo(ijf1.b, j2, xooVar2.c) : null);
                }
                break;
        }
        return rih1Var;
    }
}
