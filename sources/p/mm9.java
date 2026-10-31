package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mm9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ rm9 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm9(rm9 rm9Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = rm9Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new mm9(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new mm9(this.c, this.d, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        byte b = this.a;
        byte b2 = 0;
        String str = this.d;
        rm9 rm9Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = rm9Var.f;
                lm9 lm9Var = new lm9(str, (lnm) null, (byte) 0);
                this.b = true;
                Object objJ = b5p1.j(mr20Var, lm9Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q8n q8nVar = rm9Var.g;
                mm9 mm9Var = new mm9(rm9Var, str, lnmVar, b2);
                this.b = true;
                Object objY = fn31.Y(q8nVar, mm9Var, this);
                return objY == d9nVar ? d9nVar : objY;
        }
    }
}
