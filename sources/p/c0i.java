package p;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c0i extends sh0 {
    public final /* synthetic */ g0i h;

    public c0i(g0i g0iVar) {
        this.h = g0iVar;
    }

    public final void d(int i, o1p1 o1p1Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        g0i g0iVar = this.h;
        cp5 cp5VarA = o1p1Var.A(g0iVar, obj);
        if (cp5VarA != null) {
            new Handler(Looper.getMainLooper()).post(new z0d(this, i, cp5VarA, (byte) 4));
            return;
        }
        Intent intentZ = o1p1Var.z(g0iVar, obj);
        if (intentZ.getExtras() != null) {
            Bundle extras = intentZ.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentZ.setExtrasClassLoader(g0iVar.getClassLoader());
            }
        }
        if (intentZ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentZ.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentZ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentZ.getAction())) {
            String[] stringArrayExtra = intentZ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ag0.B0(g0iVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentZ.getAction())) {
            ag0.D0(g0iVar, intentZ, i, bundle);
            return;
        }
        kt80 parcelableExtra = intentZ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            parcelableExtra.getClass();
            i2 = i;
            try {
                ag0.E0(g0iVar, parcelableExtra.h(), i2, parcelableExtra.a(), parcelableExtra.b(), parcelableExtra.g(), bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new z0d(this, i2, e, (byte) 5));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
