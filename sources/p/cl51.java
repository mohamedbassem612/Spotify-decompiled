package p;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cl51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SeeMoreTextView b;
    public final /* synthetic */ wk51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl51(SeeMoreTextView seeMoreTextView, wk51 wk51Var, byte b) {
        super(0);
        this.a = b;
        this.b = seeMoreTextView;
        this.c = wk51Var;
    }

    public final Object invoke() {
        byte b = this.a;
        SeeMoreTextView seeMoreTextView = this.b;
        wk51 wk51Var = this.c;
        switch (b) {
            case 0:
                SpannableString spannableStringValueOf = SpannableString.valueOf(wk51Var.a);
                int i = seeMoreTextView.S0;
                String str = seeMoreTextView.P0;
                String str2 = wk51Var.c;
                SpannableStringBuilder spannableStringBuilderD = seeMoreTextView.D(spannableStringValueOf, i, str2 == null ? str : str2);
                if (str2 != null) {
                    str = str2;
                }
                seeMoreTextView.y(spannableStringBuilderD, str, seeMoreTextView.getSeeMoreSpan());
                return spannableStringBuilderD;
            default:
                boolean z = seeMoreTextView.X0;
                String str3 = seeMoreTextView.Q0;
                if (!z || seeMoreTextView.z(SpannableString.valueOf(wk51Var.a)).getLineCount() <= seeMoreTextView.T0) {
                    return seeMoreTextView.B(wk51Var.a);
                }
                SpannableStringBuilder spannableStringBuilderD2 = seeMoreTextView.D(SpannableString.valueOf(wk51Var.a), seeMoreTextView.T0, str3);
                spannableStringBuilderD2.append('\n');
                seeMoreTextView.y(spannableStringBuilderD2, str3, seeMoreTextView.getSeeLessSpan());
                return spannableStringBuilderD2;
        }
    }
}
