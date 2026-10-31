package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tia {
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final sia a;
    public final Function0 b;
    public long c;
    public final ArrayList d;

    static {
        ytw0 ytw0Var = jfv.b;
        e = fdg1.j0(0.04d, ngv.e);
    }

    public tia(sia siaVar, Function0 function0) {
        this.a = siaVar;
        this.b = function0;
        ytw0 ytw0Var = jfv.b;
        this.c = 0L;
        List list = siaVar.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new jfv(((pia) it.next()).a));
        }
        this.d = arrayList;
    }
}
