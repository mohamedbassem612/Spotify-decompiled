package p;

import android.content.Intent;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wbx0 implements jrn0, Function, cgz0, Producer, BiPredicate, com.spotify.mobius.functions.Function, bgz0, Predicate {
    public final /* synthetic */ byte a;
    public static final wbx0 b = new wbx0(0);
    public static final wbx0 c = new wbx0(1);
    public static final wbx0 d = new wbx0(2);
    public static final wbx0 e = new wbx0(3);
    public static final wbx0 f = new wbx0(4);
    public static final wbx0 g = new wbx0(5);
    public static final wbx0 h = new wbx0(6);
    public static final wbx0 i = new wbx0(7);
    public static final wbx0 t = new wbx0(8);
    public static final huz X = new huz(Boolean.TRUE, (byte) 10);
    public static final wbx0 Y = new wbx0(10);
    public static final wbx0 Z = new wbx0(11);
    public static final wbx0 N0 = new wbx0(12);
    public static final wbx0 O0 = new wbx0(13);
    public static final wbx0 P0 = new wbx0(14);
    public static final wbx0 Q0 = new wbx0(15);
    public static final wbx0 R0 = new wbx0(16);
    public static final wbx0 S0 = new wbx0(17);
    public static final wbx0 T0 = new wbx0(18);
    public static final wbx0 U0 = new wbx0(19);
    public static final wbx0 V0 = new wbx0(20);
    public static final wbx0 W0 = new wbx0(21);
    public static final wbx0 X0 = new wbx0(22);
    public static final wbx0 Y0 = new wbx0(23);
    public static final wbx0 Z0 = new wbx0(24);
    public static final wbx0 a1 = new wbx0(25);
    public static final wbx0 b1 = new wbx0(26);

    public /* synthetic */ wbx0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:16:0x003c, B:28:0x005f, B:24:0x0056, B:20:0x0049), top: B:89:0x003c, inners: #2 }] */
    public static final void c(final bm5 bm5Var, zd zdVar) {
        boolean z;
        x6o0 x6o0Var = gm5.a;
        if (!dhn.a.contains(gm5.class)) {
            try {
                gm5.b.execute(new ny2(zdVar, bm5Var, (byte) 6));
            } catch (Throwable th) {
                dhn.a(gm5.class, th);
            }
        }
        boolean z2 = false;
        final byte b2 = 1;
        if (mn10.b(kn10.V0) && x4q0.a()) {
            final String str = zdVar.a;
            Set set = dhn.a;
            if (!set.contains(x4q0.class)) {
                try {
                    boolean z3 = bm5Var.c;
                    x4q0 x4q0Var = x4q0.a;
                    if (!set.contains(x4q0Var)) {
                        if (z3) {
                            try {
                                if (x4q0.b.contains(bm5Var.e)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z3 || z) {
                                    wf10.c().execute(new Runnable() { // from class: p.j550
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b3 = b2;
                                            bm5 bm5Var2 = bm5Var;
                                            String str2 = str;
                                            switch (b3) {
                                                case 0:
                                                    if (!dhn.a.contains(l550.class)) {
                                                        try {
                                                            l550.a.c(str2, bm5Var2);
                                                        } catch (Throwable th2) {
                                                            dhn.a(l550.class, th2);
                                                            return;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Set set2 = dhn.a;
                                                    if (!set2.contains(x4q0.class)) {
                                                        try {
                                                            List listSingletonList = Collections.singletonList(bm5Var2);
                                                            u321 u321Var = u321.b;
                                                            if (!set2.contains(u321.class)) {
                                                                try {
                                                                    u321.b.d(str2, listSingletonList, 2);
                                                                } catch (Throwable th3) {
                                                                    dhn.a(u321.class, th3);
                                                                    return;
                                                                }
                                                                break;
                                                            }
                                                        } catch (Throwable th4) {
                                                            dhn.a(x4q0.class, th4);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                dhn.a(x4q0Var, th2);
                            }
                        } else {
                            z = false;
                            if (z3) {
                                wf10.c().execute(new Runnable() { // from class: p.j550
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        bm5 bm5Var2 = bm5Var;
                                        String str2 = str;
                                        switch (b3) {
                                            case 0:
                                                if (!dhn.a.contains(l550.class)) {
                                                    try {
                                                        l550.a.c(str2, bm5Var2);
                                                    } catch (Throwable th3) {
                                                        dhn.a(l550.class, th3);
                                                        return;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Set set2 = dhn.a;
                                                if (!set2.contains(x4q0.class)) {
                                                    try {
                                                        List listSingletonList = Collections.singletonList(bm5Var2);
                                                        u321 u321Var = u321.b;
                                                        if (!set2.contains(u321.class)) {
                                                            try {
                                                                u321.b.d(str2, listSingletonList, 2);
                                                            } catch (Throwable th4) {
                                                                dhn.a(u321.class, th4);
                                                                return;
                                                            }
                                                            break;
                                                        }
                                                    } catch (Throwable th5) {
                                                        dhn.a(x4q0.class, th5);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                wf10.c().execute(new Runnable() { // from class: p.j550
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        bm5 bm5Var2 = bm5Var;
                                        String str2 = str;
                                        switch (b3) {
                                            case 0:
                                                if (!dhn.a.contains(l550.class)) {
                                                    try {
                                                        l550.a.c(str2, bm5Var2);
                                                    } catch (Throwable th3) {
                                                        dhn.a(l550.class, th3);
                                                        return;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Set set2 = dhn.a;
                                                if (!set2.contains(x4q0.class)) {
                                                    try {
                                                        List listSingletonList = Collections.singletonList(bm5Var2);
                                                        u321 u321Var = u321.b;
                                                        if (!set2.contains(u321.class)) {
                                                            try {
                                                                u321.b.d(str2, listSingletonList, 2);
                                                            } catch (Throwable th4) {
                                                                dhn.a(u321.class, th4);
                                                                return;
                                                            }
                                                            break;
                                                        }
                                                    } catch (Throwable th5) {
                                                        dhn.a(x4q0.class, th5);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                } catch (Throwable th3) {
                    dhn.a(x4q0.class, th3);
                }
            }
        }
        if (mn10.b(kn10.k1)) {
            l550.a.d(zdVar.a, bm5Var);
        }
        if (mn10.b(kn10.l1)) {
            vxq0 vxq0Var = vxq0.a;
            String str2 = zdVar.a;
            if (!dhn.a.contains(vxq0Var)) {
                try {
                    if (!vxq0.c) {
                        vxq0.a();
                    }
                    if (vxq0.b) {
                        String string = null;
                        try {
                            JSONObject jSONObject = bm5Var.a;
                            if (jSONObject != null) {
                                string = jSONObject.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                        }
                        vxq0Var.b(str2, string);
                    }
                } catch (Throwable th4) {
                    dhn.a(vxq0Var, th4);
                }
            }
        }
        if (bm5Var.c) {
            return;
        }
        if (!dhn.a.contains(rm5.class)) {
            try {
                z2 = rm5.f;
            } catch (Throwable th5) {
                dhn.a(rm5.class, th5);
            }
        }
        if (z2) {
            return;
        }
        if (!u890.j(bm5Var.e, "fb_mobile_activate_app")) {
            fza fzaVar = oue0.a;
            synchronized (wf10.b) {
            }
        } else {
            if (dhn.a.contains(rm5.class)) {
                return;
            }
            try {
                rm5.f = true;
            } catch (Throwable th6) {
                dhn.a(rm5.class, th6);
            }
        }
    }

    public static final void d() {
        fza fzaVar = oue0.a;
        synchronized (wf10.b) {
        }
    }

    public static mmr0 f(Bundle bundle, ylq0 ylq0Var, boolean z) {
        String str = m69.c() ? "1" : "0";
        Map map = ylq0.b;
        mmr0 mmr0VarS = cev0.s("is_implicit_purchase_logging_enabled", str, bundle, ylq0Var);
        Object objB = cev0.B("fb_iap_product_id", bundle, ylq0Var);
        String str2 = objB instanceof String ? (String) objB : null;
        if (!z) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                mmr0 mmr0VarS2 = cev0.s("fb_content_id", str2, bundle, ylq0Var);
                mmr0VarS = cev0.s("android_dynamic_ads_content_id", "client_manual", (Bundle) mmr0VarS2.a, (ylq0) mmr0VarS2.b);
            }
        }
        mmr0 mmr0VarS3 = cev0.s("is_autolog_app_events_enabled", wgi1.c() ? "1" : "0", (Bundle) mmr0VarS.a, (ylq0) mmr0VarS.b);
        return new mmr0((Bundle) mmr0VarS3.a, (ylq0) mmr0VarS3.b);
    }

    public static void g() {
        if (h() != 2) {
            gm5.c(6);
        }
    }

    public static int h() {
        int i2;
        synchronized (rm5.j()) {
            i2 = !dhn.a.contains(rm5.class) ? 1 : 0;
        }
        return i2;
    }

    public static String i() {
        eg egVar;
        if (dhn.a.contains(rm5.class)) {
            egVar = null;
        } else {
            try {
                egVar = rm5.g;
            } catch (Throwable th) {
                dhn.a(rm5.class, th);
                egVar = null;
            }
        }
        if (!wf10.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(wf10.a()).build();
            try {
                installReferrerClientBuild.startConnection(new zc80(installReferrerClientBuild, egVar, (byte) 1));
            } catch (Exception unused) {
            }
        }
        return wf10.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    public static void j() {
        synchronized (rm5.j()) {
            if (rm5.h() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!dhn.a.contains(rm5.class)) {
                try {
                    rm5.c = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    dhn.a(rm5.class, th);
                }
            }
            Runnable kVar = new k((byte) 7);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorH = rm5.h();
            if (scheduledThreadPoolExecutorH != null) {
                scheduledThreadPoolExecutorH.scheduleAtFixedRate(kVar, 0L, 86400L, TimeUnit.SECONDS);
            } else {
                eg.m("Required value was null.");
            }
        }
    }

    public boolean a() {
        return false;
    }

    public Object apply(Object obj) {
        Object obj2 = null;
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return PuffinErrorOuterClass.PuffinError.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass.PuffinError: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
            case 3:
            case 5:
            case 9:
            case 12:
            case 15:
            case 19:
            case 23:
            case 25:
            case 26:
            default:
                return j141.a((h59) obj);
            case 4:
                return (ContextTrack) ((spq0) obj).b();
            case 6:
                return (cq3) obj;
            case 7:
                List itemsList = ((CollectionPlatformEsperantoItemsResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CollectionPlatformItem) it.next()).getUri());
                }
                return arrayList;
            case 8:
                return new fs51((agv) obj);
            case 10:
                return gk3.a;
            case 11:
                return ((qq81) obj).b;
            case 13:
                return wo91.a;
            case 14:
                for (Object obj3 : (List) obj) {
                    if (((l0l) obj3).l()) {
                        obj2 = obj3;
                        return spq0.a(obj2);
                    }
                }
                return spq0.a(obj2);
            case 16:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StatusResponseOuterClass.StatusResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport error";
                }
                return new y0f1(message);
            case 18:
                return (Completable) obj;
            case 20:
                whi1 whi1Var = (whi1) obj;
                return whi1Var instanceof thi1 ? new c5e0(whi1Var) : new f5e0(whi1Var);
            case 21:
                return (ContextTrack) ((PlayerState) obj).track().b();
            case 22:
                return Observable.empty();
            case 24:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return PinResponse.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.PinResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 27:
                spq0 spq0Var = (spq0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (spq0Var.c()) {
                    builder2.onlyForPlaybackId((String) spq0Var.b());
                }
                return new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
        }
    }

    public String e(int i2) {
        return null;
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String str = th61Var.a;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strZ = s4b1VarX.z();
        return (strZ == null || !u890.j(s4b1VarX.s(), str)) ? crn0.a : new hrn0(rbx0.class, new sbx0(strZ, str), a6w0.a);
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && u890.j(playerState.restrictions(), playerState2.restrictions()) && u890.j(playerState.options(), playerState2.options());
    }

    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
