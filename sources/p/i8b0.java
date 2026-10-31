package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i8b0 extends s2n {
    public final nfa0 a;
    public final ig10 b;

    public i8b0(nfa0 nfa0Var) {
        this.a = nfa0Var;
        se11 se11Var = r8i0.e;
        this.b = s3o1.n(nfa0Var, bmq0.w("application/json"));
    }

    @Override // p.s2n
    public final t2n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gc31 gc31Var) {
        try {
            smo1.E(type);
            return this.b.a(type, annotationArr, annotationArr2, gc31Var);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.s2n
    public final t2n b(Type type, Annotation[] annotationArr, gc31 gc31Var) {
        try {
            smo1.E(type);
            return new v6a0(this, smo1.D(this.a.b, type), (byte) 6);
        } catch (Exception unused) {
            return null;
        }
    }
}
