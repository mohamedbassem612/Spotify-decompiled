package p;

import com.google.android.recaptcha.internal.zzhm;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class evn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ cwn1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ sln1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evn1(long j, cwn1 cwn1Var, String str, sln1 sln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = j;
        this.e = cwn1Var;
        this.f = str;
        this.g = sln1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                evn1 evn1Var = new evn1(this.e, this.f, this.g, this.d, lnmVar);
                evn1Var.c = obj;
                return evn1Var;
            default:
                evn1 evn1Var2 = new evn1(this.d, this.e, this.f, this.g, lnmVar);
                evn1Var2.c = obj;
                return evn1Var2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws zzhm {
        zwo1 zwo1Var;
        byte b = this.a;
        rih1 rih1Var = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                cwn1 cwn1Var = this.e;
                try {
                    if (b2 != 0) {
                        if (b2 != 1) {
                            if (b2 == 2) {
                                hm5.M(obj);
                                obj = (pmn1) obj;
                            } else {
                                hm5.M(obj);
                            }
                            break;
                        } else {
                            zwo1Var = (zwo1) this.c;
                            hm5.M(obj);
                        }
                        return new e331(obj);
                    }
                    hm5.M(obj);
                    zwo1Var = (zwo1) this.c;
                    if (!cwn1Var.a) {
                        return new e331(pmn1.y());
                    }
                    String str = this.f;
                    sln1 sln1Var = this.g;
                    long j = this.d;
                    this.c = zwo1Var;
                    this.b = (byte) 1;
                    rih1 nwo1Var = new nwo1(cwn1Var.e(), new evn1(j, cwn1Var, str, sln1Var, (lnm) null), (Integer) null);
                    if (nwo1Var == rih1Var) {
                        return rih1Var;
                    }
                    obj = nwo1Var;
                    this.c = null;
                    this.b = (byte) 2;
                    obj = ((nwo1) obj).a(zwo1Var, this);
                    if (obj == rih1Var) {
                        return rih1Var;
                    }
                    obj = (pmn1) obj;
                    break;
                } catch (Exception unused) {
                    this.c = null;
                    this.b = (byte) 3;
                    obj = cwn1Var.c(this.f);
                    if (obj == rih1Var) {
                        return rih1Var;
                    }
                }
                return new e331(obj);
            default:
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        rvo1 rvo1Var = (rvo1) this.c;
                        long j2 = this.d;
                        z0i1 z0i1Var = new z0i1(rvo1Var, this.e, this.f, this.g, (lnm) null, (byte) 6);
                        this.b = (byte) 1;
                        obj = rc2.M(j2, z0i1Var, this);
                        if (obj == rih1Var) {
                            return rih1Var;
                        }
                    } else {
                        if (b3 != 1) {
                            zzhm zzhmVar = (zzhm) this.c;
                            hm5.M(obj);
                            throw zzhmVar;
                        }
                        hm5.M(obj);
                    }
                    Object obj2 = ((e331) obj).a;
                    hm5.M(obj2);
                    return (pmn1) obj2;
                } catch (Exception e) {
                    ij81 ij81Var = ij81.W0;
                    String message = e.getMessage();
                    tgo1 tgo1Var = tgo1.c;
                    zzhm zzhmVar2 = new zzhm(tgo1Var, ij81Var, message, (Exception) null);
                    if (e instanceof TimeoutCancellationException) {
                        zzhmVar2 = new zzhm(tgo1Var, ij81.e, e.getMessage(), (Exception) null);
                    } else if (e instanceof zzhm) {
                        zzhmVar2 = e;
                    }
                    this.c = zzhmVar2;
                    this.b = (byte) 2;
                    if (rih1.a == rih1Var) {
                        return rih1Var;
                    }
                    throw zzhmVar2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evn1(cwn1 cwn1Var, String str, sln1 sln1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.e = cwn1Var;
        this.f = str;
        this.g = sln1Var;
        this.d = j;
    }
}
