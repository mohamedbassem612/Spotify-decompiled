package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pfd implements ez20 {
    public static final pfd a = new pfd();
    public static Boolean b;

    @Override // p.ez20
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.ez20
    public final boolean e() throws KotlinNothingValueException {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw l1d.w("canFocus is read before it is written");
    }
}
