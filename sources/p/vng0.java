package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vng0 {
    public static void a(Object obj, Object obj2) {
        png0 png0Var = (png0) obj;
        pze0.m(obj2);
        if (png0Var.isEmpty()) {
            return;
        }
        Iterator it = png0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static png0 b(Object obj, Object obj2) {
        png0 png0VarI = (png0) obj;
        png0 png0Var = (png0) obj2;
        if (!png0Var.isEmpty()) {
            if (!png0VarI.e()) {
                png0VarI = png0VarI.i();
            }
            png0VarI.h(png0Var);
        }
        return png0VarI;
    }
}
