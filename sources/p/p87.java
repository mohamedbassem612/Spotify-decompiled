package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p87 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(q87 q87Var, long j, long j2, iu30 iu30Var) {
        super(2);
        this.a = (byte) 0;
        this.d = q87Var;
        this.b = j;
        this.c = j2;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    ceo ceoVar = q87.f;
                    tr80 tr80Var = new tr80(0, 20, 1);
                    ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                    lr80 it = tr80Var.iterator();
                    while (((sr80) it).c) {
                        arrayList.add(Float.valueOf(ceoVar.a(it.nextInt() / 20.0f)));
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new u7h(z4p1.A(((Number) it2.next()).floatValue(), this.b, this.c)));
                    }
                    q87 q87Var = (q87) obj4;
                    q87Var.b(mqo1.F(arrayList2), qim0VarF, apo.r(1350193290, new wf((byte) 24, (Object) q87Var, (iu30) obj3), x340Var2), x340Var2, 384);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                voo1.g((ka60) obj4, this.b, this.c, (xd60) obj3, (b0k) obj, czo1.p(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ft51.c((c380) obj4, this.b, (qim0) obj3, this.c, (b0k) obj, czo1.p(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ft51.k(this.b, this.c, (ps51) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                zr7.e(this.b, this.c, (hw61) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p87(long j, long j2, Object obj, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = j2;
        this.d = obj;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(ka60 ka60Var, long j, long j2, xd60 xd60Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.d = ka60Var;
        this.b = j;
        this.c = j2;
        this.e = xd60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(c380 c380Var, long j, qim0 qim0Var, long j2, int i) {
        super(2);
        this.a = (byte) 2;
        this.d = c380Var;
        this.b = j;
        this.e = qim0Var;
        this.c = j2;
    }
}
