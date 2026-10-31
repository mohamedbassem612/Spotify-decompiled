package p;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b9n1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9n1(Intent intent, Object obj, byte b) {
        this.a = b;
        this.b = intent;
        this.c = obj;
    }

    public static b9n1 b(GoogleApiActivity googleApiActivity, Intent intent) {
        return new b9n1(intent, googleApiActivity, (byte) 0);
    }

    public static b9n1 c(bac0 bac0Var, Intent intent) {
        return new b9n1(intent, bac0Var, (byte) 1);
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Intent intent = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                }
                break;
            default:
                if (intent != null) {
                    ((bac0) obj).startActivityForResult(intent, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
