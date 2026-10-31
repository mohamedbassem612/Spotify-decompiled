package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cm01 implements f961, am01 {
    public static final bma1 c = bma1.b.u("campfire_custom_reactions_recent_emojis");
    public final kly0 a;
    public final q8n b;

    public cm01(q8n q8nVar, kly0 kly0Var) {
        this.a = kly0Var;
        this.b = q8nVar;
    }

    public static List c(String str) {
        if (str == null) {
            return z6x.a;
        }
        List listQ0 = ihc1.Q0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(String str) {
        kly0 kly0Var = this.a;
        try {
            dma1 dma1Var = (dma1) kly0Var.get();
            bma1 bma1Var = c;
            ArrayList arrayList = new ArrayList(c(dma1Var.e(bma1Var, (String) null)));
            arrayList.remove(str);
            arrayList.add(0, str);
            List listD1 = o7h.d1(arrayList, 30);
            hma1 hma1VarEdit = ((dma1) kly0Var.get()).edit();
            hma1VarEdit.d(bma1Var, o7h.y0(listD1, ",", (String) null, (String) null, (iu30) null, 62));
            hma1VarEdit.g();
        } catch (Exception e) {
            Logger.e(e, "Failed to record emoji selection", new Object[0]);
        }
    }

    public final Object b(x4x x4xVar) {
        return fn31.Y(this.b, new p2z0(this, (lnm) null, (byte) 12), x4xVar);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
