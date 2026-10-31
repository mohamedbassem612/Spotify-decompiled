package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ig10 extends s2n {
    public final r8i0 a;
    public final y1t0 b;

    public ig10(r8i0 r8i0Var, y1t0 y1t0Var) {
        this.a = r8i0Var;
        this.b = y1t0Var;
    }

    @Override // p.s2n
    public final t2n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gc31 gc31Var) {
        y1t0 y1t0Var = this.b;
        return new dzp0(this.a, smo1.D(((nfa0) y1t0Var.b).b, type), y1t0Var, (byte) 10);
    }

    @Override // p.s2n
    public final t2n b(Type type, Annotation[] annotationArr, gc31 gc31Var) {
        y1t0 y1t0Var = this.b;
        return new iir(smo1.D(((nfa0) y1t0Var.b).b, type), y1t0Var, (byte) 29);
    }
}
