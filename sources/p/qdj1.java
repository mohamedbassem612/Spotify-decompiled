package p;

import android.content.res.Resources;
import android.view.View;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qdj1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qdj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r7
      0x00c2: PHI (r7v3 double) = (r7v2 double), (r7v4 double) binds: [B:32:0x00cd, B:27:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final void accept(Object obj) {
        int streamMaxVolume;
        double d;
        ti tiVar;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ywv0 ywv0Var = (ywv0) obj2;
                int iOrdinal = ((odj1) obj).ordinal();
                if (iOrdinal == 0) {
                    ou80 ou80Var = (ou80) obj3;
                    e7p0 e7p0Var = (e7p0) ywv0Var.c;
                    if (ou80Var == null) {
                        e7p0Var.c();
                    } else {
                        e7p0.d(e7p0Var, ou80Var);
                    }
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    ((kt91) ywv0Var.a).k(new er91((fs91) null, ((Resources) ywv0Var.b).getString(2131955897), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
            case 1:
                krk1 krk1Var = (krk1) obj;
                x6m0 x6m0Var = (x6m0) obj3;
                String str = krk1Var.b;
                qrk1 qrk1Var = krk1Var.a;
                if (qrk1Var instanceof ork1) {
                    try {
                        streamMaxVolume = ((onr) obj2).a.a.getStreamMaxVolume(3);
                    } catch (NullPointerException unused) {
                        streamMaxVolume = 0;
                    }
                    double d2 = 1.0d;
                    double d3 = 1.0d / ((double) streamMaxVolume);
                    ork1 ork1Var = (ork1) qrk1Var;
                    double d4 = ork1Var.a;
                    int iC = l1d.C(ork1Var.b);
                    if (iC != 0) {
                        if (iC != 1) {
                            eg.o();
                        } else {
                            d = d4 + d3;
                            if (d <= 1.0d) {
                                d2 = d;
                            }
                        }
                        break;
                    } else {
                        d = d4 - d3;
                        if (d < 0.0d) {
                            d2 = 0.0d;
                        } else {
                            d2 = d;
                        }
                    }
                    x6m0Var.g(d2, str, true);
                } else if (!(qrk1Var instanceof prk1)) {
                    eg.o();
                } else {
                    prk1 prk1Var = (prk1) qrk1Var;
                    x6m0Var.g(prk1Var.a, str, prk1Var.b);
                }
                break;
            case 2:
                ((n7m0) obj3).invoke(String.format("\nwindow.spotifyWebView &&\nwindow.spotifyWebView.postMessage &&\nwindow.spotifyWebView.postMessage(%s);\n", Arrays.copyOf(new Object[]{((j1l1) obj2).c.b(((y0l1) obj).a)}, 1)), (Object) null);
                break;
            default:
                r981 r981Var = (s981) obj;
                jme jmeVar = (jme) obj3;
                igl1 igl1Var = (igl1) obj2;
                if (r981Var instanceof r981) {
                    hhr hhrVar = igl1Var.g;
                    String str2 = (String) jmeVar.b;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-wear-app-onboarding-notification";
                    x6h1VarI.f = "2.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.e = str2;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    i8h1 i8h1Var = hhrVar.a;
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    if (jmeVar instanceof khl1) {
                        tiVar = mhl1.b;
                    } else if (!(jmeVar instanceof lhl1)) {
                        eg.o();
                    } else {
                        tiVar = nhl1.c;
                    }
                    igl1Var.a(tiVar);
                    igl1Var.j = r981Var.a;
                }
                break;
        }
    }
}
