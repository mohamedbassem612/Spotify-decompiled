package p;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b9l extends a8d1 implements vu30 {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public long b;
    public byte c;
    public int d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9l(long j, vgn0 vgn0Var, p811 p811Var, p811 p811Var2, ssw0 ssw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = j;
        this.f = vgn0Var;
        this.i = p811Var;
        this.t = p811Var2;
        this.Y = ssw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                return new b9l(this.b, (vgn0) this.f, (p811) this.i, (p811) obj3, (ssw0) obj2, lnmVar);
            default:
                b9l b9lVar = new b9l((l041) obj3, (String) this.X, this.d, (hkm1) obj2, lnmVar);
                b9lVar.i = obj;
                return b9lVar;
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

    /* JADX WARN: Code duplicated, block: B:56:0x01b1 A[Catch: all -> 0x01cc, TryCatch #1 {all -> 0x01cc, blocks: (B:63:0x01cf, B:54:0x01ad, B:56:0x01b1), top: B:70:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c5  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        p811 p811Var;
        int i;
        vgn0 vgn0Var;
        ssw0 ssw0Var;
        p811 p811Var2;
        Object obj2;
        p811 p811Var3;
        p811 p811Var4;
        vgn0 vgn0Var2;
        Throwable th;
        long j;
        s2t s2tVarQ;
        Object objQ;
        Object objE;
        long j2;
        gzl1 gzl1Var;
        Integer num;
        c380 c380Var;
        byte b = this.a;
        Object obj3 = this.Y;
        d9n d9nVar = d9n.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            i = this.d;
                            ssw0Var = (ssw0) this.X;
                            p811Var2 = (p811) this.h;
                            p811Var = (p811) this.g;
                            vgn0Var = (vgn0) this.e;
                            hm5.M(obj);
                            try {
                                obj2 = p811Var.a;
                                if (obj2 != null) {
                                    this.e = vgn0Var;
                                    this.g = p811Var;
                                    this.h = p811Var2;
                                    this.X = null;
                                    this.d = i;
                                    this.c = (byte) 3;
                                    if (ssw0Var.b(obj2, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                    p811Var3 = p811Var2;
                                    p811Var4 = p811Var;
                                    vgn0Var2 = vgn0Var;
                                }
                                p811Var.a = null;
                                p811Var2.a = null;
                                vgn0Var.c((Object) null);
                                return rih1.a;
                            } catch (Throwable th2) {
                                th = th2;
                                vgn0Var2 = vgn0Var;
                                vgn0Var2.c((Object) null);
                                throw th;
                            }
                        }
                        if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p811Var3 = (p811) this.h;
                        p811Var4 = (p811) this.g;
                        vgn0Var2 = (vgn0) this.e;
                        try {
                            hm5.M(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            vgn0Var2.c((Object) null);
                            throw th;
                        }
                        break;
                    } else {
                        hm5.M(obj);
                    }
                    vgn0Var = vgn0Var2;
                    p811Var = p811Var4;
                    p811Var2 = p811Var3;
                    p811Var.a = null;
                    p811Var2.a = null;
                    vgn0Var.c((Object) null);
                    return rih1.a;
                }
                hm5.M(obj);
                long j3 = this.b;
                this.c = (byte) 1;
                if (hap1.i(j3, this) == d9nVar) {
                    return d9nVar;
                }
                vgn0 vgn0Var3 = (vgn0) this.f;
                p811Var = (p811) this.i;
                p811 p811Var5 = (p811) obj4;
                ssw0 ssw0Var2 = (ssw0) obj3;
                this.e = vgn0Var3;
                this.g = p811Var;
                this.h = p811Var5;
                this.X = ssw0Var2;
                i = 0;
                this.d = 0;
                this.c = (byte) 2;
                if (vgn0Var3.a(this) == d9nVar) {
                    return d9nVar;
                }
                vgn0Var = vgn0Var3;
                ssw0Var = ssw0Var2;
                p811Var2 = p811Var5;
                obj2 = p811Var.a;
                if (obj2 != null) {
                    this.e = vgn0Var;
                    this.g = p811Var;
                    this.h = p811Var2;
                    this.X = null;
                    this.d = i;
                    this.c = (byte) 3;
                    if (ssw0Var.b(obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                    p811Var3 = p811Var2;
                    p811Var4 = p811Var;
                    vgn0Var2 = vgn0Var;
                    vgn0Var = vgn0Var2;
                    p811Var = p811Var4;
                    p811Var2 = p811Var3;
                }
                p811Var.a = null;
                p811Var2.a = null;
                vgn0Var.c((Object) null);
                return rih1.a;
            default:
                l041 l041Var = (l041) obj4;
                yqg yqgVar = l041Var.e;
                c9n c9nVar = (c9n) this.i;
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 == 1) {
                        j = this.b;
                        s2tVarQ = (s2t) this.e;
                        hm5.M(obj);
                        objQ = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j4 = this.b;
                        c380 c380Var2 = (c380) this.h;
                        Integer num2 = (Integer) this.g;
                        gzl1 gzl1Var2 = (gzl1) this.f;
                        hm5.M(obj);
                        c380Var = c380Var2;
                        num = num2;
                        j2 = j4;
                        gzl1Var = gzl1Var2;
                        objE = obj;
                    }
                    return new wz31(gzl1Var, num, c380Var, mqo1.A((Iterable) objE), fg91.b, "", j2, yqgVar.g());
                }
                hm5.M(obj);
                long jB = yqgVar.b();
                voe1 voe1VarB = l041Var.f.b();
                long j5 = l041.g;
                long j6 = voe1VarB.a;
                int i2 = sjm0.b;
                voe1 voe1Var = new voe1(kkn.x(j6, j5));
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new zz31(l041Var, (String) this.X, (lnm) null, (byte) 1), 3);
                hkm1 hkm1Var = (hkm1) obj3;
                j = jB;
                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new tv1(l041Var, (String) this.X, this.d, hkm1Var, voe1Var, (lnm) null, (byte) 8), 3);
                this.i = null;
                this.e = s2tVarQ;
                this.b = j;
                this.c = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                Iterable iterable = (Iterable) objQ;
                int iS = zno1.s(q7h.U(iterable, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj5 : iterable) {
                    linkedHashMap.put(((wwx0) obj5).a, obj5);
                }
                gzl1.Companion.getClass();
                gzl1 gzl1VarA = fzl1.a(linkedHashMap);
                wwx0 wwx0Var = (wwx0) linkedHashMap.get("duration");
                Integer numC0 = wwx0Var != null ? nhc1.c0(wwx0Var.b) : null;
                wwx0 wwx0Var2 = (wwx0) linkedHashMap.get("genre");
                vp70 vp70Var = l041.h;
                c380 c380VarA = mqo1.A(l041Var.a(wwx0Var2));
                this.i = null;
                this.e = null;
                this.f = gzl1VarA;
                this.g = numC0;
                this.h = c380VarA;
                this.b = j;
                this.c = (byte) 2;
                objE = s2tVarQ.E(this);
                if (objE == d9nVar) {
                    return d9nVar;
                }
                j2 = j;
                gzl1Var = gzl1VarA;
                num = numC0;
                c380Var = c380VarA;
                return new wz31(gzl1Var, num, c380Var, mqo1.A((Iterable) objE), fg91.b, "", j2, yqgVar.g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9l(l041 l041Var, String str, int i, hkm1 hkm1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = l041Var;
        this.X = str;
        this.d = i;
        this.Y = hkm1Var;
    }
}
