package p;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yqh0 implements Handler.Callback {
    public final int X;
    public final byte Y;
    public final d1i0 a;
    public final NotificationManager b;
    public final Handler c;
    public final wkh0 d;
    public final String e;
    public final HashMap f;
    public final k7s g;
    public final boolean h;
    public boolean i;
    public boolean t;

    public yqh0(d1i0 d1i0Var, k7s k7sVar, twa twaVar) {
        this.a = d1i0Var;
        this.g = k7sVar;
        NotificationManager notificationManager = (NotificationManager) d1i0Var.getSystemService("notification");
        notificationManager.getClass();
        this.b = notificationManager;
        Looper mainLooper = Looper.getMainLooper();
        String str = zoi1.a;
        this.c = new Handler(mainLooper, this);
        this.d = new wkh0(this, (byte) 2);
        Intent intent = new Intent((Context) d1i0Var, d1i0Var.getClass());
        String string = UUID.randomUUID().toString();
        this.e = string;
        intent.putExtra("androidx.media3.session.intent.uid", string);
        this.f = new HashMap();
        this.h = false;
        this.t = true;
        this.X = 600000;
        this.Y = (byte) 3;
    }

    public final Pair a(d1i0 d1i0Var) {
        zoi1.u(this.b, this.g.a.getString(2131954915));
        dko0 dko0Var = new dko0(d1i0Var, "default_channel_id");
        if (Build.VERSION.SDK_INT >= 31) {
            dko0Var.B = (byte) 2;
        }
        dko0Var.l(8, true);
        dko0Var.D.icon = 2131233594;
        dko0Var.v = -1;
        dko0Var.l(2, false);
        return new Pair(20938, dko0Var.c());
    }

    public final void b() {
        this.t = false;
        Handler handler = this.c;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            d1i0 d1i0Var = this.a;
            ArrayList arrayListL = d1i0Var.l();
            for (int i = 0; i < arrayListL.size(); i++) {
                d1i0Var.o(false);
            }
        }
    }

    public final tkh0 c(kph0 kph0Var) {
        wqh0 wqh0Var = (wqh0) this.f.get(kph0Var);
        if (wqh0Var != null) {
            v6 v6Var = wqh0Var.a;
            if (v6Var.isDone()) {
                try {
                    return (tkh0) fc11.C(v6Var);
                } catch (ExecutionException e) {
                    bhn0.p(e);
                }
            }
        }
        return null;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.h;
    }

    public final void f(kph0 kph0Var, String str, Bundle bundle) {
        tkh0 tkh0VarC = c(kph0Var);
        if (tkh0VarC == null) {
            return;
        }
        zoi1.c0(kph0Var.a.l, new m2d(this, kph0Var, str, bundle, tkh0VarC));
    }

    public final boolean g(boolean z) {
        boolean z2;
        long j = this.X;
        ArrayList arrayListL = this.a.l();
        int i = 0;
        while (true) {
            if (i >= arrayListL.size()) {
                z2 = false;
                break;
            }
            tkh0 tkh0VarC = c((kph0) arrayListL.get(i));
            if (tkh0VarC != null && ((tkh0VarC.q() || z) && (tkh0VarC.getPlaybackState() == 3 || tkh0VarC.getPlaybackState() == 2))) {
                z2 = true;
                break;
            }
            i++;
        }
        boolean z3 = this.t && j > 0;
        boolean z4 = this.i;
        Handler handler = this.c;
        if (z4 && !z2 && z3) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.i = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean h(kph0 kph0Var) {
        tkh0 tkh0VarC = c(kph0Var);
        if (tkh0VarC != null && !tkh0VarC.d0().p()) {
            wqh0 wqh0Var = (wqh0) this.f.get(kph0Var);
            wqh0Var.getClass();
            if (tkh0VarC.getPlaybackState() != 1) {
                wqh0Var.b = false;
                wqh0Var.c = true;
                return true;
            }
            byte b = this.Y;
            if (b == 1) {
                return !wqh0Var.b;
            }
            if (b != 2) {
                if (b != 3) {
                    bhn0.w();
                    return false;
                }
                if (!wqh0Var.b && wqh0Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        d1i0 d1i0Var = this.a;
        ArrayList arrayListL = d1i0Var.l();
        for (int i = 0; i < arrayListL.size(); i++) {
            d1i0Var.o(false);
        }
        return true;
    }
}
