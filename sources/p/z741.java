package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z741 implements rhh0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ z741(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Single b(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        z6x z6xVar = z6x.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ats0 ats0Var = (ats0) obj3;
                String str = r9cVar.b;
                boolean z = r9cVar.f;
                if (z) {
                    return ats0Var.b(r9cVar);
                }
                if (!z && nhc1.Y(str, "spotify:section:", false)) {
                    Single map = ats0Var.b(r9cVar).map(i2x0.h).toObservable().flatMapIterable(r3x0.i).flatMap(new dc31(this, r9cVar, (byte) 6)).toList().map(new ejb(this, (byte) 23)).map(h2x0.i);
                    map.getClass();
                    return map;
                }
                Logger.d("SamsungKeyboardHomeLoader doesn't support loading items for parentId: %s", new Object[]{str});
                Single singleJust = Single.just(new z310(z6xVar, (f410) null, (m510) null, (String) null));
                singleJust.getClass();
                return singleJust;
            case 1:
                m210 m210Var = r9cVar.e;
                m210Var.getClass();
                String strA = ((p2k) obj3).a(m210Var);
                if (strA != null) {
                    return sy2.c((sy2) obj2, strA, (String) null, 2, (Object) null).compose(new o2b1((ffe1) obj, (byte) 17));
                }
                n57.e("No client context provider for description " + m210Var);
                return Single.just(new z310(z6xVar, (f410) null, (m510) null, (String) null));
            default:
                m210 m210Var2 = r9cVar.e;
                m210Var2.getClass();
                String strA2 = ((p2k) obj3).a(m210Var2);
                if (strA2 != null) {
                    return sy2.c((sy2) obj2, strA2, (String) null, 2, (Object) null).compose(new dn81((vnd1) obj, (byte) 25));
                }
                n57.e("No client context provider for description " + m210Var2);
                return Single.just(new z310(z6xVar, (f410) null, (m510) null, (String) null));
        }
    }
}
