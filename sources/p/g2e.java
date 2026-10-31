package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g2e extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k2e d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2e(k2e k2eVar, String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = k2eVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
        this.i = str4;
        this.t = z2;
        this.X = str5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                g2e g2eVar = new g2e(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar, (byte) 0);
                g2eVar.c = obj;
                return g2eVar;
            default:
                g2e g2eVar2 = new g2e(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar, (byte) 1);
                g2eVar2.c = obj;
                return g2eVar2;
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

    public final Object invokeSuspend(Object obj) {
        sy21 m231Var;
        Object objD;
        sy21 m231Var2;
        Object objD2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                k2e k2eVar = this.d;
                try {
                    if (z) {
                        if (z) {
                            hm5.M(obj);
                            objD = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str = this.e;
                    String str2 = this.f;
                    boolean z2 = this.g;
                    String str3 = this.h;
                    String str4 = this.i;
                    boolean z3 = this.t;
                    String str5 = this.X;
                    this.c = null;
                    this.b = true;
                    objD = k2eVar.d(str, str2, true, z2, str3, str4, z3, str5, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    m231Var = (sy21) objD;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    k2eVar.e.E((sy21) null, thA);
                }
                if (!(m231Var instanceof m231)) {
                    return m231Var;
                }
                return null;
            default:
                boolean z4 = this.b;
                k2e k2eVar2 = this.d;
                try {
                    if (z4) {
                        if (z4) {
                            hm5.M(obj);
                            objD2 = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str6 = this.e;
                    String str7 = this.f;
                    boolean z5 = this.g;
                    String str8 = this.h;
                    String str9 = this.i;
                    boolean z6 = this.t;
                    String str10 = this.X;
                    this.c = null;
                    this.b = true;
                    objD2 = k2eVar2.d(str6, str7, false, z5, str8, str9, z6, str10, this);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    m231Var2 = (sy21) objD2;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 != null) {
                    k2eVar2.e.E((sy21) null, thA2);
                }
                if (!(m231Var2 instanceof m231)) {
                    return m231Var2;
                }
                return null;
        }
    }
}
