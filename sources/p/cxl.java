package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cxl extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxl(nm1 nm1Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 1;
        this.e = nm1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        int i = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                cxl cxlVar = new cxl(i, (lnm) obj5, (byte) 0);
                cxlVar.b = zBooleanValue;
                cxlVar.c = zBooleanValue2;
                cxlVar.d = (nno) obj3;
                cxlVar.e = (dlb) obj4;
                return cxlVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                cxl cxlVar2 = new cxl((nm1) this.e, (lnm) obj5);
                cxlVar2.c = zBooleanValue3;
                cxlVar2.d = (tqw) obj4;
                return cxlVar2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                cxl cxlVar3 = new cxl(i, (lnm) obj5, (byte) 2);
                cxlVar3.b = zBooleanValue4;
                cxlVar3.d = (String) obj2;
                cxlVar3.e = (String) obj3;
                cxlVar3.c = zBooleanValue5;
                return cxlVar3.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                cxl cxlVar4 = new cxl(i, (lnm) obj5, (byte) 3);
                cxlVar4.b = zBooleanValue6;
                cxlVar4.c = zBooleanValue7;
                cxlVar4.d = (String) obj3;
                cxlVar4.e = (i8k0) obj4;
                return cxlVar4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                boolean z2 = this.c;
                kno knoVar = (nno) this.d;
                dlb dlbVar = (dlb) this.e;
                hm5.M(obj);
                ino gnoVar = hno.a;
                if (z) {
                    return new vwl(true, gnoVar, null);
                }
                if (!z2) {
                    return new vwl(false, gnoVar, dlbVar);
                }
                if (knoVar instanceof mno) {
                    gnoVar = ino.a;
                } else if (knoVar instanceof kno) {
                    gnoVar = new gno(knoVar.a);
                } else if (!u890.j(knoVar, lno.a)) {
                    eg.o();
                    return null;
                }
                return new vwl(false, gnoVar, dlbVar);
            case 1:
                boolean z3 = this.c;
                tqw tqwVar = (tqw) this.d;
                boolean z4 = this.b;
                d9n d9nVar = rih1.a;
                if (!z4) {
                    hm5.M(obj);
                    e9c0 e9c0Var = (e9c0) ((nm1) this.e).g;
                    Object w7d0Var = z3 ? x7d0.a : new w7d0(cvl1.d(tqwVar).a.a);
                    this.d = null;
                    this.c = z3;
                    this.b = true;
                    e9c0Var.invoke(w7d0Var, this);
                    d9n d9nVar2 = d9n.a;
                    if (d9nVar == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 2:
                boolean z5 = this.b;
                String str = (String) this.d;
                String str2 = (String) this.e;
                boolean z6 = this.c;
                hm5.M(obj);
                return new emj0(str, z5, str2, z6);
            default:
                boolean z7 = this.b;
                boolean z8 = this.c;
                String str3 = (String) this.d;
                i8k0 i8k0Var = (i8k0) this.e;
                hm5.M(obj);
                return new h8k0(z7, z8, str3, i8k0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxl(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
