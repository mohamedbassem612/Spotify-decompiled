package p;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class m6 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        Object obj3;
        List listN0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                o6 o6Var = (o6) obj4;
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var = (x340) b0kVar;
                if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o6Var.a(x340Var, 0);
                } else {
                    x340Var.b0();
                }
                return rih1Var;
            default:
                gw91 gw91Var = (gw91) obj4;
                Set set = (Set) obj;
                AtomicReference atomicReference = gw91Var.b;
                do {
                    obj3 = atomicReference.get();
                    if (obj3 == null) {
                        listN0 = set;
                    } else if (obj3 instanceof Set) {
                        listN0 = p7h.M(new Set[]{obj3, set});
                    } else {
                        if (!(obj3 instanceof List)) {
                            g0k.b("Unexpected notification");
                            jah.d();
                            return null;
                        }
                        listN0 = o7h.N0(k4p1.x(set), (Collection) obj3);
                    }
                } while (!us71.o(atomicReference, obj3, listN0));
                if (!gw91Var.c()) {
                    return rih1Var;
                }
                gw91Var.a.invoke(new ww21(gw91Var, (byte) 13));
                return rih1Var;
        }
    }
}
