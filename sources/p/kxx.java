package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kxx extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxx(t24 t24Var, float f, cjx cjxVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = t24Var;
        this.b = f;
        this.d = cjxVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        float f = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new kxx((t24) this.c, f, (cjx) obj2, lnmVar);
            case 1:
                kxx kxxVar = new kxx((m811) obj2, f, lnmVar);
                kxxVar.c = obj;
                return kxxVar;
            case 2:
                return new kxx(this.b, this.c, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                return new kxx((err0) this.c, obj2, this.b, lnmVar, (byte) 3);
            case 4:
                return new kxx((err0) this.c, obj2, this.b, lnmVar, (byte) 4);
            case 5:
                return new kxx((err0) this.c, obj2, this.b, lnmVar, (byte) 5);
            default:
                return new kxx(this.b, this.c, (ven0) obj2, lnmVar, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                t24 t24Var = (t24) this.c;
                if (t24Var.l.getValue() == null && f != 0.0f) {
                    cjx cjxVar = (cjx) obj2;
                    if (t24Var.i.getValue() != w3v.b) {
                        cjxVar.a(3);
                    } else {
                        cjxVar.a(4);
                    }
                }
                break;
            case 1:
                hm5.M(obj);
                ((m811) obj2).a = ((bs41) this.c).f(f);
                break;
            case 2:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                if (!yr80.b(((yr80) ven0Var.getValue()).a, 0L)) {
                    int i = (int) (((int) (((yr80) ven0Var.getValue()).a >> 32)) / f);
                    int i2 = (int) (((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) / f);
                    if (i > 0 && i2 > 0) {
                        ((vu30) this.c).invoke(new Integer(i), new Integer(i2));
                    }
                }
                break;
            case 3:
                hm5.M(obj);
                if (((err0) this.c).s() > 0) {
                    ((fyg1) obj2).d.invoke(new Float(f));
                }
                break;
            case 4:
                hm5.M(obj);
                if (((err0) this.c).s() > 0) {
                    ((iu30) obj2).invoke(new Float(f));
                }
                break;
            case 5:
                hm5.M(obj);
                if (((err0) this.c).s() > 0) {
                    ((lcf1) obj2).h.invoke(new Float(f));
                }
                break;
            default:
                hm5.M(obj);
                if (!((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    ((drr0) obj2).t(f);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxx(float f, Object obj, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = f;
        this.c = obj;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxx(err0 err0Var, Object obj, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = err0Var;
        this.d = obj;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxx(m811 m811Var, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = m811Var;
        this.b = f;
    }
}
