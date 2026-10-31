package p;

import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqf extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public Object c;
    public byte d;
    public /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqf(n511 n511Var, fz40 fz40Var, jj50 jj50Var, br60 br60Var, br60 br60Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = (byte) 1;
        this.f = n511Var;
        this.g = fz40Var;
        this.h = jj50Var;
        this.i = br60Var;
        this.t = br60Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                fqf fqfVar = new fqf(obj5, obj4, obj3, obj2, lnmVar, (byte) 0);
                fqfVar.e = obj;
                return fqfVar;
            case 1:
                fqf fqfVar2 = new fqf((n511) this.f, (fz40) obj5, (jj50) obj4, (br60) obj3, (br60) obj2, lnmVar);
                fqfVar2.e = obj;
                return fqfVar2;
            default:
                fqf fqfVar3 = new fqf(obj5, obj4, obj3, obj2, lnmVar, (byte) 2);
                fqfVar3.e = obj;
                return fqfVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0237  */
    /* JADX WARN: Code duplicated, block: B:106:0x0241  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        l811 l811Var;
        m811 m811Var;
        Object objD;
        hav0 hav0Var;
        xab1 xab1Var;
        Object objN;
        xab1 xab1Var2;
        Object objB2;
        rih1 rih1Var;
        m811 m811Var2;
        Object objC;
        hav0 hav0Var2;
        Object objN2;
        xab1 xab1VarT;
        l811 l811Var2;
        Object objI;
        hav0 hav0Var3;
        byte b = this.b;
        Object obj2 = this.t;
        Object obj3 = this.h;
        d9n d9nVar = d9n.a;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.i;
        Object obj5 = this.g;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                bmh1 bmh1Var = (bmh1) obj5;
                i8d1 i8d1Var = (i8d1) this.e;
                byte b2 = this.d;
                byte b3 = 19;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            hm5.M(obj);
                            objB = obj;
                        } else {
                            if (b2 == 2) {
                                l811Var = (l811) this.f;
                                m811 m811Var3 = (m811) this.c;
                                hm5.M(obj);
                                m811Var = m811Var3;
                                objD = obj;
                                hav0Var = (hav0) objD;
                                if (hav0Var != null && l811Var.a) {
                                    xab1Var = bmh1Var.e;
                                    if (xab1Var != null) {
                                        xab1Var.d((CancellationException) null);
                                    }
                                    bmh1Var.d.t(0.0f);
                                    bmh1Var.f = false;
                                    bmh1Var.a(m811Var.a);
                                    long j = hav0Var.a;
                                    eqf eqfVar = new eqf(bmh1Var, (byte) 2);
                                    this.e = null;
                                    this.c = null;
                                    this.f = null;
                                    this.d = (byte) 3;
                                    objN = g5v.n(i8d1Var, j, eqfVar, this);
                                    if (objN == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                                return rih1Var2;
                            }
                            if (b2 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            objN = obj;
                        }
                        ((Boolean) objN).getClass();
                        xab1Var2 = bmh1Var.e;
                        if (xab1Var2 != null) {
                            xab1Var2.d((CancellationException) null);
                        }
                        bmh1Var.e = fn31.T(bmh1Var.b, (o8n) null, 0, new b0f1(bmh1Var, lnmVar, b3), 3);
                        return rih1Var2;
                    }
                    hm5.M(obj);
                    this.e = i8d1Var;
                    this.d = (byte) 1;
                    objB = rqd1.b(i8d1Var, this, 2);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                    m811 m811Var4 = new m811();
                    l811 l811Var3 = new l811();
                    long j2 = ((hav0) objB).a;
                    m mVar = new m(l811Var3, (flb0) obj3, (n9d1) obj4, (n9d1) obj2, m811Var4, (byte) 25);
                    l811Var = l811Var3;
                    m811Var = m811Var4;
                    this.e = i8d1Var;
                    this.c = m811Var;
                    this.f = l811Var;
                    this.d = (byte) 2;
                    objD = g5v.d(i8d1Var, j2, mVar, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    hav0Var = (hav0) objD;
                    if (hav0Var != null) {
                        xab1Var = bmh1Var.e;
                        if (xab1Var != null) {
                            xab1Var.d((CancellationException) null);
                        }
                        bmh1Var.d.t(0.0f);
                        bmh1Var.f = false;
                        bmh1Var.a(m811Var.a);
                        long j3 = hav0Var.a;
                        eqf eqfVar2 = new eqf(bmh1Var, (byte) 2);
                        this.e = null;
                        this.c = null;
                        this.f = null;
                        this.d = (byte) 3;
                        objN = g5v.n(i8d1Var, j3, eqfVar2, this);
                        if (objN == d9nVar) {
                            return d9nVar;
                        }
                        ((Boolean) objN).getClass();
                        xab1Var2 = bmh1Var.e;
                        if (xab1Var2 != null) {
                            xab1Var2.d((CancellationException) null);
                        }
                        bmh1Var.e = fn31.T(bmh1Var.b, (o8n) null, 0, new b0f1(bmh1Var, lnmVar, b3), 3);
                    }
                    return rih1Var2;
                } catch (Throwable th) {
                    xab1 xab1Var3 = bmh1Var.e;
                    if (xab1Var3 != null) {
                        xab1Var3.d((CancellationException) null);
                    }
                    bmh1Var.e = fn31.T(bmh1Var.b, (o8n) null, 0, new b0f1(bmh1Var, lnmVar, b3), 3);
                    throw th;
                }
            case 1:
                jj50 jj50Var = (jj50) obj3;
                i8d1 i8d1Var2 = (i8d1) this.e;
                byte b4 = this.d;
                if (b4 != 0) {
                    if (b4 == 1) {
                        hm5.M(obj);
                        objB2 = obj;
                    } else {
                        if (b4 == 2) {
                            m811 m811Var5 = (m811) this.c;
                            hm5.M(obj);
                            m811Var2 = m811Var5;
                            rih1Var = rih1Var2;
                            objC = obj;
                            hav0Var2 = (hav0) objC;
                            if (hav0Var2 != null) {
                                ((fz40) obj5).invoke(new Offset(hav0Var2.c));
                                jj50Var.invoke(hav0Var2, new Float(m811Var2.a));
                                long j4 = hav0Var2.a;
                                zi50 zi50Var = new zi50(jj50Var, (byte) 18);
                                this.e = null;
                                this.c = null;
                                this.d = (byte) 3;
                                objN2 = g5v.n(i8d1Var2, j4, zi50Var, this);
                                if (objN2 == d9nVar) {
                                    return d9nVar;
                                }
                            }
                            return rih1Var;
                        }
                        if (b4 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objN2 = obj;
                        rih1Var = rih1Var2;
                    }
                    if (((Boolean) objN2).booleanValue()) {
                        ((br60) obj4).invoke();
                    } else {
                        ((br60) obj2).invoke();
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.e = i8d1Var2;
                this.d = (byte) 1;
                objB2 = rqd1.b(i8d1Var2, this, 2);
                if (objB2 == d9nVar) {
                    return d9nVar;
                }
                hav0 hav0Var4 = (hav0) objB2;
                rih1Var = rih1Var2;
                if (((n511) this.f).a(hav0Var4.c)) {
                    m811Var2 = new m811();
                    long j5 = hav0Var4.a;
                    int i = hav0Var4.i;
                    e110 e110Var = new e110(m811Var2, (byte) 1);
                    this.e = i8d1Var2;
                    this.c = m811Var2;
                    this.d = (byte) 2;
                    objC = g5v.c(i8d1Var2, j5, i, e110Var, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                    hav0Var2 = (hav0) objC;
                    if (hav0Var2 != null) {
                        ((fz40) obj5).invoke(new Offset(hav0Var2.c));
                        jj50Var.invoke(hav0Var2, new Float(m811Var2.a));
                        long j6 = hav0Var2.a;
                        zi50 zi50Var2 = new zi50(jj50Var, (byte) 18);
                        this.e = null;
                        this.c = null;
                        this.d = (byte) 3;
                        objN2 = g5v.n(i8d1Var2, j6, zi50Var2, this);
                        if (objN2 == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objN2).booleanValue()) {
                            ((br60) obj4).invoke();
                        } else {
                            ((br60) obj2).invoke();
                        }
                    }
                }
                return rih1Var;
            default:
                Function0 function0 = (Function0) obj4;
                i8d1 i8d1Var3 = (i8d1) this.e;
                byte b5 = this.d;
                cav0 cav0Var = cav0.a;
                if (b5 == 0) {
                    hm5.M(obj);
                    this.e = i8d1Var3;
                    this.d = (byte) 1;
                    if (rqd1.a(i8d1Var3, false, cav0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b5 != 1) {
                        if (b5 != 2) {
                            if (b5 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xab1VarT = (xab1) this.c;
                            l811Var2 = (l811) this.f;
                            try {
                                hm5.M(obj);
                                objI = obj;
                                hav0Var3 = (hav0) objI;
                                if (l811Var2.a && hav0Var3 != null) {
                                    hav0Var3.a();
                                }
                                xab1VarT.d((CancellationException) null);
                                if (l811Var2.a) {
                                    function0.invoke();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                xab1VarT.d((CancellationException) null);
                                if (l811Var2.a) {
                                    function0.invoke();
                                }
                                throw th;
                            }
                            break;
                        } else {
                            hm5.M(obj);
                        }
                        return rih1Var2;
                    }
                    hm5.M(obj);
                }
                if (((Boolean) ((Function0) obj5).invoke()).booleanValue()) {
                    l811 l811Var4 = new l811();
                    xab1VarT = fn31.T((c9n) obj3, (o8n) null, 0, new nsf1(i8d1Var3, (Function0) obj5, l811Var4, (Function0) obj2, (lnm) null, (byte) 22), 3);
                    try {
                        this.e = null;
                        this.f = l811Var4;
                        this.c = xab1VarT;
                        this.d = (byte) 3;
                        objI = rqd1.i(i8d1Var3, cav0Var, this);
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                        l811Var2 = l811Var4;
                        hav0Var3 = (hav0) objI;
                        if (l811Var2.a) {
                            hav0Var3.a();
                        }
                        xab1VarT.d((CancellationException) null);
                        if (l811Var2.a) {
                            function0.invoke();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        l811Var2 = l811Var4;
                        xab1VarT.d((CancellationException) null);
                        if (l811Var2.a) {
                            function0.invoke();
                        }
                        throw th;
                    }
                    break;
                } else {
                    this.e = null;
                    this.d = (byte) 2;
                    if (rqd1.i(i8d1Var3, cav0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqf(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.t = obj4;
    }
}
