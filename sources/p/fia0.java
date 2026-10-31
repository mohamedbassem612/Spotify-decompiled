package p;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class fia0 {
    public static final kf30 a;
    public static final kf30 b;
    public static final kf30 c;
    public static final kf30 d;
    public static final kf30 e;
    public static final kf30 f;
    public static final kf30 g;
    public static final kf30 h;
    public static final kf30 i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map f12p;
    public static final kf30 q;

    static {
        kf30 kf30Var = new kf30("org.jspecify.nullness.Nullable");
        kf30 kf30Var2 = new kf30("org.jspecify.nullness.NullMarked");
        a = kf30Var2;
        kf30 kf30Var3 = new kf30("org.jspecify.nullness.NullnessUnspecified");
        kf30 kf30Var4 = new kf30("org.jspecify.annotations.NonNull");
        kf30 kf30Var5 = new kf30("org.jspecify.annotations.Nullable");
        kf30 kf30Var6 = new kf30("org.jspecify.annotations.NullMarked");
        b = kf30Var6;
        kf30 kf30Var7 = new kf30("org.jspecify.annotations.NullnessUnspecified");
        kf30 kf30Var8 = new kf30("org.jspecify.annotations.NullUnmarked");
        c = kf30Var8;
        d = new kf30("javax.annotation.meta.TypeQualifier");
        e = new kf30("javax.annotation.meta.TypeQualifierNickname");
        f = new kf30("javax.annotation.meta.TypeQualifierDefault");
        kf30 kf30Var9 = new kf30("javax.annotation.Nonnull");
        g = kf30Var9;
        kf30 kf30Var10 = new kf30("javax.annotation.Nullable");
        kf30 kf30Var11 = new kf30("javax.annotation.CheckForNull");
        h = new kf30("javax.annotation.ParametersAreNonnullByDefault");
        i = new kf30("javax.annotation.ParametersAreNullableByDefault");
        j = f46.S0(new kf30[]{kf30Var9, kf30Var11});
        Set setS0 = f46.S0(new kf30[]{eia0.h, kf30Var4, new kf30("android.annotation.NonNull"), new kf30("androidx.annotation.NonNull"), new kf30("androidx.annotation.RecentlyNonNull"), new kf30("android.support.annotation.NonNull"), new kf30("com.android.annotations.NonNull"), new kf30("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new kf30("org.checkerframework.checker.nullness.qual.NonNull"), new kf30("edu.umd.cs.findbugs.annotations.NonNull"), new kf30("io.reactivex.annotations.NonNull"), new kf30("io.reactivex.rxjava3.annotations.NonNull"), new kf30("org.eclipse.jdt.annotation.NonNull"), new kf30("lombok.NonNull"), new kf30("jakarta.annotation.Nonnull")});
        k = setS0;
        Set setS1 = f46.S0(new kf30[]{eia0.i, kf30Var, kf30Var5, kf30Var10, kf30Var11, new kf30("android.annotation.Nullable"), new kf30("androidx.annotation.Nullable"), new kf30("androidx.annotation.RecentlyNullable"), new kf30("android.support.annotation.Nullable"), new kf30("com.android.annotations.Nullable"), new kf30("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new kf30("org.checkerframework.checker.nullness.qual.Nullable"), new kf30("edu.umd.cs.findbugs.annotations.Nullable"), new kf30("edu.umd.cs.findbugs.annotations.PossiblyNull"), new kf30("edu.umd.cs.findbugs.annotations.CheckForNull"), new kf30("io.reactivex.annotations.Nullable"), new kf30("io.reactivex.rxjava3.annotations.Nullable"), new kf30("org.eclipse.jdt.annotation.Nullable"), new kf30("jakarta.annotation.Nullable"), new kf30("io.vertx.codegen.annotations.Nullable")});
        l = setS1;
        m = f46.S0(new kf30[]{kf30Var3, kf30Var7});
        dm61.x0(kf30Var8, dm61.x0(kf30Var6, dm61.x0(kf30Var2, dm61.x0(kf30Var9, dm61.y0(dm61.y0(new LinkedHashSet(), setS0), setS1)))));
        n = f46.S0(new kf30[]{eia0.k, eia0.n, eia0.l, eia0.m});
        o = f46.S0(new kf30[]{eia0.j, eia0.o});
        f12p = sqg0.J(new mmr0[]{new mmr0(eia0.c, rfb1.t), new mmr0(eia0.d, rfb1.w), new mmr0(eia0.e, rfb1.m), new mmr0(eia0.f, rfb1.x)});
        q = new kf30("kotlin.annotations.jvm.UnderMigration");
    }
}
