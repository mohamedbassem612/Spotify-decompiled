package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8j1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x8j1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8j1(x8j1 x8j1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = x8j1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        x8j1 x8j1Var = this.b;
        switch (b) {
            case 0:
                return new t8j1(x8j1Var, lnmVar, (byte) 0);
            case 1:
                return new t8j1(x8j1Var, lnmVar, (byte) 1);
            case 2:
                return new t8j1(x8j1Var, lnmVar, (byte) 2);
            case 3:
                return new t8j1(x8j1Var, lnmVar, (byte) 3);
            default:
                return new t8j1(x8j1Var, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x8j1 x8j1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                uoa uoaVar = (uoa) x8j1Var.d.e;
                if (uoaVar != null) {
                    uoaVar.p(2);
                }
                x8j1Var.X.a(new mmr0[]{new mmr0("muted", Boolean.TRUE)});
                break;
            case 1:
                hm5.M(obj);
                uoa uoaVar2 = (uoa) x8j1Var.d.e;
                if (uoaVar2 != null) {
                    uoaVar2.o(false);
                }
                x8j1Var.X.a(new mmr0[]{new mmr0("muted", Boolean.FALSE)});
                break;
            case 2:
                hm5.M(obj);
                uoa uoaVar3 = (uoa) x8j1Var.d.e;
                if (uoaVar3 != null) {
                    uoaVar3.l();
                }
                break;
            case 3:
                hm5.M(obj);
                uoa uoaVar4 = (uoa) x8j1Var.d.e;
                if (uoaVar4 != null) {
                    uoaVar4.f();
                }
                break;
            default:
                hm5.M(obj);
                myq0 myq0Var = x8j1Var.c;
                new MaybeFlatMapCompletable(new FlowableElementAtMaybe(((Flowable) myq0Var.b).j(mo9.N0)), new tym0(myq0Var, (byte) 23)).h(iqa1.Y0).o(Functions.h).subscribe();
                break;
        }
        return rih1Var;
    }
}
