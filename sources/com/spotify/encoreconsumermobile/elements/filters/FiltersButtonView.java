package com.spotify.encoreconsumermobile.elements.filters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aqs;
import p.b8k1;
import p.f0o1;
import p.iu30;
import p.td6;
import p.tlv;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/filters/FiltersButtonView;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_filters-filters"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FiltersButtonView extends StateListAnimatorButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public FiltersButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackground(f0o1.j(context, 2131233071));
        ColorStateList colorStateListE = x74.E(context, 2131101368);
        WeakHashMap weakHashMap = b8k1.a;
        setBackgroundTintList(colorStateListE);
        setTextAppearance(2132018007);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166033);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166032);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setMaxLines(1);
        setGravity(17);
        setText(getResources().getString(2131956010));
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new aqs(iu30Var, (byte) 21));
    }

    public FiltersButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FiltersButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FiltersButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
