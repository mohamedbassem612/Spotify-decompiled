package p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bu71 {
    public final List a;
    public final SharedPreferences b;
    public final LinkedHashSet c = new LinkedHashSet();

    public bu71(Context context, String str, List list) {
        this.a = list;
        this.b = context.getApplicationContext().getSharedPreferences(str, 0);
    }
}
