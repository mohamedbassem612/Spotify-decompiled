package p;

import android.os.Parcelable;
import android.os.ResultReceiver;
import com.spotify.mobius.functions.Consumer;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tah1 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Parcelable P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tah1(String str, rxe1 rxe1Var, List list, List list2, Set set, Set set2, boolean z, Set set3, tsq tsqVar, tsq tsqVar2, Function0 function0, iu30 iu30Var, iu30 iu30Var2, ResultReceiver resultReceiver, avk avkVar, qim0 qim0Var, int i) {
        super(2);
        this.d = str;
        this.e = rxe1Var;
        this.f = list;
        this.g = list2;
        this.h = set;
        this.i = set2;
        this.b = z;
        this.t = set3;
        this.X = tsqVar;
        this.Y = tsqVar2;
        this.Z = function0;
        this.N0 = iu30Var;
        this.O0 = iu30Var2;
        this.P0 = resultReceiver;
        this.Q0 = avkVar;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Q0;
        qau qauVar = this.P0;
        Object obj4 = this.O0;
        Object obj5 = this.N0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        Object obj8 = this.X;
        Object obj9 = this.t;
        Object obj10 = this.i;
        Object obj11 = this.h;
        Object obj12 = this.g;
        Object obj13 = this.f;
        Object obj14 = this.e;
        Object obj15 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.c;
                int iP = czo1.p(1);
                boolean z = this.b;
                uah1.g((String) obj15, (rxe1) obj14, (List) obj13, (List) obj12, (Set) obj11, (Set) obj10, z, (Set) obj9, (tsq) obj8, (tsq) obj7, (Function0) obj6, (iu30) obj5, (iu30) obj4, (ResultReceiver) qauVar, (avk) obj3, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.c;
                int iP2 = czo1.p(1);
                sok.n((cce) obj15, (dbp) obj14, (hcl1) obj13, (m0t) obj12, (q9l1) obj11, (q9l1) obj10, (fbp) obj9, (bcl1) obj8, (fq10) obj7, (n8l1) obj6, (abu) obj5, (hcl1) obj4, qauVar, (Consumer) obj3, this.b, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tah1(cce cceVar, dbp dbpVar, hcl1 hcl1Var, m0t m0tVar, q9l1 q9l1Var, q9l1 q9l1Var2, fbp fbpVar, bcl1 bcl1Var, fq10 fq10Var, n8l1 n8l1Var, abu abuVar, hcl1 hcl1Var2, qau qauVar, Consumer consumer, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.d = cceVar;
        this.e = dbpVar;
        this.f = hcl1Var;
        this.g = m0tVar;
        this.h = q9l1Var;
        this.i = q9l1Var2;
        this.t = fbpVar;
        this.X = bcl1Var;
        this.Y = fq10Var;
        this.Z = n8l1Var;
        this.N0 = abuVar;
        this.O0 = hcl1Var2;
        this.P0 = qauVar;
        this.Q0 = consumer;
        this.b = z;
        this.c = qim0Var;
    }
}
