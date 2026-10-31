package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class d8a0 {
    public static final kf30 a;
    public static final kf30[] b;
    public static final rok0 c;
    public static final e8a0 d;

    static {
        kf30 kf30Var = new kf30("org.jspecify.nullness");
        kf30 kf30Var2 = new kf30("org.jspecify.annotations");
        a = kf30Var2;
        kf30 kf30Var3 = new kf30("io.reactivex.rxjava3.annotations");
        kf30 kf30Var4 = new kf30("org.checkerframework.checker.nullness.compatqual");
        String str = kf30Var3.a.a;
        b = new kf30[]{new kf30(f4i1.e(str, ".Nullable")), new kf30(f4i1.e(str, ".NonNull"))};
        kf30 kf30Var5 = new kf30("org.jetbrains.annotations");
        e8a0 e8a0Var = e8a0.d;
        mmr0 mmr0Var = new mmr0(kf30Var5, e8a0Var);
        mmr0 mmr0Var2 = new mmr0(new kf30("kotlin.annotations.jvm"), e8a0Var);
        mmr0 mmr0Var3 = new mmr0(new kf30("androidx.annotation"), e8a0Var);
        mmr0 mmr0Var4 = new mmr0(new kf30("android.support.annotation"), e8a0Var);
        mmr0 mmr0Var5 = new mmr0(new kf30("android.annotation"), e8a0Var);
        mmr0 mmr0Var6 = new mmr0(new kf30("com.android.annotations"), e8a0Var);
        mmr0 mmr0Var7 = new mmr0(new kf30("org.eclipse.jdt.annotation"), e8a0Var);
        mmr0 mmr0Var8 = new mmr0(new kf30("org.checkerframework.checker.nullness.qual"), e8a0Var);
        mmr0 mmr0Var9 = new mmr0(kf30Var4, e8a0Var);
        mmr0 mmr0Var10 = new mmr0(new kf30("javax.annotation"), e8a0Var);
        mmr0 mmr0Var11 = new mmr0(new kf30("edu.umd.cs.findbugs.annotations"), e8a0Var);
        mmr0 mmr0Var12 = new mmr0(new kf30("io.reactivex.annotations"), e8a0Var);
        kf30 kf30Var6 = new kf30("androidx.annotation.RecentlyNullable");
        kl21 kl21Var = kl21.b;
        mmr0 mmr0Var13 = new mmr0(kf30Var6, new e8a0(kl21Var, 4));
        mmr0 mmr0Var14 = new mmr0(new kf30("androidx.annotation.RecentlyNonNull"), new e8a0(kl21Var, 4));
        mmr0 mmr0Var15 = new mmr0(new kf30("lombok"), e8a0Var);
        h8b0 h8b0Var = new h8b0(2, 1, 0);
        kl21 kl21Var2 = kl21.c;
        c = new rok0(sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, mmr0Var13, mmr0Var14, mmr0Var15, new mmr0(kf30Var, new e8a0(kl21Var, h8b0Var, kl21Var2)), new mmr0(kf30Var2, new e8a0(kl21Var, new h8b0(2, 1, 0), kl21Var2)), new mmr0(kf30Var3, new e8a0(kl21Var, new h8b0(1, 8, 0), kl21Var2)), new mmr0(new kf30("jakarta.annotation"), new e8a0(kl21Var, new h8b0(2, 4, 0), kl21Var2)), new mmr0(eia0.l, new e8a0(kl21Var, new h8b0(2, 5, 0), kl21Var2)), new mmr0(eia0.m, new e8a0(kl21Var, new h8b0(2, 5, 0), kl21Var2)), new mmr0(new kf30("io.vertx.codegen.annotations"), new e8a0(kl21Var, new h8b0(2, 5, 0), kl21Var2))}));
        d = new e8a0(kl21Var, 4);
    }
}
