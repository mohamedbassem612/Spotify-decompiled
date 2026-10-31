package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xm30 implements acr0 {
    @Override // p.acr0
    public final Set a() {
        return w7x.a;
    }

    @Override // p.acr0
    public final Class b() {
        return um30.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String string;
        String string2;
        String strE = s4b1Var.E();
        String str = "";
        if (strE == null) {
            strE = "";
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("share_id")) == null) {
            string = "";
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null && (string2 = extras2.getString("external_referrer")) != null) {
            str = string2;
        }
        return new wm30(strE, string, str);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Page API implementation of Free Tier Track page";
    }
}
