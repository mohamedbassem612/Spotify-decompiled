package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vos0 {
    public static final nlc0 c;
    public static final bma1 d;
    public final dma1 a;
    public final Object b = new Object();

    static {
        chc1 chc1Var = chc1.a;
        c = new nlc0(chc1Var, chc1Var);
        d = bma1.b.n("social_interactivity_comment_drafts");
    }

    public vos0(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final void a(String str) {
        synchronized (this.b) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c());
            if (linkedHashMap.remove(str) != null) {
                d(linkedHashMap);
            }
        }
    }

    public final String b(String str) {
        String str2;
        synchronized (this.b) {
            str2 = (String) c().get(str);
        }
        return str2;
    }

    public final Map c() {
        String strE = this.a.e(d, (String) null);
        if (strE != null) {
            try {
                return (Map) nfa0.d.a(strE, c);
            } catch (Exception unused) {
            }
        }
        return b7x.a;
    }

    public final void d(LinkedHashMap linkedHashMap) {
        boolean zIsEmpty = linkedHashMap.isEmpty();
        bma1 bma1Var = d;
        dma1 dma1Var = this.a;
        if (zIsEmpty) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.g();
        } else {
            hma1 hma1VarEdit2 = dma1Var.edit();
            hma1VarEdit2.d(bma1Var, nfa0.d.b(c, linkedHashMap));
            hma1VarEdit2.g();
        }
    }
}
