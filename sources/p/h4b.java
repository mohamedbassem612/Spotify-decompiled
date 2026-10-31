package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h4b extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ cxc0 b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4b(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        cxc0 cxc0Var = (cxc0) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                h4b h4bVar = new h4b(i, (lnm) obj3, (byte) 0);
                h4bVar.b = cxc0Var;
                h4bVar.c = zBooleanValue;
                return h4bVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                h4b h4bVar2 = new h4b(i, (lnm) obj3, (byte) 1);
                h4bVar2.b = cxc0Var;
                h4bVar2.c = zBooleanValue2;
                return h4bVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = false;
        switch (this.a) {
            case 0:
                cxc0 cxc0Var = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                if (wm5.A(cxc0Var.f.q) && (str = (String) cxc0Var.f.q.get("description")) != null && (!ihc1.y0(str)) && z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                cxc0 cxc0Var2 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                kby kbyVar = cxc0Var2.f;
                boolean z4 = kbyVar.j;
                String str2 = kbyVar.A;
                boolean z5 = cxc0Var2.i;
                if (z3 && str2 != null && str2.length() != 0 && z4 && !z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
