package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f28 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(long j, long[] jArr, long[] jArr2, o8a o8aVar) {
        super(1);
        this.b = j;
        this.c = jArr;
        this.d = jArr2;
        this.e = o8aVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((xab1) obj4).d((CancellationException) null);
                ssw0 ssw0Var = (ssw0) obj3;
                if (((Number) ((h28) obj2).a.getValue()).longValue() >= j) {
                    th = null;
                }
                ssw0Var.H(th);
                break;
            case 1:
                List list = (List) obj4;
                ((rtb0) obj).e(list.size(), new ehf0(list, (byte) 1), new ehf0(list, (byte) 2), new j2i(2039820996, new xmf0(list, this.b, (dw91) obj3, (tob1) obj2), true));
                break;
            default:
                long jLongValue = (((Number) obj).longValue() - j) / 1000000;
                for (int i = 0; i < 24; i++) {
                    long j2 = ((long[]) obj4)[i];
                    float f = ((((long[]) obj3)[i] + jLongValue) % (2 * j2)) / j2;
                    if (f >= 1.0f) {
                        f = 2.0f - f;
                    }
                    ((o8a) obj2).a.set(i, Float.valueOf(klv.c.a(f)));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(List list, long j, dw91 dw91Var, tob1 tob1Var) {
        super(1);
        this.c = list;
        this.b = j;
        this.d = dw91Var;
        this.e = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(xab1 xab1Var, ssw0 ssw0Var, h28 h28Var, long j) {
        super(1);
        this.c = xab1Var;
        this.d = ssw0Var;
        this.e = h28Var;
        this.b = j;
    }
}
