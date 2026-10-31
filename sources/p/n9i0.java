package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzhm;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n9i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9i0(x8i0 x8i0Var, String str, q9i0 q9i0Var, List list, long j, w8i0 w8i0Var, String str2, woh0 woh0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = x8i0Var;
        this.c = str;
        this.g = q9i0Var;
        this.h = list;
        this.e = j;
        this.i = w8i0Var;
        this.d = str2;
        this.t = woh0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new n9i0((x8i0) this.f, this.c, (q9i0) this.g, (List) this.h, this.e, (w8i0) obj3, this.d, (woh0) obj2, lnmVar);
            default:
                long j = this.e;
                n9i0 n9i0Var = new n9i0((u9c) obj3, this.c, this.d, (sln1) obj2, j, lnmVar);
                n9i0Var.h = obj;
                return n9i0Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws zzhm {
        String str;
        rvo1 rvo1Var;
        Object objA;
        rvo1 rvo1Var2;
        faa0 faa0Var;
        Object objA2;
        rvo1 rvo1Var3;
        pmn1 pmn1Var;
        Object objE;
        pmn1 pmn1Var2;
        Object obj2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.i;
        Object obj4 = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                woh0 woh0Var = (woh0) obj4;
                w8i0 w8i0Var = (w8i0) obj3;
                List list = (List) this.h;
                q9i0 q9i0Var = (q9i0) this.g;
                x8i0 x8i0Var = (x8i0) this.f;
                byte b2 = this.b;
                String str2 = this.d;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            hm5.M(obj);
                        } else {
                            if (b2 != 2 && b2 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        q9i0.m(w8i0Var, str2, woh0Var.a, new wxh1((List) this.h, x8i0Var.b, x8i0Var.c, this.c, x8i0Var.e, x8i0Var.f, woh0Var.d, woh0Var.e));
                        return rih1.a;
                    }
                    hm5.M(obj);
                    String str3 = x8i0Var.d;
                    if (str3 != null && (str = this.c) != null) {
                        this.b = (byte) 1;
                        if (q9i0Var.o(str3, str, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    if (list.size() > 1) {
                        String str4 = x8i0Var.a;
                        List list2 = (List) this.h;
                        long j = this.e;
                        this.b = (byte) 2;
                        if (q9i0Var.n(str4, list2, j, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        String str5 = x8i0Var.a;
                        String str6 = (String) o7h.q0(list);
                        this.b = (byte) 3;
                        if (q9i0Var.o(str5, str6, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    q9i0.m(w8i0Var, str2, woh0Var.a, new wxh1((List) this.h, x8i0Var.b, x8i0Var.c, this.c, x8i0Var.e, x8i0Var.f, woh0Var.d, woh0Var.e));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    q9i0.m(w8i0Var, str2, woh0Var.a, txh1.a);
                }
                return rih1.a;
            default:
                u9c u9cVar = (u9c) obj3;
                qeh1 qeh1Var = (qeh1) u9cVar.f;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        rvo1 rvo1Var4 = (rvo1) this.g;
                        faa0Var = (l2t) this.f;
                        rvo1 rvo1Var5 = (rvo1) this.h;
                        hm5.M(obj);
                        rvo1Var2 = rvo1Var5;
                        rvo1Var = rvo1Var4;
                        objA = obj;
                    } else if (b3 != 2) {
                        pmn1 pmn1Var3 = (pmn1) this.h;
                        hm5.M(obj);
                        pmn1Var2 = pmn1Var3;
                        objE = obj;
                    } else {
                        faa0 faa0Var2 = (l2t) this.f;
                        rvo1Var2 = (rvo1) this.h;
                        hm5.M(obj);
                        faa0Var = faa0Var2;
                        objA2 = obj;
                        rvo1Var3 = rvo1Var2;
                        pmn1Var = (pmn1) objA2;
                        if (faa0Var.v()) {
                            String str7 = this.c;
                            fn31.T(qeh1Var.a(), (o8n) null, 0, new azn1(rvo1Var3, u9cVar, str7, this.d, new vrv0(u9cVar, str7, faa0Var, (sln1) obj4), (lnm) null, (byte) 0), 3);
                            return pmn1Var;
                        }
                        this.h = pmn1Var;
                        this.f = null;
                        this.b = (byte) 3;
                        objE = faa0Var.E(this);
                        if (objE != d9nVar) {
                            return d9nVar;
                        }
                        pmn1Var2 = pmn1Var;
                    }
                    obj2 = ((e331) objE).a;
                    if (e331.a(obj2) == null) {
                        return pmn1Var2;
                    }
                    kmn1 kmn1Var = (kmn1) pmn1Var2.i();
                    kmn1Var.g((pmn1) obj2);
                    return (pmn1) kmn1Var.e();
                }
                hm5.M(obj);
                rvo1Var = (rvo1) this.h;
                c9n c9nVarA = qeh1Var.a();
                sln1 sln1Var = (sln1) obj4;
                String str8 = this.c;
                faa0 faa0VarQ = fn31.q(c9nVarA, (o8n) null, 0, new z0i1(rvo1Var, u9cVar, str8, sln1Var, (lnm) null, (byte) 8), 3);
                ssk1 ssk1Var = (ssk1) u9cVar.a;
                this.h = rvo1Var;
                this.f = faa0VarQ;
                this.g = rvo1Var;
                this.b = (byte) 1;
                objA = ssk1Var.a(str8, this.d, sln1Var, this.e);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                rvo1Var2 = rvo1Var;
                faa0Var = faa0VarQ;
                this.h = rvo1Var2;
                this.f = faa0Var;
                this.g = null;
                this.b = (byte) 2;
                objA2 = ((nwo1) objA).a(rvo1Var.a, this);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                rvo1Var3 = rvo1Var2;
                pmn1Var = (pmn1) objA2;
                if (faa0Var.v()) {
                    String str9 = this.c;
                    fn31.T(qeh1Var.a(), (o8n) null, 0, new azn1(rvo1Var3, u9cVar, str9, this.d, new vrv0(u9cVar, str9, faa0Var, (sln1) obj4), (lnm) null, (byte) 0), 3);
                    return pmn1Var;
                }
                this.h = pmn1Var;
                this.f = null;
                this.b = (byte) 3;
                objE = faa0Var.E(this);
                if (objE != d9nVar) {
                    return d9nVar;
                }
                pmn1Var2 = pmn1Var;
                obj2 = ((e331) objE).a;
                if (e331.a(obj2) == null) {
                    return pmn1Var2;
                }
                kmn1 kmn1Var2 = (kmn1) pmn1Var2.i();
                kmn1Var2.g((pmn1) obj2);
                return (pmn1) kmn1Var2.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9i0(u9c u9cVar, String str, String str2, sln1 sln1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.i = u9cVar;
        this.c = str;
        this.d = str2;
        this.t = sln1Var;
        this.e = j;
    }
}
