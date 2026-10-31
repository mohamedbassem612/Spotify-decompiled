package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m1o1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public rvo1 b;
    public byte c;
    public final /* synthetic */ rvo1 d;
    public final /* synthetic */ p811 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ rin1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1o1(rvo1 rvo1Var, Object obj, rin1 rin1Var, p811 p811Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.d = rvo1Var;
        this.f = obj;
        this.g = rin1Var;
        this.e = p811Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        tmn1 tmn1Var = this.g;
        Object obj = this.f;
        switch (b) {
            case 0:
                return new m1o1(this.d, (dzp0) obj, (xmn1) tmn1Var, this.e, lnmVar, (byte) 0);
            default:
                return new m1o1(this.d, (cik1) obj, tmn1Var, this.e, lnmVar, (byte) 1);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: zzhm -> 0x001c, TryCatch #0 {zzhm -> 0x001c, blocks: (B:7:0x0018, B:21:0x004c, B:23:0x0059, B:25:0x0065, B:26:0x0068, B:27:0x0069, B:28:0x0072, B:12:0x0020, B:18:0x003b, B:15:0x0027), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[Catch: zzhm -> 0x001c, TryCatch #0 {zzhm -> 0x001c, blocks: (B:7:0x0018, B:21:0x004c, B:23:0x0059, B:25:0x0065, B:26:0x0068, B:27:0x0069, B:28:0x0072, B:12:0x0020, B:18:0x003b, B:15:0x0027), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: zzhm -> 0x001c, TryCatch #0 {zzhm -> 0x001c, blocks: (B:7:0x0018, B:21:0x004c, B:23:0x0059, B:25:0x0065, B:26:0x0068, B:27:0x0069, B:28:0x0072, B:12:0x0020, B:18:0x003b, B:15:0x0027), top: B:53:0x0014 }] */
    public final Object invokeSuspend(Object obj) throws zzhm {
        tgo1 tgo1Var;
        ij81 ij81Var;
        int iC;
        byte b = this.a;
        p811 p811Var = this.e;
        tmn1 tmn1Var = this.g;
        Object obj2 = this.f;
        rvo1 rvo1Var = this.d;
        umn1 umn1Var = d9n.a;
        lnm lnmVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                byte b3 = this.c;
                try {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            hm5.M(obj);
                        } else {
                            rvo1Var = this.b;
                            hm5.M(obj);
                        }
                        return (ymn1) obj;
                    }
                    hm5.M(obj);
                    this.b = rvo1Var;
                    this.c = (byte) 1;
                    obj = smo1.s(new g1o1((dzp0) obj2, (xmn1) tmn1Var, lnmVar, b2), this);
                    if (obj == umn1Var) {
                        return umn1Var;
                    }
                    this.b = null;
                    this.c = (byte) 2;
                    obj = ((nwo1) obj).a(rvo1Var.a(), this);
                    if (obj == umn1Var) {
                        return umn1Var;
                    }
                    return (ymn1) obj;
                } catch (zzhm e) {
                    p811Var.a = e;
                    throw e;
                }
            default:
                byte b4 = this.c;
                try {
                    if (b4 == 0) {
                        hm5.M(obj);
                        this.b = rvo1Var;
                        this.c = (byte) 1;
                        obj = smo1.s(new mto1((cik1) obj2, tmn1Var, lnmVar, b2), this);
                        if (obj == umn1Var) {
                        }
                        return umn1Var;
                    }
                    if (b4 != 1) {
                        hm5.M(obj);
                    } else {
                        rvo1Var = this.b;
                        hm5.M(obj);
                    }
                    umn1Var = (umn1) obj;
                    if (umn1Var.x().length() == 0) {
                        tgo1Var = tgo1.c;
                        ij81Var = ij81.N1;
                        iC = umn1Var.C();
                        if (iC == 1) {
                            throw new zzhm(tgo1Var, ij81Var, String.valueOf(iC - 2), (Exception) null);
                        }
                        xin1.a();
                        throw null;
                    }
                    return umn1Var;
                    this.b = null;
                    this.c = (byte) 2;
                    obj = ((nwo1) obj).a(rvo1Var.a(), this);
                    if (obj != umn1Var) {
                        umn1Var = (umn1) obj;
                        if (umn1Var.x().length() == 0) {
                            tgo1Var = tgo1.c;
                            ij81Var = ij81.N1;
                            iC = umn1Var.C();
                            if (iC == 1) {
                                throw new zzhm(tgo1Var, ij81Var, String.valueOf(iC - 2), (Exception) null);
                            }
                            xin1.a();
                            throw null;
                        }
                    }
                    return umn1Var;
                } catch (zzhm e2) {
                    p811Var.a = e2;
                    throw e2;
                }
        }
    }
}
