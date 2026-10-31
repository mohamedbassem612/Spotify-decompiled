package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yuy extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuy(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                yuy yuyVar = new yuy((c380) obj4, (lnm) obj3, (byte) 0);
                yuyVar.c = (Map) obj;
                yuyVar.b = jLongValue;
                return yuyVar.invokeSuspend(rih1Var);
            default:
                long jLongValue2 = ((Number) obj).longValue();
                yuy yuyVar2 = new yuy((String) obj4, (lnm) obj3, (byte) 1);
                yuyVar2.b = jLongValue2;
                yuyVar2.c = (String) obj2;
                return yuyVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Map map = (Map) this.c;
                long j = this.b;
                hm5.M(obj);
                Iterator it = ((c380) obj2).iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        n5f0 n5f0Var = (n5f0) map.get((String) it.next());
                        if (n5f0Var == null || !n5f0Var.c(j)) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                Integer num = new Integer(i);
                if (num.intValue() != -1) {
                    return num;
                }
                return null;
            default:
                long j2 = this.b;
                String str = (String) this.c;
                hm5.M(obj);
                if (u890.j(str, (String) obj2)) {
                    return new Long(j2);
                }
                return null;
        }
    }
}
