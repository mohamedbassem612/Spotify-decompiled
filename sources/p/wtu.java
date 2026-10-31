package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wtu implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wtu(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                zeu zeuVar = (zeu) obj2;
                String strZ = ((s4b1) zeuVar.c).z();
                if (strZ == null) {
                    return CompletableEmpty.a;
                }
                ayl aylVar = (ayl) zeuVar.a;
                if (!z) {
                    ayl.c(aylVar, strZ, (String) null, 6);
                    return CompletableEmpty.a;
                }
                ayl.b(aylVar, strZ, (String) null, 6);
                xyu xyuVar = (xyu) zeuVar.b;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return xyuVar.a(yon1.G0().a, strZ, (tv80) obj).o(Functions.h);
            default:
                mmr0 mmr0Var = new mmr0((String) obj2, Boolean.valueOf(z));
                m900 m900Var = (m900) obj;
                h900 h900Var = (h900) m900Var.e.get(mmr0Var);
                return (h900Var == null || m900Var.a(h900Var)) ? (Single) m900Var.f.computeIfAbsent(mmr0Var, new d4k(m900Var, (byte) 1)) : Single.just(h900Var);
        }
    }
}
