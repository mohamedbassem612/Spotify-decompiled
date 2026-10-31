package p;

import android.content.Intent;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wmo0 implements eyf0 {
    public final rvy0 a;
    public final l0x0 b;
    public final rb00 c;

    public wmo0(rvy0 rvy0Var, l0x0 l0x0Var, rb00 rb00Var) {
        this.a = rvy0Var;
        this.b = l0x0Var;
        this.c = rb00Var;
    }

    @Override // p.eyf0
    public final void a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("push_data");
        boolean z = parcelableExtra instanceof vjq0;
        l0x0 l0x0Var = this.b;
        if (z) {
            vjq0 vjq0Var = (vjq0) parcelableExtra;
            this.a.a(vjq0Var.a);
            boolean z2 = vjq0Var.e;
            this.c.a(z2 ? "OPEN_URL" : "PRIMARY_ACTION", vjq0Var.b, vjq0Var.c, vjq0Var.d, vjq0Var.f);
            gg.I(intent, l0x0Var.r(vjq0Var.b, vjq0Var.d, z2));
            return;
        }
        if (parcelableExtra instanceof rjq0) {
            rjq0 rjq0Var = (rjq0) parcelableExtra;
            l0x0Var.r(rjq0Var.b, nik1.F2.a, true);
            this.c.a("PUSH_SETTINGS", rjq0Var.b, rjq0Var.c, null, rjq0Var.d);
            return;
        }
        if (parcelableExtra instanceof sn1) {
            sn1 sn1Var = (sn1) parcelableExtra;
            tv80 tv80VarP = l0x0Var.p(sn1Var.b, sn1Var.d);
            this.c.a("ADD_TO_PLAYLIST", sn1Var.b, sn1Var.c, sn1Var.d, sn1Var.e);
            gg.I(intent, tv80VarP);
            return;
        }
        if (parcelableExtra instanceof bet0) {
            bet0 bet0Var = (bet0) parcelableExtra;
            this.c.a("PLAY_AND_NAVIGATE", bet0Var.b, bet0Var.c, bet0Var.d, bet0Var.e);
            gg.I(intent, l0x0Var.s(bet0Var.b, bet0Var.d));
        } else if (parcelableExtra instanceof z261) {
            z261 z261Var = (z261) parcelableExtra;
            this.c.a("SEND_EMAIL_VERIFICATION", z261Var.b, z261Var.c, null, z261Var.d);
            String str = z261Var.b;
            if (str != null) {
                l0x0Var.t(str);
            }
        }
    }
}
