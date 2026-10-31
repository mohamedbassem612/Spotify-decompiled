package p;

import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zel1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zel1(boolean z, dpo dpoVar, byte b) {
        super(4);
        this.a = b;
        this.b = z;
        this.c = dpoVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dpo dpoVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                bpo bpoVar = (bpo) obj;
                int iIntValue = ((Number) obj2).intValue();
                long j = ((Offset) obj3).a;
                long j2 = ((u7h) obj4).a;
                if (z) {
                    xab1 xab1Var = dpoVar.d;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    dpoVar.b.setValue(new cpo(bpoVar, iIntValue));
                    dpoVar.c.setValue(new xoo(ijf1.a, j, j2));
                }
                break;
            default:
                bpo bpoVar2 = (bpo) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                long j3 = ((Offset) obj3).a;
                long j4 = ((u7h) obj4).a;
                if (z) {
                    xab1 xab1Var2 = dpoVar.d;
                    if (xab1Var2 != null) {
                        xab1Var2.d((CancellationException) null);
                    }
                    dpoVar.b.setValue(new cpo(bpoVar2, iIntValue2));
                    dpoVar.c.setValue(new xoo(ijf1.b, j3, j4));
                }
                break;
        }
        return rih1Var;
    }
}
