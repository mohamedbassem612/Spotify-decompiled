package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ius implements vu30 {
    public final rot0 a;
    public final cyp b;
    public final b7r0 c;
    public final String d;

    public ius(rot0 rot0Var, cyp cypVar, b7r0 b7r0Var, String str) {
        this.a = rot0Var;
        this.b = cypVar;
        this.c = b7r0Var;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.vu30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(so3 so3Var, lnm lnmVar) {
        hus husVar;
        String str;
        String str2;
        if (lnmVar instanceof hus) {
            husVar = (hus) lnmVar;
            int i = husVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                husVar.c = i - Integer.MIN_VALUE;
            } else {
                husVar = new hus(this, lnmVar);
            }
        } else {
            husVar = new hus(this, lnmVar);
        }
        Object obj = husVar.a;
        int i2 = husVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        String strN = qmo1.n(this.d, so3Var.d);
        int iOrdinal = so3Var.e.ordinal();
        rot0 rot0Var = this.a;
        cyp cypVar = this.b;
        d9n d9nVar = d9n.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ruz ruzVarA = cypVar.a();
                rot0Var.getClass();
                Single singleA = ruzVarA.a(q9u0.e("your-library", false));
                husVar.c = 2;
                if (fc11.j(singleA, husVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            ruz ruzVarA2 = cypVar.a();
            rot0Var.getClass();
            Single singleA2 = ruzVarA2.a(q9u0.c("your-library", false));
            husVar.c = 1;
            if (fc11.j(singleA2, husVar) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        muz muzVarD = cypVar.d();
        PlayCommand.Builder builder = PlayCommand.builder(Context.fromUri(strN), rot0Var.a(strN));
        LoggingParams.Builder builder2 = LoggingParams.builder();
        ou80 ou80Var = so3Var.f;
        String str3 = "";
        if (ou80Var == null || (str = ou80Var.a) == null) {
            str = "";
        }
        LoggingParams.Builder builderInteractionId = builder2.interactionId(str);
        y6r0 y6r0Var = this.c.get();
        if (y6r0Var != null && (str2 = y6r0Var.a) != null) {
            str3 = str2;
        }
        Completable completableIgnoreElement = muzVarD.a(builder.loggingParams(builderInteractionId.pageInstanceId(str3).build()).build()).ignoreElement();
        completableIgnoreElement.getClass();
        CompletableOnErrorComplete completableOnErrorCompleteO = completableIgnoreElement.o(Functions.h);
        husVar.c = 3;
        if (fc11.i(completableOnErrorCompleteO, husVar) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }
}
