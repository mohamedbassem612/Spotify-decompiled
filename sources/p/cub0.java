package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cub0 implements Function0 {
    public final /* synthetic */ byte a;
    public final dub0 b;

    public /* synthetic */ cub0(dub0 dub0Var, byte b) {
        this.a = b;
        this.b = dub0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        dub0 dub0Var = this.b;
        switch (b) {
            case 0:
                ajm0 ajm0Var = dub0Var.d;
                ajm0Var.w1();
                hzq0 hzq0Var = (j2k) ajm0Var.Y.getValue();
                kf30 kf30Var = dub0Var.e;
                ArrayList arrayList = new ArrayList();
                men1.p(hzq0Var, kf30Var, arrayList);
                return arrayList;
            case 1:
                ajm0 ajm0Var2 = dub0Var.d;
                ajm0Var2.w1();
                return Boolean.valueOf(men1.y((j2k) ajm0Var2.Y.getValue(), dub0Var.e));
            default:
                toe0 toe0Var = dub0Var.g;
                mma0[] mma0VarArr = dub0.i;
                mma0 mma0Var = mma0VarArr[1];
                boolean zBooleanValue = ((Boolean) toe0Var.invoke()).booleanValue();
                kf30 kf30Var2 = dub0Var.e;
                ajm0 ajm0Var3 = dub0Var.d;
                if (zBooleanValue) {
                    return ypi0.b;
                }
                toe0 toe0Var2 = dub0Var.f;
                mma0 mma0Var2 = mma0VarArr[0];
                List list = (List) toe0Var2.invoke();
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dzq0) it.next()).E());
                }
                return iko1.r("package view scope for " + kf30Var2 + " in " + ajm0Var3.getName(), o7h.O0(new umc1(ajm0Var3, kf30Var2), arrayList2));
        }
    }
}
