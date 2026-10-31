package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sfz0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfz0(iu30 iu30Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj2).a;
                new sfz0(iu30Var, ven0Var, (lnm) obj3, (byte) 0).invokeSuspend(rih1Var);
                break;
            default:
                ((Number) obj2).floatValue();
                new sfz0(iu30Var, ven0Var, (lnm) obj3, (byte) 1).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                Boolean bool = Boolean.TRUE;
                ven0Var.setValue(bool);
                iu30Var.invoke(bool);
                break;
            default:
                hm5.M(obj);
                Boolean bool2 = Boolean.FALSE;
                ven0Var.setValue(bool2);
                iu30Var.invoke(bool2);
                break;
        }
        return rih1Var;
    }
}
