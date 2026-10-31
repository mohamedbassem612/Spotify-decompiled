package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Toast;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.AndroidAutoConnected;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tg implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public tg(ix0 ix0Var, u961 u961Var) {
        this.a = (byte) 8;
        this.b = u961Var;
    }

    public final void accept(Object obj) {
        nsl1 lsl1Var;
        nsl1 lsl1Var2;
        View view;
        yit gjtVar;
        int iNextInt;
        boolean z = true;
        switch (this.a) {
            case 0:
                ug ugVar = (ug) this.b;
                ugVar.b.onNext(Boolean.valueOf(ugVar.a()));
                return;
            case 1:
                ((t3f0) this.b).a(yg8.t);
                return;
            case 2:
                Toast.makeText((Context) this.b, 2131951750, 1).show();
                return;
            case 3:
                mlb1 mlb1Var = (oob1) obj;
                if (mlb1Var instanceof mlb1) {
                    ((wbd1) this.b).a(new knb1(mlb1Var));
                    return;
                }
                return;
            case 4:
                Logger.e((Throwable) obj, "AccountSwitching: Error showing snackbar", new Object[0]);
                yu yuVar = (yu) this.b;
                ((wbd1) yuVar.g.get()).a(ymb1.b);
                ((vbd1) yuVar.a.get()).a.onNext(dwo0.a);
                return;
            case 5:
                i94 i94Var = ((qx) this.b).b;
                i94Var.a("product_state_load");
                i94Var.e("product_state_processing");
                return;
            case 6:
                bxn0 bxn0Var = ((zd0) this.b).c;
                if (bxn0Var.c == null) {
                    i1s0 i1s0Var = new i1s0(bxn0Var.b.b(), 193, "from_navigation");
                    bxn0Var.c = i1s0Var;
                    bxn0Var.d(i1s0Var);
                    return;
                }
                return;
            case 7:
                mmr0 mmr0Var = (mmr0) obj;
                mq0 mq0Var = (mq0) this.b;
                a1g1 a1g1Var = mq0Var.a;
                Boolean bool = (Boolean) mmr0Var.a;
                i280 i280Var = (i280) mmr0Var.b;
                if (!bool.booleanValue()) {
                    u601 u601Var = mq0Var.c;
                    Window window = (Window) a1g1Var.b;
                    if (!(u601Var.getValue() instanceof ck7)) {
                        int iOrdinal = i280Var.ordinal();
                        if (iOrdinal == 0) {
                            a1g1Var.a();
                            return;
                        }
                        if (iOrdinal == 1) {
                            d55.i(window, false);
                            up41 up41Var = new up41(window.getDecorView());
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 35) {
                                lsl1Var = new nsl1(window, up41Var);
                            } else if (i >= 30) {
                                lsl1Var = new msl1(window, up41Var);
                            } else {
                                lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
                            }
                            lsl1Var.G(1);
                            lsl1Var.L(2);
                            lsl1Var.K(1);
                            return;
                        }
                        if (iOrdinal != 2) {
                            eg.o();
                            return;
                        }
                        d55.i(window, false);
                        up41 up41Var2 = new up41(window.getDecorView());
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 35) {
                            lsl1Var2 = new nsl1(window, up41Var2);
                        } else if (i2 >= 30) {
                            lsl1Var2 = new msl1(window, up41Var2);
                        } else {
                            lsl1Var2 = i2 >= 26 ? new lsl1(window, up41Var2) : new ksl1(window, up41Var2);
                        }
                        lsl1Var2.G(519);
                        lsl1Var2.K(2);
                        return;
                    }
                }
                a1g1Var.a();
                return;
            case 8:
                y031 y031Var = (y031) obj;
                u961 u961Var = (u961) this.b;
                if (y031Var instanceof w031) {
                    ((View) u961Var.c).setVisibility(8);
                    ((View) u961Var.d).setVisibility(8);
                    ((View) u961Var.a).setVisibility(0);
                    ((View) u961Var.b).setVisibility(0);
                    return;
                }
                if (!(y031Var instanceof x031)) {
                    eg.o();
                    return;
                }
                ((View) u961Var.c).setVisibility(0);
                ((View) u961Var.d).setVisibility(0);
                ((View) u961Var.a).setVisibility(8);
                ((View) u961Var.b).setVisibility(8);
                return;
            case 9:
                v41 v41Var = (c51) obj;
                b21 b21Var = (b21) this.b;
                if (v41Var instanceof v41) {
                    b21Var.Y0().c(new kjt(v41Var.a), new ifl1((Object) null, (byte) 25), true);
                    return;
                }
                if (v41Var instanceof y41) {
                    kg0.e(b21Var.Y0(), zjt.a, (ifl1) null);
                    return;
                }
                if (v41Var instanceof z41) {
                    z41 z41Var = (z41) v41Var;
                    b21Var.Y0().c(new jjt(z41Var.b, z41Var.a, z41Var.c, z41Var.d, b21Var.W1 == bk8.d ? b21Var.Z0(2, 5) : null), new ifl1((Object) null, (byte) 25), true);
                    return;
                }
                if (v41Var instanceof w41) {
                    w41 w41Var = (w41) v41Var;
                    String strZ0 = !w41Var.g ? b21Var.Z0(1, 4) : null;
                    yqg yqgVar = b21Var.S1;
                    if (yqgVar == null) {
                        u890.C("clock");
                        throw null;
                    }
                    long jB = yqgVar.b();
                    long j = w41Var.h;
                    b21Var.Y0().c(new ijt(w41Var.a, w41Var.b, w41Var.c, w41Var.d, w41Var.e, w41Var.f, w41Var.g, j > 0 ? TimeUnit.SECONDS.toMillis(j) + jB : 0L, jB + 30000, w41Var.i, strZ0), new ifl1((Object) null, (byte) 25), true);
                    return;
                }
                if (v41Var instanceof s41) {
                    kg0 kg0VarY0 = b21Var.Y0();
                    s41 s41Var = (s41) v41Var;
                    boolean z2 = s41Var.b;
                    w01 w01Var = s41Var.a;
                    kg0VarY0.c(new ejt(z2, w01Var.a, w01Var.b, w01Var.c, s41Var.c), new ifl1((Object) null, (byte) 25), true);
                    return;
                }
                if (v41Var instanceof r41) {
                    a031 a031Var = b21Var.O1;
                    if (a031Var != null) {
                        a031Var.a();
                        return;
                    } else {
                        u890.C("restartAuthFlow");
                        throw null;
                    }
                }
                if (v41Var instanceof u41) {
                    b21Var.Y0().d(new bkt(false), true);
                    return;
                }
                if (v41Var instanceof x41) {
                    k41 k41Var = ((x41) v41Var).a;
                    if (k41Var instanceof k41) {
                        gjtVar = new yit(new d3f0(k41Var.a), bk8.h, (n5o) null, 12);
                    } else if (k41Var instanceof l41) {
                        gjtVar = new tjt(((l41) k41Var).a);
                    } else if (k41Var instanceof i41) {
                        gjtVar = new sit(((i41) k41Var).a, 14, false);
                    } else {
                        if (!(k41Var instanceof j41)) {
                            eg.o();
                            return;
                        }
                        gjtVar = new gjt(fjt.b, ((j41) k41Var).a);
                    }
                    if (!(k41Var instanceof j41)) {
                        b21Var.Y0().d(gjtVar, true);
                        return;
                    }
                    th30 th30VarE0 = b21Var.N0().e0();
                    th30VarE0.getClass();
                    th30VarE0.y(new qh30(th30VarE0, (String) null, -1, 1), false);
                    kg0.e(b21Var.Y0(), gjtVar, (ifl1) null);
                    return;
                }
                if (v41Var instanceof t41) {
                    tn00 tn00Var = ((t41) v41Var).a;
                    if (tn00Var != null) {
                        if (b21Var.H1 == null) {
                            u890.C("zeroResult");
                            throw null;
                        }
                        String strO = rc11.a.b(yit.class).o();
                        String str = strO != null ? strO : "zeroResult";
                        Bundle bundle = new Bundle();
                        bundle.putString("error", tn00Var.a);
                        sap1.m(b21Var, str, bundle);
                    }
                    th30 th30VarJ0 = b21Var.j0();
                    th30VarJ0.y(new qh30(th30VarJ0, (String) null, -1, 0), false);
                    return;
                }
                if (!(v41Var instanceof b51)) {
                    if (v41Var instanceof a51) {
                        b21Var.Y0().d(new sit(((a51) v41Var).a, 14, false), true);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                b51 b51Var = (b51) v41Var;
                b21Var.Y0().d(new akt(b51Var.a), true);
                nsn0 nsn0Var = b51Var.b;
                if (nsn0Var == null || (view = ((zf30) b21Var).j1) == null) {
                    return;
                }
                view.post(new nx30(b21Var, nsn0Var, (byte) 3));
                return;
            case 10:
                ((vu1) this.b).f = ((th61) obj).a;
                return;
            case 11:
                mmr0 mmr0Var2 = (mmr0) obj;
                ao0.c(((i62) this.b).c, ((Boolean) mmr0Var2.b).booleanValue() ? co0.g1 : co0.T0, ((gq0) mmr0Var2.a).a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
                return;
            case 12:
                l62 l62Var = (l62) obj;
                ((j62) this.b).g = new az8(l62Var.i, l62Var.R0.a(l62Var.S0), (byte) 4);
                return;
            case 13:
                double dDoubleValue = ((Number) obj).doubleValue();
                g72 g72Var = (g72) this.b;
                fn31.T(g72Var.i, (o8n) null, 0, new d72(g72Var, dDoubleValue, (lnm) null), 3);
                return;
            case 14:
                AgeVerificationDialogActivity ageVerificationDialogActivity = (AgeVerificationDialogActivity) this.b;
                ageVerificationDialogActivity.setResult(103);
                ageVerificationDialogActivity.finish();
                return;
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dma1 dma1Var = ((cj3) ((p2o0) this.b).b).c;
                if (dma1Var == null) {
                    eg.m("setup needs to be called first");
                    return;
                }
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(cj3.f, zBooleanValue);
                hma1VarEdit.g();
                return;
            case 16:
                zpd zpdVar = (zpd) obj;
                km0 km0Var = (km0) this.b;
                z = zpdVar == zpd.e;
                t2j0 t2j0Var = (t2j0) ((kly0) km0Var.c).get();
                o64 o64VarN = AndroidAutoConnected.n();
                o64VarN.n(z);
                t2j0Var.a(o64VarN.build());
                return;
            case 17:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                cn5 cn5Var = (cn5) ((km0) this.b).c;
                if (zBooleanValue2) {
                    if (!cn5Var.c) {
                        cn5Var.b("background-playing");
                    }
                    cn5Var.d = true;
                    return;
                } else {
                    if (!cn5Var.c) {
                        cn5Var.b("suspended");
                    }
                    cn5Var.d = false;
                    return;
                }
            case 18:
                jx5 jx5Var = (jx5) this.b;
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) obj);
                Activity activity = jx5Var.d;
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                    return;
                }
                return;
            case 19:
                ((uq6) this.b).d.onNext(Boolean.TRUE);
                return;
            case 20:
                t28 t28Var = ((w28) obj).a;
                g38 g38Var = (g38) this.b;
                cp5 cp5Var = g38Var.g;
                if (cp5Var != null) {
                    Logger.g("Removing audio routing listener.", new Object[0]);
                    t28Var.j(cp5Var);
                }
                t28Var.release();
                ayh ayhVar = (zxh) g38Var.h.getAndSet(null);
                if (ayhVar != null) {
                    ayhVar.m0(rih1.a);
                    return;
                }
                return;
            case 21:
                r321 r321Var = (r321) obj;
                i48 i48Var = (i48) this.b;
                boolean z3 = r321Var == r321.a;
                i48Var.e = z3;
                if (!i48Var.d && !z3) {
                    z = false;
                }
                i48Var.b.onNext(z ? ut7.b : ut7.a);
                return;
            case 22:
                xd8 xd8Var = (ae8) obj;
                qd8 qd8Var = (qd8) this.b;
                WebView webView = qd8Var.f;
                View view2 = qd8Var.X;
                if (xd8Var instanceof yd8) {
                    view2.setVisibility(8);
                    webView.setVisibility(0);
                    webView.loadUrl(((yd8) xd8Var).a);
                    return;
                } else if (xd8Var instanceof zd8) {
                    view2.setVisibility(0);
                    webView.setVisibility(8);
                    return;
                } else {
                    if (!(xd8Var instanceof xd8)) {
                        eg.o();
                        return;
                    }
                    String str2 = xd8Var.a;
                    qd8Var.d.e();
                    if (str2 != null) {
                        qd8Var.c.o(new er91((fs91) null, str2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    }
                    ((vku) qd8Var.b.h).c();
                    return;
                }
            case 23:
                ((dj8) this.b).Y0();
                return;
            case 24:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Error while processing the request", new Object[0]);
                ((AuthorizationActivity) this.b).o0(new dr8(nhz.Y, th.getMessage(), (String) null));
                return;
            case 25:
                ((l451) this.b).invoke();
                Logger.e((Throwable) obj, "Failed to show settings tooltip", new Object[0]);
                return;
            case 26:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                wg9 wg9Var = (wg9) this.b;
                if (zBooleanValue3) {
                    return;
                }
                ((tf9) wg9Var.c).b();
                return;
            case 27:
                aj9 aj9Var = (aj9) obj;
                byte[] bArr = aj9Var.c;
                ee9 ee9Var = aj9Var.b;
                if (u890.j(ee9Var.getUuid(), pe9.g)) {
                    t0z t0zVar = cih1.f;
                    if (t0zVar.isEmpty()) {
                        n57.e("BLE raw payload reached native unified write; byteCount=" + bArr.length + "; value=" + new String(bArr, nne.a));
                    } else {
                        Iterator it = t0zVar.iterator();
                        while (it.hasNext()) {
                            byte[] bytes = ((cih1) it.next()).a.concat(":").getBytes(nne.a);
                            if (bArr.length >= bytes.length) {
                                Collection tr80Var = new tr80(0, bytes.length - 1, 1);
                                if (!(tr80Var instanceof Collection) || !tr80Var.isEmpty()) {
                                    lr80 it2 = tr80Var.iterator();
                                    do {
                                        if (((sr80) it2).c) {
                                            iNextInt = it2.nextInt();
                                        }
                                    } while (bArr[iNextInt] == bytes[iNextInt]);
                                }
                            }
                        }
                        n57.e("BLE raw payload reached native unified write; byteCount=" + bArr.length + "; value=" + new String(bArr, nne.a));
                    }
                }
                ((uf9) this.b).e(aj9Var.a, ee9Var.getUuid(), bArr);
                return;
            case 28:
                vw9 vw9Var = (vw9) obj;
                ww9 ww9Var = (ww9) this.b;
                ub10 ub10Var = vw9Var.a;
                z = vw9Var.b == 0;
                qah qahVar = ww9Var.b;
                int i3 = ub10Var.b;
                if (!z) {
                    qahVar.a(i3);
                    return;
                } else {
                    qahVar.a.c(i3);
                    qahVar.b = i3;
                    return;
                }
            default:
                ((View) ((ip31) this.b).b).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return;
        }
    }

    public /* synthetic */ tg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
