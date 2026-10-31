package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ob8 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob8(int i, String str, String str2, dzo1 dzo1Var, Function0 function0, idn0 idn0Var, yk31 yk31Var, boolean z, kj31 kj31Var, vnr0 vnr0Var) {
        super(2);
        this.a = (byte) 4;
        this.b = i;
        this.c = str;
        this.e = str2;
        this.f = dzo1Var;
        this.g = function0;
        this.h = idn0Var;
        this.i = yk31Var;
        this.d = z;
        this.t = kj31Var;
        this.X = vnr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                gxo1.d((qim0) obj3, this.d, (xu30) obj10, (xu30) obj9, (xu30) obj8, (xu30) obj7, (xu30) obj6, (xu30) obj5, (h72) obj4, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                irn1.g((r8v) obj10, this.b, (String) obj9, (iu30) obj8, (iu30) obj7, (Function0) obj6, (qim0) obj3, this.d, (Integer) obj5, (String) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                bqn1.k((qim0) obj3, this.d, (xu30) obj10, (xu30) obj9, (xu30) obj8, (xu30) obj7, (xu30) obj6, (xu30) obj5, (byp) obj4, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                zzo1.e((ccd0) obj10, (ud1) obj9, (ng20) obj8, (zo10) obj7, (zo10) obj6, (zo10) obj5, this.d, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 4:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                String str = (String) obj3;
                float f = (i * 61.5f) / 100.0f;
                List listP = tlc1Var.P("card", new j2i(-2073500737, new cl31((String) obj10, tlc1Var, f * 0.58f, f, (dzo1) obj9, (Function0) obj8, (idn0) obj7, str, (yk31) obj6, this.d, (kj31) obj5, (vnr0) obj4), true));
                ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                int i2 = ((q5t0) arrayList.get(0)).a;
                int i3 = ((q5t0) arrayList.get(0)).b;
                return tlc1Var.S(i2, str != null ? tlc1Var.i0(16.0f) + ((q5t0) arrayList.get(1)).b + i3 : i3, b7x.a, new z731(arrayList, str, i3, (byte) 1));
            case 5:
                ((Number) obj2).intValue();
                u2o1.c((c380) obj10, (b851) obj9, (wao0) obj8, (r951) obj7, (qim0) obj3, this.d, (xb51) obj6, (iu30) obj5, (iu30) obj4, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((tva1) obj3).h(this.d, (String) obj10, (trf1) obj9, (Function0) obj8, (Function0) obj7, (vu30) obj6, (Function0) obj5, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                wqn1.j((hzm1) obj10, (iu30) obj9, (cgq) obj8, (dgq) obj7, (u911) obj6, (iu30) obj5, (ptf1) obj4, this.d, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob8(Object obj, boolean z, Object obj2, Object obj3, cv30 cv30Var, cv30 cv30Var2, cv30 cv30Var3, cv30 cv30Var4, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = z;
        this.e = obj2;
        this.f = obj3;
        this.g = cv30Var;
        this.h = cv30Var2;
        this.i = cv30Var3;
        this.t = cv30Var4;
        this.X = obj4;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob8(r8v r8vVar, int i, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, boolean z, Integer num, String str2, int i2) {
        super(2);
        this.a = (byte) 1;
        this.e = r8vVar;
        this.b = i;
        this.f = str;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = function0;
        this.c = qim0Var;
        this.d = z;
        this.t = num;
        this.X = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob8(c380 c380Var, b851 b851Var, wao0 wao0Var, r951 r951Var, qim0 qim0Var, boolean z, xb51 xb51Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = c380Var;
        this.f = b851Var;
        this.g = wao0Var;
        this.h = r951Var;
        this.c = qim0Var;
        this.d = z;
        this.i = xb51Var;
        this.t = iu30Var;
        this.X = iu30Var2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob8(ccd0 ccd0Var, ud1 ud1Var, ng20 ng20Var, zo10 zo10Var, zo10 zo10Var2, zo10 zo10Var3, boolean z, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.e = ccd0Var;
        this.f = ud1Var;
        this.g = ng20Var;
        this.h = zo10Var;
        this.i = zo10Var2;
        this.t = zo10Var3;
        this.d = z;
        this.X = function0;
        this.c = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob8(hzm1 hzm1Var, iu30 iu30Var, cgq cgqVar, dgq dgqVar, u911 u911Var, iu30 iu30Var2, ptf1 ptf1Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.e = hzm1Var;
        this.f = iu30Var;
        this.g = cgqVar;
        this.h = dgqVar;
        this.i = u911Var;
        this.t = iu30Var2;
        this.X = ptf1Var;
        this.d = z;
        this.c = qim0Var;
        this.b = i;
    }
}
