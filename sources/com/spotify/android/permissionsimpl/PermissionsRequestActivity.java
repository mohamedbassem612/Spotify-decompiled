package com.spotify.android.permissionsimpl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.ag0;
import p.aos0;
import p.dx4;
import p.e6r0;
import p.kx40;
import p.lir0;
import p.ln5;
import p.mir0;
import p.n57;
import p.n6r0;
import p.nik1;
import p.p6r0;
import p.q7s0;
import p.qir0;
import p.r7s0;
import p.tkg;
import p.vkg;
import p.xnh1;
import p.yon1;
import p.zia;
import p.zog;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/spotify/android/permissionsimpl/PermissionsRequestActivity;", "Landroid/app/Activity;", "", "Lp/lir0;", "Lp/vkg;", "<init>", "()V", "p/cso1", "src_main_java_com_spotify_android_permissionsimpl-permissionsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PermissionsRequestActivity extends Activity implements lir0, vkg {
    public static final /* synthetic */ int d = 0;
    public r7s0 a;
    public boolean b = true;
    public final tkg c = new tkg();

    public final void S(xnh1 xnh1Var) {
        this.c.a(xnh1Var);
    }

    public final void U(n6r0 n6r0Var, qir0 qir0Var) {
        this.c.U(n6r0Var, qir0Var);
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("REQUESTPERMISSIONS", "requestpermissions", 1652, "requestpermissions"), nik1.P2.a(), 4));
    }

    public final void h(n6r0 n6r0Var, qir0 qir0Var) {
        this.c.h(n6r0Var, qir0Var);
    }

    public final zia j() {
        return this.c.a;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] stringArrayExtra;
        super.onCreate(bundle);
        if (bundle != null || (stringArrayExtra = getIntent().getStringArrayExtra("REQUESTED_PERMISSIONS")) == null) {
            return;
        }
        n57.h("empty permissions list", !(stringArrayExtra.length == 0));
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("permission_rationale", "") : null;
        boolean booleanExtra = getIntent().getBooleanExtra("permission_rationale_always_show", false);
        for (String str : stringArrayExtra) {
            str.getClass();
            booleanExtra |= ag0.C0(this, str);
        }
        if (!booleanExtra || string == null || string.length() == 0) {
            ag0.B0(this, stringArrayExtra, 49374);
            return;
        }
        setContentView(2131624566);
        setFinishOnTouchOutside(false);
        q7s0 q7s0Var = new q7s0(this, 2132018154);
        ((zog) q7s0Var).a = true;
        ((zog) q7s0Var).e = string;
        ln5 ln5Var = new ln5(this, stringArrayExtra, (byte) 17);
        ((zog) q7s0Var).f = getResources().getText(2131959374);
        ((zog) q7s0Var).g = ln5Var;
        ((zog) q7s0Var).i = new aos0(this, stringArrayExtra);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE", "dialog/requestpermissions/showrationale", 488, "dialog");
        qir0 qir0VarA = nik1.P2.a();
        q7s0Var.j = this;
        q7s0Var.k = p6r0VarG1;
        q7s0Var.l = qir0VarA;
        r7s0 r7s0VarG = q7s0Var.g();
        this.a = r7s0VarG;
        r7s0VarG.show();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        r7s0 r7s0Var = this.a;
        if (r7s0Var == null || !r7s0Var.isShowing()) {
            return;
        }
        this.b = false;
        r7s0 r7s0Var2 = this.a;
        r7s0Var2.getClass();
        r7s0Var2.dismiss();
        this.a = null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        dx4 dx4Var = new dx4(strArr, iArr);
        Intent intent = new Intent();
        intent.putExtra("permission_result", (Parcelable) dx4Var);
        setResult(-1, intent);
        finish();
    }

    public final void y(e6r0 e6r0Var) {
        this.c.y(e6r0Var);
    }
}
