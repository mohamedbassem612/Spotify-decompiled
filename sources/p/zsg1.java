package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zsg1 extends a8d1 implements vu30 {
    public s2t a;
    public l2t b;
    public o93 c;
    public String d;
    public c221 e;
    public boolean f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ o93 i;
    public final /* synthetic */ hti0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsg1(o93 o93Var, hti0 hti0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = o93Var;
        this.t = hti0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        zsg1 zsg1Var = new zsg1(this.i, this.t, lnmVar);
        zsg1Var.h = obj;
        return zsg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    public final Object invokeSuspend(Object obj) {
        l2t l2tVarQ;
        s2t s2tVar;
        String str;
        c221 c221Var;
        boolean zBooleanValue;
        Object objE;
        boolean z;
        o93 o93Var;
        c9n c9nVar = (c9n) this.h;
        byte b = this.g;
        hti0 hti0Var = this.t;
        byte b2 = 1;
        o93 o93Var2 = this.i;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new k6g1(o93Var2, hti0Var, (lnm) null, (byte) 7), 3);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new ysg1(o93Var2, lnmVar, (byte) 0), 3);
            l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new ysg1(o93Var2, lnmVar, b2), 3);
            this.h = null;
            this.a = s2tVarQ2;
            this.b = l2tVarQ;
            this.g = (byte) 1;
            obj = s2tVarQ.Q(this);
            if (obj != d9nVar) {
                s2tVar = s2tVarQ2;
            }
            return d9nVar;
        }
        if (b == 1) {
            l2tVarQ = this.b;
            s2tVar = this.a;
            hm5.M(obj);
        } else {
            if (b == 2) {
                c221 c221Var2 = this.e;
                String str2 = this.d;
                o93Var2 = this.c;
                l2t l2tVar = this.b;
                hm5.M(obj);
                c221Var = c221Var2;
                l2tVarQ = l2tVar;
                str = str2;
                zBooleanValue = ((Boolean) obj).booleanValue();
                this.h = null;
                this.a = null;
                this.b = null;
                this.c = o93Var2;
                this.d = str;
                this.e = c221Var;
                this.f = zBooleanValue;
                this.g = (byte) 3;
                objE = l2tVarQ.E(this);
                if (objE != d9nVar) {
                    z = zBooleanValue;
                    obj = objE;
                    o93Var = o93Var2;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.f;
            c221Var = this.e;
            str = this.d;
            o93Var = this.c;
            hm5.M(obj);
        }
        return o93Var.e(str, c221Var, z, (Map) obj);
        c221 c221Var3 = (c221) obj;
        str = hti0Var.a;
        this.h = null;
        this.a = null;
        this.b = l2tVarQ;
        this.c = o93Var2;
        this.d = str;
        this.e = c221Var3;
        this.g = (byte) 2;
        Object objE2 = s2tVar.E(this);
        if (objE2 != d9nVar) {
            c221Var = c221Var3;
            obj = objE2;
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.h = null;
            this.a = null;
            this.b = null;
            this.c = o93Var2;
            this.d = str;
            this.e = c221Var;
            this.f = zBooleanValue;
            this.g = (byte) 3;
            objE = l2tVarQ.E(this);
            if (objE != d9nVar) {
                z = zBooleanValue;
                obj = objE;
                o93Var = o93Var2;
                return o93Var.e(str, c221Var, z, (Map) obj);
            }
        }
        return d9nVar;
    }
}
