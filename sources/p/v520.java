package p;

import android.content.Context;
import java.util.Iterator;
import java.util.SortedMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v520 extends yrg0 {
    public final Context c;
    public final ajg d;
    public final idd1 e;

    public v520(Context context, ajg ajgVar) {
        super((byte) 19);
        this.c = context;
        this.d = ajgVar;
        this.e = new idd1(new cc00((Object) this, (byte) 8));
    }

    public final void r(String str) {
        Object next;
        String str2;
        idd1 idd1Var = this.e;
        Iterator it = ((SortedMap) idd1Var.getValue()).keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                str2 = (String) next;
                str2.getClass();
            }
        } while (!nhc1.Y(str, str2, false));
        String str3 = (String) next;
        if (str3 != null) {
        }
    }
}
