package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ktn0 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ float b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ o95 f;
    public final /* synthetic */ ceo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktn0(float f, o95 o95Var, long j, long j2, o95 o95Var2, ceo ceoVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = f;
        this.c = o95Var;
        this.d = j;
        this.e = j2;
        this.f = o95Var2;
        this.g = ceoVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        ktn0 ktn0Var = new ktn0(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
        ktn0Var.a = obj;
        return ktn0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ktn0 ktn0Var = (ktn0) create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        ktn0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        ceo ceoVar;
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        float f = this.b;
        int iB = p3v.b(f, 0.0f);
        o95 o95Var = this.f;
        o95 o95Var2 = this.c;
        ceo ceoVar2 = this.g;
        if (iB > 0) {
            Float fO = yah0.o(1.0f);
            jfv jfvVar = new jfv(jfv.p(this.d, this.e));
            if (fO.equals(o95Var2.e())) {
                ceoVar = ceoVar2;
            } else {
                ceoVar = ceoVar2;
                c921.y(c9nVar, (o8n) null, 0, new mug(jfvVar, o95Var2, fO, this.e, ceoVar, (lnm) null), 3);
            }
            p3v p3vVar = new p3v(f);
            if (!p3vVar.equals(o95Var.e())) {
                c921.y(c9nVar, (o8n) null, 0, new mug((jfv) null, o95Var, (Comparable) p3vVar, this.d, ceoVar, (lnm) null), 3);
            }
        } else {
            Float fO2 = yah0.o(0.0f);
            if (!fO2.equals(o95Var2.e())) {
                c921.y(c9nVar, (o8n) null, 0, new mug((jfv) null, o95Var2, fO2, this.e, ceoVar2, (lnm) null), 3);
            }
            p3v p3vVar2 = new p3v(0.0f);
            if (!p3vVar2.equals(o95Var.e())) {
                c921.y(c9nVar, (o8n) null, 0, new mug((jfv) null, o95Var, (Comparable) p3vVar2, this.d, ceoVar2, (lnm) null), 3);
            }
        }
        return rih1.a;
    }
}
