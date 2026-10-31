package p;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class trb1 implements car {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final dqq0 c;
    public final k261 d;

    public trb1(ImageDecoder.Source source, AutoCloseable autoCloseable, dqq0 dqq0Var, k261 k261Var) {
        this.a = source;
        this.b = autoCloseable;
        this.c = dqq0Var;
        this.d = k261Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.car
    public final Object a(lnm lnmVar) {
        srb1 srb1Var;
        k261 k261Var;
        if (lnmVar instanceof srb1) {
            srb1Var = (srb1) lnmVar;
            int i = srb1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                srb1Var.d = i - Integer.MIN_VALUE;
            } else {
                srb1Var = new srb1(this, (onm) lnmVar);
            }
        } else {
            srb1Var = new srb1(this, (onm) lnmVar);
        }
        Object obj = srb1Var.b;
        int i2 = srb1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            k261 k261Var2 = this.d;
            srb1Var.a = k261Var2;
            srb1Var.d = 1;
            Object objB = k261Var2.b(srb1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
            k261Var = k261Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k261Var = srb1Var.a;
            hm5.M(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                l811 l811Var = new l811();
                y9r y9rVar = new y9r(x2p1.i(ImageDecoder.decodeBitmap(this.a, new ob5(this, l811Var, (byte) 1))), l811Var.a);
                o0c.v(autoCloseable, (Throwable) null);
                k261Var.e();
                return y9rVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o0c.v(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            k261Var.e();
            throw th3;
        }
    }
}
