package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b840 {
    public final Context a;
    public final lzn0 b;
    public final kt91 c;
    public final o78 d;
    public final kv00 e;
    public final Scheduler f;

    public b840(Context context, lzn0 lzn0Var, kt91 kt91Var, o78 o78Var, kv00 kv00Var, Scheduler scheduler) {
        this.a = context;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.d = o78Var;
        this.e = kv00Var;
        this.f = scheduler;
    }

    public final void a(n281 n281Var, String str, String str2, boolean z) {
        Parcelable w7yVar = new w7y(n281Var.c, n281Var.d, n281Var.e, n281Var.f, n281Var.g, n281Var.h, n281Var.i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("engagementDialogData", w7yVar);
        bundle.putString("showImageUri", str);
        bundle.putBoolean("is_audiobook", z);
        this.b.i(new dwn0(str2.concat(":gatedcontenteducation"), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundle);
    }

    public final void b(p281 p281Var, String str, double d, String str2) {
        String str3 = p281Var.d;
        String str4 = p281Var.f;
        String str5 = p281Var.e;
        Bundle bundle = new Bundle();
        bundle.putDouble("show_price_amount", d);
        bundle.putString("show_price_currency", str2);
        bundle.putString("SUCCESS_SNACKBAR", str3);
        bundle.putString("CHECKOUT_FULFILLED_SNACKBAR", str4);
        bundle.putString("CHECKOUT_ERROR_SNACKBAR", str5);
        this.b.i(new dwn0(str.concat(":weboverlaycheckout"), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundle);
    }
}
