package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xrh implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ xrh(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object apply(Object obj) {
        tu00 tu00Var;
        w281 w281VarA;
        tu00 tu00Var2;
        Object next;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return new w98(str);
            case 1:
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 2:
                f7h f7hVar2 = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar2 != null ? f7hVar2.a : true);
            case 3:
                Map map = (Map) obj;
                g281 g281Var = (g281) map.get(str);
                if (g281Var == null) {
                    return MaybeEmpty.a;
                }
                g281 g281Var2 = (g281) map.get(str);
                if (g281Var2 == null || (tu00Var = g281Var2.y) == null || (w281VarA = tu00Var.a(w281.class)) == null) {
                    return MaybeEmpty.a;
                }
                g281 g281Var3 = (g281) map.get(str);
                return Maybe.e(new k2u(g281.a(g281Var, str), w281VarA, (g281Var3 == null || (tu00Var2 = g281Var3.y) == null) ? null : (v740) tu00Var2.a(v740.class), (i1z) null));
            case 4:
                return str;
            case 5:
                zei1 zei1Var = ((uv00) obj).a(zei1.class, str).b;
                if (zei1Var == null) {
                    return new jw01(str, "", "", "");
                }
                Iterator it = zei1Var.e.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        yp70 yp70Var = (yp70) next;
                        int i = yp70Var.c * yp70Var.b;
                        do {
                            Object next2 = it.next();
                            yp70 yp70Var2 = (yp70) next2;
                            int i2 = yp70Var2.c * yp70Var2.b;
                            if (i < i2) {
                                next = next2;
                                i = i2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                yp70 yp70Var3 = (yp70) next;
                String str2 = yp70Var3 != null ? yp70Var3.a : null;
                return new jw01(str, zei1Var.a, zei1Var.b, str2 != null ? str2 : "");
            case 6:
                return ((uv00) obj).a(xkk1.class, str);
            case 7:
                return ((uv00) obj).a(d7u0.class, str);
            case 8:
                f7h f7hVar3 = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar3 != null ? f7hVar3.b : false);
            default:
                return ((uv00) obj).a(jo70.class, str);
        }
    }
}
