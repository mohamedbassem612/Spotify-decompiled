package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class odu extends s5w0 {
    public Intent H1;
    public boolean I1;
    public boolean J1;
    public j7p K1;
    public zce0 L1;
    public cvf M1;
    public final jlb N1 = new jlb(this, (byte) 10);
    public final thn O1;

    public odu(thn thnVar) {
        this.O1 = thnVar;
    }

    public final void D0() {
        this.L1.d(this.N1);
        cvf cvfVar = this.M1;
        if (cvfVar != null) {
            cvfVar.cancel(false);
        }
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("check_storage.settings_low.error");
        intentFilter.addAction("check_storage.cache_low.error");
        intentFilter.addAction("check_storage.diskspace.ok");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.L1.b(this.N1, intentFilter);
        if (this.J1) {
            return;
        }
        cvf cvfVar = (cvf) this.K1.get();
        this.M1 = cvfVar;
        cvfVar.execute(new Void[0]);
    }

    @Override // p.s5w0
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        bundle.putBoolean("queued", this.I1);
        bundle.putBoolean("checked", this.J1);
    }

    @Override // p.s5w0
    public final void Y0() {
        super.Y0();
        Intent intent = this.H1;
        if (intent != null) {
            startActivityForResult(intent, this.G1);
        }
    }

    @Override // p.s5w0
    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        this.I1 = false;
    }

    public final void v0(Context context) {
        this.O1.f(this);
        super.v0(context);
    }

    @Override // p.s5w0
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            this.I1 = bundle.getBoolean("queued", false);
            this.J1 = bundle.getBoolean("checked", false);
        }
    }
}
