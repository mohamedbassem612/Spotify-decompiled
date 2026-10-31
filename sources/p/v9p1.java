package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Next;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class v9p1 {
    public static b180 a;
    public static b180 b;

    public static Intent A(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ReportWebViewActivity.class);
        intent.putExtra("report_webview_url", str);
        return intent;
    }

    public static final long B(MessageTemplate messageTemplate, b0k b0kVar) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-957395565);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.a;
            x340Var.r(false);
            return j;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-957392909);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).c.a;
            x340Var2.r(false);
            return j2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-957390605);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).c.a;
        x340Var3.r(false);
        return j3;
    }

    public static final long C(MessageTemplate messageTemplate, x340 x340Var) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof ModalTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340Var.i0(805558276);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            x340Var.r(false);
            return jA;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340Var.i0(805560964);
            uwr uwrVar2 = cbx.a;
            long j = cbx.a(x340Var).a.c;
            x340Var.r(false);
            return j;
        }
        x340Var.i0(805563588);
        uwr uwrVar3 = cbx.a;
        long jA2 = cbx.a(x340Var).a.a.a();
        x340Var.r(false);
        return jA2;
    }

    public static final long D(MessageTemplate messageTemplate, b0k b0kVar) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof ModalTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-42642189);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            x340Var.r(false);
            return j;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-42639600);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).b.a;
            x340Var2.r(false);
            return j2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-42637456);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).b.a;
        x340Var3.r(false);
        return j3;
    }

    public static final long E(MessageTemplate messageTemplate, b0k b0kVar) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1689326203);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            x340Var.r(false);
            return j;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1689328699);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).b.a;
            x340Var2.r(false);
            return j2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1689330843);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).b.a;
        x340Var3.r(false);
        return j3;
    }

    public static final long F(MessageTemplate messageTemplate, b0k b0kVar) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof ModalTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-118008962);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            x340Var.r(false);
            return j;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-118006466);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).b.a;
            x340Var2.r(false);
            return j2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-118004322);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).b.a;
        x340Var3.r(false);
        return j3;
    }

    public static final long G(MessageTemplate messageTemplate, b0k b0kVar) {
        if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-815724598);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.c;
            x340Var.r(false);
            return j;
        }
        if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-815721854);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).b.a;
            x340Var2.r(false);
            return j2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-815719710);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).b.a;
        x340Var3.r(false);
        return j3;
    }

    public static final et30 H(View view) {
        while (view != null) {
            Object tag = view.getTag(2131430655);
            et30 et30Var = tag instanceof et30 ? (et30) tag : null;
            if (et30Var != null) {
                return et30Var;
            }
            Object objP = dm5.P(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final String I(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th != null ? th.getCause() : null; cause != null; cause = cause.getCause()) {
            arrayList.add(cause.getClass().getSimpleName());
        }
        return !arrayList.isEmpty() ? nfa0.d.b(new r36(chc1.a, (byte) 0), arrayList) : "";
    }

    public static final String J(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString == null) {
            return "Stack trace N/A";
        }
        if (stackTraceString.length() > 2000) {
            stackTraceString = stackTraceString.substring(0, 1999);
        }
        return stackTraceString.replace('\t', ' ').replace('\n', ' ');
    }

    public static final ep80 K(File file) {
        cp80 cp80Var;
        ep80 ep80Var = new ep80();
        String name = file.getName();
        ep80Var.a = name;
        if (nhc1.Y(name, "crash_log_", false)) {
            cp80Var = cp80.d;
        } else if (nhc1.Y(name, "shield_log_", false)) {
            cp80Var = cp80.e;
        } else if (nhc1.Y(name, "thread_check_log_", false)) {
            cp80Var = cp80.f;
        } else if (nhc1.Y(name, "analysis_log_", false)) {
            cp80Var = cp80.b;
        } else {
            cp80Var = nhc1.Y(name, "anr_log_", false) ? cp80.c : cp80.a;
        }
        ep80Var.b = cp80Var;
        JSONObject jSONObjectN = fap1.n(name);
        if (jSONObjectN != null) {
            ep80Var.g = Long.valueOf(jSONObjectN.optLong("timestamp", 0L));
            ep80Var.d = jSONObjectN.optString("app_version", null);
            ep80Var.e = jSONObjectN.optString("reason", null);
            ep80Var.f = jSONObjectN.optString("callstack", null);
            ep80Var.c = jSONObjectN.optJSONArray("feature_names");
        }
        return ep80Var;
    }

    public static ksk0 L(String str, String str2) {
        return new ksk0(str, str2, (byte) 16);
    }

    public static final EventSource M(g0l g0lVar, zzp0 zzp0Var, dxz0 dxz0Var, zor zorVar, ObservableFromPublisher observableFromPublisher, c9c0 c9c0Var) {
        inr inrVar = (inr) g0lVar;
        return RxEventSources.a(new ObservableSource[]{inrVar.j().distinctUntilChanged().map(si10.T0), Observable.combineLatest(inrVar.d(), yoi1.i(new php0(c9c0Var.b.current(), (byte) 3), o6x.a), eh10.T0), zzp0Var.a.map(mi10.T0), dxz0Var.c().distinctUntilChanged().map(xi10.T0), zorVar.e.distinctUntilChanged().map(dj10.S0), observableFromPublisher.map(y580.l1)});
    }

    public static final jge N(mr20 mr20Var, yqg yqgVar) {
        return hu20.e(rqt0.u(new jha1(mr20Var, (byte) 14)), new afb1((lnm) null, yqgVar, (byte) 3));
    }

    public static final void O(View view, g0i g0iVar) {
        view.setTag(2131430655, g0iVar);
    }

    public static final long P(long j, String str) {
        if (str == null) {
            return j;
        }
        try {
            return str.length() == 0 ? j : z4p1.e(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return j;
        }
    }

    public static long Q(int i, long j) {
        return (j & (-1073741824)) | ((long) i);
    }

    public static long R(int i, long j) {
        return (j & (-1152921503533105153L)) | (((long) i) << 30);
    }

    public static long S(long j) {
        return j & (-1152921504606846977L);
    }

    public static final void a(su1 su1Var, fu1 fu1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-232501072);
        int i2 = (x340Var.i(su1Var) ? 4 : 2) | i | (x340Var.i(fu1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vo1 vo1Var = su1Var.b;
            if (u890.j(vo1Var, qn31.a)) {
                x340Var.i0(-95224960);
                s(fu1Var, null, x340Var, (i2 >> 3) & 14, 2);
                x340Var.r(false);
            } else if (vo1Var instanceof p030) {
                x340Var.i0(-95223492);
                l(0, ((p030) vo1Var).a.b, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-95221708);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tw1(su1Var, fu1Var, i);
        }
    }

    public static final void b(fu1 fu1Var, kw1 kw1Var, jw1 jw1Var, ow1 ow1Var, iu30 iu30Var, boolean z, Function0 function0, Function0 function1, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        j2i j2iVar2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        boolean z2 = kw1Var.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1318668652);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(fu1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(kw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(jw1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(ow1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function2 = function1;
            i2 |= x340Var2.i(function2) ? 8388608 : 4194304;
        } else {
            function2 = function1;
        }
        if ((100663296 & i) == 0) {
            j2iVar2 = j2iVar;
            i2 |= x340Var2.i(j2iVar2) ? 67108864 : 33554432;
        } else {
            j2iVar2 = j2iVar;
        }
        if (!x340Var2.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else {
            if (fu1Var.f()) {
                x340Var2.i0(-1607643638);
                op71.g(x340Var2, u291.h(nim0.a, ((wat) x340Var2.k(t4k.h)).M0(x8p1.l(x340Var2).b)));
                x340Var2.r(false);
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new px1(fu1Var, kw1Var, jw1Var, ow1Var, iu30Var, z, function0, function2, j2iVar2, i, (byte) 0);
                    return;
                }
                return;
            }
            int i3 = i2;
            x340Var2.i0(-1607478346);
            x340Var2.r(false);
            boolean zA = jw1Var.a(fu1Var, z2);
            x340Var2.i0(-1607308156);
            y7e1 y7e1Var = kw1Var.a;
            boolean z3 = kw1Var.c;
            boolean z4 = z2 || (jw1Var.a instanceof zx1);
            String str = kw1Var.f;
            int i4 = i3 & 57344;
            boolean z5 = i4 == 16384;
            Object objT = x340Var2.T();
            if (z5 || objT == m4cVar) {
                objT = new cr0(iu30Var, (byte) 24);
                x340Var2.s0(objT);
            }
            Function0 function3 = (Function0) objT;
            boolean z6 = i4 == 16384;
            Object objT2 = x340Var2.T();
            if (z6 || objT2 == m4cVar) {
                objT2 = new cr0(iu30Var, (byte) 25);
                x340Var2.s0(objT2);
            }
            Function0 function4 = (Function0) objT2;
            boolean z7 = i4 == 16384;
            Object objT3 = x340Var2.T();
            if (z7 || objT3 == m4cVar) {
                objT3 = new cr0(iu30Var, (byte) 26);
                x340Var2.s0(objT3);
            }
            int i5 = i3 >> 6;
            int i6 = i3 >> 9;
            u(fu1Var, y7e1Var, z3, z4, zA, str, function3, jw1Var, function4, (Function0) objT3, jw1Var.d, ow1Var, z, function0, function1, null, j2iVar, x340Var2, (i3 & 14) | ((i3 << 15) & 29360128), (i6 & 57344) | (i6 & 7168) | 8 | (i5 & 112) | (i6 & 896) | (3670016 & i5));
            x340Var = x340Var2;
            x340Var.r(false);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new px1(fu1Var, kw1Var, jw1Var, ow1Var, iu30Var, z, function0, function1, j2iVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void c(Function0 function0, qim0 qim0Var, hux huxVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        hux huxVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        gdx gdxVarS;
        ldx ldxVar;
        String strO0;
        boolean z2;
        Object objT;
        Function0 function1;
        int i4;
        boolean zI;
        hux huxVar3 = huxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1169498711);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) != 0) {
                    i4 = 128;
                } else {
                    if ((i & 512) == 0) {
                        zI = x340Var.g(huxVar3);
                    } else {
                        zI = x340Var.i(huxVar3);
                    }
                    if (zI) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i5 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        huxVar3 = ikx.c;
                        i3 &= -897;
                    }
                    qim0Var2 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                x340Var.s();
                gdxVarS = yla.s(x340Var);
                ldxVar = ldx.c;
                strO0 = cwl1.o0(x340Var, 2131951926);
                z2 = (i3 & 14) == 4;
                objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new y1(function0, (byte) 16);
                    x340Var.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                wro1.h(new gbx(new y50(strO0), function1), ldxVar, qim0Var2, null, gdxVarS, null, false, null, null, apo.r(-389678016, new f90(huxVar3, (byte) 3), x340Var), x340Var, ((i3 << 3) & 896) | 48, 6, 984);
            } else {
                x340Var.b0();
            }
            huxVar2 = huxVar3;
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((Object) function0, (Object) qim0Var3, (Object) huxVar2, i, i2, (byte) 0);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i4 = 128;
            } else {
                if ((i & 512) == 0) {
                    zI = x340Var.g(huxVar3);
                } else {
                    zI = x340Var.i(huxVar3);
                }
                if (zI) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    huxVar3 = ikx.c;
                    i3 &= -897;
                }
                qim0Var2 = qim0Var4;
            } else {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    huxVar3 = ikx.c;
                    i3 &= -897;
                }
                qim0Var2 = qim0Var4;
            }
            x340Var.s();
            gdxVarS = yla.s(x340Var);
            ldxVar = ldx.c;
            strO0 = cwl1.o0(x340Var, 2131951926);
            if ((i3 & 14) == 4) {
            }
            objT = x340Var.T();
            if (z2) {
                objT = new y1(function0, (byte) 16);
                x340Var.s0(objT);
            } else {
                objT = new y1(function0, (byte) 16);
                x340Var.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), ldxVar, qim0Var2, null, gdxVarS, null, false, null, null, apo.r(-389678016, new f90(huxVar3, (byte) 3), x340Var), x340Var, ((i3 << 3) & 896) | 48, 6, 984);
        } else {
            x340Var.b0();
        }
        huxVar2 = huxVar3;
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((Object) function0, (Object) qim0Var3, (Object) huxVar2, i, i2, (byte) 0);
        }
    }

    public static final void d(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1615209042);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            function1 = function0;
            c(function1, anm1.N("back_button", eqr0.D(-4.0f, 0.0f, 2, nim0Var)), null, x340Var, (i2 & 14) | 48, 4);
            dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rx1(function1, j2iVar, i, (byte) 0);
        }
    }

    public static final void e(String str, qng qngVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-449603131);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(qngVar) : x340Var.i(qngVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str2 = yon1.B3().c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-add-to-playlist";
                x6h1VarI.f = "16.6.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str2;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("playlist/addtoplaylist");
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                x340Var.s0(r6h1Var2);
                objT = r6h1Var2;
            }
            r6h1 r6h1Var3 = (r6h1) objT;
            boolean zI = x340Var.i(r6h1Var3);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb1(r6h1Var3, (byte) 5);
                x340Var.s0(objT2);
            }
            dgo1.c("clip-title-editing-ubi-parent", (iu30) objT2, apo.r(580780289, new n2(qngVar, str, (byte) 19), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(str, qngVar, i, (byte) 6);
        }
    }

    public static final void f(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar3;
        j2i j2iVar4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1286637933);
        int i2 = i | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(bmq0.L(dug.f(qim0VarF, cbx.a(x340Var).a.d, d4o1.a), k1o1.q(x340Var), (g6o0) null), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, too1.y(qim0VarH, new mih1(new bgc0(lhc.g(x340Var).g, 32), poo1.s(cbx.b(x340Var).b.b, 7))));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pbh pbhVar = pbh.a;
            j2iVar3 = j2iVar;
            j2iVar3.invoke(pbhVar, x340Var, 54);
            op71.g(x340Var, u291.h(nim0.a, cbx.b(x340Var).b.e));
            j2iVar4 = j2iVar2;
            j2iVar4.invoke(pbhVar, x340Var, 54);
            x340Var.r(true);
        } else {
            j2iVar3 = j2iVar;
            j2iVar4 = j2iVar2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new huh(j2iVar3, j2iVar4, qim0Var, i, (byte) 0);
        }
    }

    public static final void g(pc30 pc30Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-443030656);
        int i2 = (x340Var.g(pc30Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            ujo1.c(l6o1.C(0, 0, 1, x340Var), dug.f(nim0.a, cbx.a(x340Var).a.c, d4o1.a), apo.r(-327399051, new mc30(pc30Var, iu30Var, b2), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mc30(pc30Var, iu30Var, i, b3);
        }
    }

    public static final void h(Function0 function0, String str, Function0 function1, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(484122631);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            int i3 = i2;
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            c(function0, anm1.N("back_button", nim0Var), null, x340Var, (i3 & 14) | 48, 4);
            String strO0 = cwl1.o0(x340Var, 2131951930);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, new wnb0(1.0f, true), cbx.d(x340Var).f, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            dv20.l((i3 >> 9) & 14, j2iVar, x340Var, true);
            if (str != null) {
                x340Var.i0(1971907537);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 48);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                c(function1, null, olx.c, x340Var, ((i3 >> 6) & 14) | (olx.d << 6), 2);
                str2 = str;
                l((i3 >> 3) & 14, str2, x340Var, null);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                str2 = str;
                x340Var.i0(1972117221);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(function0, str2, function1, j2iVar, i);
        }
    }

    public static final void i(jw1 jw1Var, boolean z, Function0 function0, Function0 function1, ow1 ow1Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-929409460);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(jw1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(ow1Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            t(2131951927, (i2 & 896) | 48, "cancel_button", function0, x340Var, null);
            if (jw1Var.a instanceof zx1) {
                x340Var.i0(-1879355796);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                uwr uwrVar = cbx.a;
                z2 = false;
                uwo1.e(cwl1.o0(x340Var, 2131951944), wnb0Var, cbx.d(x340Var).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-1879121684);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                t1c.a(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), x340Var, 0);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(-1879054724);
                m(ow1Var, null, x340Var, (i2 >> 12) & 14);
                x340Var.r(z2);
            } else {
                x340Var.i0(-1878991112);
                t(2131951928, ((i2 >> 3) & 896) | 48, "done_button", function1, x340Var, null);
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) jw1Var, z, (Object) function0, (Object) function1, (Object) ow1Var, i, (byte) 0);
        }
    }

    public static final void j(pc30 pc30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1271195163);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pc30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(1505569784, new mc30(pc30Var, iu30Var, b2), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(pc30Var, iu30Var, i, (byte) 13);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(170796115);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131951937);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y1(function0, (byte) 17);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, ldxVar, anm1.N("manage_defaults", qim0Var3), null, gdxVarS, null, null, null, t4i.b, null, t4i.c, x340Var, 805306416, 48, 1496);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 0);
        }
    }

    public static final void l(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1637031268);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).f;
            zic0 zic0Var = new zic0(1);
            int i4 = (i3 & 14) | 1572864 | (i3 & 112);
            qim0Var2 = nim0.a;
            uwo1.e(str, qim0Var2, lee1Var, 0L, null, null, 2, false, zic0Var, 0, null, x340Var, i4, 0, 1720);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var2, i, (byte) 1);
        }
    }

    public static final void m(ow1 ow1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-860005548);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ow1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pv1(ow1Var, b2);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, ldxVar, anm1.N("new_playlist", qim0Var3), null, gdxVarS, null, null, null, null, null, t4i.a, x340Var, 48, 48, 2008);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yv1(ow1Var, qim0Var2, i);
        }
    }

    public static final void n(List list, iu30 iu30Var, b0k b0kVar, int i) {
        h311 h311VarV;
        zdv0 zdv0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1661188414);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (list.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zdv0Var = new zdv0(list, iu30Var, i, b2);
                }
            } else {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                int i3 = ((i2 & 14) == 4 ? (byte) 1 : (byte) 0) | ((i2 & 112) == 32 ? (byte) 1 : (byte) 0);
                Object objT = x340Var.T();
                if (i3 != 0 || objT == fkj0.X) {
                    objT = new v40(list, iu30Var, (byte) 1);
                    x340Var.s0(objT);
                }
                too1.b(null, null, zzq0VarH, (iu30) objT, x340Var, 0, 3);
            }
            h311VarV.d = zdv0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            zdv0Var = new zdv0(list, iu30Var, i, b3);
            h311VarV.d = zdv0Var;
        }
    }

    public static final void o(boolean z, y7e1 y7e1Var, fu1 fu1Var, String str, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-256494915);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(y7e1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(fu1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fq7.g(z, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(1090591461, new k8((Object) function0, (Object) y7e1Var, (Object) fu1Var, (Object) str, (byte) 3), x340Var), x340Var, (i2 & 14) | 196608, 30);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(z, y7e1Var, fu1Var, str, function0, i);
        }
    }

    public static final void p(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1993063126);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(12.0f));
            ni7 ni7VarA = oi7.a(Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/ForcedGraduation.webp"), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
            as80 as80Var = mif1.S0;
            cbx.a.getClass();
            eso1.h(ni7VarA, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, x340Var, 3120, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 2);
        }
    }

    public static final void q(pc30 pc30Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2088665515);
        byte b2 = 4;
        int i2 = (x340Var.g(pc30Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ujo1.c(l6o1.C(0, 0, 1, x340Var), zr7.i(nim0.a, j830.t), apo.r(-1326716970, new mc30(pc30Var, iu30Var, (byte) 3), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mc30(pc30Var, iu30Var, i, b2);
        }
    }

    public static final void r(fu1 fu1Var, ow1 ow1Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1046518935);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fu1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ow1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            s(fu1Var, kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, true), x340Var, i2 & 14, 0);
            if (z) {
                x340Var.i0(1441376034);
                k((i2 >> 9) & 14, function0, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(1441449969);
                m(ow1Var, null, x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(fu1Var, ow1Var, z, function0, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void s(fu1 fu1Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(4524302);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.i(fu1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var2 = nim0.a;
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).f;
                zic0 zic0Var = new zic0(1);
                if (fu1Var.m instanceof by1) {
                    strK = x0d.k(x340Var, 52898071, 2131951930, x340Var, false);
                } else if (fu1Var.k.isEmpty()) {
                    strK = x0d.k(x340Var, 52902418, 2131951945, x340Var, false);
                } else {
                    strK = x0d.k(x340Var, 52905171, 2131951946, x340Var, false);
                }
                uwo1.e(strK, qim0Var2, lee1Var, 0L, null, null, 2, false, zic0Var, 0, null, x340Var, (i3 & 112) | 1572864, 0, 1720);
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ux1(fu1Var, qim0Var3, i, i2, (byte) 0);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var2 = nim0.a;
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var).f;
            zic0 zic0Var2 = new zic0(1);
            if (fu1Var.m instanceof by1) {
                strK = x0d.k(x340Var, 52898071, 2131951930, x340Var, false);
            } else if (fu1Var.k.isEmpty()) {
                strK = x0d.k(x340Var, 52902418, 2131951945, x340Var, false);
            } else {
                strK = x0d.k(x340Var, 52905171, 2131951946, x340Var, false);
            }
            uwo1.e(strK, qim0Var2, lee1Var2, 0L, null, null, 2, false, zic0Var2, 0, null, x340Var, (i3 & 112) | 1572864, 0, 1720);
        } else {
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ux1(fu1Var, qim0Var3, i, i2, (byte) 0);
        }
    }

    public static final void t(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1578824147);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        byte b2 = 0;
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, i);
            boolean z = (i4 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new y1(function0, (byte) 18);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            gdx gdxVarS = yla.s(b0kVar3);
            ldx ldxVar = ldx.c;
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldxVar, anm1.N(str, qim0Var2), null, gdxVarS, null, null, null, null, null, apo.r(747823916, new vx1(i, b2), b0kVar3), b0kVar2, 48, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wx1(i, str, function0, qim0Var2, i2);
        }
    }

    public static final void u(fu1 fu1Var, y7e1 y7e1Var, boolean z, boolean z2, boolean z3, String str, Function0 function0, jw1 jw1Var, Function0 function1, Function0 function2, qng qngVar, ow1 ow1Var, boolean z4, Function0 function3, Function0 function4, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z5;
        int i4;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1452521245);
        if ((i & 6) == 0) {
            i3 = (b0kVar2.i(fu1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar2.g(y7e1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar2.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z5 = z3;
            i3 |= b0kVar2.h(z5) ? 16384 : 8192;
        } else {
            z5 = z3;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar2.g(str) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar2.i(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar2.i(jw1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar2.i(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar2.i(function2) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? b0kVar2.g(qngVar) : b0kVar2.i(qngVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar2.g(ow1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar2.h(z4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar2.i(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar2.i(function4) ? 16384 : 8192;
        }
        int i6 = i4 | 196608;
        if ((i2 & 1572864) == 0) {
            i6 |= b0kVar2.i(j2iVar) ? 1048576 : 524288;
        }
        int i7 = i6;
        if (b0kVar2.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 599187) == 599186) ? false : true)) {
            gy1 gy1Var = jw1Var.a;
            zx1 zx1Var = gy1Var instanceof zx1 ? (zx1) gy1Var : null;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0Var = qim0Var2;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar2).a.a.a(), d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF2);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            if (z2) {
                b0kVar2.i0(1337184967);
                int i8 = i5 >> 18;
                i(jw1Var, z5, function1, function2, ow1Var, b0kVar2, ((i5 >> 21) & 14) | ((i5 >> 9) & 112) | (i8 & 896) | (i8 & 7168) | ((i7 << 9) & 57344));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1337402153);
                b0kVar2.r(false);
            }
            if (z4) {
                b0kVar2.i0(1337430642);
                d(function3, j2iVar, b0kVar2, ((i7 >> 9) & 14) | ((i7 >> 15) & 112));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1337496610);
                if (zx1Var == null || qngVar == null) {
                    b0kVar2.i0(1337618409);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(1337547295);
                    e(zx1Var.a, qngVar, b0kVar2, ((i7 << 3) & 112) | 64);
                    b0kVar2.r(false);
                }
                r(fu1Var, ow1Var, z3, function4, b0kVar2, (i5 & 14) | (i7 & 112) | ((i5 >> 6) & 896) | ((i7 >> 3) & 7168));
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            }
            int i9 = i5 >> 6;
            o(z, y7e1Var, fu1Var, str, function0, b0kVar2, (i9 & 14) | (i5 & 112) | ((i5 << 6) & 896) | (i9 & 7168) | (i9 & 57344));
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx1(fu1Var, y7e1Var, z, z2, z3, str, function0, jw1Var, function1, function2, qngVar, ow1Var, z4, function3, function4, qim0Var3, j2iVar, i, i2);
        }
    }

    public static int v(long j) {
        return (j & 2305843009213693952L) != 0 ? 2 : 1;
    }

    public static Next w(rq81 rq81Var, l3f0 l3f0Var, bk8 bk8Var, q41 q41Var) {
        return rq81Var.a ? Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, new g31(c31.a), (bk8) null, 11), 5)) : z(rq81Var, l3f0Var, bk8Var, q41Var);
    }

    public static final ep80 x(String str, String str2) {
        ep80 ep80Var = new ep80();
        ep80Var.b = cp80.c;
        Context contextA = wf10.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ep80Var.d = str3;
        ep80Var.e = str;
        ep80Var.f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        ep80Var.g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        ep80Var.a = stringBuffer.toString();
        return ep80Var;
    }

    public static final ep80 y(Throwable th, cp80 cp80Var) {
        String str;
        String str2;
        ep80 ep80Var = new ep80();
        ep80Var.b = cp80Var;
        Context contextA = wf10.a();
        Throwable th2 = null;
        try {
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            str = packageInfo == null ? null : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ep80Var.d = str;
        ep80Var.e = th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        ep80Var.f = jSONArray.toString();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        ep80Var.g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        int iOrdinal = cp80Var.ordinal();
        if (iOrdinal == 1) {
            str2 = "analysis_log_";
        } else if (iOrdinal == 2) {
            str2 = "anr_log_";
        } else if (iOrdinal == 3) {
            str2 = "crash_log_";
        } else if (iOrdinal != 4) {
            str2 = iOrdinal != 5 ? "Unknown" : "thread_check_log_";
        } else {
            str2 = "shield_log_";
        }
        stringBuffer.append(str2);
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        ep80Var.a = stringBuffer.toString();
        return ep80Var;
    }

    public static Next z(rq81 rq81Var, l3f0 l3f0Var, bk8 bk8Var, q41 q41Var) {
        a11 a11Var = q41Var.c;
        if (l3f0Var.equals(y2f0.a)) {
            return Next.h(q41.a(q41Var, new o41(new eo81(un81.a, bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof z2f0) {
            z2f0 z2f0Var = (z2f0) l3f0Var;
            return Next.h(q41.a(q41Var, new o41(new eo81(new vn81(z2f0Var.a, z2f0Var.b), bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof w2f0) {
            if ((rq81Var != null ? rq81Var.b : null) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            w2f0 w2f0Var = (w2f0) l3f0Var;
            return Next.h(q41.a(q41Var, new o41(new eo81(new co81(rq81Var.b, new xn81(w2f0Var.a, w2f0Var.b)), bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof c3f0) {
            return Next.h(q41.a(q41Var, new o41(new eo81(new wn81(((c3f0) l3f0Var).a), bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof a3f0) {
            return Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, new l31(z1d1.a), (bk8) null, 11), 5));
        }
        if (l3f0Var instanceof b3f0) {
            if ((rq81Var != null ? rq81Var.b : null) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            Set set = a11Var.a;
            a2d1 a2d1Var = a2d1.a;
            if (!set.contains(a2d1Var)) {
                return Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, new l31(a2d1Var), (bk8) null, 11), 5));
            }
            b3f0 b3f0Var = (b3f0) l3f0Var;
            return Next.h(q41.a(q41Var, new o41(new eo81(new co81(rq81Var.b, new yn81(b3f0Var.b, b3f0Var.c)), bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof i3f0) {
            if ((rq81Var != null ? rq81Var.b : null) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            Set set2 = a11Var.a;
            e2d1 e2d1Var = e2d1.a;
            if (!set2.contains(e2d1Var)) {
                return Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, new l31(e2d1Var), (bk8) null, 11), 5));
            }
            i3f0 i3f0Var = (i3f0) l3f0Var;
            return Next.h(q41.a(q41Var, new o41(new eo81(new co81(rq81Var.b, new ao81(f4i1.e(i3f0Var.b, i3f0Var.c))), bk8Var)), (s31) null, 6));
        }
        if (l3f0Var instanceof e3f0) {
            if ((rq81Var != null ? rq81Var.b : null) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            Set set3 = a11Var.a;
            d2d1 d2d1Var = d2d1.a;
            return set3.contains(d2d1Var) ? Next.h(q41.a(q41Var, new o41(new eo81(new co81(rq81Var.b, zn81.a), bk8Var)), (s31) null, 6)) : Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, new l31(d2d1Var), (bk8) null, 11), 5));
        }
        if ((l3f0Var instanceof v2f0) || (l3f0Var instanceof h3f0) || (l3f0Var instanceof d3f0) || (l3f0Var instanceof j3f0) || (l3f0Var instanceof f3f0) || (l3f0Var instanceof g3f0) || (l3f0Var instanceof k3f0) || (l3f0Var instanceof x2f0)) {
            return qbo1.d(q41Var, false, 0, 6);
        }
        eg.o();
        return null;
    }
}
