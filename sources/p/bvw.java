package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bvw {
    public static void a(Context context) {
        Intent intentCreateChooser;
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.APP_EMAIL");
            intent.setFlags(268435456);
            intentCreateChooser = Intent.createChooser(intent, context.getString(2131958015));
        } catch (ActivityNotFoundException unused) {
            intentCreateChooser = null;
        }
        if (intentCreateChooser != null) {
            context.startActivity(intentCreateChooser);
        }
    }
}
