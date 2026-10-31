package p;

import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qik1 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(rik1.a.x((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        rik1.a.z((View) obj, fFloatValue);
    }
}
