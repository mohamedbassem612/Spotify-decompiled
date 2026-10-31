package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ade1 extends z031 implements vu30 {
    public final /* synthetic */ String X;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y9e1 d;
    public final /* synthetic */ cde1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade1(y9e1 y9e1Var, cde1 cde1Var, float f, float f2, Function0 function0, Function0 function1, iu30 iu30Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = y9e1Var;
        this.e = cde1Var;
        this.f = f;
        this.g = f2;
        this.h = function0;
        this.i = function1;
        this.t = iu30Var;
        this.X = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ade1 ade1Var = new ade1(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        ade1Var.c = obj;
        return ade1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        rih1 rih1Var;
        cde1 cde1Var = this.e;
        err0 err0Var = cde1Var.b;
        err0 err0Var2 = cde1Var.a;
        i8d1 i8d1Var = (i8d1) this.c;
        byte b = this.b;
        String str = this.X;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                objB = obj;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rih1Var = rih1Var2;
            }
            this.i.invoke();
            if (cde1Var.b()) {
                return rih1Var;
            }
            this.t.invoke(str.substring(err0Var2.s(), err0Var.s()));
            return rih1Var;
        }
        hm5.M(obj);
        this.c = i8d1Var;
        this.b = (byte) 1;
        objB = rqd1.b(i8d1Var, this, 2);
        if (objB == d9nVar) {
            return d9nVar;
        }
        hav0 hav0Var = (hav0) objB;
        y9e1 y9e1Var = this.d;
        if (y9e1Var == null || !cde1Var.b()) {
            return rih1Var2;
        }
        int length = y9e1Var.a.a.b.length() - 1;
        n511 n511VarB = y9e1Var.b(yoi1.p(err0Var2.s(), 0, length));
        n511 n511VarB2 = y9e1Var.b(yoi1.p(err0Var.s() - 1, 0, length));
        float f = n511VarB.a;
        float f2 = n511VarB.b;
        float f3 = this.f;
        rih1Var = rih1Var2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2 - f3)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(n511VarB2.d + f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(n511VarB2.c)) << 32);
        float fD = Offset.d(Offset.f(hav0Var.c, jFloatToRawIntBits));
        float fD2 = Offset.d(Offset.f(hav0Var.c, jFloatToRawIntBits2));
        float f4 = this.g;
        boolean z = fD < f4 && (fD2 >= f4 || fD <= fD2);
        boolean z2 = !z && fD2 < f4;
        if (!z && !z2) {
            return rih1Var;
        }
        hav0Var.a();
        this.h.invoke();
        long j = hav0Var.a;
        eu91 eu91Var = new eu91(y9e1Var, z, cde1Var, str, (byte) 2);
        this.c = null;
        this.b = (byte) 2;
        if (g5v.m(i8d1Var, j, eu91Var, this) == d9nVar) {
            return d9nVar;
        }
        this.i.invoke();
        if (cde1Var.b()) {
            return rih1Var;
        }
        this.t.invoke(str.substring(err0Var2.s(), err0Var.s()));
        return rih1Var;
    }
}
