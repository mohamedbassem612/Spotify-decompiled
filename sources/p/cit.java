package p;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cit implements iu30 {
    public final /* synthetic */ byte a;
    public final eit b;

    public /* synthetic */ cit(eit eitVar, byte b) {
        this.a = b;
        this.b = eitVar;
    }

    public final Object invoke(Object obj) {
        lht lhtVar;
        rgy0 rgy0VarA;
        rgy0 rgy0VarA2;
        byte b = this.a;
        List<ggy0> listK0 = z6x.a;
        eit eitVar = this.b;
        switch (b) {
            case 0:
                ajn0 ajn0Var = (ajn0) obj;
                LinkedHashMap linkedHashMap = eitVar.a;
                tja0 tja0Var = yfy0.Z0;
                fit fitVar = eitVar.i;
                byte[] bArr = (byte[]) linkedHashMap.get(ajn0Var);
                if (bArr != null) {
                    listK0 = z561.k0(z561.b0(new gfr(tja0Var, new ByteArrayInputStream(bArr), fitVar, (byte) 4)));
                }
                ArrayList arrayList = new ArrayList(listK0.size());
                for (yfy0 yfy0Var : listK0) {
                    eki0 eki0Var = (eki0) fitVar.b.i;
                    yfy0Var.getClass();
                    iit iitVarF = eki0Var.f(yfy0Var);
                    if (!fitVar.r(iitVarF)) {
                        iitVarF = null;
                    }
                    if (iitVarF != null) {
                        arrayList.add(iitVarF);
                    }
                }
                fitVar.j(arrayList, ajn0Var);
                return h4p1.h(arrayList);
            case 1:
                ajn0 ajn0Var2 = (ajn0) obj;
                LinkedHashMap linkedHashMap2 = eitVar.b;
                tja0 tja0Var2 = ggy0.f1;
                fit fitVar2 = eitVar.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(ajn0Var2);
                if (bArr2 != null) {
                    listK0 = z561.k0(z561.b0(new gfr(tja0Var2, new ByteArrayInputStream(bArr2), fitVar2, (byte) 4)));
                }
                ArrayList arrayList2 = new ArrayList(listK0.size());
                for (ggy0 ggy0Var : listK0) {
                    eki0 eki0Var2 = (eki0) fitVar2.b.i;
                    ggy0Var.getClass();
                    arrayList2.add(eki0Var2.g(ggy0Var, false));
                }
                fitVar2.k(arrayList2, ajn0Var2);
                return h4p1.h(arrayList2);
            default:
                byp bypVar = eitVar.i.b;
                byte[] bArr3 = (byte[]) eitVar.c.get((ajn0) obj);
                if (bArr3 == null) {
                    return null;
                }
                tgy0 tgy0Var = (tgy0) tgy0.Q0.a(new ByteArrayInputStream(bArr3), (vz00) ((ks6) bypVar.b).O0);
                if (tgy0Var == null) {
                    return null;
                }
                eki0 eki0Var3 = (eki0) bypVar.i;
                byp bypVar2 = eki0Var3.a;
                l141 l141Var = (l141) bypVar2.d;
                zjn0 zjn0Var = (zjn0) bypVar2.c;
                List<efy0> list = tgy0Var.X;
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                for (efy0 efy0Var : list) {
                    ow3 ow3Var = eki0Var3.b;
                    efy0Var.getClass();
                    arrayList3.add(ow3Var.f(efy0Var, zjn0Var));
                }
                fg5 hg5Var = arrayList3.isEmpty() ? rzs0.g : new hg5(arrayList3, (byte) 0);
                fhy0 fhy0Var = (fhy0) no20.d.d(tgy0Var.d);
                switch (fhy0Var == null ? -1 : qhy0.b[fhy0Var.ordinal()]) {
                    case 1:
                        lhtVar = mht.d;
                        break;
                    case 2:
                        lhtVar = mht.a;
                        break;
                    case 3:
                        lhtVar = mht.b;
                        break;
                    case 4:
                        lhtVar = mht.c;
                        break;
                    case 5:
                        lhtVar = mht.e;
                        break;
                    case 6:
                        lhtVar = mht.f;
                        break;
                    default:
                        lhtVar = mht.a;
                        break;
                }
                jit jitVar = new jit((s1c1) ((ks6) bypVar2.b).a, (n9r) bypVar2.a, hg5Var, dem1.y(zjn0Var, tgy0Var.e), lhtVar, tgy0Var, (zjn0) bypVar2.c, (l141) bypVar2.d, (y3j1) bypVar2.e, (xht) bypVar2.g);
                mxa1 mxa1Var = (mxa1) byp.h(bypVar2, jitVar, tgy0Var.f).h;
                List listC = mxa1Var.c();
                int i = tgy0Var.c;
                if ((i & 4) == 4) {
                    rgy0VarA = tgy0Var.g;
                } else {
                    if ((i & 8) != 8) {
                        eg.m("No underlyingType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    rgy0VarA = l141Var.a(tgy0Var.h);
                }
                qx81 qx81VarJ = mxa1Var.j(rgy0VarA, false);
                int i2 = tgy0Var.c;
                if ((i2 & 16) == 16) {
                    rgy0VarA2 = tgy0Var.i;
                } else {
                    if ((i2 & 32) != 32) {
                        eg.m("No expandedType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    rgy0VarA2 = l141Var.a(tgy0Var.t);
                }
                jitVar.z1(listC, qx81VarJ, mxa1Var.j(rgy0VarA2, false));
                return jitVar;
        }
    }
}
