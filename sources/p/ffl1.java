package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64;
import app.p000rive.semantics.SemanticState;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.lang.ref.WeakReference;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ffl1 {
    public static final ComponentName l = new ComponentName("com.waze", "com.waze.sdk.SdkService");
    public static final xfl1 m = new xfl1();
    public static WeakReference n;
    public final Context a;
    public final t8r0 b;
    public String c;
    public Messenger d;
    public Messenger e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final qpj1 i;
    public qpj1 j;
    public final ufl1 k = new ufl1(this);

    public ffl1(Context context, t8r0 t8r0Var, qpj1 qpj1Var) {
        new WeakReference(this);
        this.a = context.getApplicationContext();
        this.b = t8r0Var;
        this.i = qpj1Var;
        e();
    }

    public static ffl1 h(Context context, t8r0 t8r0Var, qpj1 qpj1Var) {
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i == 0) {
            eg.m("Waze not installed.");
            return null;
        }
        if (i < 1021549) {
            eg.m(f4i1.f("Waze version ", lvx.l(context), " does not support Audio SDK version 1.0.0.9."));
            return null;
        }
        WeakReference weakReference = n;
        if (weakReference != null && weakReference.get() != null && ((ffl1) n.get()).g) {
            ((ffl1) n.get()).f(5);
        }
        WeakReference weakReference2 = new WeakReference(new ffl1(context, t8r0Var, qpj1Var));
        n = weakReference2;
        return (ffl1) weakReference2.get();
    }

    public final void e() {
        String strEncodeToString;
        if (this.g || this.h) {
            return;
        }
        this.h = true;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(SemanticState.Focused);
            strEncodeToString = Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = null;
        }
        this.c = strEncodeToString;
        Intent intent = new Intent();
        intent.setComponent(l);
        this.a.bindService(intent, (ServiceConnection) this.k, 1);
        this.f = true;
    }

    public final void f(int i) {
        if (this.f) {
            Messenger messenger = this.d;
            if (messenger != null) {
                try {
                    String str = this.c;
                    Message messageObtain = Message.obtain((Handler) null, 103);
                    Bundle bundle = new Bundle();
                    bundle.putString("token", str);
                    messageObtain.setData(bundle);
                    messenger.send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            this.a.unbindService(this.k);
            this.f = false;
        }
        if (this.g) {
            this.g = false;
            this.h = false;
            this.d = null;
            this.c = null;
            xfl1 xfl1Var = m;
            xfl1Var.getClass();
            Iterator it = xfl1Var.a.iterator();
            while (it.hasNext()) {
                pze0.m(((WeakReference) it.next()).get());
                it.remove();
            }
            qpj1 qpj1Var = this.i;
            if (qpj1Var != null) {
                ((BehaviorSubject) qpj1Var.c).onNext(Boolean.FALSE);
                yfl1 yfl1Var = (yfl1) ((qeh1) qpj1Var.b).b;
                yfl1Var.d(bgl1.b);
                yfl1Var.a();
            }
        }
    }

    public final rh3 g() {
        return new rh3(this);
    }

    public final boolean i() {
        if (this.j != null) {
            return true;
        }
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        return false;
    }

    public final void j(int i, String str) {
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        qpj1 qpj1Var = this.j;
        if (qpj1Var != null) {
            if (i > 0 || str != null) {
                qeh1 qeh1Var = (qeh1) qpj1Var.b;
                String strValueOf = String.valueOf(i);
                yfl1 yfl1Var = (yfl1) qeh1Var.b;
                sfl1 sfl1Var = yfl1Var.d;
                sfl1Var.e = strValueOf;
                sfl1Var.d.onNext(Boolean.valueOf(sfl1Var.a()));
                sfl1Var.a = str;
                yfl1Var.e();
            }
        }
    }

    public final void k(int i) {
        bgl1 bgl1Var;
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        qpj1 qpj1Var = this.j;
        if (qpj1Var == null || i == 0) {
            return;
        }
        qeh1 qeh1Var = (qeh1) qpj1Var.b;
        switch (l1d.C(i)) {
            case 0:
                bgl1Var = bgl1.b;
                break;
            case 1:
                bgl1Var = bgl1.c;
                break;
            case 2:
                bgl1Var = bgl1.d;
                break;
            case 3:
                bgl1Var = bgl1.e;
                break;
            case 4:
                bgl1Var = bgl1.f;
                break;
            case 5:
                bgl1Var = bgl1.g;
                break;
            case 6:
                bgl1Var = bgl1.h;
                break;
            case 7:
                bgl1Var = bgl1.i;
                break;
            case 8:
                bgl1Var = bgl1.t;
                break;
            case 9:
                bgl1Var = bgl1.X;
                break;
            case 10:
                bgl1Var = bgl1.Y;
                break;
            case 11:
                bgl1Var = bgl1.Z;
                break;
            case 12:
                bgl1Var = bgl1.N0;
                break;
            case 13:
                bgl1Var = bgl1.O0;
                break;
            case 14:
                bgl1Var = bgl1.P0;
                break;
            case 15:
                bgl1Var = bgl1.Q0;
                break;
            case 16:
                bgl1Var = bgl1.R0;
                break;
            case 17:
                bgl1Var = bgl1.S0;
                break;
            case 18:
                bgl1Var = bgl1.T0;
                break;
            case 19:
                bgl1Var = bgl1.U0;
                break;
            case 20:
                bgl1Var = bgl1.V0;
                break;
            default:
                eg.o();
                return;
        }
        ((yfl1) qeh1Var.b).d(bgl1Var);
    }

    public final void l(boolean z) {
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        qpj1 qpj1Var = this.j;
        if (qpj1Var != null) {
            qeh1 qeh1Var = (qeh1) qpj1Var.b;
            if (z) {
                return;
            }
            ((yfl1) qeh1Var.b).d(bgl1.b);
        }
    }

    public final void m(int i) {
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        qpj1 qpj1Var = this.j;
        if (qpj1Var != null) {
            yfl1 yfl1Var = (yfl1) ((qeh1) qpj1Var.b).b;
            yfl1Var.d.c = String.valueOf(i);
            yfl1Var.e();
        }
    }

    public final void n() {
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
    }

    public final void o(boolean z) {
        xfl1 xfl1Var = m;
        xfl1Var.getClass();
        Iterator it = xfl1Var.a.iterator();
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        qpj1 qpj1Var = this.j;
        if (qpj1Var != null) {
            ((yfl1) ((qeh1) qpj1Var.b).b).d.b = z;
        }
    }

    public final void p() {
        Messenger messenger = this.d;
        if (messenger != null) {
            try {
                String str = this.c;
                boolean zI = i();
                Message messageObtain = Message.obtain((Handler) null, 102);
                Bundle bundle = new Bundle();
                bundle.putString("token", str);
                bundle.putBoolean("request", zI);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }
}
