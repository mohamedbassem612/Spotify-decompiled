package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dp5 implements Function, com.spotify.mobius.functions.Function, de70, ete0, pqg0 {
    public static volatile dp5 d;
    public final /* synthetic */ byte a;
    public final Object b;
    public static final jcx0 c = new jcx0((byte) 28);
    public static final dp5 e = new dp5(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final fig0 f = new fig0();
    public static final e0d1 g = new e0d1();

    public dp5(xrc0 xrc0Var, ov20 ov20Var, String str) {
        this.a = (byte) 18;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.U();
        hru0VarS.x(sku0VarP);
        mr20 mr20VarK = ((rsc0) xrc0Var).k(str, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478));
        fns fnsVar = igu.a;
        mr20 mr20VarU = rqt0.u(x4p1.h(new dwv(d5p1.r(mr20VarK, smo1.e(b3s.c), new alb1(100L, 3000L), 1), (byte) 9), new re1((byte) 28)));
        ezc ezcVar = ((bw20) ov20Var).a;
        this.b = h5p1.s(mr20VarU, rqt0.u(x4p1.h(new p3t(ezcVar, (byte) 21), new m9f(3, null, (byte) 1))), rqt0.u(x4p1.h(new p3t(ezcVar, (byte) 22), new re1((byte) 27))), new kg10(this, (lnm) null, (byte) 0));
    }

    public static Object k(Context context, fjs0 fjs0Var, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        ohdVar.n(new m5o(cancellationSignal, (byte) 1));
        rjn rjnVar = new rjn(ohdVar, (byte) 2);
        l5o l5oVar = new l5o();
        b6o b6oVarA = qfl1.a(new qfl1(context));
        if (b6oVarA == null) {
            rjnVar.c(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            b6oVarA.c(context, fjs0Var, cancellationSignal, l5oVar, rjnVar);
        }
        return ohdVar.r();
    }

    @Override // p.ete0
    public void a(String str, String str2) {
        ((wre0) this.b).a.a('E', "Spotify", wre0.g(str, str2), (Throwable) null);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                Object[] objArr = (Object[]) obj;
                PlayerState playerState = (PlayerState) objArr[0];
                PlayerQueue playerQueue = (PlayerQueue) objArr[1];
                ys4 ys4Var = (ys4) obj2;
                d520 d520Var = ys4Var.r;
                spq0 spq0VarTrack = playerQueue.track();
                x0i0 x0i0Var = ys4Var.j;
                long j = x0i0Var.a;
                if (spq0VarTrack.c() && !u890.j(((ContextTrack) spq0VarTrack.b()).uri(), ys4Var.E)) {
                    ys4Var.E = ((ContextTrack) spq0VarTrack.b()).uri();
                    j++;
                    x0i0Var.a = j;
                }
                long j2 = j;
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                ota1 ota1Var = (ota1) objArr[3];
                eao eaoVar = (eao) objArr[4];
                boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
                tal talVar = (tal) objArr[7];
                ghh0 ghh0Var = (ghh0) objArr[8];
                sp91 sp91Var = (sp91) objArr[9];
                boolean zBooleanValue4 = ((Boolean) objArr[10]).booleanValue();
                boolean zBooleanValue5 = ((Boolean) objArr[11]).booleanValue();
                boolean z = upf.g((ContextTrack) playerState.track().h()) || upf.h(ys4Var.p, (ContextTrack) playerState.track().h());
                odn odnVar = (odn) objArr[12];
                Object obj3 = objArr[13];
                spq0 spq0Var = obj3 instanceof spq0 ? (spq0) obj3 : null;
                g5v0 g5v0Var = spq0Var != null ? (g5v0) spq0Var.h() : null;
                Object obj4 = objArr[14];
                spq0 spq0Var2 = obj4 instanceof spq0 ? (spq0) obj4 : null;
                return d520Var.p(playerState, playerQueue, j2, zBooleanValue, ota1Var, eaoVar, talVar, zBooleanValue2, zBooleanValue3, (v0i0) objArr[21], ghh0Var, sp91Var, zBooleanValue4, zBooleanValue5, z, odnVar, g5v0Var, spq0Var2 != null ? (String) spq0Var2.h() : null, (Map) objArr[15], (ktl) objArr[16], ((Boolean) objArr[18]).booleanValue(), (String) objArr[19], (String) objArr[17], ((Boolean) objArr[20]).booleanValue(), ((Boolean) objArr[22]).booleanValue());
            case 14:
                return xds.b((xds) obj2, (Throwable) obj);
            case 16:
                return (l4c0) ((k4c0) obj2).apply((d4c0) obj);
            case 19:
                spq0 spq0Var3 = (spq0) obj;
                return spq0Var3.c() ? new i5w0(((py30) obj2).b((cxc) spq0Var3.b())) : j5.a;
            case 21:
                return ((inr) ((g0l) obj2)).j();
            default:
                nmr0 nmr0Var = (nmr0) obj;
                re70 re70Var = (re70) nmr0Var.b;
                Boolean bool = (Boolean) nmr0Var.a;
                bool.getClass();
                return (bool.booleanValue() || !byp.u(re70Var)) ? re70Var : ((byp) obj2).o();
        }
    }

    public y570 b(y570 y570Var) {
        return ((uo5) ((kz50) this.b).c).x(y570Var).b();
    }

    @Override // p.pqg0
    public Object c(Object obj, Object obj2) {
        return ((su30) this.b).apply(obj2);
    }

    public void d(smc0 smc0Var, String str, Integer num) {
        Resources resources = (Resources) this.b;
        if (num == null) {
            smc0Var.add(str.concat("=null"));
            return;
        }
        if (num.intValue() == 0) {
            smc0Var.add(str.concat("=0 (invalid)"));
            return;
        }
        smc0Var.add(str + "=" + resources.getResourceName(num.intValue()));
        smc0Var.add(str + "Content=" + resources.getString(num.intValue()));
    }

    public void e() {
        ((hfp1) ((y1t0) this.b).b).t(null);
    }

    public Object f(Context context, xjn xjnVar, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        ohdVar.n(new m5o(cancellationSignal, (byte) 0));
        i6b i6bVar = new i6b(ohdVar, (byte) 23);
        l5o l5oVar = new l5o();
        b6o b6oVarA = qfl1.a(new qfl1((Activity) this.b));
        if (b6oVarA == null) {
            i6bVar.o(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            b6oVarA.b(context, xjnVar, cancellationSignal, l5oVar, i6bVar);
        }
        return ohdVar.r();
    }

    public void g(vs01 vs01Var) {
        ((wu01) this.b).a(vs01Var);
    }

    public Object h(String str) {
        cxc cxcVar = (cxc) this.b;
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        neVar.t();
        ry21 ry21VarE = cxcVar.a(new ln21(neVar)).e();
        try {
            if (ry21VarE.Q0) {
                byte[] bArrR = qxd0.R(ry21VarE.g, 10485760L);
                ry21VarE.close();
                return bArrR;
            }
            throw new IOException("Failed to load Rive asset: HTTP " + ry21VarE.d);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(ry21VarE, th);
                throw th2;
            }
        }
    }

    @Override // p.ete0
    public void i(String str, String str2, Throwable th) {
        ((wre0) this.b).a.a('E', "Spotify", wre0.g(str, str2), th);
    }

    public String j(Context context) {
        String m231Var;
        String string;
        pqc1 pqc1Var = (pqc1) this.b;
        boolean zIsEmpty = pqc1Var.f.isEmpty();
        hpc1 hpc1Var = pqc1Var.g;
        if (zIsEmpty) {
            string = context.getString(2131963806);
        } else if (hpc1Var != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Locale.forLanguageTag(hpc1Var.a()).getDisplayLanguage(Locale.getDefault()));
                if (hpc1Var.c()) {
                    sb.append("  [CC]");
                }
                if (hpc1Var.b() == 2) {
                    sb.append(" ".concat(context.getString(2131963803)));
                }
                m231Var = sb.toString();
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = "";
            }
            string = m231Var;
        } else {
            string = context.getString(2131963805);
            string.getClass();
        }
        string.getClass();
        return string;
    }

    public SharedPreferences l() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return (SharedPreferences) ((idd1) this.b).getValue();
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public void m(Activity activity) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            p(activity.getIntent(), data);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public void n() {
        t890.u("loadable", (t45) this.b);
    }

    public void o(er91 er91Var) {
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add("infoText=" + er91Var.b);
        d(smc0VarN, "infoTextRes", er91Var.c);
        smc0VarN.add("actionText=" + er91Var.d);
        d(smc0VarN, "actionTextRes", er91Var.e);
        smc0VarN.add("hasOnClickListener=" + (er91Var.f != null));
        Logger.b("Snackbar configuration: ".concat(o7h.y0(k4p1.k(smc0VarN), ";", (String) null, (String) null, (iu30) null, 62)), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public void p(Intent intent, Uri uri) {
        String string;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            String string2 = null;
            if (set.contains(this)) {
                string = null;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter("al_applink_data");
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        try {
                            string = new JSONObject(queryParameter).getString("campaign_ids");
                        } catch (Exception unused) {
                            string = null;
                        }
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
            if (string == null) {
                if (!dhn.a.contains(this)) {
                    try {
                        Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                        if (bundleExtra != null) {
                            string2 = bundleExtra.getString("campaign_ids");
                        }
                    } catch (Throwable th2) {
                        dhn.a(this, th2);
                    }
                }
                string = string2;
            }
            if (string != null) {
                l().edit().putString("campaign_ids", string).apply();
            }
        } catch (Throwable th3) {
            dhn.a(this, th3);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public dp5(byte b) {
        mzi0 mzi0Var;
        this.a = b;
        switch (b) {
            case 2:
                oiy0 oiy0Var = oiy0.c;
                try {
                    int i = xgt.a;
                    mzi0Var = (mzi0) xgt.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    mzi0Var = f;
                }
                mzi0[] mzi0VarArr = {te40.a, mzi0Var};
                jig0 jig0Var = new jig0();
                jig0Var.a = mzi0VarArr;
                Charset charset = l290.a;
                this.b = jig0Var;
                break;
            case 3:
                this.b = new nda1((byte) 19);
                break;
            case 8:
                this.b = new y1t0((byte) 23);
                break;
            case 15:
                v5u v5uVar = v5u.d;
                this.b = apo.m().a();
                break;
            default:
                this.b = new idd1(df.f);
                break;
        }
    }

    public /* synthetic */ dp5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public dp5(int i, float[] fArr) {
        this.a = (byte) 1;
        this.b = fArr;
    }
}
