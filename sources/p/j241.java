package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j241 extends exc {
    public final Scheduler a;
    public final boolean b;

    public j241(Scheduler scheduler, boolean z) {
        this.a = scheduler;
        this.b = z;
    }

    @Override // p.exc
    public final fxc a(Type type, Annotation[] annotationArr) {
        Type typeA;
        boolean z;
        boolean z2;
        String str;
        Class clsB = m5n1.B(type);
        if (clsB == Completable.class) {
            return new i241(Void.class, this.a, this.b, false, true, false, false, false, true);
        }
        boolean z3 = clsB == Flowable.class;
        boolean z4 = clsB == Single.class;
        boolean z5 = clsB == Maybe.class;
        if (clsB != Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            bhn0.h("<? extends Foo>", gvg.n(str, " return type must be parameterized as ", str, "<Foo> or ", str));
            return null;
        }
        Type typeA2 = m5n1.A(0, (ParameterizedType) type);
        Class clsB2 = m5n1.B(typeA2);
        if (clsB2 == sy21.class) {
            if (!(typeA2 instanceof ParameterizedType)) {
                eg.m("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            }
            typeA = m5n1.A(0, (ParameterizedType) typeA2);
            z2 = false;
            z = false;
        } else if (clsB2 != f331.class) {
            typeA = typeA2;
            z = true;
            z2 = false;
        } else {
            if (!(typeA2 instanceof ParameterizedType)) {
                eg.m("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                return null;
            }
            typeA = m5n1.A(0, (ParameterizedType) typeA2);
            z2 = true;
            z = false;
        }
        return new i241(typeA, this.a, this.b, z2, z, z3, z4, z5, false);
    }
}
