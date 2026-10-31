package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x881 {
    public final /* synthetic */ vaq a;

    public x881(vaq vaqVar) {
        this.a = vaqVar;
    }

    public final rps a(String str) {
        y441 y441VarA = this.a.a(str);
        nfa0 nfa0Var = (nfa0) y441VarA.b;
        c8o.l(nfa0Var);
        Context context = (Context) y441VarA.a;
        c8o.l(context);
        String str2 = (String) y441VarA.d;
        c8o.l(str2);
        gma1 gma1Var = (gma1) y441VarA.c;
        c8o.l(gma1Var);
        return new rps(nfa0Var, gma1Var.a().b(context, str2));
    }
}
