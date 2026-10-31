package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class en1 implements mk90 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ en1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x018d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Enum t(ak90 ak90Var, lnm lnmVar) {
        dn1 dn1Var;
        ix3 ix3Var;
        tv80 tv80VarM;
        byte b = this.a;
        lk90 lk90Var = lk90.b;
        Object obj = this.e;
        d9n d9nVar = d9n.a;
        lk90 lk90Var2 = lk90.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof dn1) {
                    dn1Var = (dn1) lnmVar;
                    int i = dn1Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dn1Var.c = i - Integer.MIN_VALUE;
                    } else {
                        dn1Var = new dn1(this, (onm) lnmVar);
                    }
                } else {
                    dn1Var = new dn1(this, (onm) lnmVar);
                }
                Object obj2 = dn1Var.a;
                int i2 = dn1Var.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return lk90Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (!(ak90Var instanceof sj90)) {
                    return lk90Var2;
                }
                sj90 sj90Var = (sj90) ak90Var;
                int i3 = sj90Var.a;
                zuc0 zuc0Var = sj90Var.b;
                boolean z = zuc0Var.j;
                String str = zuc0Var.c;
                Completable completableIgnoreElement = (z ? Single.fromCallable(new cn1(this, str, i3)) : ((bl3) obj).g(str).map(new mgc(this, str, i3, (byte) 1))).flatMap(new oi(this, zuc0Var, z, (byte) 1)).ignoreElement();
                completableIgnoreElement.getClass();
                CompletableOnErrorComplete completableOnErrorCompleteO = completableIgnoreElement.o(Functions.h);
                dn1Var.c = 1;
                return fc11.i(completableOnErrorCompleteO, dn1Var) == d9nVar ? d9nVar : lk90Var;
            default:
                if (lnmVar instanceof ix3) {
                    ix3Var = (ix3) lnmVar;
                    int i4 = ix3Var.c;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ix3Var.c = i4 - Integer.MIN_VALUE;
                    } else {
                        ix3Var = new ix3(this, (onm) lnmVar);
                    }
                } else {
                    ix3Var = new ix3(this, (onm) lnmVar);
                }
                Object obj3 = ix3Var.a;
                int i5 = ix3Var.c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return lk90Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if ((ak90Var instanceof xj90) || (ak90Var instanceof zj90) || (ak90Var instanceof yj90)) {
                    ux3 ux3Var = (ux3) obj;
                    if (ak90Var.a().b() == ltt0.c && ux3Var.a() && (((u601) ux3Var.b.getValue()).getValue() instanceof ul10)) {
                        String str2 = ak90Var.a().c;
                        f1n0 f1n0Var = (f1n0) this.b;
                        String str3 = nik1.Z5.a;
                        i8h1 i8h1Var = (i8h1) this.c;
                        int iB = ak90Var.b();
                        r6h1 r6h1Var = (r6h1) this.d;
                        yml0 yml0Var = new yml0(Integer.valueOf(iB), ak90Var.a().c, r6h1Var);
                        boolean z2 = ak90Var instanceof zj90;
                        b7x b7xVar = b7x.a;
                        if (z2) {
                            tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), yml0Var.b, yml0Var.a, System.currentTimeMillis()), (xj61) null);
                        } else if (ak90Var instanceof yj90) {
                            tv80 tv80Var = ((yj90) ak90Var).d;
                            if (tv80Var == null) {
                                x6h1 x6h1VarC = yml0Var.b.c();
                                x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC.j = false;
                                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                            } else {
                                tv80VarM = tv80Var;
                            }
                        } else {
                            String str4 = ak90Var.a().c;
                            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                            if (str4 == null) {
                                str4 = "";
                            }
                            tv80VarM = i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), yml0Var.b, yml0Var.a, System.currentTimeMillis()), (xj61) null);
                        }
                        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("com.spotify.genalphablocking.childallowlistingrequest.bottomsheetpage.EXTRA_ITEM_URI", str2)});
                        ix3Var.c = 1;
                        return f1n0Var.e(str3, tv80VarM, bundleH, ix3Var) == d9nVar ? d9nVar : lk90Var;
                    }
                }
                return lk90Var2;
        }
    }
}
