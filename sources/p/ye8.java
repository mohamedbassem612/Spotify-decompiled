package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ye8 {
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public final o241 a;
    public final ymm0 b;
    public final Single c;

    static {
        new i5x0((byte) 29);
        nbc nbcVar = bma1.b;
        d = nbcVar.u("ao_bottom_sheet_cache_version");
        e = nbcVar.u("ao_bottom_sheet_presentation_consumed");
        f = nbcVar.u("ao_bottom_sheet_presentation_date");
        g = nbcVar.u("ao_bottom_sheet_presentation_count");
    }

    public ye8(o241 o241Var, ymm0 ymm0Var, Single single) {
        this.a = o241Var;
        this.b = ymm0Var;
        this.c = single.map(new p5x0(this));
    }
}
