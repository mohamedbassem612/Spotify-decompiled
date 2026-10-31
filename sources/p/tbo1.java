package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class tbo1 implements Runnable {
    public final /* synthetic */ emo1 a;
    public final /* synthetic */ t4p1 b;
    public final /* synthetic */ short c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tbo1(emo1 emo1Var, t4p1 t4p1Var, int i) {
        this.a = emo1Var;
        this.b = t4p1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hfp1 hfp1Var;
        final emo1 emo1Var = this.a;
        final t4p1 t4p1Var = this.b;
        final short s = this.c;
        jvn1 jvn1Var = emo1Var.h;
        if (jvn1Var == null) {
            return;
        }
        synchronized (jvn1Var) {
            final bsd1 bsd1Var = new bsd1();
            pxo1 pxo1Var = jvn1Var.a;
            asd1 asd1VarB = asd1.b();
            asd1VarB.d = new dmj1(pxo1Var, (byte) 14);
            asd1VarB.c = (char) 4501;
            final byte b = 0;
            hfp1 hfp1VarE = pxo1Var.e(0, asd1VarB.a());
            owf1 owf1Var = new owf1(bsd1Var, (byte) 21);
            hfp1VarE.getClass();
            hfp1VarE.d(dsd1.a, owf1Var);
            hfp1VarE.m(new a1g1(bsd1Var, (byte) 19));
            jvn1Var.c.postDelayed(new Runnable() { // from class: p.wun1
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    bsd1 bsd1Var2 = bsd1Var;
                    switch (b2) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            jvn1.d.a("get checkbox consent timed out", new Object[0]);
                            bsd1Var2.d(Boolean.FALSE);
                            break;
                        default:
                            bsd1Var2.c(new IOException("TIMEOUT"));
                            break;
                    }
                }
            }, jvn1Var.b * 1000);
            hfp1Var = bsd1Var.a;
        }
        hfp1Var.n(new h8q0() { // from class: p.ffo1
            public final void onSuccess(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    q4p1 q4p1VarO = t4p1.o(t4p1Var);
                    emo1 emo1Var2 = emo1Var;
                    String str = emo1Var2.d;
                    q4p1VarO.a();
                    ((t4p1) q4p1VarO.b).r(str);
                    q4p1VarO.a();
                    ((t4p1) q4p1VarO.b).s(str);
                    Long l = emo1Var2.e;
                    if (l != null) {
                        int iLongValue = (int) l.longValue();
                        q4p1VarO.a();
                        ((t4p1) q4p1VarO.b).t(iLongValue);
                    }
                    t4p1 t4p1Var2 = (t4p1) q4p1VarO.b();
                    int i = emo1Var2.i;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    int i3 = s - 1;
                    xnw0 xnw0Var = xnw0.b;
                    r09 r09Var = (i2 == 0 || i2 != 1) ? new r09(Integer.valueOf(i3), t4p1Var2, xnw0Var) : new r09(Integer.valueOf(i3), t4p1Var2, xnw0.a);
                    emo1.j.a("analytics event: %s", new Object[]{r09Var});
                    iog1 iog1Var = emo1Var2.g;
                    if (iog1Var != null) {
                        iog1Var.b(r09Var);
                    }
                }
            }
        });
    }
}
