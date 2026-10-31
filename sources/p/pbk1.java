package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pbk1 {
    public final String a;

    public pbk1(String str) {
        this.a = str;
    }

    public final i2i1 a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(67108864);
        intent.putExtra("is_internal_navigation", true);
        return new i2i1(context, this.a, intent);
    }
}
