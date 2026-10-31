package androidx.xr.projected.permissions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import p.a0e1;
import p.b0k;
import p.cms0;
import p.cwl1;
import p.fc11;
import p.g0i;
import p.h0i;
import p.h311;
import p.j2i;
import p.lee1;
import p.q9e1;
import p.qim0;
import p.u7h;
import p.u890;
import p.uy40;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/xr/projected/permissions/GoToHostProjectedActivity;", "Lp/g0i;", "", "<init>", "()V", "projected"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GoToHostProjectedActivity extends g0i {
    public static final /* synthetic */ int W0 = 0;
    public cms0 U0;
    public volatile boolean V0;

    public final void e0(b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2147466091);
        if ((i & 1) == 0 && x340Var2.H()) {
            x340Var2.b0();
            x340Var = x340Var2;
        } else {
            String strO0 = cwl1.o0(x340Var2, 2131956259);
            FontWeight fontWeight = new FontWeight(750);
            x340Var = x340Var2;
            q9e1.b(strO0, (qim0) null, u7h.f, fc11.G(24), fontWeight, fc11.D(0.0525d), new a0e1(3), fc11.G(32), 0, false, 0, 0, (lee1) null, x340Var, 12782976, 6, 129362);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uy40(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        cms0 cms0Var;
        super.onCreate(bundle);
        h0i.a(this, new j2i(-1491472373, new uy40(this), true));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (bundle != null) {
                cms0Var = (cms0) bundle.getParcelable("permissionResultReceiver", cms0.class);
            } else {
                cms0Var = null;
            }
        } else if (bundle != null) {
            cms0Var = (cms0) bundle.getParcelable("permissionResultReceiver");
        } else {
            cms0Var = null;
        }
        if (cms0Var != null) {
            cms0Var.a = this;
            this.U0 = cms0Var;
            return;
        }
        cms0 cms0Var2 = new cms0(new Handler(Looper.getMainLooper()));
        cms0Var2.a = this;
        this.U0 = cms0Var2;
        ActivityOptions launchDisplayId = i >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(0) : ActivityOptions.makeBasic();
        Intent intentPutExtras = new Intent().setClass(this, RequestPermissionsOnHostActivity.class).putExtras(getIntent());
        cms0 cms0Var3 = this.U0;
        if (cms0Var3 != null) {
            startActivity(intentPutExtras.putExtra("androidx.xr.projected.permissions.extra.RESULT_RECEIVER", cms0Var3).addFlags(805437440), launchDisplayId.toBundle());
        } else {
            u890.C("permissionResultReceiver");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
        cms0 cms0Var = this.U0;
        if (cms0Var == null) {
            u890.C("permissionResultReceiver");
            throw null;
        }
        cms0Var.a = null;
        if (!isFinishing() || this.V0) {
            return;
        }
        startActivity(new Intent().setClass(this, RequestPermissionsOnHostActivity.class).putExtra("androidx.xr.projected.permissions.extra.SHOULD_FINISH", true).addFlags(805437440), (Build.VERSION.SDK_INT >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(0) : ActivityOptions.makeBasic()).toBundle());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cms0 cms0Var = this.U0;
        if (cms0Var != null) {
            bundle.putParcelable("permissionResultReceiver", cms0Var);
        } else {
            u890.C("permissionResultReceiver");
            throw null;
        }
    }
}
