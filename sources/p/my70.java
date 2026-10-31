package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class my70 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public /* synthetic */ long b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my70(tb91 tb91Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = tb91Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                my70 my70Var = new my70(3, (lnm) obj3);
                my70Var.c = (jy70) obj;
                my70Var.b = jLongValue;
                return my70Var.invokeSuspend(rih1Var);
            default:
                long j = ((Offset) obj2).a;
                my70 my70Var2 = new my70((tb91) this.c, (lnm) obj3);
                my70Var2.b = j;
                my70Var2.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        float fS;
        switch (this.a) {
            case 0:
                jy70 jy70Var = (jy70) this.c;
                long j = this.b;
                hm5.M(obj);
                return new fy70(jy70Var, j);
            default:
                hm5.M(obj);
                long j2 = this.b;
                tb91 tb91Var = (tb91) this.c;
                if (tb91Var.m == qqq0.a) {
                    fS = Float.intBitsToFloat((int) (j2 & 4294967295L));
                } else {
                    fS = tb91Var.j ? tb91Var.h.s() - Float.intBitsToFloat((int) (j2 >> 32)) : Float.intBitsToFloat((int) (j2 >> 32));
                }
                tb91Var.q.t(fS - tb91Var.f138p.s());
                return rih1.a;
        }
    }

    public /* synthetic */ my70(int i, lnm lnmVar) {
        super(i, lnmVar);
    }
}
