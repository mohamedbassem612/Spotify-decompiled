package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hoo1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xoo1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ vi01 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoo1(long j, xoo1 xoo1Var, vi01 vi01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = j;
        this.d = xoo1Var;
        this.f = vi01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hoo1 hoo1Var = new hoo1(this.e, this.d, this.f, lnmVar);
                hoo1Var.c = obj;
                return hoo1Var;
            default:
                hoo1 hoo1Var2 = new hoo1(this.d, this.e, this.f, lnmVar);
                hoo1Var2.c = obj;
                return hoo1Var2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: Exception -> 0x0016, zzhm -> 0x0098, TryCatch #4 {zzhm -> 0x0098, Exception -> 0x0016, blocks: (B:7:0x0012, B:28:0x0078, B:31:0x0082, B:32:0x0089, B:12:0x001e, B:25:0x0067, B:15:0x002a, B:17:0x003b, B:21:0x004c, B:23:0x0055, B:34:0x008b), top: B:61:0x000e }] */
    public final Object invokeSuspend(Object obj) throws zzhm {
        zwo1 zwo1Var;
        rvo1 rvo1Var;
        byte b = this.a;
        String str = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byte b2 = this.b;
                try {
                    if (b2 != 0) {
                        if (b2 != 1) {
                            hm5.M(obj);
                        } else {
                            zwo1Var = (zwo1) this.c;
                            hm5.M(obj);
                        }
                        return new e331(obj);
                    }
                    hm5.M(obj);
                    zwo1Var = (zwo1) this.c;
                    long j = this.e;
                    zwo1Var.e = j;
                    xoo1 xoo1Var = this.d;
                    vi01 vi01Var = this.f;
                    this.c = zwo1Var;
                    this.b = (byte) 1;
                    obj = new nwo1(9, new hoo1(xoo1Var, j, vi01Var, (lnm) null), null);
                    if (obj == str) {
                        return str;
                    }
                    this.c = null;
                    this.b = (byte) 2;
                    obj = ((nwo1) obj).a(zwo1Var, this);
                    if (obj == str) {
                        return str;
                    }
                } catch (zzhm e) {
                    obj = new m231(e.c());
                }
                return new e331(obj);
            default:
                byte b3 = this.b;
                tgo1 tgo1Var = tgo1.c;
                try {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            hm5.M(obj);
                        } else {
                            rvo1Var = (rvo1) this.c;
                            hm5.M(obj);
                        }
                        str = (String) obj;
                        if (str.length() == 0) {
                            return str;
                        }
                        throw new zzhm(tgo1Var, ij81.N1, null, null);
                    }
                    hm5.M(obj);
                    rvo1Var = (rvo1) this.c;
                    long j2 = this.e;
                    vi01 vi01Var2 = this.f;
                    se11 se11Var = uno1.a;
                    vi01Var2.getClass();
                    zzhm zzhmVar = !se11Var.e("mobile_client/authentication") ? new zzhm(tgo1.h, ij81.X, null, null) : null;
                    if (j2 < 5000) {
                        zzhmVar = new zzhm(tgo1Var, ij81.P0, null, null);
                    }
                    if (zzhmVar != null) {
                        throw zzhmVar;
                    }
                    eto1 eto1Var = this.d.a;
                    String str2 = rvo1Var.a.d;
                    this.c = rvo1Var;
                    this.b = (byte) 1;
                    obj = eto1Var.b(str2, vi01Var2, j2);
                    if (obj != str) {
                    }
                    return str;
                    this.c = null;
                    this.b = (byte) 2;
                    obj = ((qwo1) obj).a.invoke(rvo1Var.a, this);
                    if (obj != str) {
                        str = (String) obj;
                        if (str.length() == 0) {
                            throw new zzhm(tgo1Var, ij81.N1, null, null);
                        }
                    }
                    return str;
                } catch (zzhm e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new zzhm(tgo1Var, ij81.T0, e3.getMessage(), null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoo1(xoo1 xoo1Var, long j, vi01 vi01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = xoo1Var;
        this.e = j;
        this.f = vi01Var;
    }
}
