package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v87 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v87(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        z6x z6xVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                Set set = (Set) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (set.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            case 1:
                ll51 ll51Var = (ll51) obj;
                String str = ll51Var.a;
                z6x z6xVar2 = (String) ((LinkedHashMap) obj2).get(str);
                if (z6xVar2 == null) {
                    return ll51Var;
                }
                if (z6xVar2.length() > 0 && !z6xVar2.equals(ll51Var.b)) {
                    z6xVar = z6xVar2;
                }
                return z6xVar != null ? new ll51(str, z6xVar) : ll51Var;
            case 2:
                vqj0 vqj0Var = (vqj0) obj;
                vqj0 vqj0Var2 = (vqj0) obj2;
                return (vqj0Var == null || vqj0Var.a < vqj0Var2.a) ? vqj0Var2 : vqj0Var;
            case 3:
                ln21 ln21Var = (ln21) obj;
                ne neVarB = ln21Var.b();
                yyp0 yyp0Var = (yyp0) obj2;
                v360 v360Var = yyp0Var.c;
                List list = yyp0Var.d;
                d7 it = v360Var.iterator();
                while (true) {
                    d7 d7Var = it;
                    if (!d7Var.hasNext()) {
                        if (!list.isEmpty()) {
                            n270 n270Var = (n270) ln21Var.c(n270.class);
                            z6xVar = n270Var != null ? n270Var.a : null;
                            if (z6xVar == null) {
                                z6xVar = z6x.a;
                            }
                            neVarB.c0(n270.class, new n270(o7h.N0(list, (Collection) z6xVar)));
                        }
                        return new ln21(neVarB);
                    }
                    mmr0 mmr0Var = (mmr0) d7Var.next();
                    neVarB.G((String) mmr0Var.a, (String) mmr0Var.b);
                }
                break;
            case 4:
                uha1 uha1Var = (uha1) obj;
                return uha1.a(uha1Var, u890.j(uha1Var.a, ((uha1) obj2).a), (qha1) null, 11);
            case 5:
                pfm1 pfm1Var = (pfm1) obj;
                String str2 = (String) obj2;
                return u890.j(pfm1Var.a, str2) ? pfm1Var : new pfm1(str2, null);
            default:
                MobiusLoop mobiusLoop = (MobiusLoop) obj;
                ahm1 ahm1Var = (ahm1) obj2;
                if (mobiusLoop != null) {
                    Disposable disposable = ahm1Var.f;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    mobiusLoop.dispose();
                    ahm1Var.d.a.set(new pfm1(null, null));
                } else {
                    eg.m("This loop has already been stopped or has never been started");
                }
                return null;
        }
    }
}
