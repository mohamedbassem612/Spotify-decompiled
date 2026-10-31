package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.td6;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipsTransitionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/tlv;", "", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LibraryChipsTransitionView extends ConstraintLayout implements tlv {
    public /* synthetic */ LibraryChipsTransitionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    public LibraryChipsTransitionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipsTransitionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LibraryChipsTransitionView(Context context) {
        this(context, null, 0, 6, null);
    }
}
