package p;

import android.content.Context;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggv {
    public static final Locale b;
    public final Context a;

    static {
        new twb((byte) 8);
        b = new Locale(upn1.m());
    }

    public ggv(Context context) {
        this.a = context;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String a(long j, fgv fgvVar) throws NoWhenBranchMatchedException {
        long jAbs = Math.abs(j);
        int iC = l1d.C(fgvVar.a());
        if (iC == 0) {
            return twb.f(jAbs);
        }
        Context context = this.a;
        if (iC == 1) {
            long j2 = jAbs / 60;
            long j3 = jAbs % 60;
            String string = j2 == 0 ? context.getResources().getString(2131963345, Long.valueOf(j3)) : context.getResources().getString(2131963344, Long.valueOf(j2), Long.valueOf(j3));
            string.getClass();
            return string;
        }
        if (iC == 2) {
            return twb.d(context.getResources(), jAbs, true, fgvVar.b() == 1);
        }
        if (iC == 3) {
            return twb.d(context.getResources(), jAbs, false, fgvVar.b() == 1);
        }
        eg.o();
        return null;
    }
}
