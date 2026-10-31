package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class xr implements Supplier {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ cs b;

    public xr(ArrayList arrayList, cs csVar) {
        this.a = arrayList;
        this.b = csVar;
    }

    public final Object get() {
        Completable completableA;
        ArrayList<u4i1> arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (u4i1 u4i1Var : arrayList) {
            di8 di8Var = u4i1Var.a;
            String str = u4i1Var.c;
            String str2 = u4i1Var.d;
            Integer num = u4i1Var.e;
            cs csVar = this.b;
            m941 m941VarQ = csVar.q(new lw(di8Var, str, str2, num, Long.valueOf(csVar.c.b()), 32));
            m941VarQ.toString();
            if (m941VarQ instanceof m941) {
                completableA = csVar.i.a(new o71(cs.n(m941VarQ.a), null, Integer.valueOf(csVar.j.g()), true));
            } else {
                if (m941VarQ instanceof k941) {
                    return Single.error(new Exception("Failed to save user: " + u4i1Var));
                }
                if (!m941VarQ.equals(o941.a)) {
                    eg.o();
                    return null;
                }
                completableA = CompletableEmpty.a;
            }
            arrayList2.add(completableA);
        }
        return new CompletableToSingle(Completable.l(arrayList2), ur.c, (Object) null);
    }
}
