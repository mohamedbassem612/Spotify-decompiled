package p;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.text.NumberFormat;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.ULocale;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fo11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ytp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo11(ytp0 ytp0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ytp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ytp0 ytp0Var = this.b;
        switch (b) {
            case 0:
                return DateFormat.getPatternInstance("MMMd", (Locale) ((idd1) ytp0Var.f).getValue());
            case 1:
                return DateFormat.getPatternInstance("yMMMd", (Locale) ((idd1) ytp0Var.f).getValue());
            default:
                return RelativeDateTimeFormatter.getInstance(new ULocale(upn1.m()), NumberFormat.getInstance((Locale) ((idd1) ytp0Var.f).getValue()), RelativeDateTimeFormatter.Style.LONG, DisplayContext.CAPITALIZATION_NONE);
        }
    }
}
