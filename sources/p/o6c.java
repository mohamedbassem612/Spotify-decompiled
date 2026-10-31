package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class o6c {
    public static final void a(BrowseState.Content content, a8c a8cVar, xpw xpwVar, j3f1 j3f1Var, g9c g9cVar, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        d520 d520Var = a8cVar.e;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-495827440);
        int i2 = i | (x340Var.i(content) ? 4 : 2) | (x340Var.g(a8cVar) ? 32 : 16) | (x340Var.i(xpwVar) ? 256 : 128) | (x340Var.i(j3f1Var) ? 2048 : 1024) | (x340Var.i(g9cVar) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (i2 & 74899) != 74898)) {
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            xtb0 xtb0VarA = vpb1.A(x340Var);
            boolean zG = ((i2 & 112) == 32) | x340Var.g(iac0Var);
            Object objT = x340Var.T();
            Object obj = objT;
            if (zG || objT == m4cVar) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) d520Var.g;
                if (linkedHashMap == null) {
                    u890.C("_composeElementFactories");
                    throw null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (maa) ((vu30) entry.getValue()).invoke(d520Var.F(), iac0Var));
                }
                x340Var.s0(linkedHashMap2);
                obj = linkedHashMap2;
            }
            Map map = (Map) obj;
            zob1 zob1VarM = d520Var.M();
            Map map2 = (Map) d520Var.h;
            if (map2 == null) {
                u890.C("instrumentationEnvironments");
                throw null;
            }
            h3h1 h3h1Var = new h3h1(new n6c(content));
            snc0 snc0Var = (snc0) d520Var.e;
            if (snc0Var == null) {
                u890.C("listContentRuntime");
                throw null;
            }
            qka qkaVar = new qka(1, snc0Var, snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 13);
            x340Var.i0(-1670760505);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new q1d0(xtb0VarA, zob1VarM, map, map2, h3h1Var, qkaVar);
                x340Var.s0(objT2);
            }
            q1d0 q1d0Var = (q1d0) objT2;
            q1d0Var.a(x340Var, 0);
            x340Var.r(false);
            vgo1.f((tl7) x340Var.k(rce0.a), xtb0VarA, false, x340Var, 0, 4);
            float fM = dsa0.m(x340Var, 2131165386);
            float fM2 = dsa0.m(x340Var, 2131165387);
            ven0 ven0VarK = f4p1.k(q1d0Var.b, (iac0) null, x340Var, 7);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarN = anm1.N("browse_clientnative_data_source:" + BrowseState.Loading.INSTANCE.getDataSource(content), x2g0.E(x340Var, too1.y(qim0VarD, new bgc0(lhc.g(x340Var).f, 16))));
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                u85Var = lhc.g(x340Var).g;
                z = false;
            } else {
                z = false;
                x340Var.i0(-241885792);
            }
            x340Var.r(z);
            vk80 vk80VarC = hqq0.C(u85Var, x340Var);
            boolean zI = x340Var.i(xpwVar) | x340Var.i(j3f1Var) | ((i2 & 57344) == 16384 || x340Var.i(g9cVar)) | x340Var.i(q1d0Var) | x340Var.i(ven0VarK) | x340Var.d(fM2) | x340Var.d(fM);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                l6c l6cVar = new l6c(q1d0Var, xpwVar, j3f1Var, g9cVar, fM2, fM, ven0VarK);
                x340Var.s0(l6cVar);
                objT3 = l6cVar;
            }
            ujo1.d(qim0VarN, xtb0VarA, vk80VarC, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, x340Var, 0, 504);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m6c(content, a8cVar, xpwVar, j3f1Var, g9cVar, qim0Var, i);
        }
    }
}
