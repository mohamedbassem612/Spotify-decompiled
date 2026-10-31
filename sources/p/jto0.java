package p;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jto0 implements gs31 {
    public final /* synthetic */ kto0 a;

    public jto0(kto0 kto0Var) {
        this.a = kto0Var;
    }

    public final void a(Intent intent, th61 th61Var) {
        kto0 kto0Var = this.a;
        kto0Var.e();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("push_data", sn1.class) : intent.getParcelableExtra("push_data");
        if (parcelableExtra == null) {
            eg.m("Push action data should not be null");
            return;
        }
        sn1 sn1Var = (sn1) parcelableExtra;
        String str = sn1Var.d;
        kto0Var.f(sn1Var.a);
        tv80 tv80VarL = gg.l(intent);
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                int iOrdinal = s4b1VarX.c.ordinal();
                if (iOrdinal == 30 || iOrdinal == 844 || iOrdinal == 926) {
                    vu1.b(kto0Var.e, Collections.singletonList(str), "PUSH_NOTIFICATIONS", "PUSH_NOTIFICATIONS", tv80VarL, (dy1) null, 48);
                    return;
                } else {
                    Logger.d("This action cannot be handled by the AddToPlaylistAction", new Object[0]);
                    return;
                }
            }
        }
        vu1.b(kto0Var.e, Collections.singletonList(str), "PUSH_NOTIFICATIONS", "PUSH_NOTIFICATIONS", tv80VarL, new dy1((g3d0) null), 32);
    }
}
