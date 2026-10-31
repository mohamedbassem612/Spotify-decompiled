package p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpf {
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public final yqg a;
    public final dma1 b;
    public final idd1 c = new idd1(new lwe(this, 7));

    static {
        nbc nbcVar = bma1.b;
        d = nbcVar.u("share_history_disclaimer_accepted");
        e = nbcVar.u("share_history_banner_shown_count");
        f = nbcVar.u("notifications_dialog_shown_ignored");
        g = nbcVar.u("notifications_dialog_shown_chats");
        h = nbcVar.u("listening_activity_prompt_dismissed_chats");
        i = nbcVar.u("listening_activity_prompt_dismiss_count");
        j = nbcVar.u("chat_draft_texts");
    }

    public fpf(Context context, yqg yqgVar, String str, ucd ucdVar) {
        this.a = yqgVar;
        this.b = ucdVar.b.b(context, str);
    }

    public final boolean a(String str) {
        dma1 dma1Var = this.b;
        boolean zH = dma1Var.h(f, false);
        bma1 bma1Var = g;
        Set set = w7x.a;
        Set setB = dma1Var.b(bma1Var, set);
        if (setB != null) {
            set = setB;
        }
        return !zH && (set.size() < 3 && !set.contains(str));
    }

    public final Map b() {
        String strE = this.b.e(j, (String) null);
        if (strE != null) {
            try {
                Map map = fga0.l(nfa0.d.c(strE)).a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Object obj : map.entrySet()) {
                    Object key = ((Map.Entry) obj).getKey();
                    uga0 uga0VarL = fga0.l((ega0) ((Map.Entry) obj).getValue());
                    Object obj2 = uga0VarL.get("text");
                    obj2.getClass();
                    String strB = fga0.m((ega0) obj2).b();
                    Object obj3 = uga0VarL.get("savedAt");
                    obj3.getClass();
                    linkedHashMap.put(key, new dpf(strB, fga0.n(fga0.m((ega0) obj3))));
                }
                return linkedHashMap;
            } catch (Exception unused) {
            }
        }
        return b7x.a;
    }

    public final void c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            dpf dpfVar = (dpf) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        }
        uga0 uga0Var = new uga0(linkedHashMap2);
        hma1 hma1VarEdit = this.b.edit();
        hma1VarEdit.d(j, uga0Var.toString());
        hma1VarEdit.g();
    }
}
