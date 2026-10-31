package p;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.google.android.recaptcha.internal.zzhm;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.h;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y1t0 implements Function, t2n, qmr0, ksi0, Function3, y4l1, s5n1, h8q0, d5q0, z1q0, g1p1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public y1t0(Application application, Optional optional) {
        String str;
        this.a = (byte) 6;
        this.b = sap1.a();
        String str2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        int iOrdinal = ((lqh) nb51.z(optional)).ordinal();
        if (iOrdinal == 0) {
            str = "publishable_key_live_JN8NYwOVNhe3fvZCqyudlG2VZCJ7Dy43";
        } else {
            if (iOrdinal != 1) {
                eg.o();
                throw null;
            }
            str = "publishable_key_test_uNNoxKSSQBHgLDtYFrQxjo12PEDdzoPO";
        }
        uic uicVar = pvz0.n;
        nhc nhcVar = new nhc((byte) 2);
        nhcVar.u();
        nhcVar.v();
        uic.l(application, str, str2, nhc.k(), new bvz0(this));
    }

    public void A(smr0 smr0Var) {
        ((t441) this.b).d(smr0Var == null ? new s441() : new u441(smr0Var, 0));
    }

    public Object a(String str, lnm lnmVar) {
        return ((ae) this.b).a.getString(str, null);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                Observable observable = (Observable) obj;
                lxg lxgVar = (lxg) obj2;
                return observable.take(1L).singleOrError().doOnSubscribe(new duw0(lxgVar, (byte) 0)).doOnSuccess(new duw0(lxgVar, (byte) 1)).flatMapObservable(new euw0(observable));
            case 4:
            default:
                return ((GroupedObservable) obj).switchMap(new a1g1((Scheduler) obj2, (byte) 12));
            case 5:
                if (y7y0.H((Map) obj) && ((bpy0) ((y170) obj2).c).a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* bridge */ /* synthetic */ Object b() {
        return new d6n1((y5n1) ((l5n1) this.b).b());
    }

    public void c() {
        ((CountDownLatch) this.b).countDown();
    }

    public boolean d(msi0 msi0Var, ysi0 ysi0Var) {
        return false;
    }

    public Object e(String str, String str2, lnm lnmVar) {
        Map mapT = zno1.t(oqn1.n(str, str2));
        SharedPreferences.Editor editorEdit = ((ae) this.b).a.edit();
        editorEdit.getClass();
        for (Map.Entry entry : mapT.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.commit();
        return rih1.a;
    }

    @Override // p.y4l1
    public void f(m8b0 m8b0Var) {
        s24 s24Var = (s24) this.b;
        if (s24.n(s24Var) != null) {
            s24.n(s24Var).s(m8b0Var.d(1));
        }
    }

    @Override // p.t2n
    public Object g(Object obj) {
        uz21 uz21Var = (uz21) obj;
        try {
            try {
                h hVarB = ((qzr0) this.b).b(uz21Var.a(), bf40.b);
                uz21Var.close();
                return hVarB;
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException((Throwable) e);
            }
        } catch (Throwable th) {
            uz21Var.close();
            throw th;
        }
    }

    public void h(msi0 msi0Var) {
        Toolbar toolbar = (Toolbar) this.b;
        if (!toolbar.a.n()) {
            toolbar.j1.B(msi0Var);
        }
        xq81 xq81Var = toolbar.r1;
        if (xq81Var != null) {
            xq81Var.h(msi0Var);
        }
    }

    public void i(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    public void j(kob1 kob1Var, idd1 idd1Var, ycm ycmVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2090006261);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(idd1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ycmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mod.b(oi7.a.a((gw70) this.b), apo.r(1231150155, new hw01(kob1Var, iu30Var, this, idd1Var, ycmVar, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 23, i, this, kob1Var, idd1Var, ycmVar, iu30Var);
        }
    }

    public String k() {
        return ((zym0) ((ajg) this.b)).a.concat(".share");
    }

    public void l(String str, String str2, tv80 tv80Var) {
        xh71.b((xh71) this.b, new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), null, new vm71(str2), tv80Var, null, 18);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(long j, String str, onm onmVar) {
        nwe1 nwe1Var;
        String str2;
        long j2;
        if (onmVar instanceof nwe1) {
            nwe1Var = (nwe1) onmVar;
            int i = nwe1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwe1Var.e = i - Integer.MIN_VALUE;
            } else {
                nwe1Var = new nwe1(this, onmVar);
            }
        } else {
            nwe1Var = new nwe1(this, onmVar);
        }
        Object objO = nwe1Var.c;
        int i2 = nwe1Var.e;
        if (i2 == 0) {
            hm5.M(objO);
            wn2 wn2Var = new wn2(this, str, j, (lnm) null, (byte) 17);
            nwe1Var.a = str;
            nwe1Var.b = j;
            nwe1Var.e = 1;
            objO = rc2.O(5000L, wn2Var, nwe1Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
            str2 = str;
            j2 = j;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = nwe1Var.b;
            str2 = nwe1Var.a;
            hm5.M(objO);
        }
        opg0 opg0Var = (qpg0) objO;
        if (opg0Var instanceof opg0) {
            return new lwe1(opg0Var.a());
        }
        if (opg0Var instanceof ppg0) {
            n57.s("Timestamp conversion failed for " + str2 + ", falling back to raw timestamp");
            return new kwe1(j2, 1);
        }
        if (opg0Var != null) {
            eg.o();
            return null;
        }
        n57.s("Timestamp conversion timed out for " + str2 + ", falling back to raw timestamp");
        return new kwe1(j2, 2);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public Object n(Object obj, Object obj2, Object obj3) {
        swj1 swj1Var = (twj1) obj2;
        String str = (String) obj3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!((bv4) this.b).a()) {
            swj1Var = swj1.a;
        }
        return new hkj1(zBooleanValue, swj1Var, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object o(onm onmVar) throws zzhm {
        ayo1 ayo1Var;
        if (onmVar instanceof ayo1) {
            ayo1Var = (ayo1) onmVar;
            int i = ayo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayo1Var.c = i - Integer.MIN_VALUE;
            } else {
                ayo1Var = new ayo1(this, onmVar);
            }
        } else {
            ayo1Var = new ayo1(this, onmVar);
        }
        ayo1 ayo1Var2 = ayo1Var;
        Object objB = ayo1Var2.a;
        int i2 = ayo1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                lyo1 lyo1Var = (lyo1) this.b;
                ayo1Var2.c = 1;
                objB = lyo1Var.b("https://www.gstatic.com/recaptcha/verify_key/orcas/prod/android/verify_key.txt", "GET", (byte[]) null, b7x.a, ayo1Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            oyo1 oyo1Var = (oyo1) objB;
            oyo1Var.a();
            return new String(oyo1Var.b, nne.a);
        } catch (zzhm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhm(tgo1.d, ij81.Q1, e2.getMessage(), (Exception) null);
        }
    }

    public void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 20:
                ((gla0) obj2).invoke(obj);
                break;
            default:
                ((CountDownLatch) obj2).countDown();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(cln1 cln1Var, onm onmVar) {
        iwo1 iwo1Var;
        if (onmVar instanceof iwo1) {
            iwo1Var = (iwo1) onmVar;
            int i = iwo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwo1Var.c = i - Integer.MIN_VALUE;
            } else {
                iwo1Var = new iwo1(this, onmVar);
            }
        } else {
            iwo1Var = new iwo1(this, onmVar);
        }
        Object objO = iwo1Var.a;
        int i2 = iwo1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                zxl1 zxl1Var = (zxl1) this.b;
                iwo1Var.c = 1;
                objO = zxl1Var.o(cln1Var, iwo1Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return ((Boolean) objO).booleanValue() ? yah0.m(true) : yah0.m(false);
        } catch (Exception e) {
            e.getMessage();
            return yah0.m(false);
        }
    }

    public void q(int i, Object obj, r6o1 r6o1Var) {
        vun1 vun1Var = (vun1) this.b;
        qrn1 qrn1Var = (qrn1) obj;
        vun1Var.a(i, 2);
        vun1Var.l(qrn1Var.a(r6o1Var));
        r6o1Var.c(qrn1Var, this);
    }

    public y1t0(vun1 vun1Var) {
        this.a = (byte) 24;
        this.b = vun1Var;
        vun1Var.a = this;
    }

    public y1t0(byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = new hfp1();
                break;
            default:
                this.b = new CountDownLatch(1);
                break;
        }
    }

    public /* synthetic */ y1t0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public y1t0(gw70 gw70Var, sua suaVar) {
        this.a = (byte) 7;
        this.b = gw70Var;
    }
}
