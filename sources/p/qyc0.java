package p;

import com.spotify.playlist.proto.Permission;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyc0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xyc0 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qyc0(String str, xyc0 xyc0Var, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = str;
        this.e = xyc0Var;
        this.f = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                qyc0 qyc0Var = new qyc0(this.d, this.e, this.f, lnmVar, (byte) 0);
                qyc0Var.c = obj;
                return qyc0Var;
            default:
                qyc0 qyc0Var2 = new qyc0(this.d, this.e, this.f, lnmVar, (byte) 1);
                qyc0Var2.c = obj;
                return qyc0Var2;
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
        oy21 m231Var;
        Boolean m231Var2;
        byte b = this.a;
        String str = this.f;
        xyc0 xyc0Var = this.e;
        String str2 = this.d;
        d9n d9nVar = d9n.a;
        boolean z = true;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        jyc0 jyc0VarV = xgc.v(str2);
                        if (jyc0VarV == null) {
                            return xgc.q(str2);
                        }
                        gqu0 gqu0Var = xyc0Var.f;
                        String str3 = jyc0VarV.a;
                        String str4 = jyc0VarV.b;
                        this.c = null;
                        this.b = true;
                        obj = gqu0Var.e(str3, str4, str, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = new oy21(rih1.a);
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    m231Var = i2x0.j(str2, thA, fnc0.g);
                }
                return m231Var;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        jyc0 jyc0VarV2 = xgc.v(str2);
                        if (jyc0VarV2 == null) {
                            return Boolean.FALSE;
                        }
                        gqu0 gqu0Var2 = xyc0Var.f;
                        String str5 = jyc0VarV2.a;
                        String str6 = jyc0VarV2.b;
                        this.c = null;
                        this.b = true;
                        obj = gqu0Var2.b(str5, str6, str, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    Permission permission = (Permission) obj;
                    if (!permission.s() || permission.q() != yls0.c) {
                        z = false;
                    }
                    m231Var2 = Boolean.valueOf(z);
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                return m231Var2 instanceof m231 ? Boolean.FALSE : m231Var2;
        }
    }
}
