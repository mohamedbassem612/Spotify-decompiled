package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fhl extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhl(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.i = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = z;
        this.g = obj5;
        this.h = obj6;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fhl(obj7, obj2, obj6, obj5, this.f, obj4, obj3, lnmVar, (byte) 0);
            case 1:
                return new fhl(obj7, obj2, obj6, obj5, this.f, obj4, obj3, lnmVar, (byte) 1);
            case 2:
                return new fhl(obj7, this.f, (String) obj6, (u9c0) obj2, (String) obj5, (String) obj4, (tv80) obj3, lnmVar, (byte) 2);
            case 3:
                return new fhl(obj7, this.f, (String) obj6, (u9c0) obj2, (String) obj5, (String) obj4, (tv80) obj3, lnmVar, (byte) 3);
            default:
                return new fhl(obj7, this.c, obj6, obj5, this.f, obj4, obj3, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    public final Object invokeSuspend(Object obj) {
        ?? r17;
        ?? r18;
        byte b = this.a;
        fjz fjzVar = fjz.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.i;
        d9n d9nVar = d9n.a;
        Object obj7 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objK = ((ghl) obj6).a.k((List) obj5, (String) obj4, (String) obj7, this.f, (kio) obj3, (gj3) obj2, this);
                    return objK == d9nVar ? d9nVar : objK;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY = ((yjq) obj6).y((List) obj5, (String) obj4, (String) obj7, this.f, (kio) obj3, (gj3) obj2, this);
                    return objY == d9nVar ? d9nVar : objY;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                String str = (String) obj4;
                x860 x860Var = (x860) obj6;
                dg30 dg30Var = x860Var.c;
                boolean z3 = this.b;
                ?? r14 = this.f;
                try {
                    try {
                        if (!z3) {
                            hm5.M(obj);
                            q8n q8nVar = x860Var.e;
                            r17 = r14;
                            try {
                                hl0 hl0Var = new hl0(x860Var, (String) obj7, (boolean) r17, (lnm) null, (byte) 12);
                                this.b = true;
                                Object objY2 = fn31.Y(q8nVar, hl0Var, this);
                                r14 = hl0Var;
                                r17 = r17;
                                if (objY2 == d9nVar) {
                                    return d9nVar;
                                }
                            } catch (Throwable unused) {
                                op71.x(((u9c0) obj5).J());
                                x860Var.a.a(new xiz(fjzVar, new yiz(dg30Var.getString(r17 == 0 ? 2131956554 : 2131956555, str)), ajz.d), new g96(x860Var, (String) obj7, (String) obj3, this.f, (tv80) obj2, (byte) 1), h050.X);
                                return rih1Var;
                            }
                        } else {
                            if (!z3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            r17 = r14;
                            r14 = r14;
                        }
                        x860Var.b.k(new er91((fs91) null, dg30Var.getString(r17 == 0 ? 2131956558 : 2131956559, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    } catch (Throwable unused2) {
                        r17 = r14;
                    }
                } catch (CancellationException e) {
                    throw e;
                }
                break;
            case 3:
                String str2 = (String) obj4;
                wmy wmyVar = (wmy) obj6;
                dg30 dg30Var2 = (dg30) wmyVar.c;
                boolean z4 = this.b;
                ?? r15 = this.f;
                try {
                    try {
                        if (!z4) {
                            hm5.M(obj);
                            q8n q8nVar2 = (q8n) wmyVar.e;
                            r18 = r15;
                            try {
                                hl0 hl0Var2 = new hl0(wmyVar, (String) obj7, (boolean) r18, (lnm) null, (byte) 21);
                                this.b = true;
                                Object objY3 = fn31.Y(q8nVar2, hl0Var2, this);
                                r15 = hl0Var2;
                                r18 = r18;
                                if (objY3 == d9nVar) {
                                    return d9nVar;
                                }
                            } catch (Throwable unused3) {
                                op71.x(((u9c0) obj5).J());
                                ((jjz) wmyVar.a).a(new xiz(fjzVar, new yiz(dg30Var2.getString(r18 == 0 ? 2131961315 : 2131961316, str2)), ajz.d), new g96(wmyVar, (String) obj7, (String) obj3, this.f, (tv80) obj2, (byte) 3), n521.P0);
                                return rih1Var;
                            }
                        } else {
                            if (!z4) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            r18 = r15;
                            r15 = r15;
                        }
                        ((kt91) wmyVar.b).k(new er91((fs91) null, dg30Var2.getString(r18 == 0 ? 2131961319 : 2131961320, str2), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    } catch (Throwable unused4) {
                        r18 = r15;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                break;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20Var = new lt20(new jha1((mr20) ((iu30) obj6).invoke(obj5), (byte) 12), new w1e0(3, (lnm) null, (byte) 26), (byte) 0);
                hkd1 hkd1Var = new hkd1((vu30) obj4, this.c, (jkd1) obj7, this.f, (kkd1) obj3, (iu30) obj2);
                this.b = true;
                return lt20Var.collect(hkd1Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhl(Object obj, boolean z, String str, u9c0 u9c0Var, String str2, String str3, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.i = obj;
        this.f = z;
        this.d = str;
        this.c = u9c0Var;
        this.e = str2;
        this.g = str3;
        this.h = tv80Var;
    }
}
