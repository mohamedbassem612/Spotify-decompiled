package com.spotify.adsdisplay.uiusecases.adtag;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.lm5;
import p.qx21;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/adsdisplay/uiusecases/adtag/AdTagView;", "Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_adsdisplay_uiusecases_adtag-adtag"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class AdTagView extends EncoreTextView implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public AdTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTextAppearance(2132018001);
        setText(getResources().getString(2131952026));
        Resources resources = getResources();
        ThreadLocal threadLocal = qx21.a;
        setBackground(resources.getDrawable(2131230922, null));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130969892, typedValue, true);
        getBackground().setColorFilter(lm5.g(typedValue.resourceId, 11));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165287);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165286);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
    }

    public final /* synthetic */ void f(Object obj) {
        if (obj == null) {
            return;
        }
        bhn0.d();
    }

    public AdTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AdTagView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AdTagView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969258 : i);
    }
}
