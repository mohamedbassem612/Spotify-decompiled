package p;

import android.util.Base64;
import androidx.lifecycle.LifecycleDestroyedException;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.mobius.Loop;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p5o extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5o(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new p5o(this.c, this.d, obj2, lnmVar, (byte) 0);
            case 1:
                return new p5o(this.c, this.d, obj2, lnmVar, (byte) 1);
            case 2:
                p5o p5oVar = new p5o((byte) 2, obj2, (String) this.d, lnmVar);
                p5oVar.c = obj;
                return p5oVar;
            case 3:
                return new p5o(this.c, obj2, (String) this.d, lnmVar, (byte) 3);
            case 4:
                return new p5o(this.c, obj2, (String) this.d, lnmVar, (byte) 4);
            case 5:
                p5o p5oVar2 = new p5o((q7o1) this.d, (cmn1) obj2, lnmVar, (byte) 5);
                p5oVar2.c = obj;
                return p5oVar2;
            case 6:
                p5o p5oVar3 = new p5o((q7o1) this.d, (cmn1) obj2, lnmVar, (byte) 6);
                p5oVar3.c = obj;
                return p5oVar3;
            case 7:
                p5o p5oVar4 = new p5o((byte) 7, obj2, (String) this.d, lnmVar);
                p5oVar4.c = obj;
                return p5oVar4;
            default:
                p5o p5oVar5 = new p5o((fqn1) obj2, lnmVar);
                p5oVar5.d = obj;
                return p5oVar5;
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((p5o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((p5o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((p5o) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((p5o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((p5o) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((p5o) create((rvo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((p5o) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((p5o) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((p5o) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:110:0x0223  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:126:0x02db  */
    /* JADX WARN: Code duplicated, block: B:147:0x0374  */
    /* JADX WARN: Code duplicated, block: B:231:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        Object objH;
        bj31 bj31Var;
        gfr gfrVar;
        Object objQ;
        String strA;
        Object objQ2;
        ain1 ain1VarB;
        kmn1 kmn1VarX;
        String strJ;
        hnn1 hnn1VarI;
        enn1 enn1VarI;
        rvo1 rvo1Var;
        Object objB;
        zwo1 zwo1Var;
        Object objC;
        Object objC2;
        zwo1 zwo1Var2;
        Object objH2;
        Object objH3;
        zwo1 zwo1Var3;
        Object objK;
        zwo1 zwo1Var4;
        zwo1 zwo1Var5;
        Object qwo1Var;
        byte b = this.a;
        tgo1 tgo1Var = tgo1.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                q5o q5oVar = (q5o) this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    objF = q5o.b(q5oVar).f((String) this.d, (String) obj2, this);
                    if (objF != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 == 1) {
                    hm5.M(obj);
                    objF = obj;
                } else {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
                dd41 dd41Var = (gd41) objF;
                if (dd41Var instanceof fd41) {
                    q5o.a(q5oVar).b();
                } else if (dd41Var instanceof dd41) {
                    q5o.d(q5oVar, dd41Var.a());
                } else {
                    if (!(dd41Var instanceof ed41)) {
                        eg.o();
                        return null;
                    }
                    q5o.a(q5oVar).a();
                }
                dt71 dt71VarC = q5o.c(q5oVar);
                Boolean boolM = yah0.m(true);
                this.b = (byte) 2;
                if (dt71VarC.emit(boolM, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                nsw0 nsw0Var = (nsw0) obj2;
                mr20 mr20Var = (mr20) this.d;
                o8n o8nVar = (o8n) this.c;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(o8nVar, o6x.a)) {
                    cff cffVar = new cff(nsw0Var, (byte) 7);
                    this.b = (byte) 1;
                    if (mr20Var.collect(cffVar, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    ns20 ns20Var = new ns20(mr20Var, nsw0Var, (lnm) null, (byte) 0);
                    this.b = (byte) 2;
                    if (c921.H(o8nVar, ns20Var, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 2:
                vr20 vr20Var = (vr20) this.c;
                byte b4 = this.b;
                try {
                    if (b4 == 0) {
                        hm5.M(obj);
                        this.c = vr20Var;
                        this.b = (byte) 1;
                        if (vr20Var.emit(aj31.a, this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b4 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b4 != 2) {
                            if (b4 == 3) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            if (b4 == 4) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objH = obj;
                    }
                    bj31Var = new bj31((byte[]) objH);
                    this.c = vr20Var;
                    this.b = (byte) 3;
                    if (vr20Var.emit(bj31Var, this) != d9nVar) {
                        return rih1Var;
                    }
                    return d9nVar;
                    dp5 dp5VarA = tym0.a((tym0) obj2);
                    String str = (String) this.d;
                    this.c = vr20Var;
                    this.b = (byte) 2;
                    objH = dp5VarA.h(str);
                    if (objH != d9nVar) {
                        bj31Var = new bj31((byte[]) objH);
                        this.c = vr20Var;
                        this.b = (byte) 3;
                        if (vr20Var.emit(bj31Var, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zi31 zi31Var = new zi31(e2);
                    this.c = null;
                    this.b = (byte) 4;
                    if (vr20Var.emit(zi31Var, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 3:
                db51 db51Var = (db51) this.c;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    t551 t551Var = (t551) obj2;
                    String str2 = (String) this.d;
                    tac0 lifecycle = db51Var.getLifecycle();
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    boolean zJ = bs50Var.J(getContext());
                    if (zJ) {
                        gfrVar = new gfr(db51Var, t551Var, str2, (byte) 16);
                        this.b = (byte) 1;
                        if (fn31.W(lifecycle, zJ, bs50Var, gfrVar, this) != d9nVar) {
                        }
                    } else {
                        if (lifecycle.i == w8c0.a) {
                            throw new LifecycleDestroyedException();
                        }
                        if (lifecycle.i.compareTo(w8c0.c) >= 0) {
                            db51.j(db51Var, t551Var.a(str2));
                        } else {
                            gfrVar = new gfr(db51Var, t551Var, str2, (byte) 16);
                            this.b = (byte) 1;
                            if (fn31.W(lifecycle, zJ, bs50Var, gfrVar, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Loop loopI = db51.i(db51Var);
                if (loopI == null) {
                    u890.C("mobiusLoop");
                    throw null;
                }
                mr20 mr20VarI = mym.i(loopI, db51Var.getLifecycle(), 6);
                ab51 ab51Var = new ab51(db51Var, (byte) 0);
                this.b = (byte) 2;
                if (mr20VarI.collect(ab51Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 4:
                String str3 = (String) this.d;
                g3o1 g3o1Var = (g3o1) this.c;
                byte b6 = this.b;
                try {
                    try {
                        if (b6 != 0) {
                            if (b6 != 1) {
                                hm5.M(obj);
                                objQ2 = obj;
                            } else {
                                hm5.M(obj);
                                objQ = obj;
                            }
                            dm00 dm00Var = (dm00) objQ2;
                            kmn1VarX = pmn1.x();
                            kmn1VarX.h(str3);
                            strJ = dm00Var.j();
                            if (strJ != null) {
                                eg.m("Required value was null.");
                                return null;
                            }
                            inn1 inn1VarZ = inn1.z(Base64.decode(strJ, 0));
                            hnn1VarI = inn1VarZ.i();
                            hnn1VarI.k();
                            for (gnn1 gnn1Var : inn1VarZ.x()) {
                                enn1VarI = gnn1Var.i();
                                if (gnn1Var.x()) {
                                    try {
                                        byte[] bArrDecode = Base64.decode(gnn1Var.y(), 0);
                                        vhn1 vhn1Var = ain1.b;
                                        enn1VarI.l(ain1.x(0, bArrDecode, bArrDecode.length));
                                        break;
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    enn1VarI.h();
                                }
                                if (gnn1Var.z()) {
                                    try {
                                        byte[] bArrDecode2 = Base64.decode(gnn1Var.A(), 0);
                                        vhn1 vhn1Var2 = ain1.b;
                                        enn1VarI.n(ain1.x(0, bArrDecode2, bArrDecode2.length));
                                        break;
                                    } catch (IllegalArgumentException unused2) {
                                    }
                                    enn1VarI.i();
                                }
                                if (enn1VarI.j()) {
                                    try {
                                        rnn1 rnn1VarI = unn1.x(enn1VarI.k()).i();
                                        snn1 snn1VarX = tnn1.x();
                                        snn1VarX.h();
                                        rnn1VarI.h(snn1VarX);
                                        enn1VarI.l(rnn1VarI.e().c());
                                    } catch (Exception unused3) {
                                    }
                                }
                                hnn1VarI.i(enn1VarI.e());
                            }
                            tln1 tln1VarX = uln1.x();
                            tln1VarX.h(hnn1VarI.e());
                            kmn1VarX.j(tln1VarX.e());
                            return new e331(kmn1VarX.e());
                        }
                        hm5.M(obj);
                        l2t l2tVarG = g3o1.g(g3o1Var);
                        if (l2tVarG == null) {
                            l2tVarG = null;
                        }
                        this.b = (byte) 1;
                        objQ = ((ayh) l2tVarG).Q(this);
                        if (objQ == d9nVar) {
                            return d9nVar;
                        }
                        sln1 sln1Var = (sln1) obj2;
                        if (sln1Var == null || (ain1VarB = sln1Var.B()) == null) {
                            strA = null;
                        } else {
                            Charset charset = StandardCharsets.UTF_8;
                            strA = ain1VarB.A();
                        }
                        if (strA == null || strA.length() == 0) {
                            return new e331(new m231(new zzhm(tgo1Var, ij81.W1, (String) null, (Exception) null)));
                        }
                        bm00 bm00Var = new bm00((byte) 0);
                        bm00Var.p(strA);
                        bm00Var.o(str3);
                        ayh ayhVarK = nko1.K(yto1.s(g3o1.f(g3o1Var)).f(bm00Var.h()));
                        this.b = (byte) 2;
                        objQ2 = ayhVarK.Q(this);
                        if (objQ2 == d9nVar) {
                            return d9nVar;
                        }
                        dm00 dm00Var2 = (dm00) objQ2;
                        kmn1VarX = pmn1.x();
                        kmn1VarX.h(str3);
                        strJ = dm00Var2.j();
                        if (strJ != null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        inn1 inn1VarZ2 = inn1.z(Base64.decode(strJ, 0));
                        hnn1VarI = inn1VarZ2.i();
                        hnn1VarI.k();
                        while (r0.hasNext()) {
                            enn1VarI = gnn1Var.i();
                            if (gnn1Var.x()) {
                                byte[] bArrDecode3 = Base64.decode(gnn1Var.y(), 0);
                                vhn1 vhn1Var3 = ain1.b;
                                enn1VarI.l(ain1.x(0, bArrDecode3, bArrDecode3.length));
                                enn1VarI.h();
                            }
                            if (gnn1Var.z()) {
                                byte[] bArrDecode4 = Base64.decode(gnn1Var.A(), 0);
                                vhn1 vhn1Var4 = ain1.b;
                                enn1VarI.n(ain1.x(0, bArrDecode4, bArrDecode4.length));
                                enn1VarI.i();
                            }
                            if (enn1VarI.j()) {
                                rnn1 rnn1VarI2 = unn1.x(enn1VarI.k()).i();
                                snn1 snn1VarX2 = tnn1.x();
                                snn1VarX2.h();
                                rnn1VarI2.h(snn1VarX2);
                                enn1VarI.l(rnn1VarI2.e().c());
                            }
                            hnn1VarI.i(enn1VarI.e());
                        }
                        tln1 tln1VarX2 = uln1.x();
                        tln1VarX2.h(hnn1VarI.e());
                        kmn1VarX.j(tln1VarX2.e());
                        return new e331(kmn1VarX.e());
                    } catch (Exception unused4) {
                        return new e331(new m231(new zzhm(tgo1Var, ij81.h1, (String) null, (Exception) null)));
                    }
                } catch (Exception unused5) {
                    return new e331(new m231(new zzhm(tgo1Var, ij81.i1, (String) null, (Exception) null)));
                }
            case 5:
                byte b7 = this.b;
                if (b7 == 0) {
                    hm5.M(obj);
                    rvo1Var = (rvo1) this.c;
                    this.c = rvo1Var;
                    this.b = (byte) 1;
                    objB = ((q7o1) this.d).b((cmn1) obj2);
                    if (objB != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b7 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                rvo1Var = (rvo1) this.c;
                hm5.M(obj);
                objB = obj;
                this.c = null;
                this.b = (byte) 2;
                if (((qwo1) objB).a(rvo1Var.a(), this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 6:
                byte b8 = this.b;
                if (b8 == 0) {
                    hm5.M(obj);
                    zwo1Var = (zwo1) this.c;
                    p8o1 p8o1Var = (p8o1) this.d;
                    aje0 aje0Var = p8o1Var.c;
                    oao1 oao1Var = p8o1Var.a;
                    if (aje0Var.j()) {
                        cmn1 cmn1Var = (cmn1) obj2;
                        if (cmn1Var.z() != 0) {
                            oao1Var.b(cmn1Var.z());
                            this.c = zwo1Var;
                            this.b = (byte) 1;
                            objC = oao1Var.c();
                            if (objC != d9nVar) {
                            }
                            return d9nVar;
                        }
                    }
                    p8o1Var.b = false;
                    throw new zzhm(tgo1Var, ij81.X0, (String) null, (Exception) null);
                }
                if (b8 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                zwo1Var = (zwo1) this.c;
                hm5.M(obj);
                objC = obj;
                this.c = null;
                this.b = (byte) 2;
                if (((qwo1) objC).a(zwo1Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 7:
                String str4 = (String) this.d;
                oao1 oao1Var2 = (oao1) obj2;
                Object obj3 = this.b;
                try {
                    if (obj3 == 0) {
                        hm5.M(obj);
                        zwo1 zwo1Var6 = (zwo1) this.c;
                        this.c = zwo1Var6;
                        this.b = (byte) 1;
                        objH3 = oao1.h(oao1Var2, str4, this);
                        obj3 = zwo1Var6;
                        if (objH3 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (obj3 != 1) {
                            if (obj3 != 2) {
                                hm5.M(obj);
                                if (obj3 != 3) {
                                    objH2 = obj;
                                } else {
                                    this.b = (byte) 4;
                                    objH2 = oao1.h(oao1Var2, str4, this);
                                    if (objH2 == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            } else {
                                zwo1 zwo1Var7 = (zwo1) this.c;
                                hm5.M(obj);
                                objC2 = obj;
                                zwo1Var2 = zwo1Var7;
                                this.c = null;
                                this.b = (byte) 3;
                                if (((qwo1) objC2).a(zwo1Var2, this) == d9nVar) {
                                    return d9nVar;
                                }
                                this.b = (byte) 4;
                                objH2 = oao1.h(oao1Var2, str4, this);
                                if (objH2 == d9nVar) {
                                    return d9nVar;
                                }
                            }
                            return (String) objH2;
                        }
                        zwo1 zwo1Var8 = (zwo1) this.c;
                        hm5.M(obj);
                        objH3 = obj;
                        obj3 = zwo1Var8;
                    }
                    return (String) objH3;
                } catch (Exception unused6) {
                    this.c = obj3;
                    this.b = (byte) 2;
                    objC2 = oao1Var2.c();
                    zwo1Var2 = obj3;
                    if (objC2 == d9nVar) {
                        return d9nVar;
                    }
                }
            default:
                fqn1 fqn1Var = (fqn1) obj2;
                byte b9 = this.b;
                if (b9 == 0) {
                    hm5.M(obj);
                    zwo1Var3 = (zwo1) this.d;
                    yyo1 yyo1VarD = fqn1Var.d();
                    String strA2 = zwo1Var3.a().a();
                    this.d = zwo1Var3;
                    this.c = zwo1Var3;
                    this.b = (byte) 1;
                    objK = yyo1VarD.k(strA2);
                    if (objK != d9nVar) {
                        zwo1Var4 = zwo1Var3;
                    }
                    return d9nVar;
                }
                if (b9 == 1) {
                    zwo1Var3 = (zwo1) this.c;
                    zwo1 zwo1Var9 = (zwo1) this.d;
                    hm5.M(obj);
                    zwo1Var4 = zwo1Var9;
                    objK = obj;
                } else {
                    if (b9 == 2) {
                        zwo1Var5 = (zwo1) this.d;
                        hm5.M(obj);
                        bzo1 bzo1VarJ = fqn1Var.j();
                        String strA3 = zwo1Var5.a().a();
                        this.d = zwo1Var5;
                        this.b = (byte) 3;
                        qwo1Var = new qwo1(new xyo1(bzo1VarJ, strA3, (lnm) null, (byte) 1));
                        if (qwo1Var != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b9 != 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    zwo1Var5 = (zwo1) this.d;
                    hm5.M(obj);
                    qwo1Var = obj;
                }
                this.d = null;
                this.b = (byte) 4;
                if (((qwo1) qwo1Var).a(zwo1Var5, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
                this.d = zwo1Var4;
                this.c = null;
                this.b = (byte) 2;
                if (((qwo1) objK).a(zwo1Var3, this) != d9nVar) {
                    zwo1Var5 = zwo1Var4;
                    bzo1 bzo1VarJ2 = fqn1Var.j();
                    String strA4 = zwo1Var5.a().a();
                    this.d = zwo1Var5;
                    this.b = (byte) 3;
                    qwo1Var = new qwo1(new xyo1(bzo1VarJ2, strA4, (lnm) null, (byte) 1));
                    if (qwo1Var != d9nVar) {
                        this.d = null;
                        this.b = (byte) 4;
                        if (((qwo1) qwo1Var).a(zwo1Var5, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5o(byte b, Object obj, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5o(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5o(fqn1 fqn1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.e = fqn1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5o(q7o1 q7o1Var, cmn1 cmn1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = q7o1Var;
        this.e = cmn1Var;
    }
}
