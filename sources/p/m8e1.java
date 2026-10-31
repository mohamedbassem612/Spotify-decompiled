package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m8e1 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ long b;

    public m8e1(vr20 vr20Var, long j) {
        this.a = vr20Var;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object emit(Object obj, lnm lnmVar) {
        l8e1 l8e1Var;
        if (lnmVar instanceof l8e1) {
            l8e1Var = (l8e1) lnmVar;
            int i = l8e1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8e1Var.b = i - Integer.MIN_VALUE;
            } else {
                l8e1Var = new l8e1(this, lnmVar);
            }
        } else {
            l8e1Var = new l8e1(this, lnmVar);
        }
        Object obj2 = l8e1Var.a;
        int i2 = l8e1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            s8l1 s8l1Var = (u8l1) obj;
            boolean z = s8l1Var instanceof s8l1;
            long jE = this.b;
            if (z) {
                Integer num = s8l1Var.a.b;
                if (num != null) {
                    jE = z4p1.e(num.intValue());
                }
            } else if (!(s8l1Var instanceof t8l1)) {
                eg.o();
                return null;
            }
            u7h u7hVar = new u7h(jE);
            l8e1Var.b = 1;
            Object objEmit = this.a.emit(u7hVar, l8e1Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
