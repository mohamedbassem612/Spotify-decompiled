package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kv2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv2(lg01 lg01Var, mv2 mv2Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = mv2Var;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new kv2((lg01) null, (mv2) obj2, this.c, lnmVar);
            case 1:
                return new kv2(obj2, this.c, lnmVar, (byte) 1);
            case 2:
                return new kv2(this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new kv2(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                return new kv2(obj2, this.c, lnmVar, (byte) 4);
            case 5:
                return new kv2(obj2, this.c, lnmVar, (byte) 5);
            case 6:
                return new kv2(this.c, obj2, lnmVar, (byte) 6);
            case 7:
                return new kv2(this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new kv2(obj2, this.c, lnmVar, (byte) 8);
            case 9:
                return new kv2(obj2, this.c, lnmVar, (byte) 9);
            case 10:
                return new kv2(obj2, this.c, lnmVar, (byte) 10);
            case 11:
                return new kv2(this.c, obj2, lnmVar, (byte) 11);
            case 12:
                return new kv2(obj2, this.c, lnmVar, (byte) 12);
            case 13:
                return new kv2(obj2, this.c, lnmVar, (byte) 13);
            case 14:
                return new kv2(obj2, this.c, lnmVar, (byte) 14);
            default:
                return new kv2(this.c, obj2, lnmVar, (byte) 15);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 11:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        long j = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    throw null;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    g6o0 g6o0Var = ((k75) obj2).a;
                    this.b = true;
                    return g6o0Var.c(j, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((lw5) obj2).c.m0(rih1Var);
                Logger.b("[AppReadiness] Notifying app startup settled observers", new Object[0]);
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((bfd) obj2).O0.m0(rih1Var);
                return rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                np00 np00Var = ((dom) obj2).v1.c;
                this.b = true;
                Object objE = o2p1.e(np00Var, j, this);
                return objE == d9nVar ? d9nVar : objE;
            case 5:
                wtr wtrVar = (wtr) obj2;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zob1 zob1Var = (zob1) ((idd1) wtrVar.b.i).getValue();
                ytw0 ytw0Var = jfv.b;
                bge bgeVarR = fbp1.r(zob1Var, fdg1.l0(j, ngv.d));
                skr skrVar = new skr(wtrVar, (byte) 6);
                this.b = true;
                Object objCollect = bgeVarR.collect(new t0l(skrVar, wtrVar, (byte) 28), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj2).setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((wvw) obj2).T();
                return rih1Var;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    pfx0 pfx0Var = new pfx0(j);
                    this.b = true;
                    return ((sfx0) obj2).a(pfx0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    o95 o95Var = ((mw80) obj2).Y0;
                    if (o95Var == null) {
                        return rih1Var;
                    }
                    u7h u7hVar = new u7h(j);
                    n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                    this.b = true;
                    objB = o95.b(o95Var, u7hVar, n8b1VarL0, (Float) null, (iu30) null, this, 12);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                return rih1Var;
            case 10:
                b6p0 b6p0Var = (b6p0) obj2;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        objA = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                objA = b6p0Var.a(j, this);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                i5p0 i5p0Var = (l5p0) objA;
                if (i5p0Var instanceof i5p0) {
                    hfu0 hfu0Var = i5p0Var.a;
                    b6p0Var.i = hfu0Var;
                    b6p0Var.d.l(hfu0Var);
                    b6p0Var.j = true;
                } else {
                    if (!u890.j(i5p0Var, k5p0.a) && !u890.j(i5p0Var, j5p0.a)) {
                        eg.o();
                        return null;
                    }
                    b6p0Var.i = null;
                    b6p0Var.d.l((Object) null);
                    b6p0Var.j = true;
                }
                b6p0Var.f.m((Object) null, Boolean.TRUE);
                return rih1Var;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j + 3000, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((sbz0) obj2).b.a(ixb.c);
                return rih1Var;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var2 = (o95) obj2;
                Offset offset = new Offset(j);
                n8b1 n8b1Var = vy51.d;
                this.b = true;
                return o95.b(o95Var2, offset, n8b1Var, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 13:
                ev91 ev91Var = (ev91) obj2;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    o95 o95Var3 = ev91Var.U0;
                    Offset offset2 = new Offset(ev91Var.S0.a(Offset.g(((Offset) o95Var3.e()).a, j)));
                    this.b = true;
                    if (o95Var3.g(offset2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                dio1.z(ev91Var);
                return rih1Var;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var4 = ((j6e1) obj2).V0;
                Offset offset3 = new Offset(j);
                n8b1 n8b1Var2 = vy51.d;
                this.b = true;
                return o95.b(o95Var4, offset3, n8b1Var2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((hrr0) ((dlg1) obj2).a).setValue(Boolean.FALSE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv2(Object obj, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv2(long j, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
        this.d = obj;
    }
}
