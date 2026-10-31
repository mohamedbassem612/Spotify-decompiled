package p;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rb5 implements car {
    public final a080 a;
    public final dqq0 b;
    public final boolean c;

    public rb5(a080 a080Var, dqq0 dqq0Var, boolean z) {
        this.a = a080Var;
        this.b = dqq0Var;
        this.c = z;
    }

    public static final Drawable b(rb5 rb5Var, l811 l811Var) {
        a080 a080VarL = ucp1.l(rb5Var.a, rb5Var.c);
        try {
            ImageDecoder.Source sourceJ = d55.j(a080VarL, rb5Var.b, true);
            if (sourceJ == null) {
                gbc gbcVarD1 = a080VarL.d1();
                try {
                    gbcVarD1.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) gbcVarD1.k().b);
                    while (!gbcVarD1.k().z0()) {
                        gbcVarD1.k().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    gbcVarD1.close();
                    sourceJ = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(gbcVarD1, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceJ, new ob5(rb5Var, l811Var, (byte) 0));
            o0c.v(a080VarL, (Throwable) null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o0c.v(a080VarL, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) {
        nb5 nb5Var;
        l811 l811VarY;
        Object objU;
        l811 l811Var;
        if (lnmVar instanceof nb5) {
            nb5Var = (nb5) lnmVar;
            int i = nb5Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                nb5Var.d = i - os00.INVALID_ID;
            } else {
                nb5Var = new nb5(this, (onm) lnmVar);
            }
        } else {
            nb5Var = new nb5(this, (onm) lnmVar);
        }
        Object obj = nb5Var.b;
        int i2 = nb5Var.d;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            l811VarY = l1d.y(obj);
            og ogVar = new og(this, l811VarY, (byte) 6);
            nb5Var.a = l811VarY;
            nb5Var.d = 1;
            objU = k4k.u(ogVar, nb5Var);
            if (objU != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            l811 l811Var2 = nb5Var.a;
            hm5.M(obj);
            objU = obj;
            l811VarY = l811Var2;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l811Var = nb5Var.a;
            hm5.M(obj);
        }
        return new y9r(x2p1.h((Drawable) obj), l811Var.a);
        nb5Var.a = l811VarY;
        nb5Var.d = 2;
        Object objC = c((Drawable) objU, nb5Var);
        if (objC != obj2) {
            l811 l811Var3 = l811VarY;
            obj = objC;
            l811Var = l811Var3;
            return new y9r(x2p1.h((Drawable) obj), l811Var.a);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Drawable drawable, onm onmVar) {
        pb5 pb5Var;
        if (onmVar instanceof pb5) {
            pb5Var = (pb5) onmVar;
            int i = pb5Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                pb5Var.d = i - os00.INVALID_ID;
            } else {
                pb5Var = new pb5(this, onmVar);
            }
        } else {
            pb5Var = new pb5(this, onmVar);
        }
        Object obj = pb5Var.b;
        int i2 = pb5Var.d;
        dqq0 dqq0Var = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            jc10 jc10Var = vpb1.a;
            if (((Number) kto1.v(dqq0Var, jc10Var)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) kto1.v(dqq0Var, jc10Var)).intValue());
            }
            Function0 function0 = (Function0) kto1.v(dqq0Var, vpb1.c);
            Function0 function1 = (Function0) kto1.v(dqq0Var, vpb1.d);
            if (function0 != null || function1 != null) {
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a.f;
                qb5 qb5Var = new qb5(drawable, function0, function1, (lnm) null);
                pb5Var.a = drawable;
                pb5Var.d = 1;
                Object objY = fn31.Y(bs50Var, qb5Var, pb5Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) pb5Var.a;
            hm5.M(obj);
        }
        return new kg41(drawable, dqq0Var.c);
    }
}
