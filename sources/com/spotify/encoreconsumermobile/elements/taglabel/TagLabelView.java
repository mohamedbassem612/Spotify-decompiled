package com.spotify.encoreconsumermobile.elements.taglabel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.td6;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/taglabel/TagLabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_taglabel-taglabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TagLabelView extends AppCompatTextView implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public TagLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTextAppearance(2132018019);
        setGravity(17);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165914);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165913);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setBackgroundResource(2131233965);
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    public TagLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TagLabelView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TagLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
