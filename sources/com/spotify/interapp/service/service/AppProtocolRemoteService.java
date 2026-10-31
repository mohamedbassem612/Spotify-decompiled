package com.spotify.interapp.service.service;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.spotify.appauthorization.sso.ClientIdentity;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import p.aij0;
import p.ajg;
import p.aos;
import p.b791;
import p.b7n;
import p.bmq0;
import p.cyi0;
import p.dbm;
import p.dm5;
import p.dxz0;
import p.ev5;
import p.f0q;
import p.fe;
import p.fu50;
import p.fv5;
import p.g510;
import p.gv5;
import p.ho41;
import p.hpq;
import p.hu50;
import p.hv5;
import p.i090;
import p.i3b;
import p.i961;
import p.ifl1;
import p.j380;
import p.jma;
import p.kv5;
import p.mj61;
import p.nfa0;
import p.nk70;
import p.o241;
import p.oh61;
import p.p1f0;
import p.p2p;
import p.rku;
import p.ro5;
import p.s24;
import p.t2j0;
import p.uk4;
import p.vd;
import p.w43;
import p.x45;
import p.x610;
import p.x74;
import p.xig;
import p.y610;
import p.yqg;
import p.yt91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class AppProtocolRemoteService extends hpq {
    public static final /* synthetic */ int f1 = 0;
    public b7n N0;
    public yqg O0;
    public g510 P0;
    public ev5 Q0;
    public String R0;
    public dxz0 S0;
    public b791 T0;
    public Map U0;
    public vd V0;
    public nfa0 W0;
    public ro5 X;
    public t2j0 X0;
    public o241 Y;
    public Flowable Z;
    public f0q a;
    public x610 a1;
    public y610 b;
    public Flowable c;
    public xig c1;
    public jma d;
    public Scheduler e;
    public Handler e1;
    public i961 f;
    public p2p g;
    public mj61 h;
    public yt91 i;
    public ajg t;
    public final Messenger Y0 = new Messenger((Handler) new kv5(this));
    public final HashSet Z0 = new HashSet();
    public final rku b1 = new rku();
    public final ArrayList d1 = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Message message) {
        ApplicationInfo applicationInfo;
        aij0 aij0Var = new aij0(message.replyTo);
        Messenger messenger = aij0Var.b;
        try {
            jma jmaVar = this.d;
            int i = message.arg1;
            jmaVar.getClass();
            String[] packagesForUid = getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                String str = packagesForUid[0];
                Signature signatureA = xig.a(this, str);
                int i2 = hu50.a;
                cyi0 cyi0Var = fu50.a;
                byte[] byteArray = signatureA.toByteArray();
                cyi0Var.getClass();
                int length = byteArray.length;
                dm5.v(0, length, byteArray.length);
                dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                bmq0 bmq0VarM = cyi0Var.M();
                bmq0VarM.U(byteArray, length);
                xig xigVar = new xig(str, bmq0VarM.C().toString().toUpperCase(Locale.US));
                PackageManager packageManager = getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    applicationInfo = null;
                }
                this.f.g("com.spotify.interapp.service.service.AppProtocolRemoteService", getString(2131956738, (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : getString(2131952370))));
                s24 s24Var = new s24(new x45(this.W0), aij0Var, Executors.newSingleThreadExecutor());
                int[] iArr = {2, 1, 4, 8};
                int i3 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    i3 |= iArr[i4];
                }
                ho41 ho41Var = new ho41(i3);
                f0q f0qVar = this.a;
                x610 x610Var = this.a1;
                dbm dbmVar = new dbm();
                dbmVar.a = ho41Var;
                oh61 oh61Var = new oh61(this, f0qVar, x610Var, dbmVar, (i090) this.g.get(), this.e, this.i, this.Y, this.Z, this.N0, this.c, this.O0, this.P0, this.S0, this.T0, this.U0);
                aos aosVar = new aos(s24Var, oh61Var, j380.l("appid", this.X), this.h, xigVar);
                this.d1.add(aosVar);
                this.c1 = xigVar;
                s24Var.f = new nk70(new fe(aosVar, (byte) 5), new gv5(oh61Var, (byte) 0), new i3b((Object) aosVar, (byte) 4), new ifl1(new hv5(oh61Var), (byte) 14));
                s24Var.e = new p1f0(aosVar, s24Var, this.h, this, this.t, this.O0, this.V0);
                aij0Var.d = new uk4(this, aosVar, (byte) 3);
                try {
                    messenger.getBinder().linkToDeath(aij0Var, 0);
                } catch (RemoteException unused2) {
                    Logger.d("Trying to create a session but client binder is already dead.", new Object[0]);
                    aij0Var.binderDied();
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.replyTo = aij0Var.a;
                try {
                    messenger.send(messageObtain);
                    return;
                } catch (RemoteException unused3) {
                    Logger.d("Could not send the message to the remote client", new Object[0]);
                    return;
                }
            }
            try {
                throw new ClientIdentity.ValidationException("Can't find packages for caller id");
            } catch (ClientIdentity.ValidationException unused4) {
            }
        } catch (ClientIdentity.ValidationException unused5) {
        }
        Logger.d("Cannot validate calling identity", new Object[r6]);
        stopSelf();
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 1;
        try {
            messenger.send(messageObtain2);
        } catch (RemoteException unused6) {
            Logger.d("Could not send the message to the remote client", new Object[0]);
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.Y0.getBinder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        try {
            x74.s0(this, 28, 2);
        } catch (Exception unused) {
        }
        super.onCreate();
        this.e1 = new Handler();
        this.b1.b(new FlowableDoFinally(this.b.a(this.R0).L(this.e), new w43(this, (byte) 1)).subscribe(new fv5(this, (byte) 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        this.f.f(this, "com.spotify.interapp.service.service.AppProtocolRemoteService");
        this.b1.a();
        super/*android.app.Service*/.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f.e(this, "com.spotify.interapp.service.service.AppProtocolRemoteService", Build.VERSION.SDK_INT >= 31 ? 2 : null);
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            ArrayList<aos> arrayList = this.d1;
            for (aos aosVar : arrayList) {
                if (aosVar.l != 2) {
                    aosVar.b("wamp.error.system_shutdown");
                    mj61 mj61Var = aosVar.g;
                    mj61Var.getClass();
                    int i = aosVar.e;
                    ConcurrentHashMap concurrentHashMap = mj61Var.a;
                    concurrentHashMap.remove(Integer.valueOf(i));
                    mj61Var.b.onNext(new ArrayList(concurrentHashMap.values()));
                }
            }
            arrayList.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onUnbind(Intent intent) {
        stopSelf();
        return super/*android.app.Service*/.onUnbind(intent);
    }
}
