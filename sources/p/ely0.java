package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ely0 {
    public final xky0 a;
    public final boolean b;
    public final wv91 c;
    public final iu30 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public ely0(xky0 xky0Var, Object obj, boolean z, wv91 wv91Var, iu30 iu30Var, boolean z2) {
        this.a = xky0Var;
        this.b = z;
        this.c = wv91Var;
        this.d = iu30Var;
        this.e = z2;
        this.f = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object a() throws KotlinNothingValueException {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        g0k.b("Unexpected form of a provided value");
        jah.d();
        return null;
    }
}
