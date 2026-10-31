package p;

import android.content.Context;
import android.content.Intent;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.transformer.ExportException;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.collection.contentimpl.played.PlayedStateService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dn3 implements is31, p3r {
    public Context a;

    public dn3(zfr zfrVar) {
        this.a = (Context) zfrVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    public static u310 c(dn3 dn3Var, Map map, List list, boolean z, int i) {
        int i2;
        String string;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2 = (i & 4) != 0 ? true : z;
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 16) == 0;
        Context context = dn3Var.a;
        if (y7y0.t("offline", map)) {
            if (list.isEmpty()) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        } else if (list.isEmpty()) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        int iC = l1d.C(i2);
        y310 y310Var = null;
        if (iC != 0) {
            if (iC == 1) {
                string = context.getString(2131952345);
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                string = context.getString(2131952343);
                i3 = 2;
            }
            if (z2) {
                str = string;
            } else {
                str = null;
            }
            if (z3) {
                i3 = 1;
            }
            if (i3 == 2) {
                str2 = "spotify:android-auto:offline-library";
            } else {
                str2 = "non-playable-item";
            }
            str3 = str2;
            if (z4) {
                if (i2 != 1) {
                    str4 = "DOWNLOADS_NOT_ALLOWED";
                } else if (i2 != 2) {
                    str4 = "NO_DOWNLOADS";
                } else {
                    if (i2 == 3) {
                        throw null;
                    }
                    str4 = "HAS_DOWNLOADS";
                }
                y310Var = new y310(Collections.singletonList(new p710(10, (Integer) null, "OFFLINE_STATUS_ITEM", (String) null, str3, str4)));
            }
            return new u310(str3, (String) null, context.getString(2131952346), str, kno1.q(context, 2131233206), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, i3, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, y310Var, (String) null, (Long) null, (String) null, Collections.singletonMap(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 1), (String) null, (String) null, (oz0) null, -1140852766, 15);
        }
        string = context.getString(2131952344);
        i3 = 1;
        if (z2) {
            str = null;
        } else {
            str = string;
        }
        if (z3) {
            i3 = 1;
        }
        if (i3 == 2) {
            str2 = "spotify:android-auto:offline-library";
        } else {
            str2 = "non-playable-item";
        }
        str3 = str2;
        if (z4) {
            if (i2 != 1) {
                str4 = "DOWNLOADS_NOT_ALLOWED";
            } else if (i2 != 2) {
                str4 = "NO_DOWNLOADS";
            } else {
                if (i2 == 3) {
                    throw null;
                }
                str4 = "HAS_DOWNLOADS";
            }
            y310Var = new y310(Collections.singletonList(new p710(10, (Integer) null, "OFFLINE_STATUS_ITEM", (String) null, str3, str4)));
        }
        return new u310(str3, (String) null, context.getString(2131952346), str, kno1.q(context, 2131233206), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, i3, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, y310Var, (String) null, (Long) null, (String) null, Collections.singletonMap(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 1), (String) null, (String) null, (oz0) null, -1140852766, 15);
    }

    public static ExportException e(String str, ie30 ie30Var) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String string = ie30Var.toString();
        String str2 = ie30Var.f66p;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new m3c(string, asj0.o(str2), (String) null, true));
    }

    public static dxy g() {
        dxy dxyVar = new dxy((byte) 0);
        dxyVar.c = new n1f1(true);
        dxyVar.d = tyo1.p(blc0.mg, new String[0]);
        dxyVar.e = w7x.a;
        dxyVar.f = new rhy((yny) null, 63);
        dxyVar.g = dz61.d;
        dxyVar.e = Collections.singleton(g571.d);
        dxyVar.f = new rhy((yny) null, 63);
        dxyVar.c = m1f1.a;
        return dxyVar;
    }

    public o3r a(wa71 wa71Var) {
        l4r l4rVar = new l4r(pwc0.b, 1, fiu0.U0, new j4r(fiu0.c1), fiu0.W0);
        jd11 jd11Var = rc11.a;
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(fuj0.class)), 2, fiu0.Z, new j4r(fiu0.e1), fiu0.O0);
        l4r l4rVar3 = new l4r(jd0.b, 2, fiu0.Q0, new j4r(rku0.c), fiu0.S0);
        t20 t20Var = new t20(this, wa71Var, (byte) 18);
        return w3p1.k(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, m830.W0, new j4r(m830.Z0), m830.P0), new l4r(new wlu(jd11Var.b(jo70.class)), 1, m830.Q0, new j4r(m830.a1), m830.R0), l4rVar, l4rVar2, l4rVar3, t20Var);
    }

    public jtq b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        jtq jtqVar = new jtq();
        jtqVar.a = yqu.a(jhc1.c);
        kc00 kc00Var = new kc00(context, (byte) 1);
        jtqVar.b = kc00Var;
        jtqVar.c = yqu.a(new jjj0(kc00Var, new bsn(kc00Var, (byte) 0)));
        kc00 kc00Var2 = jtqVar.b;
        jtqVar.d = new cjg(kc00Var2, (byte) 1);
        kly0 kly0VarA = yqu.a(new xpw0(jtqVar.d, yqu.a(new djg(kc00Var2, (byte) 1)), (byte) 1));
        jtqVar.e = kly0VarA;
        j690 j690Var = new j690((byte) 8);
        kc00 kc00Var3 = jtqVar.b;
        pm41 pm41Var = new pm41(kc00Var3, kly0VarA, j690Var);
        kly0 kly0Var = jtqVar.a;
        kly0 kly0Var2 = jtqVar.c;
        jtqVar.f = yqu.a(new kog1(new hns(kly0Var, kly0Var2, pm41Var, kly0VarA, kly0VarA), new jyh1(kc00Var3, kly0Var2, kly0VarA, pm41Var, kly0Var, kly0VarA, kly0VarA), new yvl1(kly0Var, kly0VarA, pm41Var, kly0VarA)));
        return jtqVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public fmr d(MediaFormat mediaFormat, ie30 ie30Var, Surface surface, boolean z, LogSessionId logSessionId) throws ExportException {
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        ie30Var.f66p.getClass();
        try {
            Context context = this.a;
            ArrayList arrayList = new ArrayList((Collection) hkh0.h(ie30Var, false, false));
            Collections.sort(arrayList, new yxh(new ekh0(context, ie30Var, (byte) 0), (byte) 1));
            if (arrayList.isEmpty()) {
                throw e("No decoders for format", ie30Var);
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    bkh0 bkh0Var = (bkh0) arrayList.get(i);
                    if (!bkh0Var.g) {
                        arrayList2.add(bkh0Var);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 && ((bkh0) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (i2 >= 35 && logSessionId != null) {
                mb4.I(mediaFormat, logSessionId);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context2 = this.a;
            for (bkh0 bkh0Var2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", bkh0Var2.c);
                try {
                    fmr fmrVar = new fmr(context2, ie30Var, mediaFormat, bkh0Var2.a, true, surface);
                    fmrVar.c();
                    return fmrVar;
                } catch (ExportException e) {
                    arrayList3.add(e);
                }
            }
            throw ((ExportException) arrayList3.get(0));
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            oon1.w("Error querying decoders", e2);
            throw e("Querying codecs failed", ie30Var);
        }
    }

    public Intent f(Intent intent) {
        int i = AllboardingActivity.l1;
        Context context = this.a;
        context.getClass();
        return x2g0.z(context, EntryPoint.LIBRARY_ADD_ARTISTS);
    }

    public ox1 h(String str) {
        Set set = s4b1.f;
        if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
            return new ox1(this.a);
        }
        hhg1.n("No collection data statement builder for ".concat(str));
        return null;
    }

    public Object i(String str, String str2, a8d1 a8d1Var) {
        qdf0 qdf0VarG = kcf0.g(this.a, str, str2);
        ohd ohdVar = new ohd(1, aym.t(a8d1Var));
        ohdVar.t();
        jdf0 jdf0Var = new jdf0(ohdVar, (byte) 1);
        jdf0 jdf0Var2 = new jdf0(ohdVar, (byte) 0);
        qdf0VarG.b(jdf0Var);
        qdf0VarG.a(jdf0Var2);
        ohdVar.n(new lb50(qdf0VarG, jdf0Var, jdf0Var2, (byte) 28));
        return ohdVar.r();
    }

    public void j(String[] strArr, boolean z) {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) PlayedStateService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("played", z);
        intent.setAction("PlayedStateService.action.PLAYED");
        context.startService(intent);
    }

    public void k(Context context) {
        context.getClass();
        this.a = context;
    }

    public /* synthetic */ dn3(Context context, boolean z) {
        this.a = context;
    }
}
