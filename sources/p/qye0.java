package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qye0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qye0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.b = obj;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                qye0 qye0Var = new qye0(3, (lnm) obj3);
                qye0Var.b = (Intent) obj;
                return qye0Var.invokeSuspend(rih1Var);
            case 1:
                new qye0((l811) this.b, (lnm) obj3, (byte) 1).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                new qye0((rm5) this.b, (lnm) obj3, (byte) 2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Intent intent = (Intent) this.b;
                hm5.M(obj);
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                String strJ = s4b1VarX.j();
                if (strJ == null) {
                    eg.m("childId is missing from the URI");
                    return null;
                }
                zzy zzyVarR = men1.r(s4b1VarX.n("entryPoint"));
                int iF = t0c.f(s4b1VarX);
                Bundle extras = intent.getExtras();
                return lfb.l(nye0.class, new pye0(strJ, zzyVarR, iF, (extras == null || !extras.containsKey("is_free_override")) ? null : yah0.m(extras.getBoolean("is_free_override"))), new c6w0(1, true, (hd5) null, 12));
            case 1:
                hm5.M(obj);
                ((l811) this.b).a = true;
                return rih1Var;
            default:
                hm5.M(obj);
                wzu.b((lzn0) ((rm5) this.b).a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qye0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 0;
    }
}
