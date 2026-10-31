package p;

import androidx.datastore.core.CorruptionException;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ze3 implements cv11, Function, k9n {
    public final /* synthetic */ byte a;
    public final iu30 b;

    public /* synthetic */ ze3(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // p.cv11
    public t6g1 a(uv11 uv11Var, t6g1 t6g1Var) {
        q6g1 q6g1Var = t6g1Var instanceof q6g1 ? (q6g1) t6g1Var : null;
        if (q6g1Var != null) {
            xn70 xn70Var = q6g1Var.a;
            bv11 bv11Var = q6g1Var.b;
            if (((Boolean) this.b.invoke(uv11Var.a)).booleanValue()) {
                Long l = bv11Var.c;
                return l != null ? new q6g1(xn70Var, bv11.b(bv11Var, new po11(l.longValue()), (c380) null, 66584575)) : q6g1Var;
            }
            if (bv11Var.u != null) {
                return new q6g1(xn70Var, bv11.b(bv11Var, (po11) null, (c380) null, 66060287));
            }
        }
        return t6g1Var;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 1:
                return iu30Var.invoke(obj);
            default:
                z310 z310Var = (z310) obj;
                List list = z310Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((u310) iu30Var.invoke((u310) it.next()));
                }
                return z310.a(z310Var, arrayList, (f410) null, 14);
        }
    }

    public Object d(CorruptionException corruptionException) {
        return this.b.invoke(corruptionException);
    }
}
