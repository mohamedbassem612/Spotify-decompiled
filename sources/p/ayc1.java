package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ayc1 implements acr0 {
    public final of60 a;
    public final boolean b;
    public final Set c = dm61.z0(blc0.LISTENING_STATS, blc0.LISTENING_STATS_V2);

    public ayc1(of60 of60Var, boolean z) {
        this.a = of60Var;
        this.b = z;
    }

    @Override // p.acr0
    public final Set a() {
        return this.c;
    }

    @Override // p.acr0
    public final Class b() {
        return vxc1.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        int iOrdinal = s4b1Var.c.ordinal();
        Long lN = null;
        if (iOrdinal != 489 && iOrdinal == 494) {
            lN = v1p1.n(s4b1Var.o(1));
        }
        return new zxc1(lN);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Summary Page (Listening Stats)";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return ((Boolean) this.a.b().blockingFirst()).booleanValue() && this.b;
    }
}
