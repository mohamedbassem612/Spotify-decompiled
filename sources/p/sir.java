package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sir {
    public final t2j0 a;
    public final tgb b;
    public final bpb1 c;

    public sir(t2j0 t2j0Var, tgb tgbVar, ugb ugbVar, q8n q8nVar) {
        this.a = t2j0Var;
        this.b = tgbVar;
        llm llmVarT = cy30.t(q8nVar);
        this.c = gio1.b(new pir(new Date()));
        int iIntValue = ((Number) ugbVar.b()).intValue();
        if (tgbVar.isEnabled()) {
            c921.y(llmVarT, (o8n) null, 0, new cy9(this, iIntValue, (lnm) null, (byte) 5), 3);
        }
    }
}
