package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y3t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3t0(int i, String str, String str2, dzo1 dzo1Var, Function0 function0, idn0 idn0Var, int i2, jxc1 jxc1Var) {
        super(2);
        this.b = i;
        this.d = str;
        this.e = str2;
        this.f = dzo1Var;
        this.g = function0;
        this.h = idn0Var;
        this.c = i2;
        this.i = jxc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ywo1.d((cce) obj8, (o0i) obj7, (q9l1) obj6, this.b, (z0i) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | this.c));
                return rih1.a;
            default:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                String str = (String) obj8;
                float f = (this.b * 61.5f) / 100.0f;
                List listP = tlc1Var.P("card", new j2i(828108209, new vvb1((String) obj7, tlc1Var, f * 0.58f, f, (dzo1) obj6, (Function0) obj5, (idn0) obj4, str, this.c, (jxc1) obj3), true));
                ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                int i = ((q5t0) arrayList.get(0)).a;
                int i2 = ((q5t0) arrayList.get(0)).b;
                return tlc1Var.S(i, str != null ? tlc1Var.i0(16.0f) + ((q5t0) arrayList.get(1)).b + i2 : i2, b7x.a, new z731(arrayList, str, i2, (byte) 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3t0(cce cceVar, o0i o0iVar, q9l1 q9l1Var, int i, z0i z0iVar, Integer num, qim0 qim0Var, int i2) {
        super(2);
        this.d = cceVar;
        this.e = o0iVar;
        this.f = q9l1Var;
        this.b = i;
        this.g = z0iVar;
        this.h = num;
        this.i = qim0Var;
        this.c = i2;
    }
}
