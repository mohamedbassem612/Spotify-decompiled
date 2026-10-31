package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zlg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlg0(Object obj, iu30 iu30Var, Object obj2, long j, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.b = iu30Var;
        this.e = obj2;
        this.c = j;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        Object obj = this.e;
        iu30 iu30Var = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((Function0) obj2).invoke();
                iu30Var.invoke(new dlg0(((nlg0) obj).a.a, j));
                break;
            case 1:
                if (!((gmg0) obj2).k) {
                    iu30Var.invoke(bmg0.a);
                } else {
                    iu30Var.invoke(new amg0((String) obj, j));
                }
                break;
            default:
                ((Function0) obj2).invoke();
                iu30Var.invoke(new amg0(((gmg0) obj).a, j));
                break;
        }
        return rih1Var;
    }
}
