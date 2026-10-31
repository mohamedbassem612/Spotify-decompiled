package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookDialogException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljl1 extends ail1 {
    public static final /* synthetic */ int O0 = 0;
    public final String N0;

    public ljl1(dg30 dg30Var, String str, String str2) {
        super(dg30Var, str);
        this.N0 = str2;
        this.b = str2;
    }

    @Override // p.ail1
    public final Bundle c(String str) {
        String str2 = this.N0;
        if (str2.length() <= 0 || !nhc1.Y(str, str2, false)) {
            return super.c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e) {
            e(new FacebookDialogException("Failed to launch custom redirect: " + e.getMessage(), -1, str));
        }
        return new Bundle();
    }
}
