package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zg0 {
    public final Context a;

    public zg0(Context context) {
        this.a = context;
    }

    public final Intent a(h471 h471Var) {
        Intent intent;
        Iterator it = h471Var.b.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String str2 = h471Var.c;
            String str3 = h471Var.d;
            String str4 = h471Var.e;
            String str5 = h471Var.f;
            Intent intent2 = new Intent(str2);
            intent2.setPackage(str);
            intent2.setDataAndType(str4 != null ? Uri.parse(str4) : null, str3);
            if (str5 != null) {
                intent2.addCategory(str5);
            }
            if (this.a.getPackageManager().resolveActivity(intent2, 0) != null) {
                intent = intent2;
            }
        } while (intent == null);
        return intent;
    }
}
