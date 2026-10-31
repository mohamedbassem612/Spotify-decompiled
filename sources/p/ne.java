package p;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.spotify.base.java.logging.Logger;
import com.spotify.canvaslogger.events.proto.CanvasState;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;
import com.spotify.home.slotloading.proto.GetMainHomeLayoutResponse;
import com.spotify.home.slotloading.proto.GetSlotContentResponse;
import com.spotify.home.slotloading.proto.Slot;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ne implements rgy {
    public static final e4x0 f = new e4x0((byte) 27);
    public static ne g;
    public static ne h;
    public static String i;
    public static String j;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public ne(gc31 gc31Var) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        cxc cxcVar = gc31Var.b;
        List list = gc31Var.f;
        this.a = cxcVar;
        this.b = gc31Var.c;
        List list2 = gc31Var.d;
        int size = list2.size() - gc31Var.e;
        for (int i2 = 1; i2 < size; i2++) {
            ((ArrayList) this.c).add((s2n) list2.get(i2));
        }
        int size2 = list.size() - gc31Var.g;
        for (int i3 = 0; i3 < size2; i3++) {
            ((ArrayList) this.d).add((exc) list.get(i3));
        }
        this.e = gc31Var.h;
    }

    public static CanvasState w(PlayerState playerState, boolean z) {
        String str;
        spq0 spq0VarTrack = playerState.track();
        String str2 = (String) playerState.playbackId().e("");
        fkd fkdVarN = CanvasState.n();
        str2.getClass();
        fkdVarN.v(eth.M(str2));
        if (!spq0VarTrack.c() || (str = (String) ((ContextTrack) spq0VarTrack.b()).metadata().get("canvas.id")) == null) {
            str = "";
        }
        fkdVarN.r(str);
        fkdVarN.s((String) spq0VarTrack.i(bx8.d).e(""));
        fkdVarN.w(((Number) playerState.positionAsOfTimestamp().e(0L)).longValue());
        fkdVarN.x();
        fkdVarN.q(playerState.isPaused() ? "paused" : "playing");
        fkdVarN.n();
        fkdVarN.t(z ? "loaded" : "not_loaded");
        fkdVarN.u();
        return fkdVarN.build();
    }

    public static ne z(Context context) {
        ne neVar = h;
        if (neVar != null) {
            return neVar;
        }
        ne neVar2 = new ne();
        neVar2.c = new JSONObject();
        neVar2.d = new JSONObject();
        new JSONObject();
        neVar2.e = new w3c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        neVar2.a = sharedPreferences;
        neVar2.b = sharedPreferences.edit();
        h = neVar2;
        return neVar2;
    }

    public long A(String str) {
        return ((SharedPreferences) this.a).getLong(str, 0L);
    }

    public String B() {
        String strF = F("bnc_randomized_bundle_token");
        return (TextUtils.isEmpty(strF) || strF.equals("bnc_no_value")) ? F("bnc_identity_id") : strF;
    }

    public String C() {
        String strF = F("bnc_randomized_device_token");
        return (TextUtils.isEmpty(strF) || strF.equals("bnc_no_value")) ? F("bnc_device_fingerprint_id") : strF;
    }

    public JSONObject D() {
        String strF = F("bnc_referringUrlQueryParameters");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strF) && !"bnc_no_value".equals(strF)) {
            try {
                return new JSONObject(strF);
            } catch (JSONException e) {
                i1k0.C("Unable to get URL query parameters as string: " + e);
            }
        }
        return jSONObject;
    }

    public int E() {
        return ((SharedPreferences) this.a).getInt("bnc_retry_interval", 1000);
    }

    public String F(String str) {
        return ((SharedPreferences) this.a).getString(str, "bnc_no_value");
    }

    public void G(String str, String str2) {
        ((t360) this.c).g(str, str2);
    }

    public lt20 H(String str) {
        return x4p1.h(h4p1.l(new n641(str, this, (lnm) null, (byte) 2)), new q8t0((byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(nm21 nm21Var, tv80 tv80Var, onm onmVar) {
        ol21 ol21Var;
        Boolean m231Var;
        if (onmVar instanceof ol21) {
            ol21Var = (ol21) onmVar;
            int i2 = ol21Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ol21Var.e = i2 - Integer.MIN_VALUE;
            } else {
                ol21Var = new ol21(this, onmVar);
            }
        } else {
            ol21Var = new ol21(this, onmVar);
        }
        Object objJ = ol21Var.c;
        int i3 = ol21Var.e;
        try {
            if (i3 == 0) {
                hm5.M(objJ);
                Single singleA = ((ca40) this.e).a();
                ol21Var.a = nm21Var;
                ol21Var.b = tv80Var;
                ol21Var.e = 1;
                objJ = fc11.j(singleA, ol21Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tv80Var = ol21Var.b;
                nm21Var = ol21Var.a;
                hm5.M(objJ);
            }
            m231Var = (Boolean) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        tv80 tv80Var2 = tv80Var;
        Boolean boolM = yah0.m(false);
        if (m231Var instanceof m231) {
            m231Var = boolM;
        }
        if (m231Var.booleanValue()) {
            ca40.d((ca40) this.e, "", tv80Var2, (u0t0) null, new nt01(this, nm21Var, (byte) 23), 12);
        } else {
            ((mm21) this.d).a((Application) this.a, nm21Var.a, hap1.p(nm21Var.a));
        }
        return rih1.a;
    }

    public void J(JSONObject jSONObject) throws JSONException {
        w3c w3cVar = (w3c) this.e;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : w3cVar.a.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : ((ConcurrentHashMap) entry.getValue()).entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put((String) entry.getKey(), jSONObject3);
        }
        f4t f4tVar = f4t.b;
        jSONObject.put("partner_data", jSONObject2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object K(String str, onm onmVar) {
        u030 u030Var;
        vpn vpnVar = (vpn) this.a;
        if (onmVar instanceof u030) {
            u030Var = (u030) onmVar;
            int i2 = u030Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u030Var.c = i2 - Integer.MIN_VALUE;
            } else {
                u030Var = new u030(this, onmVar);
            }
        } else {
            u030Var = new u030(this, onmVar);
        }
        Object objE = u030Var.a;
        int i3 = u030Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objE);
                if (!vpnVar.a.isEmpty()) {
                    pp31 pp31Var = (op31) this.c;
                    List list = vpnVar.a;
                    u030Var.c = 1;
                    objE = pp31Var.e(str, list, u030Var);
                    d9n d9nVar = d9n.a;
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1.a;
            }
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
            ((py21) objE).d();
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    public void L(String str, tn21 tn21Var) {
        if (str.length() <= 0) {
            hhg1.n("method.isEmpty() == true");
            return;
        }
        if (tn21Var == null) {
            if (str.equals(Request.POST) || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                hhg1.f(f4i1.f("method ", str, " must have a request body."));
                return;
            }
        } else if (!eqr0.J(str)) {
            hhg1.f(f4i1.f("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = tn21Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e5 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #6 {all -> 0x007c, blocks: (B:22:0x006e, B:40:0x00df, B:42:0x00e5, B:53:0x012f, B:55:0x0133, B:70:0x01a2, B:71:0x01c5), top: B:103:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #6 {all -> 0x007c, blocks: (B:22:0x006e, B:40:0x00df, B:42:0x00e5, B:53:0x012f, B:55:0x0133, B:70:0x01a2, B:71:0x01c5), top: B:103:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f A[Catch: all -> 0x0185, TryCatch #2 {all -> 0x0185, blocks: (B:59:0x0174, B:61:0x017f, B:66:0x018b, B:68:0x0192), top: B:95:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:66:0x018b A[Catch: all -> 0x0185, TryCatch #2 {all -> 0x0185, blocks: (B:59:0x0174, B:61:0x017f, B:66:0x018b, B:68:0x0192), top: B:95:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a2 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #6 {all -> 0x007c, blocks: (B:22:0x006e, B:40:0x00df, B:42:0x00e5, B:53:0x012f, B:55:0x0133, B:70:0x01a2, B:71:0x01c5), top: B:103:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01a2, please report this as an issue */
    public Object M(g471 g471Var, p371 p371Var, ela1 ela1Var, z771 z771Var, String str, z771 z771Var2, onm onmVar) throws Exception {
        cf71 cf71Var;
        g471 g471Var2;
        g471 g471Var3;
        cqi1 cqi1VarA;
        p371 p371Var2;
        ela1 ela1Var2;
        z771 z771Var3;
        String str2;
        z771 z771Var4;
        int i2;
        yn71 yn71Var;
        p371 p371Var3;
        z771 z771Var5;
        r571 r571Var;
        z771 z771Var6;
        String str3;
        z771 z771Var7;
        yn71 yn71Var2;
        z771 z771Var8;
        String str4;
        ela1 ela1Var3;
        p371 p371Var4;
        g471 g471Var4;
        p371 p371Var5;
        z771 z771Var9;
        Object objD0;
        ho71 m231Var;
        g471 g471Var5;
        String strB;
        String strB2;
        ne neVar = this;
        if (onmVar instanceof cf71) {
            cf71Var = (cf71) onmVar;
            int i3 = cf71Var.X;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cf71Var.X = i3 - Integer.MIN_VALUE;
            } else {
                cf71Var = new cf71(neVar, onmVar);
            }
        } else {
            cf71Var = new cf71(neVar, onmVar);
        }
        Object objA = cf71Var.i;
        int i4 = cf71Var.X;
        d9n d9nVar = d9n.a;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = cf71Var.h;
                go71 go71Var = cf71Var.g;
                z771Var4 = cf71Var.f;
                String str5 = cf71Var.e;
                z771 z771Var10 = cf71Var.d;
                ela1 ela1Var4 = cf71Var.c;
                p371 p371Var6 = cf71Var.b;
                g471Var3 = cf71Var.a;
                try {
                    hm5.M(objA);
                    str2 = str5;
                    p371Var2 = p371Var6;
                    z771Var3 = z771Var10;
                    ela1Var2 = ela1Var4;
                    yn71Var = (yn71) objA;
                    if (!(g471Var3 instanceof h471)) {
                        p371Var3 = p371Var2;
                        z771Var5 = z771Var3;
                        if (g471Var3 instanceof i471) {
                            throw new IllegalStateException(("Unsupported destination type: " + rc11.a.b(g471Var3.getClass()).r()).toString());
                        }
                        z771Var6 = z771Var4;
                        str3 = str2;
                        r571Var = new r571(ela1Var2.b(), ela1Var2.g(), ela1Var2.a(), str3, p371Var3, z771Var5, z771Var6, yn71Var);
                        z771Var7 = z771Var5;
                        yn71Var2 = yn71Var;
                        cf71Var.a = g471Var3;
                        cf71Var.b = p371Var3;
                        cf71Var.c = ela1Var2;
                        cf71Var.d = z771Var7;
                        cf71Var.e = str3;
                        cf71Var.f = z771Var6;
                        cf71Var.g = yn71Var2;
                        cf71Var.h = i2;
                        cf71Var.X = 3;
                        if (((i471) g471Var3).f(r571Var, cf71Var) != d9nVar) {
                            z771Var8 = z771Var6;
                            str4 = str3;
                            ela1Var3 = ela1Var2;
                            p371Var4 = p371Var3;
                            g471Var4 = g471Var3;
                            g471Var5 = g471Var4;
                            String str6 = str4;
                            p371 p371Var7 = p371Var4;
                            m231Var = o1p1.H(yn71Var2);
                            m771 m771Var = (m771) neVar.b;
                            if (z771Var7 != null) {
                                strB = z771Var7.b();
                            } else {
                                strB = null;
                            }
                            if (z771Var8 != null) {
                                strB2 = z771Var8.b();
                            } else {
                                strB2 = null;
                            }
                            m771Var.a(g471Var5, p371Var7, m231Var, strB, strB2, ela1Var3.g(), ela1Var3.b(), ela1Var3.a(), str6);
                        }
                        return d9nVar;
                    }
                    h471 h471Var = (h471) g471Var3;
                    cf71Var.a = g471Var3;
                    cf71Var.b = p371Var2;
                    cf71Var.c = ela1Var2;
                    cf71Var.d = z771Var3;
                    cf71Var.e = str2;
                    cf71Var.f = z771Var4;
                    cf71Var.g = yn71Var;
                    cf71Var.h = i2;
                    cf71Var.X = 2;
                    p371Var5 = p371Var2;
                    z771Var9 = z771Var3;
                    try {
                        objD0 = neVar.d0(yn71Var, h471Var, p371Var5, z771Var9, cf71Var);
                        neVar = neVar;
                        if (objD0 != d9nVar) {
                            z771Var8 = z771Var4;
                            ela1Var3 = ela1Var2;
                            str4 = str2;
                            g471Var4 = g471Var3;
                            p371Var4 = p371Var5;
                            z771Var7 = z771Var9;
                            yn71Var2 = yn71Var;
                            g471Var5 = g471Var4;
                            String str7 = str4;
                            p371 p371Var8 = p371Var4;
                            m231Var = o1p1.H(yn71Var2);
                            m771 m771Var2 = (m771) neVar.b;
                            if (z771Var7 != null) {
                                strB = z771Var7.b();
                            } else {
                                strB = null;
                            }
                            if (z771Var8 != null) {
                                strB2 = z771Var8.b();
                            } else {
                                strB2 = null;
                            }
                            m771Var2.a(g471Var5, p371Var8, m231Var, strB, strB2, ela1Var3.g(), ela1Var3.b(), ela1Var3.a(), str7);
                        }
                        return d9nVar;
                    } catch (Throwable th) {
                        th = th;
                        neVar = neVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (i4 != 2 && i4 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yn71Var2 = cf71Var.g;
                z771Var8 = cf71Var.f;
                str4 = cf71Var.e;
                z771Var7 = cf71Var.d;
                ela1Var3 = cf71Var.c;
                p371Var4 = cf71Var.b;
                g471Var4 = cf71Var.a;
                try {
                    hm5.M(objA);
                    g471Var5 = g471Var4;
                    String str8 = str4;
                    p371 p371Var9 = p371Var4;
                    try {
                        m231Var = o1p1.H(yn71Var2);
                        m771 m771Var3 = (m771) neVar.b;
                        if (z771Var7 != null) {
                            strB = z771Var7.b();
                        } else {
                            strB = null;
                        }
                        if (z771Var8 != null) {
                            strB2 = z771Var8.b();
                        } else {
                            strB2 = null;
                        }
                        m771Var3.a(g471Var5, p371Var9, m231Var, strB, strB2, ela1Var3.g(), ela1Var3.b(), ela1Var3.a(), str8);
                    } catch (Throwable th3) {
                        th = th3;
                        g471Var3 = g471Var5;
                        m231Var = new m231(th);
                        g471Var5 = g471Var3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    g471Var3 = g471Var4;
                }
            }
            m231Var = new m231(th);
            g471Var5 = g471Var3;
        } else {
            hm5.M(objA);
            try {
                String strD = p371Var.d();
                String strB3 = p371Var.b();
                dqi1 dqi1VarF = p371Var.f();
                if (dqi1VarF != null) {
                    try {
                        cqi1VarA = dqi1VarF.a();
                    } catch (Throwable th5) {
                        th = th5;
                        g471Var3 = g471Var;
                    }
                } else {
                    cqi1VarA = null;
                }
                go71 go71Var2 = new go71(strD, strB3, cqi1VarA, p371Var.e(), g471Var.a().getValue(), 32);
                bo71 bo71Var = (bo71) neVar.d;
                g471Var2 = g471Var;
                try {
                    cf71Var.a = g471Var2;
                    p371Var2 = p371Var;
                    cf71Var.b = p371Var2;
                    ela1Var2 = ela1Var;
                    cf71Var.c = ela1Var2;
                    z771Var3 = z771Var;
                    cf71Var.d = z771Var3;
                    str2 = str;
                    cf71Var.e = str2;
                    cf71Var.f = z771Var2;
                    cf71Var.g = null;
                    cf71Var.h = 0;
                    cf71Var.X = 1;
                    objA = bo71Var.a(go71Var2, cf71Var);
                    if (objA != d9nVar) {
                        z771Var4 = z771Var2;
                        g471Var3 = g471Var2;
                        i2 = 0;
                        yn71Var = (yn71) objA;
                        if (!(g471Var3 instanceof h471)) {
                            h471 h471Var2 = (h471) g471Var3;
                            cf71Var.a = g471Var3;
                            cf71Var.b = p371Var2;
                            cf71Var.c = ela1Var2;
                            cf71Var.d = z771Var3;
                            cf71Var.e = str2;
                            cf71Var.f = z771Var4;
                            cf71Var.g = yn71Var;
                            cf71Var.h = i2;
                            cf71Var.X = 2;
                            p371Var5 = p371Var2;
                            z771Var9 = z771Var3;
                            objD0 = neVar.d0(yn71Var, h471Var2, p371Var5, z771Var9, cf71Var);
                            neVar = neVar;
                            if (objD0 != d9nVar) {
                                z771Var8 = z771Var4;
                                ela1Var3 = ela1Var2;
                                str4 = str2;
                                g471Var4 = g471Var3;
                                p371Var4 = p371Var5;
                                z771Var7 = z771Var9;
                                yn71Var2 = yn71Var;
                                g471Var5 = g471Var4;
                                String str9 = str4;
                                p371 p371Var10 = p371Var4;
                                m231Var = o1p1.H(yn71Var2);
                                m771 m771Var4 = (m771) neVar.b;
                                if (z771Var7 != null) {
                                    strB = z771Var7.b();
                                } else {
                                    strB = null;
                                }
                                if (z771Var8 != null) {
                                    strB2 = z771Var8.b();
                                } else {
                                    strB2 = null;
                                }
                                m771Var4.a(g471Var5, p371Var10, m231Var, strB, strB2, ela1Var3.g(), ela1Var3.b(), ela1Var3.a(), str9);
                            }
                        } else {
                            p371Var3 = p371Var2;
                            z771Var5 = z771Var3;
                            if (g471Var3 instanceof i471) {
                                throw new IllegalStateException(("Unsupported destination type: " + rc11.a.b(g471Var3.getClass()).r()).toString());
                            }
                            z771Var6 = z771Var4;
                            str3 = str2;
                            r571Var = new r571(ela1Var2.b(), ela1Var2.g(), ela1Var2.a(), str3, p371Var3, z771Var5, z771Var6, yn71Var);
                            z771Var7 = z771Var5;
                            yn71Var2 = yn71Var;
                            cf71Var.a = g471Var3;
                            cf71Var.b = p371Var3;
                            cf71Var.c = ela1Var2;
                            cf71Var.d = z771Var7;
                            cf71Var.e = str3;
                            cf71Var.f = z771Var6;
                            cf71Var.g = yn71Var2;
                            cf71Var.h = i2;
                            cf71Var.X = 3;
                            if (((i471) g471Var3).f(r571Var, cf71Var) != d9nVar) {
                                z771Var8 = z771Var6;
                                str4 = str3;
                                ela1Var3 = ela1Var2;
                                p371Var4 = p371Var3;
                                g471Var4 = g471Var3;
                                g471Var5 = g471Var4;
                                String str10 = str4;
                                p371 p371Var11 = p371Var4;
                                m231Var = o1p1.H(yn71Var2);
                                m771 m771Var5 = (m771) neVar.b;
                                if (z771Var7 != null) {
                                    strB = z771Var7.b();
                                } else {
                                    strB = null;
                                }
                                if (z771Var8 != null) {
                                    strB2 = z771Var8.b();
                                } else {
                                    strB2 = null;
                                }
                                m771Var5.a(g471Var5, p371Var11, m231Var, strB, strB2, ela1Var3.g(), ela1Var3.b(), ela1Var3.a(), str10);
                            }
                        }
                    }
                    return d9nVar;
                } catch (Throwable th6) {
                    th = th6;
                    g471Var3 = g471Var2;
                }
            } catch (Throwable th7) {
                th = th7;
                g471Var2 = g471Var;
            }
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (e331.a(m231Var) != null) {
            throw up30.p((Context) neVar.c, g471Var5.e());
        }
        hm5.M(m231Var);
        return m231Var;
    }

    public void N() {
        xd xdVar = (xd) this.c;
        if (xdVar != null && ((AtomicBoolean) this.d).compareAndSet(false, true)) {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            le leVar = new le((byte) 0);
            ge geVar = new ge(atomicBoolean, hashSet, hashSet2, hashSet3, (byte) 0);
            he heVar = new he(leVar, (byte) 0);
            ie ieVar = new ie(leVar, xdVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, (byte) 0);
            md50 md50VarR0 = e4x0.r0(xdVar, geVar);
            md50 md50VarX = e4x0.x(xdVar, heVar);
            if (u890.j(xdVar.X, "gaming")) {
                AtomicInteger atomicInteger = new AtomicInteger(0);
                je jeVar = new je(geVar, atomicInteger, ieVar, (byte) 0);
                je jeVar2 = new je(heVar, atomicInteger, ieVar, (byte) 1);
                md50VarR0.i(jeVar);
                md50VarX.i(jeVar2);
                md50VarR0.d();
                md50VarX.d();
                return;
            }
            od50 od50Var = new od50(md50VarR0, md50VarX);
            ke keVar = new ke(ieVar);
            ArrayList arrayList = od50Var.c;
            if (!arrayList.contains(keVar)) {
                arrayList.add(keVar);
            }
            String str = md50.j;
            w0h1.C(od50Var);
            new nd50(od50Var).executeOnExecutor(wf10.c(), new Void[0]);
        }
    }

    public void O(String str) {
        ((t360) this.c).f(str);
    }

    public void P(xd xdVar, xd xdVar2) {
        Intent intent = new Intent(wf10.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", xdVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", xdVar2);
        ((zce0) this.a).c(intent);
    }

    public void Q(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            Z("bnc_actions", "bnc_no_value");
            return;
        }
        Iterator it = arrayList.iterator();
        String strF = "";
        while (it.hasNext()) {
            strF = f4i1.f(strF, (String) it.next(), ",");
        }
        Z("bnc_actions", strF.substring(0, strF.length() - 1));
    }

    public void R(String str) {
        if (F("bnc_branch_key").equals(str)) {
            return;
        }
        i1k0.B("clearPrefOnBranchKeyChange");
        String strF = F("bnc_link_click_id");
        String strF2 = F("bnc_link_click_identifier");
        String strF3 = F("bnc_app_link");
        String strF4 = F("bnc_push_identifier");
        SharedPreferences.Editor editor = (SharedPreferences.Editor) this.b;
        editor.clear();
        U(strF);
        V(strF2);
        Z("bnc_app_link", strF3);
        Z("bnc_push_identifier", strF4);
        editor.apply();
        Z("bnc_branch_key", str);
        if (n3c.h() != null) {
            n3c.h().g.clear();
            n3c.h().f.d();
        }
    }

    public void S(xd xdVar, boolean z) {
        boolean zEquals;
        xd xdVar2 = (xd) this.c;
        String str = xdVar2 != null ? xdVar2.i : null;
        String str2 = xdVar != null ? xdVar.i : null;
        if (str != null && !str.equals(str2)) {
            gm5.d(6);
        }
        this.c = xdVar;
        ((AtomicBoolean) this.d).set(false);
        this.e = new Date(0L);
        if (z) {
            SharedPreferences sharedPreferences = ((ae) this.b).a;
            if (xdVar != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", xdVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                fpi1.c(wf10.a());
            }
        }
        if (xdVar2 == null) {
            zEquals = xdVar == null;
        } else {
            zEquals = xdVar2.equals(xdVar);
        }
        if (zEquals) {
            return;
        }
        P(xdVar2, xdVar);
        Context contextA = wf10.a();
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        AlarmManager alarmManager = (AlarmManager) contextA.getSystemService("alarm");
        if (fuo1.w()) {
            if ((xdVarS != null ? xdVarS.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextA, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, xdVarS.a.getTime(), PendingIntent.getBroadcast(contextA, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }

    public void T(String str) {
        i1k0.B("setInitialReferrer " + str);
        Z("bnc_initial_referrer", str);
    }

    public void U(String str) {
        Z("bnc_link_click_id", str);
    }

    public void V(String str) {
        i1k0.B("setLinkClickIdentifier: " + str);
        Z("bnc_link_click_identifier", str);
    }

    public void W(long j2, String str) {
        ((SharedPreferences.Editor) this.b).putLong(str, j2).apply();
    }

    public void X(JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            Z("bnc_referringUrlQueryParameters", "bnc_no_value");
        } else {
            Z("bnc_referringUrlQueryParameters", jSONObject.toString());
        }
    }

    public void Y(String str) {
        Z("bnc_session_params", str);
    }

    public void Z(String str, String str2) {
        ((SharedPreferences.Editor) this.b).putString(str, str2).apply();
    }

    public Object a(String str, bkn bknVar) {
        return c921.H((q8n) this.e, new xtz(this, str, (lnm) null, (byte) 4), bknVar);
    }

    public void a0() {
        rku rkuVar = (rku) this.d;
        ObservableFromPublisher observableFromPublisher = (ObservableFromPublisher) this.e;
        rkuVar.b(Observable.merge(((PublishSubject) this.c).withLatestFrom(observableFromPublisher, new hfb(this, (byte) 1)).filter(qz70.N0).map(b6j0.Z), observableFromPublisher.filter(zhm0.Z).scan(drm0.N0).distinctUntilChanged().map(new ps7(this, (byte) 16))).distinctUntilChanged().subscribe(new mba(this, (byte) 15), fcc.e));
    }

    public void b0(sks0 sks0Var) {
        kvw0 kvw0Var = (kvw0) this.e;
        synchronized (kvw0Var) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.z("Storing the product state for <" + kvw0Var.a + ">", new Object[0]);
            kvw0Var.c(sks0Var.a());
        }
        sz11 sz11Var = (sz11) this.b;
        if (sz11Var != null) {
            sz11Var.b(zz11.a);
        }
    }

    public void c(s2n s2nVar) {
        ArrayList arrayList = (ArrayList) this.c;
        Objects.requireNonNull(s2nVar, "factory == null");
        arrayList.add(s2nVar);
    }

    public void c0(Class cls, Object obj) {
        this.e = ((hm5) this.e).G(rc11.a.b(cls), obj);
    }

    public void d(String str, String str2) {
        ((t360) this.c).b(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d0(yn71 yn71Var, h471 h471Var, p371 p371Var, z771 z771Var, onm onmVar) {
        df71 df71Var;
        yn71 yn71Var2;
        if (onmVar instanceof df71) {
            df71Var = (df71) onmVar;
            int i2 = df71Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                df71Var.d = i2 - Integer.MIN_VALUE;
            } else {
                df71Var = new df71(this, onmVar);
            }
        } else {
            df71Var = new df71(this, onmVar);
        }
        Object objH = df71Var.b;
        int i3 = df71Var.d;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objH);
            x871 x871Var = new x871(p371Var, yn71Var, z771Var);
            df71Var.a = yn71Var;
            df71Var.d = 1;
            objH = h471Var.h(x871Var, df71Var);
            if (objH != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            yn71Var = df71Var.a;
            hm5.M(objH);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yn71Var2 = df71Var.a;
            hm5.M(objH);
        }
        return o1p1.H(yn71Var2);
        Intent intent = (Intent) objH;
        intent.addFlags(1);
        q8n q8nVar = (q8n) this.e;
        wp41 wp41Var = new wp41(this, intent, (lnm) null, (byte) 7);
        df71Var.a = yn71Var;
        df71Var.d = 2;
        if (c921.H(q8nVar, wp41Var, df71Var) != d9nVar) {
            yn71Var2 = yn71Var;
            return o1p1.H(yn71Var2);
        }
        return d9nVar;
    }

    public void e(String str, tv80 tv80Var, boolean z) {
        ((oj3) this.d).c(k4p1.x(str), str, "", z, new gj3(27, tv80Var)).subscribe();
    }

    public void e0(String str) {
        if (nhc1.Y(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (nhc1.Y(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        k370 k370Var = new k370();
        k370Var.f((l370) null, str);
        this.a = k370Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public void f(RecyclerView recyclerView, a aVar, boolean z) {
        boolean z2;
        if (z && !(aVar instanceof GridLayoutManager) && (aVar instanceof LinearLayoutManager)) {
            z2 = ((LinearLayoutManager) aVar).Q0 == 1;
        }
        recyclerView.setLayoutManager(aVar);
        lap1.p(recyclerView, (h3h1) this.a);
        l4o1.d0(recyclerView, (iu30) this.c, z2, (nzb0) this.d, (t8r0) this.e);
    }

    public void g(String str) {
        k370 k370Var = new k370();
        k370Var.f((l370) null, str);
        h(k370Var.b());
    }

    public void h(l370 l370Var) {
        Objects.requireNonNull(l370Var, "baseUrl == null");
        ArrayList arrayList = l370Var.f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.b = l370Var;
        } else {
            hhg1.g(l370Var, "baseUrl must end in /: ");
        }
    }

    public tqd0 i() {
        String str = (String) this.c;
        t2p1.t(str, h050.i);
        String str2 = (String) this.d;
        t2p1.t(str2, h050.h);
        String str3 = (String) this.e;
        t2p1.t(str3, h050.g);
        c350 c350VarI = hfb.i(str, str2, str3);
        c350.m1(c350VarI, (Function0) this.a);
        c350.l1(c350VarI, (Function0) this.b);
        return c350VarI;
    }

    public gc31 j() {
        ArrayList arrayList = (ArrayList) this.c;
        if (((l370) this.b) == null) {
            eg.m("Base URL required.");
            return null;
        }
        azp0 azp0Var = (cxc) this.a;
        if (azp0Var == null) {
            azp0Var = new azp0();
        }
        azp0 azp0Var2 = azp0Var;
        ir4 ir4Var = (Executor) this.e;
        if (ir4Var == null) {
            ir4Var = oct0.a;
        }
        ir4 ir4Var2 = ir4Var;
        ubc ubcVar = oct0.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        List listE = ubcVar.e(ir4Var2);
        arrayList2.addAll(listE);
        List listF = ubcVar.f();
        int size = listF.size();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + size);
        arrayList3.add(new sbc());
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listF);
        return new gc31(azp0Var2, (l370) this.b, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList2), listE.size(), ir4Var2);
    }

    public void k(upc upcVar) {
        String strZ = nyn1.Z(upcVar);
        int length = strZ.length();
        t360 t360Var = (t360) this.c;
        if (length == 0) {
            t360Var.f("Cache-Control");
        } else {
            t360Var.g("Cache-Control", strZ);
        }
    }

    public void l(cxc cxcVar) {
        Objects.requireNonNull(cxcVar, "factory == null");
        this.a = cxcVar;
    }

    public void m() {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) this.b;
        for (String str : u()) {
            ArrayList arrayListU = u();
            if (!arrayListU.contains(str)) {
                arrayListU.add(str);
                Q(arrayListU);
            }
            editor.putInt("bnc_total_base_" + str, 0).apply();
            editor.putInt("bnc_balance_base_" + str, 0).apply();
        }
        Q(new ArrayList());
    }

    public jhm n(String str, List list, String str2, String str3) {
        return new jhm("report_note", csx.c, (fhm) null, 2131954428, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(ma21.d1, new nec0(list, (byte) 16)), new tjf0(this, list, str, str2, str3, (byte) 17)), 244);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void o(DrawScope drawScope, Function0 function0, Brush brush, Function0 function1, z1a1 z1a1Var) throws NoWhenBranchMatchedException {
        iu30 b6Var;
        iu30 kqbVar;
        this.b = function0;
        if (!u890.j(brush, (Brush) this.c) || !u890.j(z1a1Var, (z1a1) this.d) || (b6Var = (iu30) this.e) == null) {
            this.c = brush;
            this.d = z1a1Var;
            if (z1a1Var instanceof htq0) {
                htq0 htq0Var = (htq0) z1a1Var;
                u8s0 u8s0Var = htq0Var.c;
                n511 n511VarI = ((tw4) u8s0Var).i();
                tw4 tw4VarA = (tw4) this.a;
                if (tw4VarA == null) {
                    tw4VarA = ww4.a();
                    this.a = tw4VarA;
                }
                tw4 tw4Var = tw4VarA;
                tw4Var.n();
                u8s0.c(tw4Var, n511VarI);
                tw4Var.l(tw4Var, u8s0Var, 0);
                kqbVar = new jqb(this, htq0Var, brush, function1, n511VarI, (((long) ((int) Math.ceil(n511VarI.c - n511VarI.a))) << 32) | (((long) ((int) Math.ceil(n511VarI.d - n511VarI.b))) & 4294967295L), tw4Var);
            } else {
                if (z1a1Var instanceof jtq0) {
                    jtq0 jtq0Var = (jtq0) z1a1Var;
                    if (ila0.w(jtq0Var.c)) {
                        b6Var = new pg(this, jtq0Var, brush, (byte) 6);
                    } else {
                        tw4 tw4VarA2 = (tw4) this.a;
                        if (tw4VarA2 == null) {
                            tw4VarA2 = ww4.a();
                            this.a = tw4VarA2;
                        }
                        m811 m811Var = new m811();
                        m811Var.a = Float.NaN;
                        kqbVar = new kqb(this, m811Var, new p811(), tw4VarA2, jtq0Var, brush, (byte) 0);
                    }
                } else {
                    if (!(z1a1Var instanceof itq0)) {
                        eg.o();
                        return;
                    }
                    b6Var = new b6(this, brush, (byte) 10);
                }
                this.e = b6Var;
            }
            b6Var = kqbVar;
            this.e = b6Var;
        }
        b6Var.invoke(drawScope);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(qkg qkgVar, String str, onm onmVar) throws IOException {
        ud91 ud91Var;
        if (onmVar instanceof ud91) {
            ud91Var = (ud91) onmVar;
            int i2 = ud91Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ud91Var.e = i2 - Integer.MIN_VALUE;
            } else {
                ud91Var = new ud91(this, onmVar);
            }
        } else {
            ud91Var = new ud91(this, onmVar);
        }
        Object objQ = ud91Var.c;
        int i3 = ud91Var.e;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objQ);
            upc upcVar = upc.o;
            upcVar.getClass();
            String strZ = nyn1.Z(upcVar);
            ud91Var.a = qkgVar;
            ud91Var.b = str;
            ud91Var.e = 2;
            objQ = q(qkgVar, strZ, str, ud91Var);
            if (objQ != d9nVar) {
            }
        }
        if (i3 == 1) {
            hm5.M(objQ);
            return objQ;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                hm5.M(objQ);
                return objQ;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = ud91Var.b;
        qkgVar = ud91Var.a;
        hm5.M(objQ);
        qkg qkgVar2 = qkgVar;
        String str2 = str;
        pe91 pe91Var = (pe91) objQ;
        lnm lnmVar = null;
        if (pe91Var != null) {
            c921.y((u9c0) this.e, (o8n) null, 0, new g1y(this, qkgVar2, str2, lnmVar, (byte) 3), 3);
            return pe91Var;
        }
        ud91Var.a = null;
        ud91Var.b = null;
        ud91Var.e = 3;
        Object objR = r(qkgVar2, "", str2, ud91Var);
        return objR == d9nVar ? d9nVar : objR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(qkg qkgVar, String str, String str2, onm onmVar) {
        vd91 vd91Var;
        pe91 m231Var;
        if (onmVar instanceof vd91) {
            vd91Var = (vd91) onmVar;
            int i2 = vd91Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vd91Var.c = i2 - Integer.MIN_VALUE;
            } else {
                vd91Var = new vd91(this, onmVar);
            }
        } else {
            vd91Var = new vd91(this, onmVar);
        }
        Object objR = vd91Var.a;
        int i3 = vd91Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objR);
                vd91Var.c = 1;
                objR = r(qkgVar, str, str2, vd91Var);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objR);
            }
            m231Var = (pe91) objR;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(qkg qkgVar, String str, String str2, onm onmVar) throws IOException {
        wd91 wd91Var;
        ef91 ef91Var;
        if (onmVar instanceof wd91) {
            wd91Var = (wd91) onmVar;
            int i2 = wd91Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wd91Var.c = i2 - Integer.MIN_VALUE;
            } else {
                wd91Var = new wd91(this, onmVar);
            }
        } else {
            wd91Var = new wd91(this, onmVar);
        }
        Object objA = wd91Var.a;
        int i3 = wd91Var.c;
        if (i3 == 0) {
            hm5.M(objA);
            se91 se91Var = (se91) this.a;
            String str3 = qkgVar.b;
            wd91Var.c = 1;
            objA = se91Var.a(str, str3, str2, wd91Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        sy21 sy21Var = (sy21) objA;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0) {
            k220.i(ry21Var.c);
            return null;
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        GetMainHomeLayoutResponse getMainHomeLayoutResponse = (GetMainHomeLayoutResponse) obj;
        x4e0 x4e0Var = o0c.D(sy21Var, (yqg) this.c) ? x4e0.b : x4e0.a;
        h290 h290VarN = getMainHomeLayoutResponse.n();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = h290VarN.iterator();
        while (it.hasNext()) {
            ff91 ff91VarN = ((Slot) it.next()).n();
            int iOrdinal = ff91VarN.ordinal();
            if (iOrdinal == 1) {
                ef91Var = ef91.b;
            } else if (iOrdinal == 2) {
                ef91Var = ef91.c;
            } else if (iOrdinal != 3) {
                Logger.b("SlotLoop :: unknown slot type: %s, skipping", ff91VarN);
                ef91Var = null;
            } else {
                ef91Var = ef91.d;
            }
            if (ef91Var != null) {
                arrayList.add(ef91Var);
            }
        }
        return new pe91(arrayList, x4e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public Object s(ef91 ef91Var, ice0 ice0Var, qkg qkgVar, boolean z, boolean z2, String str, String str2, onm onmVar) throws IOException {
        xd91 xd91Var;
        String strZ;
        boolean z3;
        yqg yqgVar = (yqg) this.c;
        yjq yjqVar = (yjq) this.d;
        if (onmVar instanceof xd91) {
            xd91Var = (xd91) onmVar;
            int i2 = xd91Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xd91Var.d = i2 - Integer.MIN_VALUE;
            } else {
                xd91Var = new xd91(this, onmVar);
            }
        } else {
            xd91Var = new xd91(this, onmVar);
        }
        xd91 xd91Var2 = xd91Var;
        Object objB = xd91Var2.b;
        int i3 = xd91Var2.d;
        if (i3 == 0) {
            hm5.M(objB);
            int iOrdinal = ef91Var.ordinal();
            String strL = (iOrdinal == 1 || iOrdinal == 2) ? yjqVar.l() : null;
            se91 se91Var = (se91) this.a;
            if (ice0Var == ice0.a) {
                upc upcVar = upc.o;
                upcVar.getClass();
                strZ = nyn1.Z(upcVar);
            } else if (ice0Var == ice0.f) {
                upc upcVar2 = upc.n;
                upcVar2.getClass();
                strZ = nyn1.Z(upcVar2);
            } else {
                strZ = "";
            }
            String str3 = strZ;
            int iA = ef91Var.a();
            String str4 = qkgVar.b;
            String id = yqgVar.g().getID();
            z3 = z;
            xd91Var2.a = z3;
            xd91Var2.d = 1;
            objB = se91Var.b(str3, iA, str4, id, strL, z2, str, str2, xd91Var2);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = xd91Var2.a;
            hm5.M(objB);
        }
        sy21 sy21Var = (sy21) objB;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0) {
            k220.i(ry21Var.c);
            return null;
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        GetSlotContentResponse getSlotContentResponse = (GetSlotContentResponse) obj;
        BatchedExtensionResponse batchedExtensionResponseP = getSlotContentResponse.n().p();
        ioj0 ioj0VarH = batchedExtensionResponseP.p() > 0 ? yjqVar.h(batchedExtensionResponseP) : null;
        x4e0 x4e0Var = o0c.D(sy21Var, yqgVar) ? x4e0.b : x4e0.a;
        yz21 yz21VarT = z47.t(getSlotContentResponse.o(), z3);
        return new nd91(((uny) this.b).B(getSlotContentResponse.p(), z3, yz21VarT), x4e0Var, yz21VarT, getSlotContentResponse.o().s(), ioj0VarH);
    }

    public void t() {
        L(Request.GET, null);
    }

    public ArrayList u() {
        String strF = F("bnc_actions");
        if (strF.equals("bnc_no_value")) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strF.split(","));
        return arrayList;
    }

    public boolean v(String str) {
        return ((SharedPreferences) this.a).getBoolean(str, false);
    }

    public int x() {
        String strF = F("bnc_consumer_protection_attribution_level");
        if (strF.equals("bnc_no_value")) {
            return 1;
        }
        return gvg.E(strF);
    }

    public String y(String str) {
        try {
            return ((JSONObject) this.d).get(str).toString();
        } catch (JSONException e) {
            i1k0.m(e.getMessage());
            return null;
        }
    }

    public void b(String str) {
    }

    public ne(int i2, iu30 iu30Var) {
        dts dtsVar = new dts(null);
        this.a = null;
        this.b = dtsVar;
        this.c = iu30Var;
        this.d = new nzb0(this, (byte) 18);
        t8r0 t8r0Var = new t8r0();
        t8r0Var.a = new ArrayList();
        t8r0Var.b = "";
        this.e = t8r0Var;
    }

    public ne(Flowable flowable, t2j0 t2j0Var) {
        this.a = t2j0Var;
        this.b = new LinkedHashSet();
        this.c = new PublishSubject();
        this.d = new rku();
        this.e = new ObservableFromPublisher(flowable);
    }

    public ne(Context context, hm61 hm61Var, sz11 sz11Var) {
        this.a = hm61Var;
        this.b = sz11Var;
        qfm0 qfm0Var = hm61Var.a;
        this.c = r6p1.s(context, men1.D(qfm0Var));
        uq8 uq8Var = cj4.b;
        this.d = m9x0.b(context, men1.w(hm61Var), men1.D(qfm0Var));
        m9x0.d(context);
        LinkedHashMap linkedHashMap = kvw0.b;
        this.e = cev0.x(context);
    }

    public ne(byte b) {
        switch (b) {
            case 10:
                this.c = new ArrayList();
                this.d = new ArrayList();
                break;
            default:
                this.e = e9x.n;
                this.b = Request.GET;
                this.c = new t360();
                break;
        }
    }

    public /* synthetic */ ne(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
