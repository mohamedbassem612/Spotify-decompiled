package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7c0 implements j7c0 {
    public final nu71 b;
    public final q8n c;
    public final Context d;
    public final dvm1 e;
    public final idd1 f = new idd1(new nzb0(this, 5));

    public m7c0(nu71 nu71Var, q8n q8nVar, Context context, dvm1 dvm1Var) {
        this.b = nu71Var;
        this.c = q8nVar;
        this.d = context;
        this.e = dvm1Var;
    }

    public final b7c0 a(String str) {
        b7c0 m231Var;
        if (str != null) {
            try {
                m231Var = b7c0.valueOf(str);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            b7c0 b7c0Var = m231Var;
            if (b7c0Var != null) {
                return b7c0Var;
            }
        }
        return (b7c0) this.f.getValue();
    }
}
