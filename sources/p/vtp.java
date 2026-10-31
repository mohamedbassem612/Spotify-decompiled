package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vtp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ vtp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final res a(Function0 function0, Function0 function1, e5l0 e5l0Var) {
        byte b = this.a;
        dlp dlpVar = this.b;
        switch (b) {
            case 0:
                wtp wtpVar = (wtp) dlpVar.c;
                o4o0 o4o0Var = (o4o0) ((r3o0) wtpVar.d).b.get();
                c8o.l(o4o0Var);
                o1o0 o1o0Var = (o1o0) ((r3o0) wtpVar.d).f.get();
                c8o.l(o1o0Var);
                rfr rfrVar = (rfr) ((r3o0) wtpVar.d).c.get();
                c8o.l(rfrVar);
                return new res(o4o0Var, o1o0Var, rfrVar, function0, function1, e5l0Var);
            default:
                wtp wtpVar2 = (wtp) dlpVar.c;
                o4o0 o4o0Var2 = (o4o0) ((e4o0) wtpVar2.d).b.get();
                c8o.l(o4o0Var2);
                o1o0 o1o0Var2 = (o1o0) ((e4o0) wtpVar2.d).e.get();
                c8o.l(o1o0Var2);
                rfr rfrVar2 = (rfr) ((e4o0) wtpVar2.d).c.get();
                c8o.l(rfrVar2);
                return new res(o4o0Var2, o1o0Var2, rfrVar2, function0, function1, e5l0Var);
        }
    }
}
