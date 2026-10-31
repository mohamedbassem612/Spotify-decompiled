package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q82 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q82(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new q82((Context) obj2, lnmVar, (byte) 0);
            case 1:
                return new q82((bj5) obj2, lnmVar, (byte) 1);
            case 2:
                return new q82((uya) obj2, lnmVar, (byte) 2);
            case 3:
                return new q82((xya) obj2, lnmVar, (byte) 3);
            case 4:
                return new q82((mxg) obj2, lnmVar, (byte) 4);
            case 5:
                return new q82((gen) obj2, lnmVar, (byte) 5);
            case 6:
                return new q82((ceu) obj2, lnmVar, (byte) 6);
            case 7:
                return new q82((Runnable) obj2, lnmVar, (byte) 7);
            case 8:
                return new q82((km0) obj2, lnmVar, (byte) 8);
            case 9:
                return new q82((wo70) obj2, lnmVar, (byte) 9);
            case 10:
                return new q82((j0f0) obj2, lnmVar, (byte) 10);
            case 11:
                return new q82((Function0) obj2, lnmVar, (byte) 11);
            case 12:
                return new q82((i4o1) obj2, lnmVar, (byte) 12);
            default:
                return new q82((i4o1) obj2, lnmVar, (byte) 13);
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                ((q82) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                ((q82) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                ((q82) create((c8r) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                ((q82) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return ((q82) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((q82) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo((Context) this.b);
                } catch (Exception e) {
                    i1k0.C("Caught getGoogleAdvertisingInfoObject exception: " + e);
                    return null;
                }
            case 1:
                hm5.M(obj);
                yf10 yf10Var = (yf10) ((xf10) ((bj5) this.b).t.get());
                Bundle bundle = (Bundle) ((kf10) ((r7n0) yf10Var.c.get()).b.getValue()).b.getValue();
                String string = bundle != null ? bundle.getString("com.facebook.sdk.ApplicationId") : null;
                if (string == null) {
                    string = "";
                }
                wf10 wf10Var = wf10.a;
                w0h1.B(string, "applicationId");
                wf10.d = string;
                Bundle bundle2 = (Bundle) ((kf10) ((r7n0) yf10Var.c.get()).b.getValue()).b.getValue();
                String string2 = bundle2 != null ? bundle2.getString("com.facebook.sdk.ClientToken") : null;
                wf10.h = string2 != null ? string2 : "";
                wf10.i(yf10Var.b.getApplicationContext(), new l7c((byte) 10));
                return rih1.a;
            case 2:
                hm5.M(obj);
                uya uyaVar = (uya) this.b;
                uyaVar.a.a(Collections.singleton(qe9.a()));
                j0d1 j0d1VarA = guo1.A((faa0) uyaVar.f.a.A(fkj0.W0));
                uyaVar.l = j0d1VarA;
                llm llmVarE = smo1.e(ha71.A(j0d1VarA, uyaVar.e));
                xir xirVar = uyaVar.b;
                l4p1.u(llmVarE, f5p1.q(new nf(yoi1.g(xirVar.d), (byte) 24), new ry5(uyaVar, (lnm) null, (byte) 24)));
                l4p1.u(llmVarE, f5p1.q(new pya(f5p1.m(yoi1.g(xirVar.e), rc11.a.b(je9.class)), (byte) 0), new u98(uyaVar)));
                l4p1.u(llmVarE, f5p1.q(hu20.e(rqt0.u(new hs6(uyaVar.g, (byte) 14)), new qt((lnm) null, uyaVar, (byte) 28)), new kk(uyaVar, (lnm) null, (byte) 23)));
                return rih1.a;
            case 3:
                hm5.M(obj);
                xya xyaVar = (xya) this.b;
                j0d1 j0d1VarA2 = guo1.A((faa0) xyaVar.e.a.A(fkj0.W0));
                xyaVar.g = j0d1VarA2;
                llm llmVarE2 = smo1.e(ha71.A(j0d1VarA2, xyaVar.d));
                l4p1.u(llmVarE2, f5p1.q(yoi1.g(xyaVar.a.d()), new ry5(xyaVar, (lnm) null, (byte) 25)));
                l4p1.u(llmVarE2, f5p1.q(hu20.e(rqt0.u(new hs6(xyaVar.f, (byte) 15)), new qt((lnm) null, xyaVar, (byte) 29)), new kk(xyaVar, (lnm) null, (byte) 24)));
                return rih1.a;
            case 4:
                hm5.M(obj);
                krw0 krw0Var = krw0.i;
                u7n0.w().f.a(((mxg) this.b).c);
                return rih1.a;
            case 5:
                hm5.M(obj);
                gen genVar = (gen) this.b;
                if (!gen.a(genVar)) {
                    return null;
                }
                long jE = gen.e(genVar).a.e();
                long jC = jE - gen.c(genVar);
                gen.h(genVar, jE);
                long jF = gen.f(genVar);
                long jB = jF - gen.b(genVar);
                gen.g(genVar, jF);
                if (jB < 0) {
                    jB = 0;
                }
                return new x1v0(jB / jC, (int) gen.d(genVar));
            case 6:
                hm5.M(obj);
                Object objD = ceu.d((ceu) this.b);
                ceu ceuVar = (ceu) this.b;
                synchronized (objD) {
                    if (!ceu.c(ceuVar) || ceu.a(ceuVar)) {
                        return rih1.a;
                    }
                    try {
                        ceu.i(ceuVar);
                        break;
                    } catch (IOException unused) {
                        ceu.h(ceuVar);
                    }
                    try {
                        if (ceu.e(ceuVar)) {
                            ceu.j(ceuVar);
                        }
                        break;
                    } catch (IOException unused2) {
                        ceu.g(ceuVar);
                        ceu.f(ceuVar, sj1.f(sj1.e()));
                    }
                    return rih1.a;
                }
            case 7:
                hm5.M(obj);
                ((Runnable) this.b).run();
                return rih1.a;
            case 8:
                hm5.M(obj);
                km0.h((km0) this.b).a(true);
                return rih1.a;
            case 9:
                hm5.M(obj);
                Iterator it = ((wo70) this.b).a.iterator();
                while (it.hasNext()) {
                    ((po70) it.next()).b();
                }
                return rih1.a;
            case 10:
                hm5.M(obj);
                ((j0f0) this.b).a().invoke();
                return rih1.a;
            case 11:
                hm5.M(obj);
                ((Function0) this.b).invoke();
                return rih1.a;
            case 12:
                hm5.M(obj);
                rnn1 rnn1VarY = unn1.y();
                i4o1 i4o1Var = (i4o1) this.b;
                tnn1 tnn1VarD = i4o1.d(Build.MANUFACTURER);
                tnn1 tnn1VarD2 = i4o1.d(Build.MODEL);
                tnn1 tnn1VarD3 = i4o1.d(Build.DEVICE);
                tnn1 tnn1VarD4 = i4o1.d(Build.HARDWARE);
                tnn1 tnn1VarD5 = i4o1.d(Build.FINGERPRINT);
                tnn1 tnn1VarD6 = i4o1.d(Build.PRODUCT);
                tnn1 tnn1VarD7 = i4o1.d(Build.BOARD);
                tnn1 tnn1VarD8 = i4o1.d(Build.BRAND);
                tnn1 tnn1VarD9 = i4o1.d(f46.s0(Build.SUPPORTED_ABIS, ",", "[", "]", null, 56));
                long j = Build.TIME;
                snn1 snn1VarX = tnn1.x();
                snn1VarX.i();
                rnn1VarY.i(p7h.M(tnn1VarD, tnn1VarD2, tnn1VarD3, tnn1VarD4, tnn1VarD5, tnn1VarD6, tnn1VarD7, tnn1VarD8, tnn1VarD9, snn1VarX.e(), i4o1.d(Build.ID), i4o1.d(Build.BOOTLOADER), i4o1.d(Build.DISPLAY), i4o1.d(Build.TYPE), i4o1.d(Build.TAGS)));
                return bmq0.l0(i4o1Var, rnn1VarY.e());
            default:
                hm5.M(obj);
                i4o1 i4o1Var2 = (i4o1) this.b;
                int i = Build.VERSION.SDK_INT;
                rnn1 rnn1VarY2 = unn1.y();
                snn1 snn1VarX2 = tnn1.x();
                snn1VarX2.j(String.valueOf(i));
                rnn1VarY2.i(k4p1.x(snn1VarX2.e()));
                return bmq0.l0(i4o1Var2, rnn1VarY2.e());
        }
    }
}
