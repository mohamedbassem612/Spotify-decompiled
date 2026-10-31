package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xy41 {
    public static final List a;

    static {
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(mo21.Q0, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            if (((mo21) next) != mo21.O0) {
                arrayList.add(next);
            }
        }
        a = o7h.a1(arrayList, new be21((byte) 6));
        bma1.b.k("search_entity_types_override_enabled");
    }

    public xy41(Context context, ut71 ut71Var) {
        ut71Var.c(context.getApplicationContext());
    }
}
