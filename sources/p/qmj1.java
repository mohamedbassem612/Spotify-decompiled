package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qmj1 extends a8d1 implements vu30 {
    public final /* synthetic */ ptf1 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ String X;
    public final /* synthetic */ d0r Y;
    public final /* synthetic */ qxc0 Z;
    public s2t a;
    public tmj1 b;
    public String c;
    public d0r d;
    public Map e;
    public ptf1 f;
    public boolean g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ tmj1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmj1(tmj1 tmj1Var, String str, d0r d0rVar, qxc0 qxc0Var, ptf1 ptf1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.t = tmj1Var;
        this.X = str;
        this.Y = d0rVar;
        this.Z = qxc0Var;
        this.N0 = ptf1Var;
        this.O0 = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        qmj1 qmj1Var = new qmj1(this.t, this.X, this.Y, this.Z, this.N0, this.O0, lnmVar);
        qmj1Var.i = obj;
        return qmj1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Map map;
        s2t s2tVar;
        d0r d0rVar;
        tmj1 tmj1Var;
        ptf1 ptf1Var;
        Map map2;
        boolean z;
        tmj1 tmj1Var2;
        c9n c9nVar = (c9n) this.i;
        byte b = this.h;
        tmj1 tmj1Var3 = this.t;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            d0r d0rVar2 = this.Y;
            str = this.X;
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new hex0(d0rVar2, str, null, (byte) 3), 3);
            ptf1 ptf1Var2 = this.N0;
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new k6g1(ptf1Var2, str, (lnm) null, (byte) 26), 3);
            map = this.Z.X;
            this.i = null;
            this.a = s2tVarQ;
            this.b = tmj1Var3;
            this.c = str;
            this.d = d0rVar2;
            this.e = map;
            this.f = ptf1Var2;
            this.h = (byte) 1;
            Object objQ = s2tVarQ2.Q(this);
            if (objQ != d9nVar) {
                s2tVar = s2tVarQ;
                obj = objQ;
                d0rVar = d0rVar2;
                tmj1Var = tmj1Var3;
                ptf1Var = ptf1Var2;
            }
            return d9nVar;
        }
        if (b == 1) {
            ptf1 ptf1Var3 = this.f;
            Map map3 = this.e;
            d0rVar = this.d;
            str = this.c;
            tmj1 tmj1Var4 = this.b;
            s2tVar = this.a;
            hm5.M(obj);
            ptf1Var = ptf1Var3;
            tmj1Var = tmj1Var4;
            map = map3;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.g;
            ptf1Var = this.f;
            Map map4 = this.e;
            d0rVar = this.d;
            String str2 = this.c;
            tmj1 tmj1Var5 = this.b;
            hm5.M(obj);
            map2 = map4;
            tmj1Var2 = tmj1Var5;
            str = str2;
            z = z2;
        }
        d0r d0rVar3 = d0rVar;
        return tmj1Var2.c(str, d0rVar3, map2, ptf1Var, z, ((Boolean) obj).booleanValue(), tmj1Var3.d(this.O0));
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.i = null;
        this.a = null;
        this.b = tmj1Var;
        this.c = str;
        this.d = d0rVar;
        this.e = map;
        this.f = ptf1Var;
        this.g = zBooleanValue;
        this.h = (byte) 2;
        Object objE = s2tVar.E(this);
        if (objE != d9nVar) {
            map2 = map;
            z = zBooleanValue;
            obj = objE;
            tmj1Var2 = tmj1Var;
            d0r d0rVar4 = d0rVar;
            return tmj1Var2.c(str, d0rVar4, map2, ptf1Var, z, ((Boolean) obj).booleanValue(), tmj1Var3.d(this.O0));
        }
        return d9nVar;
    }
}
