package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c5b1 implements o2q0 {
    public final /* synthetic */ uo5 a;

    public c5b1(uo5 uo5Var) {
        this.a = uo5Var;
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        if (zf30Var instanceof ug30) {
            BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
            u9c0 u9c0VarQ = cto1.q(zf30Var);
            uo5 uo5Var = this.a;
            c921.y(u9c0VarQ, (o8n) null, 0, new v4e0(uo5Var, zf30Var, behaviorSubjectF, (lnm) null, (byte) 12), 3);
            zf30Var.s1.a(new awc(((ug30) zf30Var).c().a.startWithItem(new d6r0(str)).flatMapSingle(new j2e0(str, behaviorSubjectF, (byte) 13)).subscribe((Consumer) uo5Var.d), (byte) 1));
        }
    }
}
