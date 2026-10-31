package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jqv0 extends o1p1 {
    public final zxf c;
    public final boolean d;

    public jqv0(zxf zxfVar, boolean z) {
        this.c = zxfVar;
        this.d = z;
    }

    public final Object D(Intent intent, int i) {
        return Boolean.valueOf(i == -1);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Intent z(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PremiumCheckoutActivity.class);
        intent.putExtra("EXTRA_ARGS", new mqv0(str, this.c, this.d));
        return intent;
    }

    public /* synthetic */ jqv0(zxf zxfVar) {
        this(zxfVar, false);
    }
}
