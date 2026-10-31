package p;

import android.content.SharedPreferences;
import android.media.AudioDescriptor;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.SystemClock;
import androidx.car.app.IAppHost;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.appauthorization.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class um5 implements jn10, Function, pw60, e36, e9d0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ um5(boolean z) {
        this.a = (byte) 16;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor c(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioManager$OnCommunicationDeviceChangedListener e(Object obj) {
        return (AudioManager$OnCommunicationDeviceChangedListener) obj;
    }

    public int a(int i, flb0 flb0Var) {
        byte b = this.a;
        flb0 flb0Var2 = flb0.a;
        switch (b) {
            case 16:
                return c13.e(1.0f, flb0Var != flb0Var2 ? 1.0f : -1.0f, i / 2.0f);
            default:
                return c13.e(1.0f, flb0Var == flb0Var2 ? 1.0f : (-1.0f) * 1.0f, (i + 0) / 2.0f);
        }
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 14:
                fr8 fr8Var = (fr8) obj;
                return ((fr8Var instanceof br8) || (fr8Var instanceof ar8)) ? CompletableEmpty.a : Completable.j(new BuiltInAuthException(1, "Explicit user authorization is required to use Spotify. The user has to complete the auth-flow to allow the app to use Spotify on their behalf"));
            case 21:
                return ((PlayerState) obj).isPaused() ? new g9u0("AudioExternalKeyboardController", false) : new d9u0("AudioExternalKeyboardController", false);
            case 22:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.track().c() && l4o1.P((ContextTrack) playerState.track().b())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return new i9u0(((Long) obj).longValue());
        }
    }

    public Object b(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 1);
            default:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new uo7((byte) 0);
        }
    }

    public Object d(IInterface iInterface) {
        ((IAppHost) iInterface).invalidate();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(boolean z) {
        HashSet hashSetE;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                if (z) {
                    z580 z580Var = z580.a;
                    if (!dhn.a.contains(z580.class)) {
                        try {
                            if (m69.c()) {
                                z580.e.set(true);
                                z580.d();
                            } else {
                                y580.g();
                            }
                        } catch (Throwable th) {
                            dhn.a(z580.class, th);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (z) {
                    mub1 mub1Var = mub1.a;
                    Set set = dhn.a;
                    if (!set.contains(mub1.class)) {
                        try {
                            if (!mub1.b) {
                                mub1 mub1Var2 = mub1.a;
                                if (!set.contains(mub1Var2)) {
                                    try {
                                        c120 c120VarK = g120.k(wf10.b(), false);
                                        if (c120VarK != null) {
                                            mub1Var2.a(c120VarK.r);
                                            break;
                                        }
                                    } catch (Throwable th2) {
                                        dhn.a(mub1Var2, th2);
                                    }
                                }
                                mub1.b = (mub1.c.isEmpty() && mub1.d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th3) {
                            dhn.a(mub1.class, th3);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (z) {
                    vey0 vey0Var = vey0.a;
                    if (!dhn.a.contains(vey0.class)) {
                        try {
                            vey0.b = true;
                            vey0.a.a();
                        } catch (Throwable th4) {
                            dhn.a(vey0.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (z) {
                    Set set2 = dhn.a;
                    if (!set2.contains(stf0.class)) {
                        try {
                            stf0 stf0Var = stf0.b;
                            if (!set2.contains(stf0Var)) {
                                try {
                                    c120 c120VarK2 = g120.k(wf10.b(), false);
                                    if (c120VarK2 != null) {
                                        stf0.d = c120VarK2.n;
                                        break;
                                    }
                                } catch (Throwable th5) {
                                    dhn.a(stf0Var, th5);
                                }
                            }
                            if (stf0.d != null) {
                                stf0.c = true;
                            }
                        } catch (Throwable th6) {
                            dhn.a(stf0.class, th6);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (z) {
                    y8b y8bVar = y8b.a;
                    Set set3 = dhn.a;
                    if (!set3.contains(y8b.class)) {
                        try {
                            y8b y8bVar2 = y8b.a;
                            if (!set3.contains(y8bVar2)) {
                                try {
                                    c120 c120VarK3 = g120.k(wf10.b(), false);
                                    if (c120VarK3 != null && (hashSetE = fpi1.e(c120VarK3.o)) != null) {
                                        y8b.c = hashSetE;
                                    }
                                } catch (Throwable th7) {
                                    dhn.a(y8bVar2, th7);
                                }
                            }
                            HashSet hashSet = y8b.c;
                            if (hashSet != null && !hashSet.isEmpty()) {
                                y8b.b = true;
                            }
                        } catch (Throwable th8) {
                            dhn.a(y8b.class, th8);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 5:
                if (z) {
                    i711 i711Var = i711.a;
                    if (!dhn.a.contains(i711.class)) {
                        try {
                            i711.a.a();
                            if (!i711.c.isEmpty()) {
                                i711.b = true;
                            }
                        } catch (Throwable th9) {
                            dhn.a(i711.class, th9);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
                if (z) {
                    i561 i561Var = i561.a;
                    if (!dhn.a.contains(i561.class)) {
                        try {
                            i561.a.a();
                            if (i561.c.isEmpty() && i561.d.isEmpty()) {
                                i561.b = false;
                            } else {
                                i561.b = true;
                            }
                        } catch (Throwable th10) {
                            dhn.a(i561.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (z) {
                    try {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        md50 md50Var = new md50((xd) null, wf10.b().concat("/cloudbridge_settings"), (Bundle) null, a370.a, new id50() { // from class: p.km5
                            private final void b(pd50 pd50Var) {
                            }

                            @Override // p.id50
                            public final void a(pd50 pd50Var) {
                                switch (objArr2) {
                                    case 0:
                                        lf10 lf10Var = pd50Var.c;
                                        Object obj = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        linkedHashMap = null;
                                        LinkedHashMap linkedHashMap = null;
                                        if (lf10Var != null) {
                                            fza fzaVar = oue0.a;
                                            lf10Var.toString();
                                            String.valueOf(lf10Var.i);
                                            synchronized (wf10.b) {
                                            }
                                            if (!dhn.a.contains(lm5.class)) {
                                                try {
                                                    SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                                                    if (sharedPreferences != null) {
                                                        String string = sharedPreferences.getString("dataset_id", null);
                                                        String string2 = sharedPreferences.getString("endpoint", null);
                                                        String string3 = sharedPreferences.getString("access_key", null);
                                                        if (string != null && !ihc1.y0(string) && string2 != null && !ihc1.y0(string2) && string3 != null && !ihc1.y0(string3)) {
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            linkedHashMap2.put("endpoint", string2);
                                                            linkedHashMap2.put("dataset_id", string);
                                                            linkedHashMap2.put("access_key", string3);
                                                            linkedHashMap = linkedHashMap2;
                                                        }
                                                    }
                                                } catch (Throwable th11) {
                                                    dhn.a(lm5.class, th11);
                                                }
                                            }
                                            if (linkedHashMap != null) {
                                                URL url = new URL(String.valueOf(linkedHashMap.get("endpoint")));
                                                qm5.c = new pm5(String.valueOf(linkedHashMap.get("dataset_id")), url.getProtocol() + "://" + url.getHost(), String.valueOf(linkedHashMap.get("access_key")));
                                                qm5.d = new ArrayList();
                                                lm5.a = true;
                                            }
                                        } else {
                                            fza fzaVar2 = oue0.a;
                                            HashSet hashSet2 = wf10.b;
                                            synchronized (hashSet2) {
                                            }
                                            JSONObject jSONObject = pd50Var.b;
                                            if (jSONObject != null) {
                                                try {
                                                    obj = jSONObject.get("data");
                                                } catch (NullPointerException e) {
                                                    fza fzaVar3 = oue0.a;
                                                    j2h1.I(e);
                                                    wf10.g();
                                                    return;
                                                } catch (JSONException e2) {
                                                    fza fzaVar4 = oue0.a;
                                                    j2h1.I(e2);
                                                    wf10.g();
                                                    return;
                                                }
                                            }
                                            HashMap mapG = fpi1.g(new JSONObject((String) o7h.s0(fpi1.f((JSONArray) obj))));
                                            String str = (String) mapG.get("endpoint");
                                            String str2 = (String) mapG.get("dataset_id");
                                            String str3 = (String) mapG.get("access_key");
                                            if (str == null || str2 == null || str3 == null) {
                                                synchronized (hashSet2) {
                                                }
                                            } else {
                                                try {
                                                    qm5.c = new pm5(str2, str, str3);
                                                    qm5.d = new ArrayList();
                                                    lm5.t(mapG);
                                                    lm5.a = mapG.get("is_enabled") != null ? ((Boolean) mapG.get("is_enabled")).booleanValue() : false;
                                                } catch (MalformedURLException e3) {
                                                    fza fzaVar5 = oue0.a;
                                                    j2h1.I(e3);
                                                    synchronized (wf10.b) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 1:
                                        break;
                                    default:
                                        fza fzaVar6 = oue0.a;
                                        lbk1.a();
                                        synchronized (wf10.b) {
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 32);
                        fza fzaVar = oue0.a;
                        synchronized (wf10.b) {
                        }
                        md50Var.d();
                    } catch (JSONException e) {
                        fza fzaVar2 = oue0.a;
                        j2h1.I(e);
                        synchronized (wf10.b) {
                            return;
                        }
                    }
                }
                break;
            case 8:
                if (z) {
                    l550 l550Var = l550.a;
                    if (!dhn.a.contains(l550.class)) {
                        try {
                            l550.b = true;
                            l550.c = new m550(wf10.a());
                            l550.d = "https://www." + wf10.s + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th11) {
                            dhn.a(l550.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 9:
                if (z) {
                    vxq0.a();
                }
                break;
            case 10:
                if (z) {
                    AtomicBoolean atomicBoolean = n550.a;
                    if (!dhn.a.contains(n550.class)) {
                        try {
                            n550.a.set(true);
                        } catch (Throwable th12) {
                            dhn.a(n550.class, th12);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 11:
                if (z) {
                    v131 v131Var = v131.a;
                    if (!dhn.a.contains(v131.class)) {
                        try {
                            v131.b = true;
                            v131.a.b();
                        } catch (Throwable th13) {
                            dhn.a(v131.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z) {
                    dim0 dim0Var = dim0.a;
                    if (!dhn.a.contains(dim0.class)) {
                        try {
                            try {
                                wf10.c().execute(new k((byte) 13));
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Throwable th14) {
                            dhn.a(dim0.class, th14);
                            return;
                        }
                        break;
                    }
                }
                break;
            default:
                if (z) {
                    y900 y900Var = y900.a;
                    if (!dhn.a.contains(y900.class)) {
                        try {
                            y900.b = true;
                            y900.a.a();
                        } catch (Throwable th15) {
                            dhn.a(y900.class, th15);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public void invoke(Object obj) {
        long jE0;
        z8c0 z8c0Var;
        zo00 zo00Var;
        ugr ugrVar = (ugr) obj;
        switch (this.a) {
            case 26:
                ygr ygrVar = ugrVar.a;
                if (ugrVar == ygrVar.k && ygrVar.o != null) {
                    wgr wgrVar = ygrVar.q;
                    int i = wgrVar.d;
                    if (i != -1) {
                        long j = wgrVar.e.f / i;
                        o58 o58Var = ygrVar.u;
                        o58Var.getClass();
                        jE0 = zoi1.e0(o58Var.a.getSampleRate(), j);
                    } else {
                        jE0 = -9223372036854775807L;
                    }
                    final long jElapsedRealtime = SystemClock.elapsedRealtime() - ygrVar.Y;
                    z8c0 z8c0Var2 = ygrVar.o;
                    final int i2 = ygrVar.q.e.f;
                    final long jN0 = zoi1.n0(jE0);
                    final em3 em3Var = ((zjh0) z8c0Var2.b).i2;
                    Handler handler = (Handler) em3Var.b;
                    if (handler != null) {
                        final byte b = 0;
                        handler.post(new Runnable() { // from class: p.o38
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                Object obj2 = em3Var;
                                switch (b2) {
                                    case 0:
                                        t38 t38Var = (t38) ((em3) obj2).c;
                                        String str = zoi1.a;
                                        t38Var.G(i2, jN0, jElapsedRealtime);
                                        break;
                                    default:
                                        ((m4a) obj2).b.a(i2, jN0, jElapsedRealtime);
                                        break;
                                }
                            }
                        });
                    }
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ugrVar.getClass();
                ygr.e0.getAndDecrement();
                z8c0 z8c0Var3 = ugrVar.a.o;
                if (z8c0Var3 != null) {
                    b4x0 b4x0Var = new b4x0((byte) 29);
                    em3 em3Var2 = ((zjh0) z8c0Var3.b).i2;
                    Handler handler2 = (Handler) em3Var2.b;
                    if (handler2 != null) {
                        handler2.post(new q38(em3Var2, b4x0Var, (byte) 0));
                    }
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ygr ygrVar2 = ugrVar.a;
                if (ugrVar == ygrVar2.k && (z8c0Var = ygrVar2.o) != null && ygrVar2.Q && (zo00Var = ((zjh0) z8c0Var.b).i1) != null) {
                    zo00Var.a();
                }
                break;
            default:
                ygr ygrVar3 = ugrVar.a;
                if (ugrVar == ygrVar3.k && ygrVar3.O) {
                    ygrVar3.P = true;
                }
                break;
        }
    }

    public /* synthetic */ um5(byte b) {
        this.a = b;
    }
}
