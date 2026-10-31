package p;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class xim0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:21:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:25:0x0148  */
    /* JADX WARN: Code duplicated, block: B:31:0x015b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0166  */
    /* JADX WARN: Code duplicated, block: B:41:0x023e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0247 A[LOOP:0: B:38:0x022c->B:44:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0246 A[SYNTHETIC] */
    public static final e141 a(Class cls) {
        lia0 lia0Var;
        kl21 kl21Var;
        kl21 kl21Var2;
        cgl1 cgl1Var;
        ConcurrentHashMap concurrentHashMap;
        lia0 lia0Var2;
        oia0 oia0VarL;
        oia0 oia0VarL2;
        e141 e141Var;
        cgl1 cgl1Var2;
        ConcurrentHashMap concurrentHashMap2;
        WeakReference weakReference;
        e141 e141Var2;
        ClassLoader classLoaderD = bb11.d(cls);
        cgl1 cgl1Var3 = new cgl1(classLoaderD);
        ConcurrentHashMap concurrentHashMap3 = a;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap3.get(cgl1Var3);
        if (weakReference2 != null) {
            e141 e141Var3 = (e141) weakReference2.get();
            if (e141Var3 != null) {
                return e141Var3;
            }
            concurrentHashMap3.remove(cgl1Var3, weakReference2);
        }
        yi20 yi20Var = yi20.h;
        uqv0 uqv0Var = new uqv0(classLoaderD, (byte) 19);
        uqv0 uqv0Var2 = new uqv0(rih1.class.getClassLoader(), (byte) 19);
        m7y0 m7y0Var = new m7y0(classLoaderD, (byte) 8);
        rdx0 rdx0Var = rdx0.g;
        voe0 voe0Var = new voe0("DeserializationComponentsForJava.ModuleData");
        lia0 lia0Var3 = new lia0(voe0Var);
        ajm0 ajm0Var = new ajm0(ajn0.g("<" + ("runtime module for " + classLoaderD) + '>'), voe0Var, lia0Var3, 56);
        bx81 bx81Var = voe0Var.a;
        bx81Var.lock();
        try {
            if (lia0Var3.a != null) {
                throw new AssertionError("Built-ins module is already set: " + lia0Var3.a + " (attempting to reset to " + ajm0Var + ")");
            }
            lia0Var3.a = ajm0Var;
            bx81Var.unlock();
            lia0Var3.f = new jia0(ajm0Var, (byte) 0);
            zht zhtVar = new zht();
            q881 q881Var = new q881((byte) 4);
            poj0 poj0Var = new poj0(voe0Var, ajm0Var);
            va20 va20Var = va20.U0;
            h8b0 h8b0Var = new h8b0(1, 9, 0);
            e8a0 e8a0Var = d8a0.d;
            h8b0 h8b0Var2 = e8a0Var.b;
            if (h8b0Var2 != null) {
                lia0Var = lia0Var3;
                if (h8b0Var2.d - h8b0Var.d <= 0) {
                    kl21Var = e8a0Var.c;
                }
                if (kl21Var == kl21.b) {
                    kl21Var2 = null;
                } else {
                    kl21Var2 = kl21Var;
                }
                oi oiVar = new oi(new rha0(kl21Var, kl21Var2), new p5(h8b0Var, (byte) 27));
                nfb nfbVar = new nfb();
                wd11 wd11Var = new wd11(ajm0Var, poj0Var);
                zf5 zf5Var = new zf5(oiVar);
                sua suaVar = new sua(new nhc((byte) 13), (byte) 25);
                bao0.b.getClass();
                cao0 cao0Var = aao0.b;
                cgl1Var = cgl1Var3;
                concurrentHashMap = concurrentHashMap3;
                lia0 lia0Var4 = lia0Var;
                hzq0 oqb0Var = new oqb0(new uw0(voe0Var, m7y0Var, uqv0Var, zhtVar, nfbVar, q881Var, va20Var, ajm0Var, wd11Var, zf5Var, suaVar, cao0Var, oiVar, new uic((byte) 7)));
                joj0 joj0Var = joj0.g;
                v6a0 v6a0Var = new v6a0(uqv0Var, zhtVar, (byte) 1);
                p2o0 p2o0Var = new p2o0(ajm0Var, poj0Var, voe0Var, uqv0Var);
                p2o0Var.g = joj0Var;
                List listSingletonList = Collections.singletonList(cys.a);
                g6b0 g6b0Var = ajm0Var.e;
                lia0Var2 = g6b0Var instanceof lia0 ? (lia0) g6b0Var : null;
                yz10 yz10Var = yz10.h;
                if (lia0Var2 != null || (oia0VarL = lia0Var2.L()) == null) {
                    oia0VarL = s9w.e;
                }
                if (lia0Var2 != null || (oia0VarL2 = lia0Var2.L()) == null) {
                    oia0VarL2 = o610.W0;
                }
                vz00 vz00Var = fka0.a;
                String str = voe0.d;
                new ConcurrentHashMap(3, 1.0f, 2);
                ks6 ks6Var = new ks6(voe0Var, ajm0Var, v6a0Var, p2o0Var, oqb0Var, rdx0Var, yz10Var, z6x.a, poj0Var, oia0VarL, oia0VarL2, vz00Var, cao0Var, listSingletonList, yi20Var);
                zhtVar.a = ks6Var;
                q881Var.b = new lmw(oqb0Var, (byte) 29);
                oia0 oia0VarL3 = lia0Var4.L();
                oia0 oia0VarL4 = lia0Var4.L();
                String str2 = voe0.d;
                new ConcurrentHashMap(3, 1.0f, 2);
                qia0 qia0Var = new qia0(voe0Var, uqv0Var2, ajm0Var);
                lqr lqrVar = new lqr(qia0Var, (byte) 14);
                wbc wbcVar = wbc.m;
                qia0Var.c = new ks6(voe0Var, ajm0Var, lqrVar, new km3(ajm0Var, poj0Var, wbcVar), qia0Var, p7h.M(new deg[]{new vbc(voe0Var, ajm0Var), new iia0(voe0Var, ajm0Var)}), poj0Var, oia0VarL3, oia0VarL4, wbcVar.a, cao0Var, 262144);
                ajm0Var.h = new yim0(f46.Q0(new ajm0[]{ajm0Var}));
                ajm0Var.i = new j2k(p7h.M(new hzq0[]{oqb0Var, qia0Var}), "CompositeProvider@RuntimeModuleData for " + ajm0Var);
                e141Var = new e141(ks6Var, new rzo0(zhtVar, uqv0Var));
                while (true) {
                    cgl1Var2 = cgl1Var;
                    concurrentHashMap2 = concurrentHashMap;
                    weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(cgl1Var2, new WeakReference(e141Var));
                    if (weakReference == null) {
                        return e141Var;
                    }
                    e141Var2 = (e141) weakReference.get();
                    if (e141Var2 != null) {
                        return e141Var2;
                    }
                    concurrentHashMap2.remove(cgl1Var2, weakReference);
                    cgl1Var = cgl1Var2;
                    concurrentHashMap = concurrentHashMap2;
                }
            } else {
                lia0Var = lia0Var3;
            }
            kl21Var = e8a0Var.a;
            if (kl21Var == kl21.b) {
                kl21Var2 = null;
            } else {
                kl21Var2 = kl21Var;
            }
            oi oiVar2 = new oi(new rha0(kl21Var, kl21Var2), new p5(h8b0Var, (byte) 27));
            nfb nfbVar2 = new nfb();
            wd11 wd11Var2 = new wd11(ajm0Var, poj0Var);
            zf5 zf5Var2 = new zf5(oiVar2);
            sua suaVar2 = new sua(new nhc((byte) 13), (byte) 25);
            bao0.b.getClass();
            cao0 cao0Var2 = aao0.b;
            cgl1Var = cgl1Var3;
            concurrentHashMap = concurrentHashMap3;
            lia0 lia0Var5 = lia0Var;
            hzq0 oqb0Var2 = new oqb0(new uw0(voe0Var, m7y0Var, uqv0Var, zhtVar, nfbVar2, q881Var, va20Var, ajm0Var, wd11Var2, zf5Var2, suaVar2, cao0Var2, oiVar2, new uic((byte) 7)));
            joj0 joj0Var2 = joj0.g;
            v6a0 v6a0Var2 = new v6a0(uqv0Var, zhtVar, (byte) 1);
            p2o0 p2o0Var2 = new p2o0(ajm0Var, poj0Var, voe0Var, uqv0Var);
            p2o0Var2.g = joj0Var2;
            List listSingletonList2 = Collections.singletonList(cys.a);
            g6b0 g6b0Var2 = ajm0Var.e;
            if (g6b0Var2 instanceof lia0) {
            }
            yz10 yz10Var2 = yz10.h;
            if (lia0Var2 != null) {
                oia0VarL = s9w.e;
            } else {
                oia0VarL = s9w.e;
            }
            if (lia0Var2 != null) {
                oia0VarL2 = o610.W0;
            } else {
                oia0VarL2 = o610.W0;
            }
            vz00 vz00Var2 = fka0.a;
            String str3 = voe0.d;
            new ConcurrentHashMap(3, 1.0f, 2);
            ks6 ks6Var2 = new ks6(voe0Var, ajm0Var, v6a0Var2, p2o0Var2, oqb0Var2, rdx0Var, yz10Var2, z6x.a, poj0Var, oia0VarL, oia0VarL2, vz00Var2, cao0Var2, listSingletonList2, yi20Var);
            zhtVar.a = ks6Var2;
            q881Var.b = new lmw(oqb0Var2, (byte) 29);
            oia0 oia0VarL5 = lia0Var5.L();
            oia0 oia0VarL6 = lia0Var5.L();
            String str4 = voe0.d;
            new ConcurrentHashMap(3, 1.0f, 2);
            qia0 qia0Var2 = new qia0(voe0Var, uqv0Var2, ajm0Var);
            lqr lqrVar2 = new lqr(qia0Var2, (byte) 14);
            wbc wbcVar2 = wbc.m;
            qia0Var2.c = new ks6(voe0Var, ajm0Var, lqrVar2, new km3(ajm0Var, poj0Var, wbcVar2), qia0Var2, p7h.M(new deg[]{new vbc(voe0Var, ajm0Var), new iia0(voe0Var, ajm0Var)}), poj0Var, oia0VarL5, oia0VarL6, wbcVar2.a, cao0Var2, 262144);
            ajm0Var.h = new yim0(f46.Q0(new ajm0[]{ajm0Var}));
            ajm0Var.i = new j2k(p7h.M(new hzq0[]{oqb0Var2, qia0Var2}), "CompositeProvider@RuntimeModuleData for " + ajm0Var);
            e141Var = new e141(ks6Var2, new rzo0(zhtVar, uqv0Var));
            while (true) {
                cgl1Var2 = cgl1Var;
                concurrentHashMap2 = concurrentHashMap;
                weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(cgl1Var2, new WeakReference(e141Var));
                if (weakReference == null) {
                    return e141Var;
                }
                e141Var2 = (e141) weakReference.get();
                if (e141Var2 != null) {
                    return e141Var2;
                }
                concurrentHashMap2.remove(cgl1Var2, weakReference);
                cgl1Var = cgl1Var2;
                concurrentHashMap = concurrentHashMap2;
            }
        } catch (Throwable th) {
            try {
                voe0Var.b.getClass();
                throw th;
            } catch (Throwable th2) {
                bx81Var.unlock();
                throw th2;
            }
        }
    }
}
