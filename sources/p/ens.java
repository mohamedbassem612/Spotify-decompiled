package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ens implements rs61 {
    public final /* synthetic */ byte a = 1;
    public final kly0 b;
    public final p6r0 c;
    public final lik1 d;
    public final Set e;
    public final Object f;

    public ens(g15 g15Var, thq thqVar) {
        this.f = g15Var;
        this.b = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("SETTINGS_PARENTAL_CONTROLS", "settings/parental-controls", 1841, "settings");
        this.d = nik1.Z0;
        this.e = Collections.singleton(blc0.Yf);
    }

    public final Set a() {
        byte b = this.a;
        return this.e;
    }

    public final kly0 c() {
        byte b = this.a;
        return this.b;
    }

    public final p6r0 e() {
        byte b = this.a;
        return this.c;
    }

    public final lik1 getViewUri() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return ((z0t) obj).a.e();
            default:
                return ((g15) obj).a();
        }
    }

    public ens(z0t z0tVar, thq thqVar) {
        this.f = z0tVar;
        this.b = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("SETTINGS_DEFAULT_SAVE_LOCATIONS", "settings/default-save-locations", 1815, "settings");
        this.d = nik1.k1;
        this.e = Collections.singleton(blc0.Sf);
    }
}
