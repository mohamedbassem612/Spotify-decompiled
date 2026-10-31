package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wyl1 implements anc0, mqb1 {
    public final String a;
    public final Intent b;
    public final q8n c;
    public final koc0 d;
    public final b1r0 e;
    public xab1 f;
    public volatile boolean g;

    public wyl1(String str, Intent intent, q8n q8nVar, koc0 koc0Var, b1r0 b1r0Var) {
        this.a = str;
        this.b = intent;
        this.c = q8nVar;
        this.d = koc0Var;
        this.e = b1r0Var;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.g = bundle != null ? bundle.getBoolean("workout_open_settings_has_triggered") : false;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        bundle.putBoolean("workout_open_settings_has_triggered", this.g);
    }

    @Override // p.anc0
    public final void n() {
        String strI;
        if (this.g) {
            return;
        }
        String str = this.a;
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(str).d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) && (strI = cgj1.I(this.a)) != null) {
            xab1 xab1Var = this.f;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            String dataString = this.b.getDataString();
            this.f = fn31.T(smo1.e(this.c), (o8n) null, 0, new fjk(dataString != null && u890.j(uic.x(dataString).n("openWorkoutSettings"), "true"), this, strI, ((roc0) this.d).d(), (lnm) null, (byte) 5), 3);
        }
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
