package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wb31 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r0x a;
    public final /* synthetic */ String b;

    public wb31(r0x r0xVar, String str) {
        this.a = r0xVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vb31 vb31Var;
        MaybeMap maybeMapE;
        if (onmVar instanceof vb31) {
            vb31Var = (vb31) onmVar;
            int i = vb31Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vb31Var.b = i - Integer.MIN_VALUE;
            } else {
                vb31Var = new vb31(this, onmVar);
            }
        } else {
            vb31Var = new vb31(this, onmVar);
        }
        Object obj2 = vb31Var.a;
        int i2 = vb31Var.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        wa31 wa31Var = (wa31) obj;
        ega1 ega1Var = wa31Var.a;
        km90 km90Var = wa31Var.b;
        String str = this.b;
        qsn qsnVar = new qsn(str, ega1Var, km90Var);
        dga1 dga1Var = ega1Var.a;
        if (u890.j(dga1Var, zfa1.a)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        r0x r0xVar = this.a;
        t890.u("children_dataSource", (t45) ((zb91) r0xVar.h).b);
        Set set = s4b1.f;
        if (uic.g(str, blc0.fh)) {
            maybeMapE = ((uu00) r0xVar.c).b(new oi("cwp", false, new z9b0(str, (byte) 5))).timeInterval().take(2L).flatMap(new t4o(str, (byte) 4)).firstElement().f(new upa0(qsnVar, (byte) 6));
        } else {
            maybeMapE = Maybe.e(new kia1(dga1Var));
        }
        ezc ezcVarG = yoi1.g(new MaybeToSingle(maybeMapE.f(new zc80(qsnVar, (byte) 9)), qsnVar).flatMapObservable(new yfc0(r0xVar, (byte) 1)).map(new z8c0(r0xVar, (byte) 2)).doOnNext(new hzc0(r0xVar, (byte) 0)).doOnError(new hzc0(r0xVar, (byte) 1)));
        klp0 klp0Var = new klp0(r261Var, (byte) 17);
        vb31Var.b = 1;
        Object objCollect = ezcVarG.collect(new tzy0(klp0Var, wa31Var, (byte) 15), vb31Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
