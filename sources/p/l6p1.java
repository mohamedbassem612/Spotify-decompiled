package p;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.spotify.player.esperanto.proto.EsCommandOptions;
import com.spotify.player.model.command.options.CommandOptions;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l6p1 {
    public static WeakReference a;
    public static b180 b;
    public static b180 c;

    public static final void a(yg1 yg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1801837495);
        int i2 = (x340Var.g(yg1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = yg1Var.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N("DescriptionText", nim0.a), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xf1(yg1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final d030 b(int i, c4z c4zVar) {
        return new d030(i, 10, c4zVar);
    }

    public static d030 c() {
        return b(2, null);
    }

    public static final void d(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(995845559);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean zF = x340Var.f(((yr80) ven0Var.getValue()).a) | x340Var.g(watVar) | x340Var.d(2.0f);
            Object objT2 = x340Var.T();
            if (zF || objT2 == obj) {
                long j = ((yr80) ven0Var.getValue()).a;
                objT2 = yr80.b(j, 0L) ? dqs0.e : mqo1.t(new mmr0("ai_persona_badge", new gh80(new d6t0(4, watVar.s(watVar.M0((int) (j >> 32)) + 4.0f), watVar.s(watVar.M0((int) (j & 4294967295L)))), usi.a)));
                x340Var.s0(objT2);
            }
            cqs0 cqs0Var = (cqs0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = b980.e1;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT3);
            boolean zG = x340Var.g(cqs0Var) | ((i2 & 14) == 4);
            Object objT4 = x340Var.T();
            if (zG || objT4 == obj) {
                objT4 = new nd80(z, cqs0Var, ven0Var);
                x340Var.s0(objT4);
            }
            gfh0 gfh0Var = (gfh0) objT4;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = b980.d1;
                x340Var.s0(objT5);
            }
            k1u.a(s161.a(nim0.a, (iu30) objT5), 1, 0, (Function0) null, x340Var, 48, 12);
            j2iVar.invoke(cqs0Var, x340Var, Integer.valueOf((i2 >> 3) & 112));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new py3(z, qim0Var, j2iVar, i, (byte) 3);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-746031165);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 27);
        }
    }

    public static final void f(uuu0 uuu0Var, puu0 puu0Var, b0k b0kVar, int i) {
        uuu0 uuu0Var2;
        puu0 puu0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-726064831);
        byte b2 = 16;
        int i2 = (x340Var.i(uuu0Var) ? 4 : 2) | i | (x340Var.i(puu0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uuu0Var2 = uuu0Var;
            puu0Var2 = puu0Var;
            otw.c(uuu0Var2, puu0Var2, (qim0) null, (ipb1) null, x340Var, i2 & 126, 12);
        } else {
            uuu0Var2 = uuu0Var;
            puu0Var2 = puu0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(uuu0Var2, puu0Var2, i, b2);
        }
    }

    public static final void g(tvu0 tvu0Var, dvu0 dvu0Var, b0k b0kVar, int i) {
        tvu0 tvu0Var2;
        dvu0 dvu0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1034285173);
        int i2 = (x340Var.i(tvu0Var) ? 4 : 2) | i | (x340Var.g(dvu0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tvu0Var2 = tvu0Var;
            dvu0Var2 = dvu0Var;
            otw.c(tvu0Var2, dvu0Var2, (qim0) null, (ipb1) null, x340Var, i2 & 126, 12);
        } else {
            tvu0Var2 = tvu0Var;
            dvu0Var2 = dvu0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(tvu0Var2, dvu0Var2, i, (byte) 15);
        }
    }

    public static final EsCommandOptions.CommandOptions h(CommandOptions commandOptions) {
        tlz tlzVarN = EsCommandOptions.CommandOptions.n();
        if (commandOptions.overrideRestrictions().c()) {
            tlzVarN.r(((Boolean) commandOptions.overrideRestrictions().b()).booleanValue());
        }
        if (commandOptions.onlyForLocalDevice().c()) {
            tlzVarN.n(((Boolean) commandOptions.onlyForLocalDevice().b()).booleanValue());
        }
        if (commandOptions.systemInitiated().c()) {
            tlzVarN.s(((Boolean) commandOptions.systemInitiated().b()).booleanValue());
        }
        if (commandOptions.onlyForPlaybackId().c()) {
            tlzVarN.q(eth.M((String) commandOptions.onlyForPlaybackId().b()));
        }
        return tlzVarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        if (r6 != 4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] i(byte[] r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l6p1.i(byte[]):byte[]");
    }

    public static apk0 j(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static final long k(y9e1 y9e1Var, int i, boolean z, boolean z2) {
        zrm0 zrm0Var = y9e1Var.b;
        long j = y9e1Var.c;
        int iD = zrm0Var.d(i);
        if (iD >= zrm0Var.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(yoi1.o(y9e1Var.e(i, y9e1Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == y9e1Var.j(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(yoi1.o(zrm0Var.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final int l(x581 x581Var) {
        if (x581Var.equals(w581.a)) {
            return 2;
        }
        if (x581Var instanceof u581) {
            return 1;
        }
        if (x581Var.equals(v581.a)) {
            return 0;
        }
        eg.o();
        return 0;
    }

    public static String m(String str, JSONObject jSONObject) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        String strConcat4;
        String strConcat5;
        String str2 = "";
        try {
            f4t f4tVar = f4t.b;
            str2 = jSONObject.getString("~referring_link").split("\\?")[0];
        } catch (Exception unused) {
            i1k0.B("Failed to get referring link");
        }
        String strE = f4i1.e(str2, "?validate=true");
        if (!TextUtils.isEmpty(str)) {
            try {
                if (jSONObject.getString("ct").equals("t1")) {
                    strConcat = "&t1=".concat(str);
                } else {
                    strConcat = "&t1=" + jSONObject.getString("t1");
                }
                String strConcat6 = strE.concat(strConcat);
                if (jSONObject.getString("ct").equals("t2")) {
                    strConcat2 = "&t2=".concat(str);
                } else {
                    strConcat2 = "&t2=" + jSONObject.getString("t2");
                }
                String strConcat7 = strConcat6.concat(strConcat2);
                if (jSONObject.getString("ct").equals("t3")) {
                    strConcat3 = "&t3=".concat(str);
                } else {
                    strConcat3 = "&t3=" + jSONObject.getString("t3");
                }
                String strConcat8 = strConcat7.concat(strConcat3);
                if (jSONObject.getString("ct").equals("t4")) {
                    strConcat4 = "&t4=".concat(str);
                } else {
                    strConcat4 = "&t4=" + jSONObject.getString("t4");
                }
                String strConcat9 = strConcat8.concat(strConcat4);
                if (jSONObject.getString("ct").equals("t5")) {
                    strConcat5 = "&t5=".concat(str);
                } else {
                    strConcat5 = "&t5=" + jSONObject.getString("t5");
                }
                strE = strConcat9.concat(strConcat5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return strE.concat("&os=android");
    }

    public static void n(String str) {
        if (a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Activity) a.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                ((Activity) a.get()).startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                ((Activity) a.get()).startActivity(intent);
            }
        }
    }

    public static void o(String str) {
        Object next;
        d7 d7Var = new d7(a6k1.f, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            if (((a6k1) next).a.equals(str)) {
            }
        }
        next = null;
    }

    public static void p(WeakReference weakReference) {
        String strOptString;
        a = weakReference;
        if (n3c.h() != null) {
            n3c.h().i();
            JSONObject jSONObjectI = n3c.h().i();
            f4t f4tVar = f4t.b;
            strOptString = jSONObjectI.optString("~referring_link");
        } else {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString) || weakReference == null) {
            return;
        }
        JSONObject jSONObjectI2 = n3c.h().i();
        if (jSONObjectI2.optInt("_branch_validate") != 60514) {
            if (jSONObjectI2.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new a6n(jSONObjectI2, (byte) 2), 500L);
                return;
            }
            return;
        }
        f4t f4tVar2 = f4t.b;
        if (jSONObjectI2.optBoolean("+clicked_branch_link")) {
            if (a.get() != null) {
                new AlertDialog.Builder((Context) a.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) new obr(jSONObjectI2, (byte) 1)).setNegativeButton((CharSequence) "No", (DialogInterface.OnClickListener) new obr(jSONObjectI2, (byte) 0)).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) new k6b((byte) 16)).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
            }
        } else if (a.get() != null) {
            new AlertDialog.Builder((Context) a.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton((CharSequence) "Got it", (DialogInterface.OnClickListener) new k6b((byte) 17)).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
        }
    }
}
