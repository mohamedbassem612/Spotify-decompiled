package com.spotify.encoreconsumermobile.elements.find;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.cqo;
import p.cvr;
import p.eg;
import p.eg7;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.kln1;
import p.lgh;
import p.q0t;
import p.tlv;
import p.u681;
import p.wg20;
import p.x29;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/find/FindInContextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_find-find"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FindInContextView extends ConstraintLayout implements tlv {
    public final View T0;
    public final EditText U0;
    public final ClearButtonView V0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View, com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView] */
    public FindInContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(2131624644, (ViewGroup) this, true);
        this.T0 = viewInflate;
        AppCompatImageView appCompatImageViewFindViewById = viewInflate.findViewById(2131430824);
        EditText editText = (EditText) viewInflate.findViewById(2131428585);
        this.U0 = editText;
        ?? r7 = (ClearButtonView) viewInflate.findViewById(2131428096);
        this.V0 = r7;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(context.getDrawable(2131233072));
        float dimension = getContext().getResources().getDimension(2131165724);
        int color = getContext().getColor(2131104462);
        g4b1 g4b1Var = new g4b1(getContext(), j4b1.W5, dimension);
        g4b1Var.b(color);
        appCompatImageViewFindViewById.setImageDrawable(g4b1Var);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new eg7(this, (byte) 14));
        } else {
            r7.setVisibility(editText.getText().length() > 0 ? 0 : 8);
        }
    }

    public final void f(Object obj) {
        this.U0.setText("");
        y(((wg20) obj).a);
    }

    public final void n(iu30 iu30Var) {
        this.V0.setOnClickListener(new cvr(iu30Var, this, (byte) 29));
        TextWatcher lghVar = new lgh(this, iu30Var, (byte) 2);
        EditText editText = this.U0;
        editText.addTextChangedListener(lghVar);
        editText.setOnKeyListener(new q0t(iu30Var, (byte) 1));
        editText.setOnFocusChangeListener(new x29(iu30Var, (byte) 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(kln1 kln1Var) {
        String string;
        if (kln1Var instanceof u681) {
            string = getResources().getString(2131956017);
        } else {
            if (!(kln1Var instanceof cqo)) {
                eg.o();
                return;
            }
            string = ((cqo) kln1Var).b;
        }
        string.getClass();
        EditText editText = this.U0;
        editText.setHint(string);
        editText.setContentDescription(string);
        tlv tlvVar = this.V0;
        tlvVar.setContentDescription(tlvVar.getContext().getString(2131953907, string));
    }

    public FindInContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FindInContextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FindInContextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
