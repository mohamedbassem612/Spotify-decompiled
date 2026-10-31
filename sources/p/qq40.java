package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qq40 implements ServiceConnection {
    public final String X;
    public final Context a;
    public final nj7 b;
    public uk4 c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int t;

    public qq40(Context context, rye0 rye0Var) {
        String str = rye0Var.d;
        String strValueOf = String.valueOf(rye0Var.e);
        String str2 = rye0Var.Q0;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = 65536;
        this.g = 65537;
        this.h = str;
        this.i = strValueOf;
        this.t = 20121101;
        this.X = str2;
        this.b = new nj7(this, (byte) 9);
    }

    public final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            uk4 uk4Var = this.c;
            if (uk4Var != null) {
                rq40 rq40Var = (rq40) uk4Var.b;
                rye0 rye0Var = (rye0) uk4Var.c;
                qq40 qq40Var = rq40Var.c;
                if (qq40Var != null) {
                    qq40Var.c = null;
                }
                rq40Var.c = null;
                m4e0 m4e0Var = rq40Var.h().e;
                if (m4e0Var != null) {
                    View view = ((l1f0) m4e0Var.b).J1;
                    if (view == null) {
                        u890.C("progressBar");
                        throw null;
                    }
                    view.setVisibility(8);
                }
                if (bundle != null) {
                    z6x stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = z6x.a;
                    }
                    w7x<String> w7xVar = rye0Var.b;
                    if (w7xVar == null) {
                        w7xVar = w7x.a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (w7xVar.contains("openid") && (string == null || string.length() == 0)) {
                        rq40Var.h().s();
                        return;
                    }
                    if (stringArrayList.containsAll((Collection) w7xVar)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            rq40Var.x(bundle, rye0Var);
                            return;
                        }
                        m4e0 m4e0Var2 = rq40Var.h().e;
                        if (m4e0Var2 != null) {
                            View view2 = ((l1f0) m4e0Var2.b).J1;
                            if (view2 == null) {
                                u890.C("progressBar");
                                throw null;
                            }
                            view2.setVisibility(0);
                        }
                        final String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 == null) {
                            eg.m("Required value was null.");
                            return;
                        }
                        final lc20 lc20Var = new lc20(bundle, rq40Var, rye0Var, (byte) 14);
                        JSONObject jSONObjectA = a8x0.a(string3);
                        if (jSONObjectA != null) {
                            lc20Var.b(jSONObjectA);
                            return;
                        }
                        id50 id50Var = new id50() { // from class: p.dpi1
                            @Override // p.id50
                            public final void a(pd50 pd50Var) {
                                JSONObject jSONObject = pd50Var.d;
                                lf10 lf10Var = pd50Var.c;
                                epi1 epi1Var = lc20Var;
                                if (lf10Var != null) {
                                    epi1Var.d(lf10Var.i);
                                } else if (jSONObject == null) {
                                    eg.m("Required value was null.");
                                } else {
                                    a8x0.a.put(string3, jSONObject);
                                    epi1Var.b(jSONObject);
                                }
                            }
                        };
                        md50 md50VarP = fpi1.p(string3);
                        md50VarP.i(id50Var);
                        md50VarP.d();
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : w7xVar) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        rq40Var.a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    rye0Var.b = hashSet;
                }
                rq40Var.h().s();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.X;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f);
        messageObtain.arg1 = this.t;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
