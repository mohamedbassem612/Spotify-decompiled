package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import p.ai30;
import p.cf10;
import p.dg30;
import p.dhn;
import p.l1f0;
import p.nu9;
import p.omn0;
import p.wf10;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Lp/dg30;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class FacebookActivity extends dg30 {
    public static final /* synthetic */ int a1 = 0;
    public zf30 Z0;

    @Override // p.dg30, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    @Override // p.g0i, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zf30 zf30Var = this.Z0;
        if (zf30Var != null) {
            zf30Var.onConfigurationChanged(configuration);
        }
    }

    @Override // p.dg30, p.g0i, p.f0i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!wf10.q.get()) {
            Context applicationContext = getApplicationContext();
            synchronized (wf10.class) {
                wf10.i(applicationContext, null);
            }
        }
        setContentView(2131624420);
        if (!"PassThrough".equals(intent.getAction())) {
            Intent intent2 = getIntent();
            ai30 ai30VarT = this.U0.t();
            cf10 cf10VarG = ai30VarT.G("SingleFragment");
            if (cf10VarG == null) {
                if ("FacebookDialogFragment".equals(intent2.getAction())) {
                    cf10VarG = new cf10();
                    cf10VarG.W0();
                    cf10VarG.g1(ai30VarT, "SingleFragment");
                } else {
                    cf10VarG = new l1f0();
                    cf10VarG.W0();
                    nu9 nu9Var = new nu9(ai30VarT);
                    nu9Var.k(2131428125, cf10VarG, "SingleFragment", 1);
                    nu9Var.f();
                }
            }
            this.Z0 = cf10VarG;
            return;
        }
        Bundle bundleH = omn0.h(getIntent());
        if (dhn.a.contains(omn0.class) || bundleH == null) {
            facebookException = null;
        } else {
            try {
                String string = bundleH.getString("error_type");
                if (string == null) {
                    string = bundleH.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = bundleH.getString("error_description");
                if (string2 == null) {
                    string2 = bundleH.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                facebookException = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
            } catch (Throwable th) {
                dhn.a(omn0.class, th);
                facebookException = null;
            }
        }
        setResult(0, omn0.e(getIntent(), null, facebookException));
        finish();
    }
}
