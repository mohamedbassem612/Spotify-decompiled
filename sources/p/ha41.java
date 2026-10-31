package p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ha41 implements dyf0 {
    public final mn1 a;

    public ha41(mn1 mn1Var) {
        this.a = mn1Var;
    }

    @Override // p.dyf0
    public final void a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Uri uri = Uri.parse(dataString);
            mn1 mn1Var = this.a;
            mn1Var.getClass();
            if (mn1.b(uri)) {
                mn1Var.g = uri;
            }
        }
    }
}
