package p;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b9o implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ b9o(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        Class<?> enclosingClass;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((bjg1) obj).d.getValue();
            case 1:
                return bpi1.d(((lft) obj).t());
            case 2:
                mgt mgtVar = (mgt) obj;
                heg hegVar = i141.a;
                tdy0 tdy0VarZ = mgtVar.z();
                mla0 mla0Var = mgtVar.h;
                rja0 rja0VarB = i141.b(tdy0VarZ);
                if (!(rja0VarB instanceof rja0)) {
                    if (rja0VarB instanceof pja0) {
                        return ((pja0) rja0VarB).C();
                    }
                    if ((rja0VarB instanceof qja0) || (rja0VarB instanceof sja0)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                rja0 rja0Var = rja0VarB;
                tdy0 tdy0VarC = rja0Var.C();
                vz00 vz00Var = fka0.a;
                eja0 eja0VarC = fka0.c(rja0Var.E(), rja0Var.D(), rja0Var.G());
                if (eja0VarC == null) {
                    return null;
                }
                if (wm5.B(tdy0VarC) || fka0.e(rja0Var.E())) {
                    enclosingClass = mla0Var.n().getEnclosingClass();
                } else {
                    beg begVarK = tdy0VarC.k();
                    enclosingClass = begVarK instanceof beg ? bpi1.p(begVarK) : mla0Var.n();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(eja0VarC.J());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 3:
                return new kgt((lgt) obj);
            case 4:
                ArrayList arrayList = ((a440) obj).a;
                nen0 nen0VarQ = ot11.q(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fpa0 fpa0Var = (fpa0) arrayList.get(i);
                    dwm0.a(nen0VarQ, ot11.n(fpa0Var), fpa0Var);
                }
                return new dwm0(nen0VarQ);
            case 5:
                return new yka0((bla0) obj);
            case 6:
                yka0 yka0Var = (yka0) obj;
                boolean zE = yka0Var.e();
                if (zE) {
                    Collection collectionA = yka0Var.a();
                    mc11 mc11Var = yka0Var.o;
                    mma0 mma0Var = yka0.w[12];
                    return o7h.N0((Collection) mc11Var.invoke(), collectionA);
                }
                if (zE) {
                    eg.o();
                    return null;
                }
                mc11 mc11Var2 = yka0Var.t;
                mma0 mma0Var2 = yka0.w[17];
                Collection collection = (Collection) mc11Var2.invoke();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection) {
                    if (!sh10.d((lft) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 7:
                return w6b0.B((mla0) obj);
            case 8:
                return ((p241) ((o241) obj)).a.map(bj20.Y).distinctUntilChanged();
            case 9:
                return ebp1.g((znb0) obj).o();
            default:
                return sfb1.l.a(((tnw0) obj).a);
        }
    }
}
