package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vn30 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public final /* synthetic */ g2z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn30(g2z g2zVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = g2zVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g2z g2zVar = this.e;
        String str = (String) obj;
        String str2 = (String) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                vn30 vn30Var = new vn30(g2zVar, lnmVar, (byte) 0);
                vn30Var.c = str;
                vn30Var.d = str2;
                return vn30Var.invokeSuspend(rih1Var);
            case 1:
                vn30 vn30Var2 = new vn30(g2zVar, lnmVar, (byte) 1);
                vn30Var2.c = str;
                vn30Var2.d = str2;
                return vn30Var2.invokeSuspend(rih1Var);
            default:
                vn30 vn30Var3 = new vn30(g2zVar, lnmVar, (byte) 2);
                vn30Var3.c = str;
                vn30Var3.d = str2;
                return vn30Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g2z g2zVar = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                String str = this.c;
                String str2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j0a1 j0a1Var = (j0a1) g2zVar.d;
                this.c = null;
                this.d = null;
                this.b = true;
                j0a1Var.getClass();
                Object objH = j0a1Var.h(str, str2, zz91.a, new qz91(str2), this);
                return objH == d9nVar ? d9nVar : objH;
            case 1:
                String str3 = this.c;
                String str4 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j0a1 j0a1Var2 = (j0a1) g2zVar.d;
                this.c = null;
                this.d = null;
                this.b = true;
                Object objA = j0a1Var2.a(str3, str4, this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                String str5 = this.c;
                String str6 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j0a1 j0a1Var3 = (j0a1) g2zVar.d;
                this.c = null;
                this.d = null;
                this.b = true;
                j0a1Var3.getClass();
                Object objH2 = j0a1Var3.h(str5, str6, i0a1.a, new wz91(str6), this);
                return objH2 == d9nVar ? d9nVar : objH2;
        }
    }
}
