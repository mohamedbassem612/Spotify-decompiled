package p;

import android.text.Editable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g4x extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile g4x b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new cna1(cls, charSequence) : super.newEditable(charSequence);
    }
}
