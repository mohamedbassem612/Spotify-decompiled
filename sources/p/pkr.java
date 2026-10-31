package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pkr extends exc {
    public final Executor a;

    public pkr(Executor executor) {
        this.a = executor;
    }

    @Override // p.exc
    public final fxc a(Type type, Annotation[] annotationArr) {
        if (m5n1.B(type) != dxc.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new rm5(m5n1.A(0, (ParameterizedType) type), m5n1.I(annotationArr, h591.class) ? null : this.a);
        }
        hhg1.n("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
