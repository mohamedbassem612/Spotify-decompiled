package p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class irb0 implements mma0 {
    public final znb0 a;

    public irb0(Function0 function0) {
        this.a = dm5.S(2, function0);
    }

    public final Object call(Object... objArr) {
        return e().call(Arrays.copyOf(objArr, objArr.length));
    }

    public final Object callBy(Map map) {
        return e().callBy(map);
    }

    public final mma0 e() {
        return (mma0) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        return u890.j(e(), obj);
    }

    public final List getAnnotations() {
        return e().getAnnotations();
    }

    public final String getName() {
        return e().getName();
    }

    public final List getParameters() {
        return e().getParameters();
    }

    public final oma0 getReturnType() {
        return e().getReturnType();
    }

    public final List getTypeParameters() {
        return e().getTypeParameters();
    }

    public final xma0 getVisibility() {
        return e().getVisibility();
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final boolean isAbstract() {
        return e().isAbstract();
    }

    public final boolean isFinal() {
        return e().isFinal();
    }

    public final boolean isOpen() {
        return e().isOpen();
    }

    public final boolean isSuspend() {
        return e().isSuspend();
    }

    public final String toString() {
        return e().toString();
    }
}
