package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vmj1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmj1(byte b, Object obj, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.e = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        Object obj4 = this.f;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                vmj1 vmj1Var = new vmj1((byte) 0, (bnj1) obj4, str, lnmVar);
                vmj1Var.c = vr20Var;
                vmj1Var.d = obj2;
                return vmj1Var.invokeSuspend(rih1Var);
            default:
                vmj1 vmj1Var2 = new vmj1((byte) 1, (haa0) obj4, str, lnmVar);
                vmj1Var2.c = vr20Var;
                vmj1Var2.d = obj2;
                return vmj1Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj3 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 data = ((r4r) cnj1.b.a(((bnj1) obj2).a, cnj1.a[0])).getData();
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                Object objCollect = data.collect(new ubr(vr20Var, (String) obj3, this.e, (byte) 2), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                haa0 haa0Var = (haa0) obj2;
                vr20 vr20Var2 = this.c;
                Object obj4 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mmr0 mmr0Var = (mmr0) obj4;
                    xom1 xom1Var = (bpm1) mmr0Var.a;
                    i1r i1rVar = (k1r) mmr0Var.b;
                    boolean z3 = xom1Var instanceof yom1;
                    huz sr0Var = r6x.a;
                    String str2 = this.e;
                    if (z3) {
                        if (i1rVar instanceof i1r) {
                            i1e i1eVar = (i1e) i1rVar.a;
                            String str3 = i1eVar.b;
                            str = str3 != null ? str3 : "";
                            String str4 = i1eVar.a;
                            if (str4 != null) {
                                str2 = str4;
                            }
                            sr0Var = new huz(new hnm1(str, str2, i1eVar.c), (byte) 10);
                        }
                    } else if (xom1Var instanceof apm1) {
                        if (i1rVar instanceof i1r) {
                            i1e i1eVar2 = (i1e) i1rVar.a;
                            String str5 = i1eVar2.b;
                            str = str5 != null ? str5 : "";
                            String str6 = i1eVar2.a;
                            if (str6 != null) {
                                str2 = str6;
                            }
                            sr0Var = new huz(new knm1(str, str2, i1eVar2.c), (byte) 10);
                        }
                    } else if (xom1Var instanceof zom1) {
                        if (i1rVar instanceof i1r) {
                            i1e i1eVar3 = (i1e) i1rVar.a;
                            String str7 = i1eVar3.b;
                            str = str7 != null ? str7 : "";
                            String str8 = i1eVar3.a;
                            if (str8 != null) {
                                str2 = str8;
                            }
                            sr0Var = new huz(new lnm1(str, str2, i1eVar3.c), (byte) 10);
                        }
                    } else if (xom1Var instanceof xom1) {
                        xom1 xom1Var2 = xom1Var;
                        if (i1rVar instanceof i1r) {
                            sr0Var = new sr0(d3p1.F((d0r) haa0Var.c, kzd.b, xom1Var2.a), (i1e) i1rVar.a, str2, xom1Var2, (byte) 11);
                        }
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var2, sr0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
