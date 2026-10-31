package p;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class hcn1 implements ufp1, igp1, vcp1, v0i {
    public static final /* synthetic */ hcn1 a = new hcn1();
    public static final /* synthetic */ hcn1 b = new hcn1();

    @Override // p.vcp1
    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return kgn1.c(kap1Var, a2x0Var);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return zfn1.d((ccn1) pno1Var);
    }

    @Override // p.igp1
    public Object c(zxl1 zxl1Var, zxl1 zxl1Var2) throws GeneralSecurityException {
        mhn1 mhn1VarA;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) zxl1Var.b).size(); i++) {
            q9p1 q9p1VarS = zxl1Var.s(i);
            if (q9p1VarS.b == k9p1.c) {
                tap1 tap1Var = (tap1) zxl1Var2.p(q9p1VarS);
                pno1 pno1Var = q9p1VarS.a;
                if (pno1Var instanceof jfn1) {
                    mhn1VarA = ((jfn1) pno1Var).w();
                } else {
                    if (!(pno1Var instanceof jdp1)) {
                        String name = pno1Var.getClass().getName();
                        String strValueOf = String.valueOf(pno1Var.u());
                        throw new GeneralSecurityException(rjx.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    kap1 kap1Var = ((jdp1) pno1Var).d;
                    clv clvVar = (clv) kap1Var.d;
                    Integer num = (Integer) kap1Var.e;
                    if (clvVar == clv.h) {
                        mhn1VarA = mhn1.a(new byte[0]);
                    } else if (clvVar == clv.f) {
                        mhn1VarA = sep1.b(num.intValue());
                    } else {
                        if (clvVar != clv.g && clvVar != clv.i) {
                            k220.r("Unknown output prefix type");
                            return null;
                        }
                        mhn1VarA = sep1.a(num.intValue());
                    }
                }
                tgn1 tgn1Var = new tgn1(tap1Var, q9p1VarS.c);
                Objects.requireNonNull(mhn1VarA, "prefix must be non-null");
                byte[] bArr = mhn1VarA.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    k220.r("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                ((List) map.computeIfAbsent(mhn1VarA, azt.l)).add(tgn1Var);
            }
        }
        if (((HashMap) zxl1Var.c).get(pdp1.class) != null) {
            bhn0.d();
            return null;
        }
        List list = (List) map.get(mfp1.d);
        List listUnmodifiableList = list != null ? Collections.unmodifiableList(new ArrayList(list)) : Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((mhn1) entry.getKey()).a.length == 5) {
                long jA = mfp1.a(((mhn1) entry.getKey()).b());
                ArrayList arrayList2 = new ArrayList(listUnmodifiableList.size() + ((List) entry.getValue()).size());
                arrayList2.addAll((Collection) entry.getValue());
                arrayList2.addAll(listUnmodifiableList);
                arrayList.add(new bfp1(jA, Collections.unmodifiableList(arrayList2)));
            }
        }
        arrayList.sort(epj1.d);
        long[] jArr = new long[arrayList.size()];
        List[] listArr = new List[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((bfp1) arrayList.get(i2)).a;
            listArr[i2] = ((bfp1) arrayList.get(i2)).b;
        }
        return new sgn1(new mfp1(jArr, listArr, listUnmodifiableList));
    }

    public Object m(dxy dxyVar) {
        return new o321(dxyVar.g(pbo1.class));
    }
}
