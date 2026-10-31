package androidx.xr.projected.permissions;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.compose.ui.text.font.FontWeight;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a0e1;
import p.b0k;
import p.cec;
import p.d1u;
import p.d36;
import p.een;
import p.ew31;
import p.fc11;
import p.gj5;
import p.h0i;
import p.h311;
import p.h36;
import p.hmb0;
import p.hrr0;
import p.hw61;
import p.hzj;
import p.j06;
import p.j2i;
import p.jbh;
import p.jw31;
import p.kp21;
import p.lee1;
import p.llj;
import p.mbh;
import p.mue1;
import p.n4k;
import p.nim0;
import p.nko1;
import p.of80;
import p.q9e1;
import p.qim0;
import p.tgp1;
import p.u291;
import p.u890;
import p.um5;
import p.uxb;
import p.uyn1;
import p.v8r;
import p.vzq0;
import p.w9;
import p.wnb0;
import p.x340;
import p.xec;
import p.xos0;
import p.y580;
import p.z5c;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/xr/projected/permissions/RequestPermissionsOnHostActivity;", "Lp/gj5;", "<init>", "()V", "p/kp21", "projected"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestPermissionsOnHostActivity extends gj5 {
    public static final /* synthetic */ int i1 = 0;
    public ArrayList a1;
    public ResultReceiver b1;
    public Bundle c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public final hrr0 h1 = v8r.q((Object) null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o0(RequestPermissionsOnHostActivity requestPermissionsOnHostActivity) {
        ArrayList arrayList = requestPermissionsOnHostActivity.a1;
        if (arrayList == null) {
            u890.C("requests");
            throw null;
        }
        kp21 kp21Var = (kp21) arrayList.get(requestPermissionsOnHostActivity.d1);
        requestPermissionsOnHostActivity.h1.setValue((Object) null);
        requestPermissionsOnHostActivity.requestPermissions((String[]) kp21Var.a.toArray(new String[0]), requestPermissionsOnHostActivity.d1, kp21Var.c);
        requestPermissionsOnHostActivity.e1 = true;
        requestPermissionsOnHostActivity.d1++;
    }

    public final void l0(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(910709131);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
        if ((i2 & 1171) == 1170 && x340Var.H()) {
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.d(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var, 6);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            mue1.a(function0, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (hw61) null, (cec) null, (xec) null, (vzq0) null, d1u.a, x340Var, ((i2 >> 3) & 14) | 805306368, 508);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            mue1.a(function1, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (hw61) null, (cec) null, (xec) null, (vzq0) null, d1u.b, x340Var, ((i2 >> 6) & 14) | 805306368, 508);
            x340Var.r(true);
            q9e1.b(str, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 30.0f, 5), 0L, fc11.G(24), (FontWeight) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var, (i2 & 14) | 3120, 0, 131060);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uxb(this, str, function0, function1, qim0Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0() {
        int i = this.d1;
        ArrayList arrayList = this.a1;
        if (arrayList == null) {
            u890.C("requests");
            throw null;
        }
        if (i >= arrayList.size()) {
            r0();
            finish();
            return;
        }
        ArrayList arrayList2 = this.a1;
        if (arrayList2 == null) {
            u890.C("requests");
            throw null;
        }
        kp21 kp21Var = (kp21) arrayList2.get(this.d1);
        if (kp21Var.b != null) {
            this.h1.setValue(kp21Var);
            return;
        }
        requestPermissions((String[]) kp21Var.a.toArray(new String[0]), this.d1, kp21Var.c);
        this.e1 = true;
        this.d1++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        this.h1.setValue((Object) null);
        this.f1 = false;
        this.d1 = bundle != null ? bundle.getInt("nextRequestIndex", this.d1) : 0;
        if (bundle == null || (bundle2 = bundle.getBundle("permissionResults")) == null) {
            bundle2 = new Bundle();
        }
        this.c1 = bundle2;
        this.e1 = bundle != null && bundle.getBoolean("pendingUserAction", this.e1);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("androidx.xr.projected.permissions.extra.RESULT_RECEIVER", ResultReceiver.class);
        if (resultReceiver == null) {
            finish();
            return;
        }
        this.b1 = resultReceiver;
        int intExtra = getIntent().getIntExtra("androidx.xr.projected.permissions.extra.DEVICE_ID", -1);
        if (intExtra == -1) {
            r0();
            finish();
            return;
        }
        Bundle[] bundleArr = (Bundle[]) getIntent().getParcelableArrayExtra("androidx.xr.projected.permissions.extra.PERMISSION_REQUEST_DATA", Bundle.class);
        if (bundleArr == null || bundleArr.length == 0) {
            r0();
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle4 : bundleArr) {
            String string = bundle4.getString("androidx.xr.projected.permissions.BUNDLE_KEY_RATIONALE");
            ArrayList<String> stringArrayList = bundle4.getStringArrayList("androidx.xr.projected.permissions.BUNDLE_KEY_PERMISSIONS");
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                arrayList.add(new kp21(intExtra, string, stringArrayList));
            }
        }
        this.a1 = arrayList;
        h0i.a(this, new j2i(553204872, new w9(this, (byte) 20), true));
        int i = this.d1;
        if (bundle != null) {
            i = bundle.getInt("nextRequestIndex", i);
        }
        this.d1 = i;
        if (bundle == null || (bundle3 = bundle.getBundle("permissionResults")) == null) {
            bundle3 = new Bundle();
        }
        this.c1 = bundle3;
        boolean z = this.e1;
        if (bundle != null) {
            z = bundle.getBoolean("pendingUserAction", z);
        }
        this.e1 = z;
        if (!z) {
            m0();
        }
        this.g1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*p.dg30*/.onCreate(bundle);
        if (getIntent().getBooleanExtra("androidx.xr.projected.permissions.extra.SHOULD_FINISH", false)) {
            finish();
        } else {
            n0(bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super.onDestroy();
        if (this.g1 && isFinishing() && !this.f1) {
            boolean z = this.e1;
            int i = this.d1;
            if (z) {
                i--;
            }
            ArrayList arrayList = this.a1;
            if (arrayList == null) {
                u890.C("requests");
                throw null;
            }
            int size = arrayList.size();
            while (i < size) {
                q0(i);
                i++;
            }
            r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        if (intent.getBooleanExtra("androidx.xr.projected.permissions.extra.SHOULD_FINISH", false)) {
            finish();
            return;
        }
        r0();
        setIntent(intent);
        n0(null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr, int i2) {
        this.e1 = false;
        p0(i, strArr, iArr);
        m0();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.g0i*/.onSaveInstanceState(bundle);
        bundle.putInt("nextRequestIndex", this.d1);
        Bundle bundle2 = this.c1;
        if (bundle2 == null) {
            u890.C("permissionResults");
            throw null;
        }
        bundle.putBundle("permissionResults", bundle2);
        bundle.putBoolean("pendingUserAction", this.e1);
    }

    public final void p0(int i, String[] strArr, int[] iArr) {
        if (strArr.length != 0) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle = this.c1;
                if (bundle == null) {
                    u890.C("permissionResults");
                    throw null;
                }
                bundle.putBoolean(strArr[i2], iArr[i2] == 0);
            }
            return;
        }
        ArrayList arrayList = this.a1;
        if (arrayList == null) {
            u890.C("requests");
            throw null;
        }
        for (String str : ((kp21) arrayList.get(i)).a) {
            Bundle bundle2 = this.c1;
            if (bundle2 == null) {
                u890.C("permissionResults");
                throw null;
            }
            bundle2.putBoolean(str, false);
        }
    }

    public final void q0(int i) {
        ArrayList arrayList = this.a1;
        if (arrayList == null) {
            u890.C("requests");
            throw null;
        }
        kp21 kp21Var = (kp21) arrayList.get(i);
        String[] strArr = (String[]) kp21Var.a.toArray(new String[0]);
        int size = kp21Var.a.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = -1;
        }
        p0(i, strArr, iArr);
    }

    public final void r0() {
        ResultReceiver resultReceiver = this.b1;
        if (resultReceiver == null) {
            u890.C("resultReceiver");
            throw null;
        }
        Bundle bundle = this.c1;
        if (bundle == null) {
            u890.C("permissionResults");
            throw null;
        }
        resultReceiver.send(0, bundle);
        this.f1 = true;
    }
}
