package p;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class piv implements niv {
    public static final oiv a = new oiv(new piv(), false);
    public static final Set b = Collections.singleton(liv.d);

    @Override // p.niv
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // p.niv
    public final Set b(liv livVar) {
        o0c.k("DynamicRange is not supported: " + livVar, liv.d.equals(livVar));
        return b;
    }

    @Override // p.niv
    public final Set c() {
        return b;
    }
}
