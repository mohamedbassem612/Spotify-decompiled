package p;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z7j0 extends a8j0 {
    public final kqi0 U0;
    public final iu30 V0;

    public z7j0(kqi0 kqi0Var, hox0 hox0Var) {
        super((ConstraintLayout) kqi0Var.b);
        this.U0 = kqi0Var;
        this.V0 = hox0Var;
    }

    public final void E(l6j0 l6j0Var) {
        boolean zC = l6j0Var.c();
        kqi0 kqi0Var = this.U0;
        EncoreTextView encoreTextView = (EncoreTextView) kqi0Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) kqi0Var.b;
        EncoreTextView encoreTextView2 = (EncoreTextView) kqi0Var.c;
        if (!zC) {
            encoreTextView2.setVisibility(8);
            encoreTextView.setAlpha(1.0f);
            constraintLayout.setOnClickListener(d37.d);
            return;
        }
        encoreTextView2.setVisibility(0);
        encoreTextView.setAlpha(0.7f);
        if (l6j0Var.e) {
            encoreTextView2.setAlpha(1.0f);
            constraintLayout.setOnClickListener(new t230(this, l6j0Var, (byte) 15));
        } else {
            encoreTextView2.setAlpha(0.7f);
            constraintLayout.setClickable(false);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) constraintLayout.getContext().getString(2131955898));
        spannableStringBuilder.append((CharSequence) " ");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(constraintLayout.getContext().getColor(2131104471));
        int length = spannableStringBuilder.length();
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(encoreTextView2.getContext(), 2132018006);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) constraintLayout.getContext().getString(2131955888));
        spannableStringBuilder.setSpan(textAppearanceSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.toString();
        encoreTextView2.setText(new SpannedString(spannableStringBuilder));
    }
}
