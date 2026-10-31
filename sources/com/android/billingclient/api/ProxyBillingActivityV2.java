package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import p.bh0;
import p.e1r0;
import p.g0i;
import p.kt80;
import p.qh0;
import p.vsn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ProxyBillingActivityV2 extends g0i {
    public qh0 U0;
    public qh0 V0;
    public qh0 W0;
    public qh0 X0;
    public ResultReceiver Y0;
    public ResultReceiver Z0;
    public ResultReceiver a1;
    public ResultReceiver b1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final byte b = 0;
        this.U0 = a0(new bh0(this) { // from class: p.x0o1
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
            public final void a(Object obj) {
                Bundle extras;
                byte b2 = b;
                ?? r8 = this.b;
                ah0 ah0Var = (ah0) obj;
                switch (b2) {
                    case 0:
                        Intent intent = ah0Var.b;
                        int i = vsn1.e("ProxyBillingActivityV2", intent).a;
                        ResultReceiver resultReceiver = r8.Y0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 1:
                        Intent intent2 = ah0Var.b;
                        int i2 = vsn1.e("ProxyBillingActivityV2", intent2).a;
                        ResultReceiver resultReceiver2 = r8.Z0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i2, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i2 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 2:
                        Intent intent3 = ah0Var.b;
                        int i3 = ah0Var.a;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i4 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i5 = vsn1.e("ProxyBillingActivityV2", intent3).a;
                        ResultReceiver resultReceiver3 = r8.a1;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i5, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i5 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    default:
                        Intent intent4 = ah0Var.b;
                        int i6 = ah0Var.a;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i6 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i7 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i6);
                        }
                        int i8 = vsn1.e("ProxyBillingActivityV2", intent4).a;
                        ResultReceiver resultReceiver4 = r8.b1;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                }
            }
        }, new e1r0((byte) 6));
        final byte b2 = 1;
        this.V0 = a0(new bh0(this) { // from class: p.x0o1
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
            public final void a(Object obj) {
                Bundle extras;
                byte b3 = b2;
                ?? r8 = this.b;
                ah0 ah0Var = (ah0) obj;
                switch (b3) {
                    case 0:
                        Intent intent = ah0Var.b;
                        int i = vsn1.e("ProxyBillingActivityV2", intent).a;
                        ResultReceiver resultReceiver = r8.Y0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 1:
                        Intent intent2 = ah0Var.b;
                        int i2 = vsn1.e("ProxyBillingActivityV2", intent2).a;
                        ResultReceiver resultReceiver2 = r8.Z0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i2, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i2 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 2:
                        Intent intent3 = ah0Var.b;
                        int i3 = ah0Var.a;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i4 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i5 = vsn1.e("ProxyBillingActivityV2", intent3).a;
                        ResultReceiver resultReceiver3 = r8.a1;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i5, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i5 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    default:
                        Intent intent4 = ah0Var.b;
                        int i6 = ah0Var.a;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i6 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i7 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i6);
                        }
                        int i8 = vsn1.e("ProxyBillingActivityV2", intent4).a;
                        ResultReceiver resultReceiver4 = r8.b1;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                }
            }
        }, new e1r0((byte) 6));
        final byte b3 = 2;
        this.W0 = a0(new bh0(this) { // from class: p.x0o1
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
            public final void a(Object obj) {
                Bundle extras;
                byte b4 = b3;
                ?? r8 = this.b;
                ah0 ah0Var = (ah0) obj;
                switch (b4) {
                    case 0:
                        Intent intent = ah0Var.b;
                        int i = vsn1.e("ProxyBillingActivityV2", intent).a;
                        ResultReceiver resultReceiver = r8.Y0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 1:
                        Intent intent2 = ah0Var.b;
                        int i2 = vsn1.e("ProxyBillingActivityV2", intent2).a;
                        ResultReceiver resultReceiver2 = r8.Z0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i2, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i2 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 2:
                        Intent intent3 = ah0Var.b;
                        int i3 = ah0Var.a;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i4 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i5 = vsn1.e("ProxyBillingActivityV2", intent3).a;
                        ResultReceiver resultReceiver3 = r8.a1;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i5, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i5 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    default:
                        Intent intent4 = ah0Var.b;
                        int i6 = ah0Var.a;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i6 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i7 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i6);
                        }
                        int i8 = vsn1.e("ProxyBillingActivityV2", intent4).a;
                        ResultReceiver resultReceiver4 = r8.b1;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                }
            }
        }, new e1r0((byte) 6));
        final byte b4 = 3;
        this.X0 = a0(new bh0(this) { // from class: p.x0o1
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
            public final void a(Object obj) {
                Bundle extras;
                byte b5 = b4;
                ?? r8 = this.b;
                ah0 ah0Var = (ah0) obj;
                switch (b5) {
                    case 0:
                        Intent intent = ah0Var.b;
                        int i = vsn1.e("ProxyBillingActivityV2", intent).a;
                        ResultReceiver resultReceiver = r8.Y0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 1:
                        Intent intent2 = ah0Var.b;
                        int i2 = vsn1.e("ProxyBillingActivityV2", intent2).a;
                        ResultReceiver resultReceiver2 = r8.Z0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i2, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (ah0Var.a != -1 || i2 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    case 2:
                        Intent intent3 = ah0Var.b;
                        int i3 = ah0Var.a;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i4 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i5 = vsn1.e("ProxyBillingActivityV2", intent3).a;
                        ResultReceiver resultReceiver3 = r8.a1;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i5, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i5 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                    default:
                        Intent intent4 = ah0Var.b;
                        int i6 = ah0Var.a;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i6 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i7 = vsn1.a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i6);
                        }
                        int i8 = vsn1.e("ProxyBillingActivityV2", intent4).a;
                        ResultReceiver resultReceiver4 = r8.b1;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        r8.finish();
                        break;
                }
            }
        }, new e1r0((byte) 6));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.Y0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.Z0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.a1 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.b1 = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        vsn1.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.Y0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.U0.a(new kt80(pendingIntent.getIntentSender(), (Intent) null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.Z0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.V0.a(new kt80(pendingIntent2.getIntentSender(), (Intent) null, 0, 0));
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.a1 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.W0.a(new kt80(pendingIntent3.getIntentSender(), (Intent) null, 0, 0));
        } else if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.b1 = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.X0.a(new kt80(pendingIntent4.getIntentSender(), (Intent) null, 0, 0));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.Y0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.Z0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.a1;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.b1;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
