package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class exc {
    public fxc a(Type type, Annotation[] annotationArr) {
        if (m5n1.B(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            eg.m("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeA = m5n1.A(0, (ParameterizedType) type);
        if (m5n1.B(typeA) != sy21.class) {
            return new fna(typeA, (byte) 20);
        }
        if (typeA instanceof ParameterizedType) {
            return new n4b(m5n1.A(0, (ParameterizedType) typeA), (byte) 13);
        }
        eg.m("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
