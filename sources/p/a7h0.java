package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class a7h0 {
    public static final se11 a = new se11("^#{1,3}\\s.*", 6);

    public static final List a(c380 c380Var, int i, lpu lpuVar) {
        return (lpuVar.a || !xa4.s(3, c380Var).isEmpty()) ? Collections.singletonList(new y5h0(f4i1.c(i, "verticalIntentSuggestions:"), lpuVar, c380Var)) : z6x.a;
    }
}
