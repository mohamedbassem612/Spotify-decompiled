package com.spotify.encoreconsumermobile.elements.marqueetextview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/marqueetextview/MarqueeTextView;", "Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_marqueetextview-marqueetextview"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public class MarqueeTextView extends EncoreTextView implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setHorizontallyScrolling(true);
        setHorizontalFadingEdgeEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        setText((String) obj);
    }

    public final boolean isFocused() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super/*android.view.View*/.onFocusChanged(z, i, rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            super/*android.view.View*/.onWindowFocusChanged(z);
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MarqueeTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MarqueeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
