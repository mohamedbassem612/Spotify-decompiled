package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oro1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ n811 b;
    public final /* synthetic */ zwo1 c;
    public final /* synthetic */ yro1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ayh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oro1(n811 n811Var, zwo1 zwo1Var, yro1 yro1Var, long j, ayh ayhVar, lnm lnmVar) {
        super(1, lnmVar);
        this.b = n811Var;
        this.c = zwo1Var;
        this.d = yro1Var;
        this.e = j;
        this.f = ayhVar;
    }

    public final lnm create(lnm lnmVar) {
        return new oro1(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        hm5.M(obj);
        if (z) {
            return obj;
        }
        this.b.a++;
        vu30 mugVar = new mug(this.e, this.f, (lnm) null, this.d);
        this.a = true;
        Object objD = this.c.d(41, null, mugVar, this);
        d9n d9nVar = d9n.a;
        return objD == d9nVar ? d9nVar : objD;
    }
}
