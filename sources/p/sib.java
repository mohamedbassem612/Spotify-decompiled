package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sib {
    public final ynb0 a;
    public final qib b;
    public final sir c;
    public final tgb d;
    public final epb e;
    public final tgb f;
    public final PublishSubject g = new PublishSubject();
    public Function0 h;

    public sib(ynb0 ynb0Var, qib qibVar, sir sirVar, tgb tgbVar, epb epbVar, tgb tgbVar2) {
        this.a = ynb0Var;
        this.b = qibVar;
        this.c = sirVar;
        this.d = tgbVar;
        this.e = epbVar;
        this.f = tgbVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(Set set, qhb qhbVar, rhb rhbVar, onm onmVar) {
        rib ribVar;
        if (onmVar instanceof rib) {
            ribVar = (rib) onmVar;
            int i = ribVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ribVar.c = i - Integer.MIN_VALUE;
            } else {
                ribVar = new rib(this, onmVar);
            }
        } else {
            ribVar = new rib(this, onmVar);
        }
        rib ribVar2 = ribVar;
        Object objA = ribVar2.a;
        int i2 = ribVar2.c;
        if (i2 == 0) {
            hm5.M(objA);
            aib aibVar = (aib) this.a.get();
            boolean zIsEnabled = this.d.isEnabled();
            gaa gaaVar = new gaa(this, (byte) 14);
            ribVar2.c = 1;
            objA = aibVar.a(set, qhbVar, rhbVar, zIsEnabled, gaaVar, ribVar2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        mmr0 mmr0Var = (mmr0) objA;
        xhb xhbVar = (zhb) mmr0Var.a;
        Function0 function0 = (Function0) mmr0Var.b;
        if (xhbVar instanceof xhb) {
            this.b.d(xhbVar);
        }
        this.h = function0;
        return xhbVar;
    }
}
