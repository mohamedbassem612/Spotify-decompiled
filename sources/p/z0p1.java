package p;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z0p1 extends xxh0 {
    public final /* synthetic */ a8p1 f;

    public z0p1(a8p1 a8p1Var) {
        Objects.requireNonNull(a8p1Var);
        this.f = a8p1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c(String str, Bundle bundle) {
        a8p1.v.a("onCustomAction with action = %s", new Object[]{str});
        int iHashCode = str.hashCode();
        a8p1 a8p1Var = this.f;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -a8p1Var.e.c;
                    e321 e321Var = a8p1Var.n;
                    if (e321Var == null) {
                        return;
                    }
                    long jMin = Math.min(e321Var.f(), Math.max(0L, e321Var.b() + j));
                    e321 e321Var2 = a8p1Var.n;
                    if (e321Var2 == null) {
                        return;
                    }
                    dxh0 dxh0Var = new dxh0(jMin);
                    zod.n("Must be called from the main thread.");
                    if (e321Var2.r()) {
                        e321.s(new min1(e321Var2, dxh0Var));
                        return;
                    } else {
                        e321.q();
                        return;
                    }
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    wf61 wf61Var = a8p1Var.d;
                    if (wf61Var != null) {
                        wf61Var.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    wf61 wf61Var2 = a8p1Var.d;
                    if (wf61Var2 != null) {
                        wf61Var2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = a8p1Var.e.c;
                    e321 e321Var3 = a8p1Var.n;
                    if (e321Var3 == null) {
                        return;
                    }
                    long jMin2 = Math.min(e321Var3.f(), Math.max(0L, e321Var3.b() + j2));
                    e321 e321Var4 = a8p1Var.n;
                    if (e321Var4 == null) {
                        return;
                    }
                    dxh0 dxh0Var2 = new dxh0(jMin2);
                    zod.n("Must be called from the main thread.");
                    if (e321Var4.r()) {
                        e321.s(new min1(e321Var4, dxh0Var2));
                        return;
                    } else {
                        e321.q();
                        return;
                    }
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(a8p1Var.g);
        int i = Build.VERSION.SDK_INT;
        Context context = a8p1Var.a;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public final boolean d(Intent intent) {
        e321 e321Var;
        a8p1.v.a("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (e321Var = this.f.n) == null) {
            return true;
        }
        e321Var.m();
        return true;
    }

    public final void e() {
        a8p1.v.a("onPause", new Object[0]);
        e321 e321Var = this.f.n;
        if (e321Var != null) {
            e321Var.m();
        }
    }

    public final void f() {
        a8p1.v.a("onPlay", new Object[0]);
        e321 e321Var = this.f.n;
        if (e321Var != null) {
            e321Var.m();
        }
    }

    public final void l(long j) {
        pue0 pue0Var = a8p1.v;
        a8p1.v.a("onSeekTo %d", new Object[]{Long.valueOf(j)});
        e321 e321Var = this.f.n;
        if (e321Var == null) {
            return;
        }
        dxh0 dxh0Var = new dxh0(j);
        zod.n("Must be called from the main thread.");
        if (e321Var.r()) {
            e321.s(new min1(e321Var, dxh0Var));
        } else {
            e321.q();
        }
    }

    public final void p() {
        a8p1.v.a("onSkipToNext", new Object[0]);
        e321 e321Var = this.f.n;
        if (e321Var != null) {
            zod.n("Must be called from the main thread.");
            if (e321Var.r()) {
                e321.s(new ren1(e321Var, (byte) 1, false));
            } else {
                e321.q();
            }
        }
    }

    public final void q() {
        a8p1.v.a("onSkipToPrevious", new Object[0]);
        e321 e321Var = this.f.n;
        if (e321Var != null) {
            zod.n("Must be called from the main thread.");
            if (e321Var.r()) {
                e321.s(new ren1(e321Var, (byte) 0, false));
            } else {
                e321.q();
            }
        }
    }
}
