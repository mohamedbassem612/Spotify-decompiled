package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ListView;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.spotify.widgets.dynamicnpvwidget.actioncallbacks.WidgetInteractionActionCallback;
import defpackage.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(ep8 ep8Var, iu30 iu30Var, yqg yqgVar, ai4 ai4Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        m4c m4cVar = fkj0.X;
        List list = ep8Var.a.h;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-211450179);
        int i2 = i | (b0kVar3.g(ep8Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(yqgVar) ? 256 : 128) | (b0kVar3.e(ai4Var.ordinal()) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = b0kVar3.g(context);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new oq51(context);
                b0kVar3.s0(objT);
            }
            oq51 oq51Var = (oq51) objT;
            boolean zG2 = b0kVar3.g(list);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = mqo1.A(list);
                b0kVar3.s0(objT2);
            }
            c380 c380Var = (c380) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            tvx tvxVarA = tvx.a(tvxVarB, 2.0f, 6);
            zov0 zov0Var = cbx.b(b0kVar3).g;
            uvx uvxVar = new uvx(0, (pgx) null, 3, zzq0Var, (zzq0) null, tvxVarA, (hw61) null, 1, new p3v(48.0f), 83);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT3 = b0kVar3.T();
            if (z || objT3 == m4cVar) {
                objT3 = new sn8(iu30Var, yqgVar, (byte) 1);
                b0kVar3.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0("TODO")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("TODO"), function0);
            j2i j2iVarR2 = apo.r(220411700, new gp8(ep8Var, (byte) 0), b0kVar3);
            j2i j2iVarR3 = apo.r(1909597173, new gp8(ep8Var, (byte) 1), b0kVar3);
            if (ep8Var.b) {
                b0kVar3.i0(1406578790);
                j2iVarR = apo.r(1545942779, new ef8(ep8Var, iu30Var, (byte) 2), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1406864362);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, null, false, null, null, gbxVar, null, null, j2iVarR2, null, j2iVarR3, j2iVarR, null, null, apo.r(-1661209351, new k8((Object) ep8Var, (Object) oq51Var, (Object) c380Var, (Object) ai4Var, (byte) 12), b0kVar3), b0kVar2, 805306432, 196656, 26044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) ep8Var, (Object) iu30Var, (Object) yqgVar, (Object) ai4Var, qim0Var2, i, (byte) 17);
        }
    }

    public static final void b(puo puoVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        xu30 xu30Var;
        xu30 xu30Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(391360357);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(puoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ouo ouoVar = puoVar.a;
            boolean zA = ef.c(b0kVar3).a().a();
            boolean zG = b0kVar3.g(ouoVar);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new fnn(ouoVar, (byte) 24);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            ngx ngxVar = ngx.e;
            zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVarA = uvx.a(uvxVar, ngxVar, 2, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), zzq0VarH, (tvx) null, (p3v) null, 481);
            gbx gbxVar = new gbx(z50.c, function0);
            String str = ouoVar.c;
            if (str == null) {
                b0kVar3.i0(-1818929039);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(-1818929038);
                xu30 xu30VarR = apo.r(-879575619, new kaf(str, (byte) 23), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            if (ouoVar.e) {
                b0kVar3.i0(-1818800791);
                xu30 xu30VarR2 = apo.r(1630278286, new tf((Object) puoVar, (Object) ouoVar, (Object) function1, zA, (byte) 7), b0kVar3);
                b0kVar3.r(false);
                xu30Var2 = xu30VarR2;
            } else {
                b0kVar3.i0(-1817453160);
                b0kVar3.r(false);
                xu30Var2 = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVarA, null, false, null, null, gbxVar, null, xu30Var2, null, null, xu30Var, ouoVar.d ? mhi.b : null, null, null, apo.r(-17955423, new mgl(ouoVar, (byte) 19), b0kVar3), b0kVar2, 64, 196608, 26300);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, puoVar, function0, function1, qim0Var2, (byte) 28);
        }
    }

    public static final void c(bro1 bro1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1816977582);
        int i2 = i | (x340Var.i(bro1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = bro1Var instanceof xk7;
            cnx cnxVar = z ? cnx.c : okx.c;
            String strM = bro1Var.m();
            cnx cnxVar2 = cnxVar;
            String strM2 = bro1Var.m();
            if (z) {
                x340Var.i0(1936246010);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.d;
            } else {
                x340Var.i0(1936247126);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r(false);
            long j2 = j;
            qim0 qim0Var3 = nim0.a;
            hqn1.h(cnxVar2, strM, strM2, function0, anm1.N("artifact-page-file-attachment", qim0Var3), j2, false, bro1Var instanceof al7, null, joi.a, x340Var, 805306376 | ((i2 << 6) & 7168), 320);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(bro1Var, function0, qim0Var2, i, (byte) 7);
        }
    }

    public static final void d(zxi1 zxi1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        lee1 lee1VarA;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1837374981);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(zxi1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            if (zxi1Var.c != null) {
                b0kVar3.i0(-2119990752);
                uwr uwrVar = cbx.a;
                lee1VarA = lee1.a(cbx.d(b0kVar3).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-2119894032);
                uwr uwrVar2 = cbx.a;
                lee1VarA = cbx.d(b0kVar3).k;
                b0kVar3.r(false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new uyh1(iu30Var, (byte) 20);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15), new uvx(0, mgx.e, 0, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 501), null, false, null, null, null, null, null, zpj.b, null, apo.r(277897677, new e9f1(zxi1Var, (byte) 28), b0kVar3), null, null, null, apo.r(-1568437175, new sgi1(zxi1Var, lee1VarA, (byte) 5), b0kVar3), b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(zxi1Var, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    public static boolean e(ListView listView) {
        return listView.canScrollList(-1);
    }

    public static Intent f(Context context, int i, scn0 scn0Var) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", WidgetInteractionActionCallback.class.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(scn0Var.a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            x60 x60Var = (x60) entry.getKey();
            arrayList.add(new mmr0(x60Var.a, entry.getValue()));
        }
        mmr0[] mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", mno1.h((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length)));
        return intentPutExtra;
    }

    public static final nmy g(cky ckyVar, boolean z) {
        dky dkyVar;
        int i;
        nqt0 nqt0Var;
        bky bkyVar = ckyVar.h;
        oqt0 oqt0Var = null;
        b2a b2aVarF = m(bkyVar) ? w5p1.f(ckyVar) : null;
        List list = bkyVar != null ? bkyVar.a : null;
        if (bkyVar != null && (dkyVar = bkyVar.b) != null) {
            boolean z2 = dkyVar.a;
            boolean z3 = dkyVar.b;
            float f = dkyVar.c;
            int iC = l1d.C(dkyVar.d);
            if (iC != 0) {
                int i2 = 2;
                if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                i = i2;
            } else {
                i = 1;
            }
            int iC2 = l1d.C(dkyVar.e);
            if (iC2 == 0) {
                nqt0Var = nqt0.e;
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                nqt0Var = nqt0.f;
            }
            oqt0Var = new oqt0(z2, z3, f, i, nqt0Var, true);
        }
        return new nmy(b2aVarF, list, oqt0Var, z);
    }

    public static final boolean h(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return u890.j(ihc1.e1(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final double i(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }

    public static final String j(Collection collection) {
        return !collection.isEmpty() ? jhc1.C(o7h.y0(collection, ",\n", "\n", "\n", (iu30) null, 56)).concat("},") : " }";
    }

    public static final String k(Bundle bundle) {
        String string;
        return (!l(bundle) || bundle == null || (string = bundle.getString("com.spotify.music.extra.SUGGESTED_TYPE", "default")) == null) ? "default" : string;
    }

    public static final boolean l(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey("com.spotify.music.extra.SUGGESTED_TYPE");
        }
        return false;
    }

    public static final boolean m(bky bkyVar) {
        ArrayList arrayList;
        if (bkyVar == null) {
            return false;
        }
        List list = bkyVar.a;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!ihc1.y0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return ((arrayList == null || arrayList.isEmpty()) && bkyVar.b == null) ? false : true;
    }

    public static final String n(Collection collection) {
        return jhc1.C(o7h.y0(collection, ",", (String) null, (String) null, (iu30) null, 62)).concat(jhc1.C(" }"));
    }

    public static final String o(Collection collection) {
        return jhc1.C(o7h.y0(collection, ",", (String) null, (String) null, (iu30) null, 62)).concat(jhc1.C("},"));
    }

    public static z771 p(blc0 blc0Var, String... strArr) {
        String strConcat;
        Object objJ0;
        String str;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        switch (blc0Var.ordinal()) {
            case 809:
                strConcat = "about-the-song";
                Set set = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 810:
                objJ0 = f46.j0(strArr2);
                str = "ai-playlist:";
                strConcat = gvg.g(objJ0, str);
                Set set2 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 811:
                strConcat = "chapter:audio";
                Set set3 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 812:
                strConcat = "chapter:video";
                Set set4 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 813:
                strConcat = "cultural-moments";
                Set set5 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 814:
                strConcat = "daylist:".concat(f46.s0(strArr2, ":", (String) null, (String) null, (iu30) null, 62));
                Set set6 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 815:
                strConcat = "entity";
                Set set7 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 816:
                strConcat = "fandom-collectibles";
                Set set8 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 817:
                strConcat = "full-content:audio";
                Set set9 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 818:
                strConcat = "full-content:video";
                Set set10 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 819:
                strConcat = "inappmessaging";
                Set set11 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 820:
                strConcat = "listening-stats:".concat(f46.s0(strArr2, ":", (String) null, (String) null, (iu30) null, 62));
                Set set12 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 821:
                strConcat = "lyrics";
                Set set13 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 822:
                strConcat = "messaging-actions";
                Set set14 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 823:
                strConcat = "music-video";
                Set set15 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 824:
                strConcat = "playlist-with-tracks";
                Set set16 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 825:
                strConcat = "prompted-playlist";
                Set set17 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 826:
                strConcat = "prompted-playlist-default";
                Set set18 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 827:
            case 828:
            default:
                hhg1.g(blc0Var, "Cannot create share format id from ");
                return null;
            case 829:
                objJ0 = f46.j0(strArr2);
                str = "running:";
                strConcat = gvg.g(objJ0, str);
                Set set19 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 830:
                strConcat = "song-dna";
                Set set110 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 831:
                strConcat = "timestamp:audio";
                Set set111 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 832:
                strConcat = "timestamp:transcript";
                Set set112 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 833:
                strConcat = "timestamp:video";
                Set set113 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 834:
                strConcat = "transcript";
                Set set114 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 835:
                strConcat = "vtec";
                Set set115 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 836:
                strConcat = "watch-feed-entity-share";
                Set set116 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
            case 837:
                strConcat = "your-sound-capsule";
                Set set117 = s4b1.f;
                return new z771(uic.x("spotify:shareformat:".concat(strConcat)));
        }
    }

    public static Object q(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final boolean r(cky ckyVar) {
        kky kkyVar = ckyVar.d;
        if ((kkyVar == null || kkyVar.a.length() != 0 || !u890.j(kkyVar.c, gky.a)) && kkyVar != null) {
            return false;
        }
        wiy wiyVar = ckyVar.f;
        String str = wiyVar != null ? wiyVar.a : null;
        return (str == null || ihc1.y0(str)) && m(ckyVar.h) && ckyVar.g == null;
    }

    public static Map s(String str) {
        return u890.j(o7h.t0(1, ihc1.Q0(str, new String[]{":"}, 0, 6)), "track") ? sqg0.J(new mmr0[]{new mmr0("has_video", "true"), new mmr0("is_single_track_video_content", "true")}) : sqg0.J(new mmr0[]{new mmr0("has_video", "true"), new mmr0("is_video_first", "true")});
    }

    public static void t(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
