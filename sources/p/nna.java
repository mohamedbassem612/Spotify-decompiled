package p;

import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nna implements d0u0 {
    public final ubu0 a;
    public final zwz0 b;
    public final q8n c;
    public final yqg d;
    public final Context e;

    public nna(ubu0 ubu0Var, zwz0 zwz0Var, q8n q8nVar, yqg yqgVar, Context context) {
        this.a = ubu0Var;
        this.b = zwz0Var;
        this.c = q8nVar;
        this.d = yqgVar;
        this.e = context;
    }

    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        p8n p8nVar = q8n.b;
        q8n q8nVarM = this.c.M(1);
        z8n z8nVar = new z8n("betamax-event-reporting-scope");
        q8nVarM.getClass();
        llm llmVarE = smo1.e(flo1.l(q8nVarM, z8nVar));
        Context context = this.e;
        return new mna(m0u0Var, str, oot0Var, this.a, this.b, llmVarE, np00Var, this.d, (BatteryManager) context.getSystemService(BatteryManager.class), (PowerManager) context.getSystemService(PowerManager.class));
    }
}
