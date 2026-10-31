package p;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Bundle;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.work.impl.WorkDatabase;
import app.p000rive.core.CommandQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ny2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny2(rch rchVar, int i, n8d0 n8d0Var) {
        this.a = (byte) 0;
        this.b = rchVar;
        this.c = n8d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tp7 tp7Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                ((rch) this.b).G((n8d0) this.c);
                return;
            case 1:
                ((rch) this.b).D((q280) this.c);
                return;
            case 2:
                mb4.j((ob4) this.b, (LongSparseArray) this.c);
                return;
            case 3:
                try {
                    ((z3j1) this.b).onRequestFinished((o05) this.c);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((qy70) this.c).e((oi) this.b);
                return;
            case 5:
                qj5 qj5Var = (qj5) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    qj5Var.a();
                }
            case 6:
                zd zdVar = (zd) this.b;
                bm5 bm5Var = (bm5) this.c;
                if (dhn.a.contains(gm5.class)) {
                    return;
                }
                try {
                    x6o0 x6o0Var = gm5.a;
                    synchronized (x6o0Var) {
                        ef61 ef61VarM = x6o0Var.m(zdVar);
                        if (ef61VarM != null) {
                            ef61VarM.a(bm5Var);
                        }
                        break;
                    }
                    if (wbx0.h() != 2 && gm5.a.j() > 100) {
                        gm5.d(5);
                        return;
                    } else {
                        if (gm5.c == null) {
                            gm5.c = gm5.b.schedule((Runnable) gm5.d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    dhn.a(gm5.class, th);
                    return;
                }
            case 7:
                zd zdVar2 = (zd) this.b;
                ef61 ef61Var = (ef61) this.c;
                if (dhn.a.contains(gm5.class)) {
                    return;
                }
                try {
                    hm5.E(zdVar2, ef61Var);
                    return;
                } catch (Throwable th2) {
                    dhn.a(gm5.class, th2);
                    return;
                }
            case 8:
                Integer num = (Integer) this.b;
                List list = (List) this.c;
                if (o7h.i0(qm5.a, num) || !o7h.i0(qm5.b, num)) {
                    return;
                }
                if (qm5.e >= 5) {
                    qm5.a().clear();
                    qm5.e = 0;
                    return;
                } else {
                    qm5.a().addAll(0, list);
                    qm5.e++;
                    return;
                }
            case 9:
                Context context = (Context) this.b;
                rm5 rm5Var = (rm5) this.c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                for (int i2 = 0; i2 < 11; i2++) {
                    String str = strArr[i2];
                    String str2 = strArr2[i2];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i |= 1 << i2;
                    } catch (ClassNotFoundException unused2) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                    sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                    rm5Var.B(bundle, "fb_sdk_initialize");
                    return;
                }
                return;
            case 10:
                mj7 mj7Var = (mj7) this.b;
                Runnable runnable = (Runnable) this.c;
                mj7Var.c.f();
                qj7 qj7Var = mj7Var.b;
                synchronized (qj7Var.a) {
                    qj7Var.b();
                    runnable.run();
                    break;
                }
                return;
            case 11:
                Context context2 = (Context) this.b;
                hsk hskVar = (hsk) this.c;
                kw7.a = (AudioManager) context2.getSystemService("audio");
                hskVar.f();
                return;
            case 12:
                em3 em3Var = (em3) this.b;
                String str3 = (String) this.c;
                t38 t38Var = (t38) em3Var.c;
                String str4 = zoi1.a;
                t38Var.q(str3);
                return;
            case 13:
                em3 em3Var2 = (em3) this.b;
                iwg iwgVar = (iwg) this.c;
                t38 t38Var2 = (t38) em3Var2.c;
                String str5 = zoi1.a;
                t38Var2.y(iwgVar);
                return;
            case 14:
                yu3 yu3Var = (yu3) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) yu3Var.d).post(new ny2((Object) yu3Var, (Object) routedDevice, (byte) 15));
                    return;
                }
                return;
            case 15:
                yu3 yu3Var2 = (yu3) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((k58) yu3Var2.e) == null || (tp7Var = ((r58) ((ps7) yu3Var2.c).b).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) tp7Var.j)) {
                    return;
                }
                tp7Var.j = audioDeviceInfo;
                Context context3 = (Context) tp7Var.b;
                po7 po7Var = (po7) tp7Var.k;
                List listG = tp7Var.g();
                bg11 bg11Var = qp7.e;
                tp7Var.h(qp7.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var, audioDeviceInfo, listG));
                return;
            case 16:
                t01 t01Var = (t01) this.b;
                Object objApply = ((ro00) this.c).apply(t01Var.f);
                t01Var.f = objApply;
                wy9 wy9Var = new wy9(t01Var, objApply, b);
                wdd1 wdd1Var = (wdd1) t01Var.c;
                if (wdd1Var.a.getLooper().getThread().isAlive()) {
                    wdd1Var.f(wy9Var);
                    return;
                }
                return;
            case 17:
                ((vaa) this.b).d.a(VideoFrameProcessingException.a(-9223372036854775807L, (Exception) this.c));
                return;
            case 18:
                d1d d1dVar = (d1d) this.b;
                d2d d2dVar = (d2d) this.c;
                a1d a1dVar = d1dVar.x;
                ((HashSet) a1dVar.b).remove(d2dVar);
                ((ArrayMap) a1dVar.c).remove(d2dVar);
                return;
            case 19:
                d1d d1dVar2 = (d1d) this.b;
                mzc mzcVar = (mzc) this.c;
                final long jO = d1dVar2.o();
                final mzc mzcVar2 = new mzc();
                mzcVar2.c = new it21();
                pzc pzcVar = new pzc(mzcVar2);
                mzcVar2.b = pzcVar;
                mzcVar2.a = x0d.class;
                try {
                    d1dVar2.h(new c1d() { // from class: p.y0d
                        /* JADX WARN: Code duplicated, block: B:13:0x0030  */
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            boolean z;
                            Long l;
                            if (totalCaptureResult.getRequest() == null) {
                                z = false;
                            } else {
                                Object tag = totalCaptureResult.getRequest().getTag();
                                if (!(tag instanceof tod1) || (l = (Long) ((tod1) tag).a.get("CameraControlSessionUpdateId")) == null || l.longValue() < jO) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            }
                            if (!z) {
                                return false;
                            }
                            mzcVar2.b((Object) null);
                            return true;
                        }
                    });
                    mzcVar2.a = "waitForSessionUpdateId:" + jO;
                    break;
                } catch (Exception e) {
                    pzcVar.a(e);
                }
                poz0.G(true, pzcVar, mzcVar, n5u.a());
                return;
            case 20:
                b1d b1dVar = (b1d) this.b;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.c;
                HashSet hashSet = new HashSet();
                HashSet<c1d> hashSet2 = (HashSet) b1dVar.b;
                for (c1d c1dVar : hashSet2) {
                    if (c1dVar.a(totalCaptureResult)) {
                        hashSet.add(c1dVar);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 21:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case 22:
                p1d p1dVar = (p1d) this.b;
                mzc mzcVar3 = (mzc) this.c;
                toj0 toj0Var = p1dVar.W0;
                if (toj0Var == null) {
                    mzcVar3.b(Boolean.FALSE);
                    return;
                } else {
                    mzcVar3.b(Boolean.valueOf(p1dVar.a.t(p1d.w(toj0Var))));
                    return;
                }
            case 23:
                p1d p1dVar2 = (p1d) this.b;
                String str6 = (String) this.c;
                p1dVar2.t("Use case " + str6 + " INACTIVE");
                LinkedHashMap linkedHashMap = (LinkedHashMap) p1dVar2.a.b;
                if (linkedHashMap.containsKey(str6)) {
                    g4i1 g4i1Var = (g4i1) linkedHashMap.get(str6);
                    g4i1Var.f = false;
                    if (!g4i1Var.e) {
                        linkedHashMap.remove(str6);
                    }
                }
                p1dVar2.K();
                return;
            case 24:
                ((ya61) this.b).a((bb61) this.c);
                return;
            case 25:
                bzn1.l(((UUID) this.c).toString(), (awl1) this.b);
                return;
            case 26:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                awl1 awl1Var = (awl1) this.c;
                Iterator it = ((List) qyo1.x(workDatabase.A().a, true, false, new qti1((byte) 24))).iterator();
                while (it.hasNext()) {
                    bzn1.l((String) it.next(), awl1Var);
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                String str7 = (String) this.b;
                Bundle bundle2 = (Bundle) this.c;
                if (dhn.a.contains(uwg.class)) {
                    return;
                }
                try {
                    new rm5(wf10.a(), (String) null).y(bundle2, str7);
                    return;
                } catch (Throwable th3) {
                    dhn.a(uwg.class, th3);
                    return;
                }
            default:
                CommandQueue.runOrDispatchOnMain$lambda$43((Function0) this.b, (iu30) this.c);
                return;
        }
    }

    public /* synthetic */ ny2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
