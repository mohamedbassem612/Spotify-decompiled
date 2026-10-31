package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sh7 implements v9t {
    public final char a;

    public sh7(char c) {
        this.a = c;
    }

    @Override // p.v9t
    public final int a(u9t u9tVar, u9t u9tVar2) {
        cdo0 q5xVar;
        ArrayList arrayList = u9tVar.a;
        ArrayList arrayList2 = u9tVar2.a;
        if (u9tVar.e || u9tVar2.d) {
            int i = u9tVar2.c;
            if (i % 3 != 0 && (u9tVar.c + i) % 3 == 0) {
                return 0;
            }
        }
        int size = arrayList.size();
        char c = this.a;
        int i2 = 2;
        if (size < 2 || arrayList2.size() < 2) {
            String.valueOf(c);
            q5xVar = new q5x();
            i2 = 1;
        } else {
            String.valueOf(c);
            q5xVar = new rhc1();
        }
        g4r g4rVar = new g4r();
        g4rVar.i(u9tVar.b(i2));
        xzd1 xzd1Var = (xzd1) arrayList.get(arrayList.size() - 1);
        kng0 kng0Var = new kng0(xzd1Var.e, (xzd1) arrayList2.get(0), (byte) 1);
        while (kng0Var.hasNext()) {
            cdo0 cdo0Var = (cdo0) kng0Var.next();
            q5xVar.b(cdo0Var);
            g4rVar.h(cdo0Var.c());
        }
        g4rVar.i(u9tVar2.a(i2));
        List list = g4rVar.a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        q5xVar.e(list);
        q5xVar.g();
        cdo0 cdo0Var2 = xzd1Var.e;
        q5xVar.e = cdo0Var2;
        if (cdo0Var2 != null) {
            cdo0Var2.d = q5xVar;
        }
        q5xVar.d = xzd1Var;
        xzd1Var.e = q5xVar;
        cdo0 cdo0Var3 = xzd1Var.a;
        q5xVar.a = cdo0Var3;
        if (q5xVar.e == null) {
            cdo0Var3.c = q5xVar;
        }
        return i2;
    }

    @Override // p.v9t
    public final char b() {
        return this.a;
    }

    @Override // p.v9t
    public final int c() {
        return 1;
    }

    @Override // p.v9t
    public final char d() {
        return this.a;
    }
}
