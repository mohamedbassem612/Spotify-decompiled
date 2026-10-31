package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.crossdeviceprompt.CrossDevicePromptException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nbo1 {
    public static final mcn1 c = new mcn1("CrossDevicePromptClient");
    public final gzo1 a;
    public final String b;

    public nbo1(Context context) {
        String strEncodeToString;
        this.b = context.getPackageName();
        mcn1 mcn1Var = x7p1.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                mcn1Var.c("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    mcn1Var.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.a = new gzo1(context, c, new Intent("com.google.android.finsky.BIND_CROSS_DEVICE_PROMPT_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ", ");
                        }
                    }
                }
                mcn1Var.c(f4i1.f("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                mcn1Var.c("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            mcn1Var.c("Play Store package is not found.", new Object[0]);
        }
    }

    public final hfp1 a() {
        Bundle bundle = new Bundle();
        bundle.putInt("cross_device_prompt_type", 1);
        Object[] objArr = {this.b};
        mcn1 mcn1Var = c;
        mcn1Var.b("requestPromptLaunchInfo (%s)", objArr);
        gzo1 gzo1Var = this.a;
        if (gzo1Var == null) {
            Object[] objArr2 = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                mcn1.d(mcn1Var.b, "Play Store app is either not installed or not the official version", objArr2);
            }
            return o0c.y(new CrossDevicePromptException(-1));
        }
        bsd1 bsd1Var = new bsd1();
        gzo1Var.a().post(new qxn1(gzo1Var, bsd1Var, bsd1Var, new qxn1(this, bsd1Var, bundle, bsd1Var)));
        return bsd1Var.a;
    }
}
