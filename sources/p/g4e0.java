package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g4e0 extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public s2t a;
    public l2t b;
    public String c;
    public Object d;
    public long e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ w4k1 h;
    public final /* synthetic */ il71 i;
    public final /* synthetic */ dxy t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(w4k1 w4k1Var, il71 il71Var, dxy dxyVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.h = w4k1Var;
        this.i = il71Var;
        this.t = dxyVar;
        this.X = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        g4e0 g4e0Var = new g4e0(this.h, this.i, this.t, this.X, lnmVar);
        g4e0Var.g = obj;
        return g4e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:25:0x0102  */
    /* JADX WARN: Code duplicated, block: B:27:0x0105  */
    /* JADX WARN: Code duplicated, block: B:28:0x0108  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    public final Object invokeSuspend(Object obj) {
        d9n d9nVar;
        long j;
        il71 il71Var;
        l2t l2tVarQ;
        s2t s2tVar;
        l2t l2tVarQ2;
        Object objQ;
        String str;
        Object objE;
        Object obj2;
        Object objE2;
        Object obj3;
        long j2;
        s2t s2tVar2;
        s2t s2tVar3;
        s2t s2tVar4;
        c9n c9nVar = (c9n) this.g;
        byte b = this.f;
        dxy dxyVar = this.t;
        w4k1 w4k1Var = this.h;
        il71 il71Var2 = this.i;
        d9n d9nVar2 = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            long j3 = w4k1Var.c;
            d9nVar = d9nVar2;
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new f4e0(this.i, dxyVar, w4k1Var, this.X, j3, (lnm) null), 3);
            j = j3;
            il71Var = il71Var2;
            l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new f4e0(this.i, dxyVar, this.X, this.h, j3, (lnm) null), 3);
            s2tVar = null;
            l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new n0a0(il71Var, w4k1Var, dxyVar, (lnm) null, (byte) 29), 3);
            this.g = null;
            this.a = l2tVarQ;
            this.b = l2tVarQ2;
            this.e = j;
            this.f = (byte) 1;
            objQ = s2tVarQ.Q(this);
            if (objQ != d9nVar) {
            }
            w4k1Var = w4k1Var;
            dxyVar = dxyVar;
            return d9nVar;
        }
        if (b == 1) {
            long j4 = this.e;
            l2t l2tVar = this.b;
            l2t l2tVar2 = this.a;
            hm5.M(obj);
            j = j4;
            d9nVar = d9nVar2;
            l2tVarQ2 = l2tVar;
            il71Var = il71Var2;
            objQ = obj;
            l2tVarQ = l2tVar2;
            s2tVar = null;
        } else {
            if (b == 2) {
                long j5 = this.e;
                String str2 = this.c;
                l2t l2tVar3 = this.b;
                hm5.M(obj);
                objE = obj;
                j = j5;
                d9nVar = d9nVar2;
                str = str2;
                l2tVarQ2 = l2tVar3;
                il71Var = il71Var2;
                s2tVar = null;
                obj2 = ((e331) objE).a;
                this.g = s2tVar;
                this.a = s2tVar;
                this.b = s2tVar;
                this.c = str;
                this.d = obj2;
                this.e = j;
                this.f = (byte) 3;
                objE2 = l2tVarQ2.E(this);
                if (objE2 != d9nVar) {
                    obj3 = obj2;
                    j2 = j;
                }
                w4k1Var = w4k1Var;
                dxyVar = dxyVar;
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j6 = this.e;
            Object obj4 = this.d;
            String str3 = this.c;
            hm5.M(obj);
            il71Var = il71Var2;
            s2tVar = null;
            j2 = j6;
            obj3 = obj4;
            str = str3;
            objE2 = obj;
        }
        llg llgVar = (llg) objE2;
        il71Var.setAttribute("result", "success");
        xid xidVar = (xid) dxyVar.f;
        s2tVar2 = w4k1Var.a.b.b;
        if (s2tVar2 instanceof u5k1) {
            s2tVar3 = (u5k1) s2tVar2;
        } else {
            s2tVar3 = s2tVar;
        }
        if (s2tVar3 != null) {
            s2tVar4 = ((u5k1) s2tVar3).N0;
        } else {
            s2tVar4 = s2tVar;
        }
        if (s2tVar4 == null) {
            s2tVar4 = "";
        }
        return new g5k1(obj3, str, llgVar, xidVar.n(llgVar, j2, true, s2tVar4));
        w4k1Var = w4k1Var;
        dxyVar = dxyVar;
        str = (String) objQ;
        this.g = s2tVar;
        this.a = s2tVar;
        this.b = l2tVarQ2;
        this.c = str;
        this.e = j;
        this.f = (byte) 2;
        objE = l2tVarQ.E(this);
        if (objE != d9nVar) {
            obj2 = ((e331) objE).a;
            this.g = s2tVar;
            this.a = s2tVar;
            this.b = s2tVar;
            this.c = str;
            this.d = obj2;
            this.e = j;
            this.f = (byte) 3;
            objE2 = l2tVarQ2.E(this);
            if (objE2 != d9nVar) {
                obj3 = obj2;
                j2 = j;
                llg llgVar2 = (llg) objE2;
                il71Var.setAttribute("result", "success");
                xid xidVar2 = (xid) dxyVar.f;
                s2tVar2 = w4k1Var.a.b.b;
                if (s2tVar2 instanceof u5k1) {
                    s2tVar3 = (u5k1) s2tVar2;
                } else {
                    s2tVar3 = s2tVar;
                }
                if (s2tVar3 != null) {
                    s2tVar4 = ((u5k1) s2tVar3).N0;
                } else {
                    s2tVar4 = s2tVar;
                }
                if (s2tVar4 == null) {
                    s2tVar4 = "";
                }
                return new g5k1(obj3, str, llgVar2, xidVar2.n(llgVar2, j2, true, s2tVar4));
            }
        }
        w4k1Var = w4k1Var;
        dxyVar = dxyVar;
        return d9nVar;
    }
}
