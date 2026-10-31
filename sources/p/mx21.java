package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mx21 {
    public static final bma1 d;
    public static final bma1 e;
    public final Context a;
    public final ut71 b;
    public final idd1 c = new idd1(new g521(this, (byte) 10));

    static {
        nbc nbcVar = bma1.b;
        d = nbcVar.q("wrapped_widget_resources_language");
        e = nbcVar.q("wrapped_widget_resources");
    }

    public mx21(Context context, ut71 ut71Var) {
        this.a = context;
        this.b = ut71Var;
    }

    public final ajm1 a() {
        String strE = ((dma1) this.c.getValue()).e(e, (String) null);
        if (strE == null) {
            return null;
        }
        try {
            return (ajm1) nfa0.d.a(strE, ajm1.Companion.serializer());
        } catch (Exception e2) {
            n57.g("Failed to deserialize cached widget resources", e2);
            return null;
        }
    }

    public final void b(ajm1 ajm1Var) {
        String strB = nfa0.d.b(ajm1.Companion.serializer(), ajm1Var);
        hma1 hma1VarEdit = ((dma1) this.c.getValue()).edit();
        hma1VarEdit.d(e, strB);
        hma1VarEdit.d(d, upn1.k(this.a));
        hma1VarEdit.g();
    }
}
