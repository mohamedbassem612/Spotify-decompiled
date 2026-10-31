package p;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzhm;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bym1 implements xi7, i2q0, fsc1, gon1, vsa, lxn1 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public bym1(Context context, doo1 doo1Var) {
        this.a = (byte) 8;
        fjs0 fjs0Var = new fjs0();
        try {
            jog1.b(context);
            fjs0Var.b = jog1.a().c(xhc.e).a("PLAY_BILLING_LIBRARY", new bbx("proto"), new kim1((byte) 3));
        } catch (Throwable unused) {
            fjs0Var.a = true;
        }
        this.c = fjs0Var;
        this.b = doo1Var;
    }

    public static void k(bym1 bym1Var, frl1 frl1Var) {
        fqn1 fqn1Var = (fqn1) frl1Var.b;
        fqn1 fqn1Var2 = (fqn1) bym1Var.b;
        long[] jArr = (long[]) fqn1Var2.b;
        long[] jArr2 = (long[]) fqn1Var.b;
        long[] jArr3 = (long[]) frl1Var.c;
        zqo1.z(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) fqn1Var2.c;
        long[] jArr5 = (long[]) fqn1Var.c;
        long[] jArr6 = (long[]) fqn1Var.d;
        zqo1.z(jArr4, jArr5, jArr6);
        zqo1.z((long[]) fqn1Var2.d, jArr6, jArr3);
        zqo1.z((long[]) bym1Var.c, jArr2, jArr5);
    }

    public c9d0 a() {
        return (c9d0) this.b;
    }

    public void b() {
        vsn1.g("BillingClient", "Reconnection attempt failed.");
        try {
            ((f1p1) this.b).a(iyn1.h);
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
        gsa gsaVar = (gsa) this.c;
        if (gsaVar.H != null) {
            Runnable seg1Var = new seg1(this, (byte) 16);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                seg1Var.run();
            } else {
                gsaVar.g.post(seg1Var);
            }
        }
    }

    public void c(iua iuaVar) {
        vsn1.g("BillingClient", "Reconnection finished with result: " + iuaVar.a);
        try {
            ((f1p1) this.b).a(iuaVar);
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
        gsa gsaVar = (gsa) this.c;
        if (gsaVar.H != null) {
            Runnable sjj1Var = new sjj1(this, iuaVar, (byte) 13);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                sjj1Var.run();
            } else {
                gsaVar.g.post(sjj1Var);
            }
        }
    }

    public Bundle d() {
        bg11 bg11Var = (bg11) this.c;
        Bundle bundle = new Bundle();
        String str = (String) this.b;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("A", str);
        }
        if (!bg11Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            w6 it = bg11Var.iterator();
            while (true) {
                w6 w6Var = it;
                if (!w6Var.hasNext()) {
                    break;
                }
                fq70 fq70Var = (fq70) w6Var.next();
                fq70Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("A", fq70Var.a);
                bundle2.putInt("B", fq70Var.b);
                bundle2.putInt("C", fq70Var.c);
                bundle2.putInt("E", 0);
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("D", null);
                }
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("B", arrayList);
        }
        return bundle;
    }

    public hfp1 e(Object obj) {
        switch (this.a) {
            case 4:
                km3 km3Var = (km3) this.b;
                mlw0 mlw0Var = (mlw0) this.c;
                Bundle bundle = (Bundle) obj;
                mln1 mln1Var = (mln1) km3Var.c;
                boolean zC0 = eth.c0(mln1Var);
                ContentResolver contentResolver = mln1Var.a;
                if (zC0 && bundle.getBoolean("update_tv_provider", false)) {
                    nnm nnmVar = (nnm) mlw0Var.b;
                    try {
                        contentResolver.delete(mln1.b, null, null);
                    } catch (RuntimeException e) {
                        mln1.c.a("RuntimeException occurred", new Object[]{e});
                    }
                    bg11 bg11Var = (bg11) nnmVar.b.b;
                    ArrayList arrayList = new ArrayList(bg11Var.d);
                    w280 w280VarR = bg11Var.r(0);
                    while (w280VarR.hasNext()) {
                    }
                    if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                        try {
                            contentResolver.bulkInsert(mln1.b, (ContentValues[]) arrayList.toArray(new ContentValues[0]));
                        } catch (RuntimeException e2) {
                            mln1.c.a("RuntimeException occurred", new Object[]{e2});
                        }
                    }
                }
                break;
            default:
                km3 km3Var2 = (km3) this.b;
                vun vunVar = (vun) this.c;
                Bundle bundle2 = (Bundle) obj;
                mln1 mln1Var2 = (mln1) km3Var2.c;
                bg11 bg11Var2 = (bg11) vunVar.b;
                if ((bg11Var2.isEmpty() || bg11Var2.contains(3)) && eth.c0(mln1Var2) && bundle2.getBoolean("update_tv_provider", false)) {
                    try {
                        mln1Var2.a.delete(mln1.b, null, null);
                    } catch (RuntimeException e3) {
                        mln1.c.a("RuntimeException occurred", new Object[]{e3});
                    }
                }
                break;
        }
        return o0c.z((Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(xmn1 xmn1Var, onm onmVar) throws zzhm {
        fxo1 fxo1Var;
        if (onmVar instanceof fxo1) {
            fxo1Var = (fxo1) onmVar;
            int i = fxo1Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                fxo1Var.c = i - os00.INVALID_ID;
            } else {
                fxo1Var = new fxo1(this, onmVar);
            }
        } else {
            fxo1Var = new fxo1(this, onmVar);
        }
        Object objA = fxo1Var.a;
        int i2 = fxo1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                lyo1 lyo1Var = (lyo1) this.c;
                String str = (String) ((brk1) this.b).e;
                byte[] bArrD = xmn1Var.d();
                fxo1Var.c = 1;
                objA = lyo1Var.a(str, bArrD, fxo1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return ((oyo1) objA).b(ymn1.z());
        } catch (zzhm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhm(tgo1.d, ij81.N0, e2.getMessage(), (Exception) null);
        }
    }

    public void g(long j, long j2, long j3, String str) {
        gon1 gon1Var = (gon1) this.b;
        if (gon1Var != null) {
            gon1Var.g(j, j2, j3, str);
        }
    }

    public void h(String str, long j, int i, Object obj, long j2, long j3) {
        gon1 gon1Var = (gon1) this.b;
        if (gon1Var != null) {
            if (i == 2001) {
                knn1 knn1Var = (knn1) this.c;
                ((sxn1) knn1Var).a.c("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", new Object[]{Integer.valueOf(knn1Var.i)});
                for (oxo1 oxo1Var : ((e321) knn1Var.h.a).h) {
                    switch (oxo1Var.a) {
                        case 0:
                            ((koh0) oxo1Var.b).e();
                            break;
                    }
                }
                i = 2001;
            }
            gon1Var.h(str, j, i, obj, j2, j3);
        }
    }

    public void i(nlo1 nlo1Var) {
        try {
            u(nlo1Var, (doo1) this.b);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void j(ipo1 ipo1Var) {
        this.b = ipo1Var;
    }

    public Single l(Intent intent, th61 th61Var) {
        ru9 ru9Var = (ru9) this.b;
        Single singleFirstOrError = ((Observable) ((gfr) ru9Var.c).invoke()).firstOrError();
        blc0 blc0Var = (blc0) this.c;
        return singleFirstOrError.map(new aym1(ru9Var, intent, blc0Var, th61Var)).onErrorReturn(new aym1(blc0Var, ru9Var, intent, th61Var));
    }

    public void m(qgn1 qgn1Var) {
        this.c = qgn1Var;
    }

    public void n(nlo1 nlo1Var, int i) {
        try {
            xno1 xno1VarL = ((doo1) this.b).l();
            xno1VarL.b();
            doo1.D(((t9o1) xno1VarL).b, i);
            this.b = xno1VarL.a();
            i(nlo1Var);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public rbn1 o() {
        ECPoint eCPoint;
        sbn1 sbn1Var = (sbn1) this.b;
        if (sbn1Var == null) {
            k220.r("Cannot build without a ecdsa public key");
            return null;
        }
        i2i1 i2i1Var = (i2i1) this.c;
        if (i2i1Var == null) {
            k220.r("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) i2i1Var.b;
        ECPoint eCPoint2 = sbn1Var.e;
        xjp1 xjp1Var = sbn1Var.d.b;
        BigInteger order = xjp1Var.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            k220.r("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = xjp1Var.b;
        if (!lcp1.b(eCParameterSpec, lcp1.a) && !lcp1.b(eCParameterSpec, lcp1.b) && !lcp1.b(eCParameterSpec, lcp1.c)) {
            k220.r("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            k220.r("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            k220.r("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        lcp1.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = lcp1.c(curve);
        kcp1 kcp1VarD = lcp1.d(ECPoint.POINT_INFINITY, bigIntegerC);
        kcp1 kcp1VarD2 = lcp1.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                kcp1VarD = lcp1.f(kcp1VarD, kcp1VarD2, a, bigIntegerC);
                kcp1VarD2 = lcp1.e(kcp1VarD2, a, bigIntegerC);
            } else {
                kcp1VarD2 = lcp1.f(kcp1VarD, kcp1VarD2, a, bigIntegerC);
                kcp1VarD = lcp1.e(kcp1VarD, a, bigIntegerC);
            }
        }
        if (kcp1VarD.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = kcp1VarD.c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(kcp1VarD.a.multiply(bigIntegerMod).mod(bigIntegerC), kcp1VarD.b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        lcp1.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new rbn1((sbn1) this.b, (i2i1) this.c);
        }
        k220.r("Invalid private value");
        return null;
    }

    public void onComplete(Task task) {
        switch (this.a) {
            case 2:
                c5n1 c5n1Var = (c5n1) this.b;
                bsd1 bsd1Var = (bsd1) this.c;
                synchronized (c5n1Var.f) {
                    c5n1Var.e.remove(bsd1Var);
                    break;
                }
                return;
            default:
                hzo1 hzo1Var = (hzo1) this.b;
                bsd1 bsd1Var2 = (bsd1) this.c;
                synchronized (hzo1Var.f) {
                    hzo1Var.e.remove(bsd1Var2);
                    break;
                }
                return;
        }
    }

    public aap1 p() {
        return new aap1((ipo1) this.b, (qgn1) this.c);
    }

    public void q(nlo1 nlo1Var, int i, long j) {
        try {
            xno1 xno1VarL = ((doo1) this.b).l();
            xno1VarL.b();
            doo1.D(((t9o1) xno1VarL).b, i);
            doo1 doo1Var = (doo1) xno1VarL.a();
            this.b = doo1Var;
            if (j != 0) {
                xno1 xno1VarL2 = doo1Var.l();
                xno1VarL2.b();
                doo1.F(((t9o1) xno1VarL2).b, j);
                doo1Var = (doo1) xno1VarL2.a();
            }
            u(nlo1Var, doo1Var);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void r(nlo1 nlo1Var, long j, boolean z) {
        try {
            hlo1 hlo1VarL = nlo1Var.l();
            dpo1 dpo1VarL = nlo1Var.v().l();
            dpo1VarL.b();
            ypo1.r(((t9o1) dpo1VarL).b, z);
            hlo1VarL.b();
            nlo1.q(((t9o1) hlo1VarL).b, dpo1VarL.a());
            nlo1 nlo1Var2 = (nlo1) hlo1VarL.a();
            doo1 doo1Var = (doo1) this.b;
            if (j != 0) {
                xno1 xno1VarL = doo1Var.l();
                xno1VarL.b();
                doo1.F(((t9o1) xno1VarL).b, j);
                doo1Var = (doo1) xno1VarL.a();
            }
            u(nlo1Var2, doo1Var);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void s(nlo1 nlo1Var, int i, long j, boolean z) {
        try {
            xno1 xno1VarL = ((doo1) this.b).l();
            xno1VarL.b();
            doo1.D(((t9o1) xno1VarL).b, i);
            this.b = xno1VarL.a();
            hlo1 hlo1VarL = nlo1Var.l();
            dpo1 dpo1VarL = nlo1Var.v().l();
            dpo1VarL.b();
            ypo1.r(((t9o1) dpo1VarL).b, z);
            hlo1VarL.b();
            nlo1.q(((t9o1) hlo1VarL).b, dpo1VarL.a());
            nlo1 nlo1Var2 = (nlo1) hlo1VarL.a();
            doo1 doo1Var = (doo1) this.b;
            if (j != 0) {
                xno1 xno1VarL2 = doo1Var.l();
                xno1VarL2.b();
                doo1.F(((t9o1) xno1VarL2).b, j);
                doo1Var = (doo1) xno1VarL2.a();
            }
            u(nlo1Var2, doo1Var);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void t(dro1 dro1Var) {
        try {
            fjs0 fjs0Var = (fjs0) this.c;
            cqo1 cqo1VarR = kqo1.r();
            cqo1VarR.d((doo1) this.b);
            cqo1VarR.b();
            kqo1.w(((t9o1) cqo1VarR).b, dro1Var);
            fjs0Var.n(cqo1VarR.a());
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void u(nlo1 nlo1Var, doo1 doo1Var) {
        if (nlo1Var == null) {
            return;
        }
        try {
            cqo1 cqo1VarR = kqo1.r();
            cqo1VarR.d(doo1Var);
            cqo1VarR.b();
            kqo1.s(((t9o1) cqo1VarR).b, nlo1Var);
            ((fjs0) this.c).n(cqo1VarR.a());
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public void v(gmo1 gmo1Var, doo1 doo1Var) {
        if (gmo1Var == null) {
            return;
        }
        try {
            cqo1 cqo1VarR = kqo1.r();
            cqo1VarR.d(doo1Var);
            cqo1VarR.b();
            kqo1.t(((t9o1) cqo1VarR).b, gmo1Var);
            ((fjs0) this.c).n(cqo1VarR.a());
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    public /* synthetic */ bym1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ bym1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bym1() {
        this(new fqn1(), new long[10], (byte) 16);
        this.a = (byte) 16;
    }

    public /* synthetic */ bym1(frl1 frl1Var) {
        this.a = (byte) 15;
        this.b = (String) frl1Var.b;
        this.c = ((v280) frl1Var.c).g();
    }

    public bym1(knn1 knn1Var, gon1 gon1Var) {
        this.a = (byte) 6;
        this.b = gon1Var;
        Objects.requireNonNull(knn1Var);
        this.c = knn1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bym1(frl1 frl1Var, byte b) {
        this();
        this.a = (byte) 16;
        k(this, frl1Var);
    }
}
