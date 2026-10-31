package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vhz0 extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public l2t a;
    public s2t b;
    public ljz0 c;
    public List d;
    public String e;
    public ljz0 f;
    public int g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ zhz0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhz0(zhz0 zhz0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.t = zhz0Var;
        this.X = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        vhz0 vhz0Var = new vhz0(this.t, this.X, lnmVar);
        vhz0Var.i = obj;
        return vhz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVarQ;
        l2t l2tVar;
        Object obj2;
        ljz0 ljz0Var;
        Object obj3;
        Throwable thA;
        List list;
        String str;
        Object objE;
        List list2;
        String str2;
        c9n c9nVar = (c9n) this.i;
        byte b = this.h;
        int i = 0;
        Object[] objArr = 0;
        byte b2 = 1;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            zhz0 zhz0Var = this.t;
            String str3 = this.X;
            l2t l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new uhz0(zhz0Var, str3, lnmVar, b2), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new uhz0(zhz0Var, str3, lnmVar, objArr == true ? 1 : 0), 3);
            i6n0 i6n0Var = zhz0Var.a;
            this.i = null;
            this.a = l2tVarQ;
            this.b = s2tVarQ;
            this.h = (byte) 1;
            Object objB = i6n0Var.b(str3, this);
            if (objB != d9nVar) {
                l2tVar = l2tVarQ;
                obj2 = objB;
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = this.b;
            l2tVar = this.a;
            hm5.M(obj);
            obj2 = ((e331) obj).a;
        } else {
            if (b == 2) {
                i = this.g;
                ljz0Var = this.c;
                l2tVar = this.a;
                hm5.M(obj);
                obj3 = ((e331) obj).a;
                thA = e331.a(obj3);
                if (thA == null) {
                    return new biz0(thA);
                }
                list = (List) obj3;
                str = ljz0Var.d;
                this.i = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = list;
                this.e = str;
                this.f = ljz0Var;
                this.g = i;
                this.h = (byte) 3;
                objE = l2tVar.E(this);
                if (objE != d9nVar) {
                    obj = objE;
                    list2 = list;
                    str2 = str;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ljz0Var = this.f;
            str2 = this.e;
            list2 = this.d;
            hm5.M(obj);
        }
        return new ciz0(ljz0Var, str2, (List) obj, list2);
        Throwable thA2 = e331.a(obj2);
        if (thA2 != null) {
            return new biz0(thA2);
        }
        ljz0 ljz0Var2 = (ljz0) obj2;
        this.i = null;
        this.a = l2tVar;
        this.b = null;
        this.c = ljz0Var2;
        this.g = 0;
        this.h = (byte) 2;
        Object objE2 = s2tVarQ.E(this);
        if (objE2 != d9nVar) {
            ljz0Var = ljz0Var2;
            obj = objE2;
            obj3 = ((e331) obj).a;
            thA = e331.a(obj3);
            if (thA == null) {
                return new biz0(thA);
            }
            list = (List) obj3;
            str = ljz0Var.d;
            this.i = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = list;
            this.e = str;
            this.f = ljz0Var;
            this.g = i;
            this.h = (byte) 3;
            objE = l2tVar.E(this);
            if (objE != d9nVar) {
                obj = objE;
                list2 = list;
                str2 = str;
                return new ciz0(ljz0Var, str2, (List) obj, list2);
            }
        }
        return d9nVar;
    }
}
