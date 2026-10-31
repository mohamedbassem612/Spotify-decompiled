package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class jnc1 {
    public static final o3r a = w3p1.o(new l4r(new xv00(rc11.a.b(w281.class)), 2, ljc1.e, new j4r(ljc1.g), ljc1.f), ljc1.h);

    public static final String a(k1r k1rVar, Context context) {
        List list;
        i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
        if (i1rVar != null && (list = (List) i1rVar.a) != null) {
            if (list.contains(v281.e)) {
                return context.getString(2131960241);
            }
            if (list.contains(v281.c)) {
                return context.getString(2131960207);
            }
            if (list.contains(v281.b) || list.contains(v281.d)) {
                return context.getString(2131960241);
            }
        }
        return null;
    }
}
