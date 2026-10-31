package p;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sj21 implements p4h1 {
    public final bz11 a;
    public final Consumer b;
    public final kt91 c;
    public final ConstraintLayout d;
    public final r4u e;

    public sj21(bz11 bz11Var, Consumer consumer, kt91 kt91Var) {
        EncoreTextView encoreTextView = (EncoreTextView) bz11Var.g;
        this.a = bz11Var;
        this.b = consumer;
        this.c = kt91Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) bz11Var.a;
        this.d = constraintLayout;
        this.e = r4u.c(new r4u[]{r4u.d(new hyr(nj21.b, (byte) 6), r4u.a(new bb01(this, (byte) 9))), r4u.d(new hyr(oj21.b, (byte) 6), r4u.a(new rut0(this, (byte) 29))), r4u.d(new hyr(pj21.b, (byte) 6), r4u.a(new ij01(this, (byte) 7))), r4u.d(new hyr(qj21.b, (byte) 6), r4u.a(new n801(this, (byte) 7))), r4u.d(new hyr(rj21.b, (byte) 6), r4u.a(new vqv0(this, (byte) 22))), r4u.d(new hyr(mj21.b, (byte) 6), r4u.a(new n0v0(this, (byte) 26)))});
        EncoreButton encoreButton = (EncoreButton) bz11Var.i;
        encoreButton.setEnabled(false);
        ((RadioGroup) bz11Var.h).setOnCheckedChangeListener(new lj21(this));
        encoreButton.setOnClickListener(new hid0(this, (byte) 23));
        ((EditText) bz11Var.d).addTextChangedListener(new p96(this, (byte) 11));
        kt91Var.a(new z3h(this, (byte) 1));
        if (Build.VERSION.SDK_INT >= 28) {
            constraintLayout.setAccessibilityPaneTitle(constraintLayout.getContext().getString(2131961208));
        }
        String string = constraintLayout.getContext().getString(2131961265);
        String string2 = constraintLayout.getContext().getString(2131961267);
        int iW0 = ihc1.w0(string, string2, 0, false, 6);
        int length = string2.length() + iW0;
        ntj ntjVar = new ntj(this, (byte) 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(ntjVar, iW0, length, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(constraintLayout.getContext().getColor(2131103300)), 0, spannableStringBuilder.length(), 33);
        encoreTextView.setText(spannableStringBuilder);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p.p4h1
    public final View a() {
        return this.d;
    }
}
