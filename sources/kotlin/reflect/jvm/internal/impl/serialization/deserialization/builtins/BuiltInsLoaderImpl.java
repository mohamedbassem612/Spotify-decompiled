package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p.bao0;
import p.bcc;
import p.deg;
import p.fzq0;
import p.gzq0;
import p.hzq0;
import p.iu30;
import p.kf30;
import p.km3;
import p.ks6;
import p.lqr;
import p.nb51;
import p.poj0;
import p.qct0;
import p.qka;
import p.s1c1;
import p.sfb1;
import p.voe0;
import p.vz00;
import p.wbc;
import p.yz1;
import p.zbc;
import p.zim0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    public final bcc b = new bcc();

    public final fzq0 createBuiltInPackageFragmentProvider(s1c1 s1c1Var, zim0 zim0Var, Set<kf30> set, Iterable<? extends deg> iterable, qct0 qct0Var, yz1 yz1Var, boolean z, iu30 iu30Var) {
        ArrayList arrayList = new ArrayList();
        for (kf30 kf30Var : set) {
            wbc.m.getClass();
            InputStream inputStream = (InputStream) iu30Var.invoke(wbc.a(kf30Var));
            zbc zbcVarQ = inputStream != null ? nb51.q(kf30Var, s1c1Var, zim0Var, inputStream) : null;
            if (zbcVarQ != null) {
                arrayList.add(zbcVarQ);
            }
        }
        hzq0 gzq0Var = new gzq0(arrayList);
        poj0 poj0Var = new poj0(s1c1Var, zim0Var);
        lqr lqrVar = new lqr(gzq0Var, (byte) 14);
        wbc wbcVar = wbc.m;
        km3 km3Var = new km3(zim0Var, poj0Var, wbcVar);
        vz00 vz00Var = wbcVar.a;
        String str = voe0.d;
        new ConcurrentHashMap(3, 1.0f, 2);
        ks6 ks6Var = new ks6(s1c1Var, zim0Var, lqrVar, km3Var, gzq0Var, iterable, poj0Var, yz1Var, qct0Var, vz00Var, (bao0) null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zbc) it.next()).y1(ks6Var);
        }
        return gzq0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public fzq0 createPackageFragmentProvider(s1c1 s1c1Var, zim0 zim0Var, Iterable<? extends deg> iterable, qct0 qct0Var, yz1 yz1Var, boolean z) {
        return createBuiltInPackageFragmentProvider(s1c1Var, zim0Var, sfb1.r, iterable, qct0Var, yz1Var, z, new qka(1, this.b, bcc.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, (byte) 14));
    }
}
