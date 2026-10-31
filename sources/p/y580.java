package p;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.ApiException;
import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken$AcquireResult;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y580 implements Predicate, jrn0, Function, d5q0, lbc, i931, BiFunction {
    public final /* synthetic */ byte a;
    public static final y580 b = new y580(0);
    public static final y580 c = new y580(1);
    public static final y580 d = new y580(2);
    public static final y580 e = new y580(3);
    public static final y580 f = new y580(4);
    public static final y580 g = new y580(5);
    public static final y580 h = new y580(6);
    public static final y580 i = new y580(7);
    public static final /* synthetic */ y580 t = new y580(8);
    public static final ya4 X = new ya4((byte) 10);
    public static final llj Y = new llj(2);
    public static final llj Z = new llj(3);
    public static final llj N0 = new llj(4);
    public static final llj O0 = new llj(5);
    public static final llj P0 = new llj(6);
    public static final llj Q0 = new llj(7);
    public static final llj R0 = new llj(8);
    public static final ia4 S0 = new ia4(5);
    public static final y580 T0 = new y580(9);
    public static final y580 U0 = new y580(10);
    public static final y580 V0 = new y580(11);
    public static final y580 W0 = new y580(12);
    public static final y580 X0 = new y580(13);
    public static final y580 Y0 = new y580(14);
    public static final y580 Z0 = new y580(15);
    public static final xat a1 = new xat(1.0f, 1.0f);
    public static final y580 b1 = new y580(16);
    public static final y580 c1 = new y580(17);
    public static final y580 d1 = new y580(18);
    public static final y580 e1 = new y580(19);
    public static final y580 f1 = new y580(20);
    public static final y580 g1 = new y580(21);
    public static final y580 h1 = new y580(22);
    public static final y580 i1 = new y580(23);
    public static final y580 j1 = new y580(24);
    public static final y580 k1 = new y580(25);
    public static final y580 l1 = new y580(26);
    public static final y580 m1 = new y580(27);
    public static final y580 n1 = new y580(28);
    public static final y580 o1 = new y580(29);

    public /* synthetic */ y580(byte b2) {
        this.a = b2;
    }

    public static final void c() {
        if (dhn.a.contains(y580.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = wf10.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            wf10.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            dhn.a(y580.class, th);
        }
    }

    public static final void d(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z, String str, int i2, boolean z2) {
        Set set = dhn.a;
        if (set.contains(y580.class)) {
            return;
        }
        try {
            y580 y580Var = b;
            LinkedHashMap linkedHashMapB = y580Var.b(y580Var.a(concurrentHashMap, z), concurrentHashMap2, str);
            if (set.contains(y580Var)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    m69.d(i2, (String) entry.getKey(), (String) entry.getValue(), z, z2);
                }
            } catch (Throwable th) {
                dhn.a(y580Var, th);
            }
        } catch (Throwable th2) {
            dhn.a(y580.class, th2);
        }
    }

    public static final void e() {
        if (dhn.a.contains(y580.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = wf10.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) ihc1.Q0((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            c();
        } catch (Throwable th) {
            dhn.a(y580.class, th);
        }
    }

    public static final void f() {
        if (dhn.a.contains(y580.class)) {
            return;
        }
        try {
            try {
                wf10.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            dhn.a(y580.class, th);
        }
    }

    public static final void g() {
        if (dhn.a.contains(y580.class)) {
            return;
        }
        try {
            f();
            try {
                SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            dhn.a(y580.class, th);
        }
    }

    public HashMap a(Map map, boolean z) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : sqg0.U(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public Object apply(Object obj) throws NoWhenBranchMatchedException {
        switch (this.a) {
            case 3:
                return Boolean.FALSE;
            case 5:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), Boolean.valueOf(((f7h) entry.getValue()).b));
                }
                return linkedHashMap;
            case 7:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsClientToken$AcquireResult.s(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken.AcquireResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                return Boolean.valueOf(((twj1) obj) instanceof rwj1);
            case 13:
                return ((Boolean) obj).booleanValue() ? jta1.a : new kta1(Collections.singleton("not_playing_locally"));
            case 14:
                return Boolean.valueOf(((vpu) obj) == vpu.a);
            case 16:
                Logger.e((Throwable) obj, "GetError failed, suppressing further player error emissions", new Object[0]);
                return Observable.never();
            case 17:
                return Boolean.valueOf(yto.j((String) obj));
            case 23:
                fzi0 fzi0Var = (gzi0) obj;
                if (fzi0Var instanceof fzi0) {
                    fzi0 fzi0Var2 = fzi0Var;
                    return new xdj0(fzi0Var2.c, fzi0Var2.a, fzi0Var2.b);
                }
                if (fzi0Var instanceof ezi0) {
                    return new vdj0(((ezi0) fzi0Var).a);
                }
                eg.o();
                return null;
            case 26:
                return new rkp0(((Boolean) obj).booleanValue());
            case 27:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return ResponseStatus.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.on_demand_set.proto.ResponseStatus: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            default:
                return ((PlayerState) obj).duration();
        }
    }

    public LinkedHashMap b(HashMap map, Map map2, String str) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        linkedHashMap.put(jSONObject.toString(), jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    @Override // p.lbc
    public flb0 getLayoutDirection() {
        return flb0.a;
    }

    @Override // p.lbc
    public wat h() {
        return a1;
    }

    @Override // p.d5q0
    public void i(Exception exc) {
        if ((exc instanceof ApiException) && ((ApiException) exc).getStatusCode() == 16) {
            Logger.l(exc, "CronetRuntime: provider installation unavailable (Play Services missing)", new Object[0]);
            return;
        }
        n57.t("CronetRuntime: provider installation failed: " + exc.getMessage(), exc);
    }

    @Override // p.lbc
    public long j() {
        return 9205357640488583168L;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 2:
                Set set = s4b1.f;
                String strJ = uic.x(intent.getDataString()).j();
                if (strJ == null) {
                    strJ = "";
                }
                return new hrn0(tv3.class, new vv3(8, strJ, "NoDialog_".concat(strJ)), new c6w0(3, false, (hd5) null, 14));
            default:
                return crn0.a;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
                return (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated);
            case 4:
                nl8 nl8Var = (nl8) obj;
                return (nl8Var instanceof kl8) || (nl8Var instanceof ml8);
            case 6:
                return ((String) obj).length() > 0;
            case 12:
                return ((spq0) obj).c();
            case 20:
                return ((Boolean) obj).booleanValue();
            case 21:
                return ((cma1) obj).b == 1;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                return new ggg0(((Boolean) obj).booleanValue(), (of8) obj2);
            default:
                return (Boolean) obj2;
        }
    }
}
