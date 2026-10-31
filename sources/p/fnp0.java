package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fnp0 implements acr0 {
    public final /* synthetic */ byte a;

    @Override // p.acr0
    public final Set a() {
        switch (this.a) {
            case 0:
                return Collections.singleton(blc0.PREMIUM_DESTINATION_FLAVOR_PAGE);
            default:
                return w7x.a;
        }
    }

    @Override // p.acr0
    public final Class b() {
        switch (this.a) {
            case 0:
                return dnp0.class;
            default:
                return oua1.class;
        }
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                np20 parcelableExtra = intent.getParcelableExtra("request");
                return new pp20(parcelableExtra != null ? Integer.valueOf(parcelableExtra.b()) : null, parcelableExtra != null ? parcelableExtra.a() : null);
            default:
                return new wua1(intent.getIntExtra("initialSpeed", a5u0.c.a()));
        }
    }

    @Override // p.acr0
    public final e6w0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b6w0(true);
    }

    @Override // p.acr0
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A page for loading and displaying the offers flavor page";
            default:
                return "Playback speed control bottom sheet";
        }
    }
}
