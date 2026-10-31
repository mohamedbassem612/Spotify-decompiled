package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.base.java.logging.Logger;
import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jlb extends BroadcastReceiver {
    public static jlb c;
    public final /* synthetic */ byte a;
    public Object b;

    public jlb(Context context) {
        this.a = (byte) 0;
        this.b = context.getApplicationContext();
    }

    public static final jlb a() {
        if (dhn.a.contains(jlb.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            dhn.a(jlb.class, th);
            return null;
        }
    }

    public void b() {
        Log.isLoggable("FirebaseMessaging", 3);
        ((ucd1) this.b).c.b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                Set set = dhn.a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                zce0.a((Context) this.b).d(this);
                            } catch (Throwable th) {
                                dhn.a(this, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        dhn.a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fkb fkbVar;
        KeyEvent keyEventP;
        switch (this.a) {
            case 0:
                if (!dhn.a.contains(this)) {
                    try {
                        rm5 rm5Var = new rm5(context, (String) null);
                        StringBuilder sb = new StringBuilder("bf_");
                        sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String str : setKeySet) {
                                bundle.putString(Pattern.compile("[ -]*$").matcher(Pattern.compile("^[ -]*").matcher(Pattern.compile("[^0-9a-zA-Z _-]").matcher(str).replaceAll("-")).replaceAll("")).replaceAll(""), (String) bundleExtra.get(str));
                            }
                        }
                        wf10 wf10Var = wf10.a;
                        if (wgi1.c()) {
                            rm5Var.y(bundle, string);
                        }
                    } catch (Throwable th) {
                        dhn.a(this, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                q64 q64Var = (q64) this.b;
                q64Var.c.execute(new p64(q64Var, (byte) 2));
                break;
            case 2:
                ((yf) this.b).q();
                break;
            case 3:
                tp7 tp7Var = (tp7) this.b;
                if (!isInitialStickyBroadcast()) {
                    tp7Var.h(qp7.b(context, intent, (po7) tp7Var.k, (AudioDeviceInfo) tp7Var.j, tp7Var.g()));
                }
                break;
            case 4:
                gkb gkbVar = (gkb) this.b;
                if (u890.j(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", os00.INVALID_ID)) {
                        case 10:
                            fkbVar = fkb.a;
                            break;
                        case 11:
                            fkbVar = fkb.d;
                            break;
                        case 12:
                            fkbVar = fkb.c;
                            break;
                        case 13:
                            fkbVar = fkb.b;
                            break;
                        default:
                            fkbVar = fkb.e;
                            break;
                    }
                    gkbVar.d.onNext(fkbVar);
                    break;
                }
                break;
            case 5:
                ((v5c) this.b).f(intent);
                break;
            case 6:
                ((x5c) this.b).b.onNext(intent);
                break;
            case 7:
                ((bqd) this.b).Z.startQuery(42, null, bqd.O0, new String[]{"CarConnectionState"}, null, null, null);
                break;
            case 8:
                ((CustomTabActivity) this.b).finish();
                break;
            case 9:
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i = CustomTabMainActivity.c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            case 10:
                odu oduVar = (odu) this.b;
                if (!oduVar.I1 && context != null) {
                    oduVar.J1 = true;
                    if (!"check_storage.diskspace.ok".equals(intent.getAction())) {
                        oduVar.H1 = new Intent(context, (Class<?>) DiskAlmostFullActivity.class);
                        h3u h3uVar = ((s5w0) oduVar).F1;
                        if (h3uVar != null) {
                            h3uVar.Z0(oduVar);
                            oduVar.I1 = true;
                        }
                        break;
                    }
                }
                break;
            case 11:
                ilo1.E(intent, (ssw0) this.b);
                break;
            case 12:
                Logger.k("Audio has become noisy - headset probably removed", new Object[0]);
                inh0 inh0Var = (inh0) this.b;
                inh0Var.e.a(inh0Var.a.a().a(new d9u0("mediafocusmanagerplugin", true)).subscribe());
                break;
            case 13:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEventP = twa.p(intent)) != null) {
                    ((e0i0) this.b).j.getController().dispatchMediaButtonEvent(keyEventP);
                }
                break;
            case 14:
                ((Executor) ((v8o0) this.b).c).execute(new zyh0((Object) this, (Object) context, (byte) 11));
                break;
            case 15:
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    ((djh0) ((g9r) this.b).d).d(keyEvent, new m4c((byte) 17));
                    break;
                }
                break;
            case 16:
                ((h9d0) this.b).g();
                break;
            case 17:
                if (!isInitialStickyBroadcast()) {
                    ((at7) this.b).c();
                }
                break;
            default:
                ucd1 ucd1Var = (ucd1) this.b;
                if (ucd1Var != null && ucd1Var.a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    ucd1 ucd1Var2 = (ucd1) this.b;
                    FirebaseMessaging firebaseMessaging = ucd1Var2.c;
                    FirebaseMessaging.b(ucd1Var2, 0L);
                    ((ucd1) this.b).c.b.unregisterReceiver(this);
                    this.b = null;
                }
                break;
        }
    }

    public /* synthetic */ jlb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public jlb(ucd1 ucd1Var) {
        this.a = (byte) 18;
        this.b = ucd1Var;
    }
}
