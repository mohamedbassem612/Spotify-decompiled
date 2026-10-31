package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vqm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ o95 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqm(o95 o95Var, long j, o95 o95Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = j;
        this.e = o95Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new vqm(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new vqm(this.c, this.d, this.e, lnmVar, (byte) 1);
            default:
                return new vqm(this.c, this.d, this.e, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        long j = this.d;
        o95 o95Var = this.c;
        o95 o95Var2 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int i = (int) (j >> 32);
                int i2 = (int) (j & 4294967295L);
                if (Math.abs(Float.intBitsToFloat(i) + ((Number) o95Var.e()).floatValue()) > Math.abs(Float.intBitsToFloat(i2) + ((Number) o95Var2.e()).floatValue())) {
                    Float f = new Float(Float.intBitsToFloat(i) + ((Number) o95Var.e()).floatValue());
                    this.b = (byte) 1;
                    if (o95Var.g(f, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f2 = new Float(Float.intBitsToFloat(i2) + ((Number) o95Var2.e()).floatValue());
                    this.b = (byte) 2;
                    if (o95Var2.g(f2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    Float f3 = new Float(Float.intBitsToFloat((int) (j >> 32)) + ((Number) o95Var.e()).floatValue());
                    this.b = (byte) 1;
                    if (o95Var.g(f3, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f4 = new Float(Float.intBitsToFloat((int) (j & 4294967295L)) + ((Number) o95Var2.e()).floatValue());
                this.b = (byte) 2;
                if (o95Var2.g(f4, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                if (Math.abs(Float.intBitsToFloat(i3) + ((Number) o95Var.e()).floatValue()) > Math.abs(Float.intBitsToFloat(i4) + ((Number) o95Var2.e()).floatValue())) {
                    Float f5 = new Float(Float.intBitsToFloat(i3) + ((Number) o95Var.e()).floatValue());
                    this.b = (byte) 1;
                    if (o95Var.g(f5, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f6 = new Float(Float.intBitsToFloat(i4) + ((Number) o95Var2.e()).floatValue());
                    this.b = (byte) 2;
                    if (o95Var2.g(f6, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}
