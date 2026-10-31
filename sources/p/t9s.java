package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public int c;
    public final /* synthetic */ boolean d;
    public Object e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9s(int i, o95 o95Var, o95 o95Var2, boolean z, hdn0 hdn0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.e = o95Var;
        this.f = o95Var2;
        this.d = z;
        this.g = hdn0Var;
        this.h = ven0Var;
        this.i = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                t9s t9sVar = new t9s((y9s) obj2, this.d, lnmVar);
                t9sVar.h = obj;
                return t9sVar;
            default:
                return new t9s(this.c, (o95) this.e, (o95) this.f, this.d, (hdn0) this.g, (ven0) this.h, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0202  */
    /* JADX WARN: Code duplicated, block: B:91:0x020f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0211  */
    public final Object invokeSuspend(Object obj) {
        Object objO;
        List listI;
        int i;
        id4 id4VarG;
        l2t l2tVarQ;
        Object objQ;
        String str;
        boolean z;
        int i2;
        Object objE;
        String str2;
        boolean z2;
        Float f;
        o95 o95Var;
        Float f2;
        pxg1 pxg1VarO0;
        o95 o95Var2;
        Float f3;
        pxg1 pxg1VarO1;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                y9s y9sVar = (y9s) obj2;
                c9n c9nVar = (c9n) this.h;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                        objO = obj;
                    } else if (b2 == 2) {
                        i = this.c;
                        l2t l2tVar = (s2t) this.g;
                        id4 id4Var = (id4) this.f;
                        String str3 = (String) this.e;
                        hm5.M(obj);
                        l2tVarQ = l2tVar;
                        id4VarG = id4Var;
                        str = str3;
                        objQ = obj;
                        int i3 = i;
                        dla1 dla1Var = (dla1) objQ;
                        y9s y9sVar2 = (y9s) obj2;
                        if (id4VarG == id4.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        y9sVar2.e(str, iwc1.b, dla1Var, i3, z);
                        i2 = i3;
                        this.h = null;
                        this.e = str;
                        this.f = id4VarG;
                        this.g = null;
                        this.c = i2;
                        this.b = (byte) 3;
                        objE = l2tVarQ.E(this);
                        if (objE == d9nVar) {
                            return d9nVar;
                        }
                        str2 = str;
                    } else {
                        if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = this.c;
                        id4VarG = (id4) this.f;
                        String str4 = (String) this.e;
                        hm5.M(obj);
                        str2 = str4;
                        objE = obj;
                    }
                    int i4 = i2;
                    dla1 dla1Var2 = (dla1) objE;
                    y9s y9sVar3 = (y9s) obj2;
                    if (id4VarG == id4.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    y9sVar3.e(str2, iwc1.a, dla1Var2, i4, z2);
                    return rih1Var;
                }
                hm5.M(obj);
                this.h = c9nVar;
                this.b = (byte) 1;
                jd4 jd4Var = y9sVar.d;
                if (jd4Var.d()) {
                    listI = y9sVar.a.i();
                    if (!y9s.d(listI)) {
                        objO = listI;
                        objO = null;
                    }
                } else {
                    objO = rc2.O(jd4Var.e(), new p9s(y9sVar, null, (byte) 0), this);
                }
                if (objO == d9nVar) {
                    return d9nVar;
                }
                List list = (List) objO;
                if (list != null) {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = list2.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            if (!((l0l) it.next()).l() && (i5 = i5 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                        i = i5;
                    }
                    String string = UUID.randomUUID().toString();
                    id4VarG = y9sVar.d.g();
                    s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new p9s(y9sVar, null, (byte) 4), 3);
                    l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new s9s(y9sVar, this.d, string, null, (byte) 1), 3);
                    this.h = null;
                    this.e = string;
                    this.f = id4VarG;
                    this.g = l2tVarQ;
                    this.c = i;
                    this.b = (byte) 2;
                    objQ = s2tVarQ.Q(this);
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                    str = string;
                    int i6 = i;
                    dla1 dla1Var3 = (dla1) objQ;
                    y9s y9sVar4 = (y9s) obj2;
                    if (id4VarG == id4.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y9sVar4.e(str, iwc1.b, dla1Var3, i6, z);
                    i2 = i6;
                    this.h = null;
                    this.e = str;
                    this.f = id4VarG;
                    this.g = null;
                    this.c = i2;
                    this.b = (byte) 3;
                    objE = l2tVarQ.E(this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    str2 = str;
                    int i7 = i2;
                    dla1 dla1Var4 = (dla1) objE;
                    y9s y9sVar5 = (y9s) obj2;
                    if (id4VarG == id4.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    y9sVar5.e(str2, iwc1.a, dla1Var4, i7, z2);
                }
                return rih1Var;
            default:
                o95 o95Var3 = (o95) this.f;
                int i8 = this.c;
                ven0 ven0Var = (ven0) this.h;
                err0 err0Var = (hdn0) this.g;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    err0 err0Var2 = err0Var;
                    if (i8 != err0Var2.s()) {
                        ven0Var.setValue(new Integer(err0Var2.s()));
                        o95 o95Var4 = (o95) this.e;
                        Object objE2 = o95Var3.e();
                        this.b = (byte) 1;
                        if (o95Var4.g(objE2, this) == d9nVar) {
                            return d9nVar;
                        }
                        err0Var.t(i8);
                        f = new Float(0.0f);
                        this.b = (byte) 2;
                        if (o95Var3.g(f, this) == d9nVar) {
                            return d9nVar;
                        }
                        if (!this.d) {
                            o95Var = (o95) this.e;
                            f2 = new Float(0.0f);
                            pxg1VarO0 = irn1.o0(100, 0, x6f1.h, 2);
                            this.b = (byte) 3;
                            if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                                return d9nVar;
                            }
                            ((Function0) ((ven0) obj2).getValue()).invoke();
                            o95Var2 = (o95) this.f;
                            f3 = new Float(1.0f);
                            pxg1VarO1 = irn1.o0(500, 0, x6f1.h, 2);
                            this.b = (byte) 4;
                            if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    } else if (!this.d) {
                        o95Var = (o95) this.e;
                        f2 = new Float(0.0f);
                        pxg1VarO0 = irn1.o0(100, 0, x6f1.h, 2);
                        this.b = (byte) 3;
                        if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                        ((Function0) ((ven0) obj2).getValue()).invoke();
                        o95Var2 = (o95) this.f;
                        f3 = new Float(1.0f);
                        pxg1VarO1 = irn1.o0(500, 0, x6f1.h, 2);
                        this.b = (byte) 4;
                        if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (b3 == 1) {
                    hm5.M(obj);
                    err0Var.t(i8);
                    f = new Float(0.0f);
                    this.b = (byte) 2;
                    if (o95Var3.g(f, this) == d9nVar) {
                        return d9nVar;
                    }
                    if (!this.d) {
                        o95Var = (o95) this.e;
                        f2 = new Float(0.0f);
                        pxg1VarO0 = irn1.o0(100, 0, x6f1.h, 2);
                        this.b = (byte) 3;
                        if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                        ((Function0) ((ven0) obj2).getValue()).invoke();
                        o95Var2 = (o95) this.f;
                        f3 = new Float(1.0f);
                        pxg1VarO1 = irn1.o0(500, 0, x6f1.h, 2);
                        this.b = (byte) 4;
                        if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (b3 == 2) {
                    hm5.M(obj);
                    if (!this.d && ((Integer) ven0Var.getValue()) != null) {
                        o95Var = (o95) this.e;
                        f2 = new Float(0.0f);
                        pxg1VarO0 = irn1.o0(100, 0, x6f1.h, 2);
                        this.b = (byte) 3;
                        if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                        ((Function0) ((ven0) obj2).getValue()).invoke();
                        o95Var2 = (o95) this.f;
                        f3 = new Float(1.0f);
                        pxg1VarO1 = irn1.o0(500, 0, x6f1.h, 2);
                        this.b = (byte) 4;
                        if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (b3 == 3) {
                    hm5.M(obj);
                    ((Function0) ((ven0) obj2).getValue()).invoke();
                    o95Var2 = (o95) this.f;
                    f3 = new Float(1.0f);
                    pxg1VarO1 = irn1.o0(500, 0, x6f1.h, 2);
                    this.b = (byte) 4;
                    if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b3 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue((Object) null);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9s(y9s y9sVar, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.i = y9sVar;
        this.d = z;
    }
}
