package p;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w701 {
    public final d390 a;
    public final qa01 b;
    public final ecg1 c;
    public final q8n d;

    public w701(d390 d390Var, qa01 qa01Var, ecg1 ecg1Var, q8n q8nVar) {
        this.a = d390Var;
        this.b = qa01Var;
        this.c = ecg1Var;
        this.d = q8nVar;
    }

    public static Object a(w701 w701Var, String str, onm onmVar, int i) {
        String m231Var;
        k8g1 k8g1Var = (k8g1) w701Var.a.a.c(str.concat("false"));
        if (k8g1Var != null) {
            return k8g1Var;
        }
        try {
            Set set = s4b1.f;
            m231Var = uic.x(str).h();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            hhg1.n("Invalid episode URI: ".concat(str));
            return null;
        }
        return fn31.Y(w701Var.d, new du2((Object) w701Var, m231Var, false, (Serializable) str, (lnm) null, (byte) 13), onmVar);
    }
}
