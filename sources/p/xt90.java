package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xt90 implements wuy0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ xt90(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.wuy0
    public final boolean a(rba rbaVar) {
        switch (this.a) {
            case 0:
                Set set = s4b1.f;
                return uic.x(rbaVar.a.c).c == blc0.w8;
            default:
                return rbaVar.f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p.wuy0
    public final Object b(lnm lnmVar) {
        wt90 wt90Var;
        b541 b541Var;
        byte b = this.a;
        mb mbVar = mb.a;
        Object obj = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof wt90) {
                    wt90Var = (wt90) lnmVar;
                    int i = wt90Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wt90Var.c = i - Integer.MIN_VALUE;
                    } else {
                        wt90Var = new wt90(this, (onm) lnmVar);
                    }
                } else {
                    wt90Var = new wt90(this, (onm) lnmVar);
                }
                Object objJ = wt90Var.a;
                int i2 = wt90Var.c;
                if (i2 == 0) {
                    hm5.M(objJ);
                    Single singleFirstOrError = ((Observable) obj).firstOrError();
                    wt90Var.c = 1;
                    objJ = fc11.j(singleFirstOrError, wt90Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ);
                }
                return ((Boolean) objJ).booleanValue() ? new ob(2) : mbVar;
            default:
                if (lnmVar instanceof b541) {
                    b541Var = (b541) lnmVar;
                    int i3 = b541Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b541Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        b541Var = new b541(this, (onm) lnmVar);
                    }
                } else {
                    b541Var = new b541(this, (onm) lnmVar);
                }
                Object objJ2 = b541Var.a;
                int i4 = b541Var.c;
                if (i4 == 0) {
                    hm5.M(objJ2);
                    Single singleA = ((fzm0) obj).a();
                    b541Var.c = 1;
                    objJ2 = fc11.j(singleA, b541Var);
                    if (objJ2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ2);
                }
                return ((Boolean) objJ2).booleanValue() ? mbVar : new ob(6);
        }
    }
}
