package p;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wnd {
    public static final sy8 h = new sy8("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final sy8 i = new sy8("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final sy8 j = new sy8("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final eqq0 b;
    public final int c;
    public final List d;
    public final boolean e;
    public final tod1 f;
    public final j2d g;

    public wnd(ArrayList arrayList, eqq0 eqq0Var, int i2, ArrayList arrayList2, boolean z, tod1 tod1Var, j2d j2dVar) {
        this.a = arrayList;
        this.b = eqq0Var;
        this.c = i2;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = z;
        this.f = tod1Var;
        this.g = j2dVar;
    }

    public final int a() {
        Object objE = 0;
        try {
            objE = this.b.e(i4i1.J0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objE;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int b() {
        Object objE = 0;
        try {
            objE = this.b.e(i4i1.K0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objE;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
