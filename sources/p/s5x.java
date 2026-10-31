package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s5x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5x(int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                s5x s5xVar = new s5x(this.c, lnmVar, (byte) 0);
                s5xVar.b = obj;
                return s5xVar;
            case 1:
                s5x s5xVar2 = new s5x(this.c, lnmVar, (byte) 1);
                s5xVar2.b = obj;
                return s5xVar2;
            default:
                s5x s5xVar3 = new s5x(this.c, lnmVar, (byte) 2);
                s5xVar3.b = obj;
                return s5xVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((jt61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((m7e0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((m7e0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = false;
        int i = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Integer num = (Integer) ((jt61) obj2).a();
                if (num != null && num.intValue() == i) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                m7e0 m7e0Var = (m7e0) obj2;
                hm5.M(obj);
                if (m7e0Var.a == 0) {
                    return Boolean.TRUE;
                }
                List listD1 = o7h.d1(m7e0Var.b, i);
                if (!listD1.isEmpty()) {
                    List list = listD1;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = true;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!(((l7e0) it.next()) instanceof j7e0)) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                m7e0 m7e0Var2 = (m7e0) obj2;
                hm5.M(obj);
                int i2 = m7e0Var2.a;
                if (i2 == 0) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(o7h.d1(m7e0Var2.b, i).size() == Math.min(i, i2));
        }
    }
}
