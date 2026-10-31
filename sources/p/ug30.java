package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface ug30 extends lir0, fn10 {
    String A(Context context);

    default zf30 b() {
        zf30 zf30Var = this instanceof zf30 ? (zf30) this : null;
        if (zf30Var != null) {
            return zf30Var;
        }
        eg.f("FragmentIdentifier is not implemented by a Fragment.");
        return null;
    }

    String s();
}
