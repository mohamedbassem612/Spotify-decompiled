package p;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qb6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vb6 c;
    public final /* synthetic */ y2r0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb6(vb6 vb6Var, y2r0 y2r0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vb6Var;
        this.d = y2r0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y2r0 y2r0Var = this.d;
        vb6 vb6Var = this.c;
        switch (b) {
            case 0:
                return new qb6(vb6Var, y2r0Var, lnmVar, (byte) 0);
            default:
                return new qb6(vb6Var, y2r0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objE;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        vb6 vb6Var = this.c;
        y2r0 y2r0Var = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    w6e0 w6e0Var = vb6Var.e;
                    Map mapSingletonMap = Collections.singletonMap(y2r0Var.a, dm61.y0(dm61.y0(vb6Var.i.d(y2r0Var), vb6Var.N0), f46.S0(new aq21[]{new zp21(jo70.class), new yp21(xkk1.class)})));
                    this.b = true;
                    objE = w6e0Var.e(mapSingletonMap, this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE = ((e331) obj).a;
                }
                return new e331(objE);
            default:
                llm llmVar = vb6Var.U0;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    tb6 tb6Var = new tb6(yoi1.g(vb6Var.X.a(Collections.singletonList(y2r0Var.a))), y2r0Var, (byte) 0);
                    this.b = true;
                    obj = d5p1.s(tb6Var, llmVar, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                zob1 zob1Var = (zob1) obj;
                vb6Var.S0.l(zob1Var.getValue());
                xab1 xab1Var = vb6Var.X0;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                vb6Var.X0 = fn31.T(llmVar, (o8n) null, 0, new k96(zob1Var, vb6Var, (lnm) null, (byte) 1), 3);
                return rih1.a;
        }
    }
}
