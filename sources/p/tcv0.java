package p;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tcv0 extends f9 {
    public final tka0 a;
    public final List b;
    public final znb0 c;

    public tcv0(tka0 tka0Var) {
        this.a = tka0Var;
        this.b = z6x.a;
        this.c = dm5.S(2, new g030(this, (byte) 25));
    }

    @Override // p.f9
    public final tka0 c() {
        return this.a;
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return (h661) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public tcv0(tka0 tka0Var, Annotation[] annotationArr) {
        this(tka0Var);
        this.b = f46.H(annotationArr);
    }
}
