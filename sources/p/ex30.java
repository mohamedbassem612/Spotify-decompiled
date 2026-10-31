package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ex30 {
    public final gka1 a;

    public ex30(ex30... ex30VarArr) {
        List listAsList = Arrays.asList(ex30VarArr);
        ArrayList arrayList = new ArrayList();
        synchronized (listAsList) {
            try {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((ex30) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = new p4u(arrayList);
    }

    public static ex30 b(av30 av30Var, ex30 ex30Var) {
        return new ex30((gka1) new uk4(ex30Var, av30Var, (byte) 24));
    }

    public static ex30 c(ex30... ex30VarArr) {
        return new ex30(ex30VarArr);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [p.cx30] */
    public final cx30 a(qiw qiwVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final jku jkuVarI = this.a.i(new uk4(atomicBoolean, qiwVar, (byte) 25));
        return new jku() { // from class: p.cx30
            public final void dispose() {
                atomicBoolean.set(true);
                jkuVarI.dispose();
            }
        };
    }

    public ex30(gka1 gka1Var) {
        this.a = gka1Var;
    }
}
