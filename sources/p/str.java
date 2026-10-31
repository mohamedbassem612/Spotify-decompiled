package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class str extends LinearLayout implements tlv {
    public yuw a;
    public iu30 b;
    public int c;
    public final zfr d;
    public final Pattern e;
    public boolean f;
    public ydt g;

    public str(Context context) {
        super(context, null, 0);
        this.c = getResources().getInteger(2131492882);
        LayoutInflater.from(context).inflate(2131624527, this);
        int i = 2131430960;
        EncoreTextView encoreTextViewT = m5n1.t(this, 2131430960);
        if (encoreTextViewT != null) {
            i = 2131431533;
            EncoreTextView encoreTextViewT2 = m5n1.t(this, 2131431533);
            if (encoreTextViewT2 != null) {
                this.d = new zfr(this, encoreTextViewT, encoreTextViewT2);
                this.e = Pattern.compile(" ");
                eg7 eg7Var = new eg7(this, (byte) 8);
                setOrientation(1);
                encoreTextViewT2.addOnLayoutChangeListener(eg7Var);
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(ydt ydtVar, SpannableStringBuilder spannableStringBuilder) {
        this.f = true;
        try {
            if (ydtVar.b) {
                zfr zfrVar = this.d;
                EncoreTextView encoreTextView = (EncoreTextView) zfrVar.c;
                encoreTextView.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
                encoreTextView.setContentDescription(spannableStringBuilder.toString());
                ((EncoreTextView) zfrVar.c).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                iu30 iu30Var = this.b;
                if (iu30Var != null) {
                    iu30Var.invoke(udt.a);
                }
            } else {
                b(spannableStringBuilder);
            }
        } finally {
            this.f = false;
        }
    }

    public final void b(SpannableStringBuilder spannableStringBuilder) {
        String str;
        zfr zfrVar = this.d;
        EncoreTextView encoreTextView = (EncoreTextView) zfrVar.c;
        encoreTextView.setMaxLines(this.c);
        String strReplaceAll = this.e.matcher(encoreTextView.getContext().getString(2131954939)).replaceAll(" ");
        if (this.a == null) {
            u890.C("ellipsisMarkupFactory");
            throw null;
        }
        strReplaceAll.getClass();
        zuw zuwVar = new zuw(encoreTextView, strReplaceAll, new xap(this, (byte) 8));
        if (encoreTextView.getWidth() == 0) {
            Logger.d("TextView's width need to be set, to be able to markup ellipsis", new Object[0]);
        } else if (encoreTextView.getMaxLines() > 0 && zuwVar.a(spannableStringBuilder).getLineCount() > encoreTextView.getMaxLines()) {
            int maxLines = encoreTextView.getMaxLines();
            CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(0, zuwVar.a(spannableStringBuilder).getLineEnd(maxLines - 1));
            while (charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1) == '\n') {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceSubSequence);
            while (true) {
                int length = spannableStringBuilder2.length();
                str = zuwVar.c;
                if (length <= 0 || zuwVar.a(new SpannableStringBuilder(spannableStringBuilder2).append((CharSequence) str)).getLineCount() <= maxLines) {
                    break;
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                }
            }
            encoreTextView.setContentDescription(spannableStringBuilder2.toString());
            spannableStringBuilder2.append((CharSequence) str);
            spannableStringBuilder2.setSpan(new ntj(zuwVar.d, spannableStringBuilder), spannableStringBuilder2.length() - zuwVar.b.length(), spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        ((EncoreTextView) zfrVar.b).setOnClickListener(new c20(this, (byte) 27));
        iu30 iu30Var = this.b;
        if (iu30Var != null) {
            iu30Var.invoke(tdt.a);
        }
        ((EncoreTextView) zfrVar.c).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(ydt ydtVar) {
        boolean z = ydtVar.b;
        zfr zfrVar = this.d;
        EncoreTextView encoreTextView = (EncoreTextView) zfrVar.c;
        EncoreTextView encoreTextView2 = (EncoreTextView) zfrVar.c;
        encoreTextView.setVisibility(0);
        Integer num = ydtVar.c;
        if (num != null) {
            this.c = num.intValue();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ydtVar.a);
        this.g = ydtVar;
        if (z) {
            encoreTextView2.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            encoreTextView2.setMaxLines(this.c);
        }
        ((EncoreTextView) zfrVar.b).setVisibility(z ? 0 : 8);
        encoreTextView2.setText(spannableStringBuilder);
        if (encoreTextView2.getWidth() > 0) {
            a(ydtVar, spannableStringBuilder);
        }
    }

    public final iu30 getEvent$src_main_java_com_spotify_creativeworkplatform_encore_encore() {
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        this.b = iu30Var;
    }

    public final void setEvent$src_main_java_com_spotify_creativeworkplatform_encore_encore(iu30 iu30Var) {
        this.b = iu30Var;
    }

    public static /* synthetic */ void getEvent$src_main_java_com_spotify_creativeworkplatform_encore_encore$annotations() {
    }
}
