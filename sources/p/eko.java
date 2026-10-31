package p;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eko extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eko(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                eko ekoVar = new eko(i, (lnm) obj4, (byte) 0);
                ekoVar.b = zBooleanValue;
                ekoVar.c = (Boolean) obj2;
                ekoVar.d = (Boolean) obj3;
                return ekoVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                eko ekoVar2 = new eko(i, (lnm) obj4, (byte) 1);
                ekoVar2.c = (String) obj;
                ekoVar2.d = (z7d) obj2;
                ekoVar2.b = zBooleanValue2;
                return ekoVar2.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        boolean z;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                Boolean bool = (Boolean) this.c;
                Boolean bool2 = (Boolean) this.d;
                hm5.M(obj);
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                bool2.getClass();
                return new xjo(z2, zBooleanValue, bool2.booleanValue());
            default:
                String str = (String) this.c;
                x7d x7dVar = (z7d) this.d;
                boolean z3 = this.b;
                hm5.M(obj);
                if (u890.j(x7dVar, y7d.a)) {
                    return bg81.a;
                }
                if (u890.j(x7dVar, w7d.a)) {
                    return yf81.a;
                }
                if (!(x7dVar instanceof x7d)) {
                    eg.o();
                    return null;
                }
                x7d x7dVar2 = x7dVar;
                List listA = x7dVar2.a();
                if (listA.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listA.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            goe goeVar = (goe) it.next();
                            if (goeVar.h().a() || goeVar.h().g() || goeVar.h().h()) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                str.getClass();
                return new ag81(str, x7dVar2.a(), z3 && z);
        }
    }
}
