package p;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class eia0 {
    public static final kf30 a;
    public static final ajn0 b;
    public static final kf30 c;
    public static final kf30 d;
    public static final kf30 e;
    public static final kf30 f;
    public static final kf30 g;
    public static final kf30 h;
    public static final kf30 i;
    public static final kf30 j;
    public static final kf30 k;
    public static final kf30 l;
    public static final kf30 m;
    public static final kf30 n;
    public static final kf30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kf30 f21p;
    public static final kf30 q;
    public static final kf30 r;
    public static final kf30 s;

    static {
        kf30 kf30Var = new kf30("kotlin.Metadata");
        a = kf30Var;
        tia0.b(kf30Var).d();
        b = ajn0.e("value");
        c = new kf30(Target.class.getName());
        new kf30(ElementType.class.getName());
        d = new kf30(Retention.class.getName());
        new kf30(RetentionPolicy.class.getName());
        e = new kf30(Deprecated.class.getName());
        f = new kf30(Documented.class.getName());
        g = new kf30("java.lang.annotation.Repeatable");
        new kf30("java.lang.annotation.Inherited");
        new kf30(Override.class.getName());
        h = new kf30("org.jetbrains.annotations.NotNull");
        i = new kf30("org.jetbrains.annotations.Nullable");
        j = new kf30("org.jetbrains.annotations.Mutable");
        k = new kf30("org.jetbrains.annotations.ReadOnly");
        l = new kf30("org.jetbrains.annotations.Unmodifiable");
        m = new kf30("org.jetbrains.annotations.UnmodifiableView");
        n = new kf30("kotlin.annotations.jvm.ReadOnly");
        o = new kf30("kotlin.annotations.jvm.Mutable");
        f21p = new kf30("kotlin.jvm.PurelyImplements");
        new kf30("kotlin.jvm.internal");
        kf30 kf30Var2 = new kf30("kotlin.jvm.internal.SerializedIr");
        q = kf30Var2;
        tia0.b(kf30Var2).d();
        r = new kf30("kotlin.jvm.internal.EnhancedNullability");
        s = new kf30("kotlin.jvm.internal.EnhancedMutability");
    }
}
