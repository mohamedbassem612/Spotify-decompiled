package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ogc1 implements v9t {
    @Override // p.v9t
    public final int a(u9t u9tVar, u9t u9tVar2) {
        ArrayList arrayList = u9tVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = u9tVar2.a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        xzd1 xzd1Var = (xzd1) l1d.i(1, arrayList);
        arrayList.size();
        String str = xzd1Var.g;
        ngc1 ngc1Var = new ngc1();
        g4r g4rVar = new g4r();
        g4rVar.i(u9tVar.b(arrayList.size()));
        kng0 kng0Var = new kng0(xzd1Var.e, (xzd1) arrayList2.get(0), (byte) 1);
        while (kng0Var.hasNext()) {
            cdo0 cdo0Var = (cdo0) kng0Var.next();
            ngc1Var.b(cdo0Var);
            g4rVar.h(cdo0Var.c());
        }
        g4rVar.i(u9tVar2.a(arrayList2.size()));
        List list = g4rVar.a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        ngc1Var.e(list);
        ngc1Var.g();
        cdo0 cdo0Var2 = xzd1Var.e;
        ngc1Var.e = cdo0Var2;
        if (cdo0Var2 != null) {
            cdo0Var2.d = ngc1Var;
        }
        ngc1Var.d = xzd1Var;
        xzd1Var.e = ngc1Var;
        cdo0 cdo0Var3 = xzd1Var.a;
        ngc1Var.a = cdo0Var3;
        if (ngc1Var.e == null) {
            cdo0Var3.c = ngc1Var;
        }
        return arrayList.size();
    }

    @Override // p.v9t
    public final char b() {
        return '~';
    }

    @Override // p.v9t
    public final int c() {
        return 1;
    }

    @Override // p.v9t
    public final char d() {
        return '~';
    }
}
