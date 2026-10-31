package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final lqb0 b;

    public /* synthetic */ iqb0(lqb0 lqb0Var, byte b) {
        this.a = b;
        this.b = lqb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        lqb0 lqb0Var = this.b;
        switch (b) {
            case 0:
                return o7h.p1(z561.k0(z561.f0(zqb0.W0, z561.U(zqb0.V0, f46.I(lqb0Var.o.a.getDeclaredClasses())))));
            case 1:
                Collection collectionC = lqb0Var.o.c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionC) {
                    if (((sb11) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((sb11) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                return dm61.y0(lqb0Var.b(), lqb0Var.f());
        }
    }
}
