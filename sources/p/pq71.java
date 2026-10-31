package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pq71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public tq71 b;
    public boolean c;
    public final /* synthetic */ tq71 d;
    public final /* synthetic */ il71 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ z771 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq71(byte b, String str, lnm lnmVar, z771 z771Var, il71 il71Var, tq71 tq71Var) {
        super(2, lnmVar);
        this.a = b;
        this.d = tq71Var;
        this.e = il71Var;
        this.f = str;
        this.g = z771Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new pq71((byte) 0, this.f, lnmVar, this.g, this.e, this.d);
            case 1:
                return new pq71((byte) 1, this.f, lnmVar, this.g, this.e, this.d);
            case 2:
                return new pq71((byte) 2, this.f, lnmVar, this.g, this.e, this.d);
            case 3:
                return new pq71((byte) 3, this.f, lnmVar, this.g, this.e, this.d);
            case 4:
                return new pq71((byte) 4, this.f, lnmVar, this.g, this.e, this.d);
            default:
                return new pq71((byte) 5, this.f, lnmVar, this.g, this.e, this.d);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jl71 jl71Var = (jl71) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(jl71Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        jq71 m231Var;
        Object objM;
        jq71 m231Var2;
        Object objP;
        jq71 m231Var3;
        Object objO;
        jq71 m231Var4;
        Object objP2;
        jq71 m231Var5;
        Object objO2;
        jq71 m231Var6;
        Object objP3;
        byte b = this.a;
        il71 il71Var = this.e;
        tq71 tq71Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                try {
                    if (!z) {
                        hm5.M(obj);
                        String str = this.f;
                        z771 z771Var = this.g;
                        r961 r961Var = tq71Var.b;
                        iq71 iq71Var = new iq71(str, z771Var, null, null, 12);
                        this.b = tq71Var;
                        this.c = true;
                        objM = r961Var.m(iq71Var, this);
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tq71Var = this.b;
                        hm5.M(obj);
                        objM = obj;
                    }
                    m231Var = (jq71) objM;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                tq71Var.getClass();
                tq71.e(m231Var, il71Var, "fetching_playlist_sticker");
                hm5.M(m231Var);
                return m231Var;
            case 1:
                boolean z2 = this.c;
                try {
                    if (z2) {
                        if (z2) {
                            tq71Var = this.b;
                            hm5.M(obj);
                            objP = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str2 = this.f;
                    z771 z771Var2 = this.g;
                    r961 r961Var2 = tq71Var.b;
                    iq71 iq71Var2 = new iq71(str2, z771Var2, null, null, 12);
                    this.b = tq71Var;
                    this.c = true;
                    objP = r961Var2.p(iq71Var2, this);
                    if (objP == d9nVar) {
                        return d9nVar;
                    }
                    m231Var2 = (jq71) objP;
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 != null && !(thA2 instanceof TimeoutCancellationException) && (thA2 instanceof CancellationException)) {
                    throw thA2;
                }
                tq71Var.getClass();
                tq71.e(m231Var2, il71Var, "fetching_themed_sticker");
                if (!(m231Var2 instanceof m231)) {
                    return m231Var2;
                }
                return null;
            case 2:
                boolean z3 = this.c;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        String str3 = this.f;
                        z771 z771Var3 = this.g;
                        r961 r961Var3 = tq71Var.b;
                        iq71 iq71Var3 = new iq71(str3, z771Var3, null, null, 12);
                        this.b = tq71Var;
                        this.c = true;
                        objO = r961Var3.o(iq71Var3, this);
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tq71Var = this.b;
                        hm5.M(obj);
                        objO = obj;
                    }
                    m231Var3 = (jq71) objO;
                } catch (Throwable th3) {
                    m231Var3 = new m231(th3);
                }
                Throwable thA3 = e331.a(m231Var3);
                if (thA3 != null && !(thA3 instanceof TimeoutCancellationException) && (thA3 instanceof CancellationException)) {
                    throw thA3;
                }
                tq71Var.getClass();
                tq71.e(m231Var3, il71Var, "fetching_sticker");
                hm5.M(m231Var3);
                return m231Var3;
            case 3:
                boolean z4 = this.c;
                try {
                    if (z4) {
                        if (z4) {
                            tq71Var = this.b;
                            hm5.M(obj);
                            objP2 = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str4 = this.f;
                    z771 z771Var4 = this.g;
                    r961 r961Var4 = tq71Var.b;
                    iq71 iq71Var4 = new iq71(str4, z771Var4, null, null, 12);
                    this.b = tq71Var;
                    this.c = true;
                    objP2 = r961Var4.p(iq71Var4, this);
                    if (objP2 == d9nVar) {
                        return d9nVar;
                    }
                    m231Var4 = (jq71) objP2;
                    break;
                } catch (Throwable th4) {
                    m231Var4 = new m231(th4);
                }
                Throwable thA4 = e331.a(m231Var4);
                if (thA4 != null && !(thA4 instanceof TimeoutCancellationException) && (thA4 instanceof CancellationException)) {
                    throw thA4;
                }
                tq71Var.getClass();
                tq71.e(m231Var4, il71Var, "fetching_themed_sticker");
                if (!(m231Var4 instanceof m231)) {
                    return m231Var4;
                }
                return null;
            case 4:
                boolean z5 = this.c;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        String str5 = this.f;
                        z771 z771Var5 = this.g;
                        r961 r961Var5 = tq71Var.b;
                        iq71 iq71Var5 = new iq71(str5, z771Var5, null, null, 12);
                        this.b = tq71Var;
                        this.c = true;
                        objO2 = r961Var5.o(iq71Var5, this);
                        if (objO2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tq71Var = this.b;
                        hm5.M(obj);
                        objO2 = obj;
                    }
                    m231Var5 = (jq71) objO2;
                } catch (Throwable th5) {
                    m231Var5 = new m231(th5);
                }
                Throwable thA5 = e331.a(m231Var5);
                if (thA5 != null && !(thA5 instanceof TimeoutCancellationException) && (thA5 instanceof CancellationException)) {
                    throw thA5;
                }
                tq71Var.getClass();
                tq71.e(m231Var5, il71Var, "fetching_sticker");
                hm5.M(m231Var5);
                return m231Var5;
            default:
                boolean z6 = this.c;
                try {
                    if (z6) {
                        if (z6) {
                            tq71Var = this.b;
                            hm5.M(obj);
                            objP3 = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str6 = this.f;
                    z771 z771Var6 = this.g;
                    r961 r961Var6 = tq71Var.b;
                    iq71 iq71Var6 = new iq71(str6, z771Var6, null, null, 12);
                    this.b = tq71Var;
                    this.c = true;
                    objP3 = r961Var6.p(iq71Var6, this);
                    if (objP3 == d9nVar) {
                        return d9nVar;
                    }
                    m231Var6 = (jq71) objP3;
                    break;
                } catch (Throwable th6) {
                    m231Var6 = new m231(th6);
                }
                Throwable thA6 = e331.a(m231Var6);
                if (thA6 != null && !(thA6 instanceof TimeoutCancellationException) && (thA6 instanceof CancellationException)) {
                    throw thA6;
                }
                tq71Var.getClass();
                tq71.e(m231Var6, il71Var, "fetching_themed_sticker");
                if (!(m231Var6 instanceof m231)) {
                    return m231Var6;
                }
                return null;
        }
    }
}
