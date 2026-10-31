package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l5d {
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public final fp8 a;
    public final Single b;
    public final yqg c;

    static {
        nbc nbcVar = bma1.b;
        d = nbcVar.u("unboxing_premium_home_banner_presented");
        e = nbcVar.u("unboxing_premium_modal_presented");
        f = nbcVar.u("unboxing_premium_entry_point_start_date");
    }

    public l5d(fp8 fp8Var, Single single, yqg yqgVar) {
        this.a = fp8Var;
        this.b = single;
        this.c = yqgVar;
    }
}
