package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m0r0 implements vg30 {
    public final ig30 a;
    public final mwn0 b;
    public final y911 c;

    public m0r0(mu9 mu9Var, ig30 ig30Var, mwn0 mwn0Var, y911 y911Var) {
        this.a = ig30Var;
        this.b = mwn0Var;
        this.c = y911Var;
    }

    public final void a(ug30 ug30Var, Intent intent, e6w0 e6w0Var) {
        n57.i(u890.j(Looper.myLooper(), Looper.getMainLooper()), "Fragment navigation must be applied on the main thread, but ran on %s.", new Object[]{Thread.currentThread().getName()});
        a4p1 a4p1VarN = c4p1.n(intent);
        String stringExtra = intent.getStringExtra(ContextTrack$Metadata.KEY_TITLE);
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null && (strK = intent.getDataString()) == null) {
            strK = "";
        }
        lu9 lu9Var = new lu9(stringExtra, strK, intent.getStringExtra("tag"));
        ee5 ee5VarO = c4p1.o(intent);
        this.c.a(ug30Var, intent);
        Bundle bundleExtra = intent.getBundleExtra("fragment_arguments");
        if (bundleExtra != null) {
            Bundle bundle = ug30Var.b().f;
            if (bundle != null) {
                bundle.putAll(bundleExtra);
            } else {
                ug30Var.b().T0(bundleExtra);
            }
        }
        Parcelable parcelableL = gg.l(intent);
        if (parcelableL != null) {
            Bundle bundle2 = ug30Var.b().f;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putParcelable("extra_interaction_logging_result", parcelableL);
            ug30Var.b().T0(bundle2);
        }
        this.b.f(gg.d(intent));
        this.a.a(a4p1VarN, ug30Var.b(), lu9Var, ee5VarO, e6w0Var);
    }
}
