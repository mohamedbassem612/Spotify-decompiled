package p;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kce1 {
    public static final kce1 b = new kce1();
    public final AtomicReference a = new AtomicReference();

    public final boolean a() {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = gjv.a(qok0.c().b(), "com.google.mlkit.dynamite.text.latin") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public final String b() {
        return true != a() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    public final String c() {
        return true != a() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kce1) {
            return k8p1.h(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
