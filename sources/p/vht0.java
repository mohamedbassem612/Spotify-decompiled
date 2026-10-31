package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vht0 {
    public final i6n0 a;
    public final gw70 b;
    public final kt91 c;
    public final lzn0 d;
    public final q8n e;
    public final Scheduler f;
    public final SerialDisposable g = new SerialDisposable();
    public final a h;

    public vht0(i6n0 i6n0Var, gw70 gw70Var, kt91 kt91Var, lzn0 lzn0Var, q8n q8nVar, q8n q8nVar2, Scheduler scheduler) {
        this.a = i6n0Var;
        this.b = gw70Var;
        this.c = kt91Var;
        this.d = lzn0Var;
        this.e = q8nVar2;
        this.f = scheduler;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sht0 sht0Var = new sht0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dht0.class), runSequentially.a(sht0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cht0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uht0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eht0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pht0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kht0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qht0(this)));
        this.h = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(dht0 dht0Var, onm onmVar) {
        oht0 oht0Var;
        Object objC;
        if (onmVar instanceof oht0) {
            oht0Var = (oht0) onmVar;
            int i = oht0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oht0Var.d = i - Integer.MIN_VALUE;
            } else {
                oht0Var = new oht0(this, onmVar);
            }
        } else {
            oht0Var = new oht0(this, onmVar);
        }
        Object obj = oht0Var.b;
        int i2 = oht0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            String str = dht0Var.a;
            int i3 = dht0Var.b;
            oht0Var.a = dht0Var;
            oht0Var.d = 1;
            objC = this.a.c(i3, str, oht0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dht0Var = oht0Var.a;
            hm5.M(obj);
            objC = ((e331) obj).a;
        }
        Throwable thA = e331.a(objC);
        if (thA != null) {
            return new ijt0(dht0Var.b, thA);
        }
        vp31 vp31Var = (vp31) objC;
        xj61 xj61Var = new xj61();
        String str2 = vp31Var.c;
        if (str2 != null) {
            xj61Var.add(str2);
        }
        for (k1z0 k1z0Var : vp31Var.g) {
            x3z0 x3z0Var = k1z0Var.c;
            if (x3z0Var instanceof t3z0) {
                xj61Var.add(((t3z0) x3z0Var).a);
            } else if (x3z0Var instanceof v3z0) {
                xj61Var.add("https://learning-public-assets-cdn.spotifycdn.com/quiz/quotes.png");
            }
            vkk1 vkk1Var = k1z0Var.g.b;
            if (vkk1Var instanceof ukk1) {
                Iterator it = ((ukk1) vkk1Var).a.iterator();
                while (it.hasNext()) {
                    h67 h67Var = ((skk1) it.next()).a;
                    e67 e67Var = h67Var instanceof e67 ? (e67) h67Var : null;
                    if (e67Var != null) {
                        zz70 zz70Var = e67Var.a;
                        if (zz70Var instanceof yz70) {
                            xj61Var.add(((yz70) zz70Var).a);
                        } else {
                            if (!(zz70Var instanceof xz70)) {
                                eg.o();
                                return null;
                            }
                            xj61Var.add(((xz70) zz70Var).a);
                        }
                    }
                }
            }
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        ArrayList arrayList = new ArrayList(q7h.U(xj61VarJ, 10));
        wkg0 it2 = xj61VarJ.iterator();
        while (((g0y) it2).hasNext()) {
            Flowable flowableV = new CompletableDefer(new xf0(this, (String) it2.next(), (byte) 11)).t(5L, TimeUnit.SECONDS, this.f, (CompletableError) null).v();
            Predicate predicate = Functions.h;
            arrayList.add(new CompletableFromPublisher(flowableV.R(1L, predicate)).o(predicate));
        }
        this.g.a(Completable.l(arrayList).subscribe());
        return new jjt0(vp31Var);
    }
}
