package com.google.android.gms.auth.api.signin.internal;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
import p.dan1;
import p.dg30;
import p.dio1;
import p.eg;
import p.f2g1;
import p.fad0;
import p.h9e0;
import p.i9e0;
import p.iac0;
import p.ina1;
import p.j8n1;
import p.j9e0;
import p.l0c1;
import p.lal;
import p.lan1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class SignInHubActivity extends dg30 {
    public static boolean e1 = false;
    public boolean Z0 = false;
    public SignInConfiguration a1;
    public boolean b1;
    public int c1;
    public Intent d1;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void h0() {
        fad0 fad0VarG = fad0.g(this);
        f2g1 f2g1Var = new f2g1(this, (byte) 18);
        iac0 iac0Var = (iac0) fad0VarG.b;
        j9e0 j9e0Var = (j9e0) fad0VarG.c;
        boolean z = j9e0Var.c;
        ina1 ina1Var = j9e0Var.b;
        if (z) {
            eg.m("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            eg.m("initLoader must be called on the main thread");
            return;
        }
        ina1Var.getClass();
        h9e0 h9e0Var = (h9e0) dio1.r(ina1Var, 0);
        if (h9e0Var == null) {
            try {
                j9e0Var.c = true;
                Set set = j8n1.b;
                synchronized (set) {
                }
                dan1 dan1Var = new dan1(this, set);
                if (dan1.class.isMemberClass() && !Modifier.isStatic(dan1.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dan1Var);
                }
                h9e0 h9e0Var2 = new h9e0(dan1Var);
                ina1Var.e(0, h9e0Var2);
                j9e0Var.c = false;
                i9e0 i9e0Var = new i9e0(h9e0Var2.Y, f2g1Var);
                h9e0Var2.f(iac0Var, i9e0Var);
                i9e0 i9e0Var2 = h9e0Var2.N0;
                if (i9e0Var2 != null) {
                    h9e0Var2.k(i9e0Var2);
                }
                h9e0Var2.Z = iac0Var;
                h9e0Var2.N0 = i9e0Var;
            } catch (Throwable th) {
                j9e0Var.c = false;
                throw th;
            }
        } else {
            i9e0 i9e0Var3 = new i9e0(h9e0Var.Y, f2g1Var);
            h9e0Var.f(iac0Var, i9e0Var3);
            i9e0 i9e0Var4 = h9e0Var.N0;
            if (i9e0Var4 != null) {
                h9e0Var.k(i9e0Var4);
            }
            h9e0Var.Z = iac0Var;
            h9e0Var.N0 = i9e0Var3;
        }
        e1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(int i) {
        Parcelable status = new Status(i, (String) null, (PendingIntent) null, (lal) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        e1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.Z0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                lan1 lan1VarD = lan1.d(this);
                GoogleSignInOptions googleSignInOptions = this.a1.b;
                synchronized (lan1VarD) {
                    ((l0c1) lan1VarD.b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.b1 = true;
                this.c1 = i2;
                this.d1 = intent;
                h0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                i0(intExtra);
                return;
            }
        }
        i0(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            i0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            if (strValueOf.length() != 0) {
                "Unknown action: ".concat(strValueOf);
            }
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.a1 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.b1 = z;
            if (z) {
                this.c1 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.d1 = intent2;
                h0();
                return;
            }
            return;
        }
        if (e1) {
            setResult(0);
            i0(12502);
            return;
        }
        e1 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.a1);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.Z0 = true;
            i0(17);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        e1 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.g0i*/.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.b1);
        if (this.b1) {
            bundle.putInt("signInResultCode", this.c1);
            bundle.putParcelable("signInResultData", this.d1);
        }
    }
}
