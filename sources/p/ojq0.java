package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ojq0 implements anc0, mqb1 {
    public final /* synthetic */ byte a;
    public final Intent b;
    public final q8n c;
    public xab1 d;
    public boolean e;
    public final Object f;
    public final Object g;

    public /* synthetic */ ojq0(Intent intent, Object obj, Object obj2, q8n q8nVar, byte b) {
        this.a = b;
        this.b = intent;
        this.f = obj;
        this.g = obj2;
        this.c = q8nVar;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        switch (this.a) {
            case 0:
                this.e = bundle != null ? bundle.getBoolean("open_mixing_edit_sheet_has_triggered") : false;
                break;
            default:
                this.e = bundle != null ? bundle.getBoolean("open_share_flow_has_triggered") : false;
                break;
        }
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.putBoolean("open_mixing_edit_sheet_has_triggered", this.e);
                break;
            default:
                bundle.putBoolean("open_share_flow_has_triggered", this.e);
                break;
        }
    }

    @Override // p.anc0
    public final void n() {
        String string;
        wx61 wx61Var;
        byte b = this.a;
        q8n q8nVar = this.c;
        Intent intent = this.b;
        switch (b) {
            case 0:
                if (!this.e) {
                    try {
                        Bundle extras = intent.getExtras();
                        string = extras != null ? extras.getString("mixing_transition_uri") : null;
                        break;
                    } catch (Exception unused) {
                    }
                    if (string != null) {
                        this.e = true;
                        this.d = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new ian0(this, string, (lnm) null, (byte) 7), 3);
                        break;
                    }
                }
                break;
            default:
                if (!this.e) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        extras2.setClassLoader(wx61.class.getClassLoader());
                        wx61Var = (wx61) jhc1.t(extras2, "list-entity-music-shared-action", wx61.class);
                    } else {
                        wx61Var = null;
                    }
                    if (wx61Var instanceof vx61) {
                        this.e = true;
                        this.d = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new ian0((vx61) wx61Var, this, (lnm) null, (byte) 8), 3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p.anc0
    public final void q() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = this.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            default:
                xab1 xab1Var2 = this.d;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
        }
    }
}
