package p;

import com.spotify.messages.OnDemandSetFetchMismatch;
import com.spotify.ondemandselector.proto.OndemandResponse;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k3q0 {
    public final h3q0 a;
    public final n3q0 b;
    public final t2j0 c;

    public k3q0(h3q0 h3q0Var, n3q0 n3q0Var, t2j0 t2j0Var) {
        this.a = h3q0Var;
        this.b = n3q0Var;
        this.c = t2j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Set set, onm onmVar) {
        j3q0 j3q0Var;
        Object m231Var;
        Object obj;
        if (onmVar instanceof j3q0) {
            j3q0Var = (j3q0) onmVar;
            int i = j3q0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j3q0Var.e = i - Integer.MIN_VALUE;
            } else {
                j3q0Var = new j3q0(this, onmVar);
            }
        } else {
            j3q0Var = new j3q0(this, onmVar);
        }
        Object objA = j3q0Var.c;
        int i2 = j3q0Var.e;
        t2j0 t2j0Var = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                h3q0 h3q0Var = this.a;
                j3q0Var.a = set;
                j3q0Var.b = null;
                j3q0Var.e = 1;
                objA = h3q0Var.a(j3q0Var);
                if (objA == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                set = j3q0Var.a;
                hm5.M(objA);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = j3q0Var.b;
                Set set2 = j3q0Var.a;
                hm5.M(objA);
            }
            m231Var = obj;
            if (e331.a(m231Var) != null) {
                i3q0 i3q0VarN = OnDemandSetFetchMismatch.n();
                i3q0VarN.r();
                t2j0Var.a(i3q0VarN.build());
            }
            return rih1.a;
            m231Var = (OndemandResponse) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            OndemandResponse ondemandResponse = (OndemandResponse) m231Var;
            Collection urisList = set;
            if (urisList == null || urisList.isEmpty()) {
                urisList = ondemandResponse.getUrisList();
            } else if (!ondemandResponse.getUrisList().isEmpty() && u890.j(set, ondemandResponse.getUrisList())) {
                urisList = ondemandResponse.getUrisList();
            }
            if (urisList == null) {
                urisList = w7x.a;
            }
            if (set != null && !set.equals(o7h.p1(ondemandResponse.getUrisList()))) {
                i3q0 i3q0VarN2 = OnDemandSetFetchMismatch.n();
                i3q0VarN2.n(ondemandResponse.getUrisList().isEmpty());
                i3q0VarN2.q(set.isEmpty());
                t2j0Var.a(i3q0VarN2.build());
            }
            CompletableAndThenCompletable completableAndThenCompletableB = this.b.b(o7h.p1(urisList));
            j3q0Var.a = null;
            j3q0Var.b = m231Var;
            j3q0Var.e = 2;
            if (fc11.i(completableAndThenCompletableB, j3q0Var) != d9nVar) {
                obj = m231Var;
                m231Var = obj;
            }
            return d9nVar;
        }
        if (e331.a(m231Var) != null) {
            i3q0 i3q0VarN3 = OnDemandSetFetchMismatch.n();
            i3q0VarN3.r();
            t2j0Var.a(i3q0VarN3.build());
        }
        return rih1.a;
    }
}
