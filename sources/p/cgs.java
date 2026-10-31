package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cgs implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dgs b;

    public /* synthetic */ cgs(dgs dgsVar, byte b) {
        this.a = b;
        this.b = dgsVar;
    }

    public final void accept(Object obj) {
        int iC;
        byte b = this.a;
        Object k8v0Var = j8v0.a;
        i8v0 i8v0Var = i8v0.a;
        h8v0 h8v0Var = h8v0.a;
        dgs dgsVar = this.b;
        switch (b) {
            case 0:
                BehaviorSubject behaviorSubject = dgsVar.t;
                hm41 hm41Var = ((cn40) obj).a;
                xk41 xk41Var = hm41Var.b;
                if (hm41Var.e && (iC = l1d.C(xk41Var.a)) != 0) {
                    if (iC == 1) {
                        k8v0Var = i8v0Var;
                    } else if (iC == 2) {
                        n7r n7rVar = xk41Var.b;
                        if (n7rVar == null) {
                            n7rVar = n7r.b;
                        }
                        k8v0Var = new k8v0(n7rVar.a());
                    } else if (iC != 3) {
                        eg.o();
                    } else {
                        k8v0Var = h8v0Var;
                    }
                }
                behaviorSubject.onNext(k8v0Var);
                break;
            case 1:
                mvh1 mvh1Var = (mvh1) obj;
                BehaviorSubject behaviorSubject2 = dgsVar.t;
                if (mvh1Var instanceof hvh1) {
                    k8v0Var = i8v0Var;
                } else if (mvh1Var instanceof kvh1) {
                    k8v0Var = new k8v0(((kvh1) mvh1Var).a);
                } else if (!(mvh1Var instanceof jvh1)) {
                    if (!(mvh1Var instanceof ivh1)) {
                        eg.o();
                    } else {
                        k8v0Var = h8v0Var;
                    }
                }
                behaviorSubject2.onNext(k8v0Var);
                break;
            case 2:
                dgsVar.t.onNext(h8v0Var);
                break;
            default:
                dgsVar.r.onNext(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
        }
    }
}
