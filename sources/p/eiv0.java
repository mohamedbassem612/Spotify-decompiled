package p;

import android.icu.text.DateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eiv0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fiv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eiv0(fiv0 fiv0Var, byte b) {
        super(0);
        this.a = b;
        this.b = fiv0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        fiv0 fiv0Var = this.b;
        switch (b) {
            case 0:
                return DateFormat.getPatternInstance("MMMMd", (Locale) fiv0Var.b.getValue());
            case 1:
                return DateFormat.getPatternInstance("MMMd", (Locale) fiv0Var.b.getValue());
            default:
                return DateFormat.getPatternInstance("yMMMd", (Locale) fiv0Var.b.getValue());
        }
    }
}
