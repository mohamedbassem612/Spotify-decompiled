package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hp7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp7(kp7 kp7Var, byte b) {
        super(1);
        this.a = b;
        this.b = kp7Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final Object invoke(Object obj) {
        nf huzVar;
        byte b = this.a;
        int i = 2;
        kp7 kp7Var = this.b;
        switch (b) {
            case 0:
                fdc fdcVar = kp7Var.i;
                i7e0 i7e0Var = ((jey0) obj).a;
                if (i7e0Var instanceof jae0) {
                    return r6x.a;
                }
                if (!(i7e0Var instanceof k8e0)) {
                    eg.o();
                    return null;
                }
                ezc ezcVar = (ezc) fdcVar.e;
                kge kgeVar = (kge) fdcVar.d;
                mr20 mr20Var = (mr20) fdcVar.f;
                String str = ((k8e0) i7e0Var).c;
                if (str != null) {
                    l78 l78Var = (l78) fdcVar.c;
                    huzVar = new nf(yoi1.g(l78Var.a(str).flatMapObservable(new fl1(l78Var, (byte) 26))), (byte) 14);
                } else {
                    huzVar = new huz(Boolean.FALSE, (byte) 10);
                }
                return new lt20(h5p1.r(ezcVar, kgeVar, mr20Var, huzVar, new np7(fdcVar, i7e0Var, null)), new ew0(i7e0Var, (lnm) null, (byte) 4), (byte) 0);
            case 1:
                ((qtr) obj).b(new f3(kp7Var, (lnm) null, (byte) 4));
                return rih1.a;
            case 2:
                dob1 dob1Var = (dob1) obj;
                String str2 = kp7Var.b;
                i7e0 i7e0Var2 = dob1Var.a;
                if (!(i7e0Var2 instanceof k8e0)) {
                    if (i7e0Var2 instanceof jae0) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                pft0 pft0VarX = tro1.x(dob1Var);
                if (!(pft0VarX instanceof oft0) && ((!(pft0VarX instanceof nft0) || ((nft0) pft0VarX).a != 2) && !dob1Var.c)) {
                    return null;
                }
                k8e0 k8e0Var = (k8e0) i7e0Var2;
                return new fvu(str2, tro1.s(i7e0Var2), tro1.x(dob1Var) instanceof mft0, tro1.E(k8e0Var), k8e0Var.m);
            case 3:
                dob1 dob1Var2 = (dob1) obj;
                String str3 = kp7Var.b;
                i7e0 i7e0Var3 = dob1Var2.a;
                if (!(i7e0Var3 instanceof k8e0)) {
                    if (i7e0Var3 instanceof jae0) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                k8e0 k8e0Var2 = (k8e0) i7e0Var3;
                fh90 fh90VarE = tro1.E(k8e0Var2);
                String str4 = k8e0Var2.d;
                if (str4 == null) {
                    str4 = "";
                }
                if (tro1.x(dob1Var2).equals(new mft0(1))) {
                    i = 3;
                } else if (tro1.x(dob1Var2) instanceof mft0) {
                    i = 1;
                } else {
                    pft0 pft0VarX2 = tro1.x(dob1Var2);
                    if (pft0VarX2 instanceof nft0) {
                        if (gp7.a[l1d.C(((nft0) pft0VarX2).a)] != 1) {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                }
                return new git0(str4, str3, (ai90) fh90VarE, i);
            default:
                return tro1.m(((dob1) obj).a, kp7Var.b);
        }
    }
}
