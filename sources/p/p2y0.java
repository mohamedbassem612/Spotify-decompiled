package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p2y0 extends hab0 implements xu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p40 c;
    public final /* synthetic */ hz5 d;
    public final /* synthetic */ op41 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ ung g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2y0(List list, int i, p40 p40Var, hz5 hz5Var, op41 op41Var, iu30 iu30Var, ung ungVar, String str, int i2, Function0 function0) {
        super(3);
        this.a = list;
        this.b = i;
        this.c = p40Var;
        this.d = hz5Var;
        this.e = op41Var;
        this.f = iu30Var;
        this.g = ungVar;
        this.h = str;
        this.i = i2;
        this.t = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        int i = this.b;
        List list = this.a;
        x2y0 x2y0Var = (x2y0) o7h.t0(i, list);
        if (x2y0Var != null) {
            ArrayList arrayList2 = x2y0Var.a;
            arrayList = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((y2y0) it.next()).b);
            }
        } else {
            arrayList = z6x.a;
        }
        ArrayList arrayList3 = arrayList;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(list) | x340Var2.e(i);
        iu30 iu30Var = this.f;
        boolean zG2 = zG | x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zG2 || objT == m4cVar) {
            objT = new gu2(list, i, iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        boolean zG3 = x340Var2.g(list) | x340Var2.e(i) | x340Var2.i(this.g) | x340Var2.g(this.h) | x340Var2.e(this.i) | x340Var2.g(this.t);
        Object objT2 = x340Var2.T();
        if (zG3 || objT2 == m4cVar) {
            o2y0 o2y0Var = new o2y0(this.a, this.b, this.g, this.h, this.i, this.t);
            x340Var2.s0(o2y0Var);
            objT2 = o2y0Var;
        }
        ryn1.i(arrayList3, this.c, this.d, this.e, (qim0) null, iu30Var2, (iu30) objT2, x340Var2, 0, 16);
        return rih1.a;
    }
}
