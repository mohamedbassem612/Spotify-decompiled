package p;

import android.content.Context;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzs {
    public final Context a;
    public final g0l b;
    public final kor c;
    public final ark1 d;
    public final bpb1 e;
    public final BehaviorSubject f;
    public final bpb1 g;
    public final ezc h;

    public zzs(Context context, g0l g0lVar, kor korVar, ark1 ark1Var) {
        this.a = context;
        this.b = g0lVar;
        this.c = korVar;
        this.d = ark1Var;
        bpb1 bpb1VarB = gio1.b(huk1.a);
        this.e = bpb1VarB;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.f = behaviorSubjectF;
        this.g = bpb1VarB;
        this.h = yoi1.g(behaviorSubjectF.switchMap(fkj0.P0));
    }

    public final guk1 a(l0l l0lVar, Double d) {
        String name = l0lVar.getName();
        int iU = sqe.u(l0lVar.getType(), l0lVar.z());
        Context context = this.a;
        return new guk1(name, sqe.y(context, iU, context.getResources().getDimension(2131166920)), d.doubleValue());
    }

    public final l0l b() {
        bpb1 bpb1Var;
        Object value;
        l0l l0lVarC = ((inr) this.b).c();
        if (l0lVarC != null && !l0lVarC.l()) {
            return l0lVarC;
        }
        do {
            bpb1Var = this.e;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, fuk1.a));
        return null;
    }
}
