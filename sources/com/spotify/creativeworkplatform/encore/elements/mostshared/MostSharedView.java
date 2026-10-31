package com.spotify.creativeworkplatform.encore.elements.mostshared;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/mostshared/MostSharedView;", "Landroid/widget/TextView;", "Lp/tlv;", "", "Lp/rih1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_creativeworkplatform_encore_elements_mostshared-mostshared"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MostSharedView extends TextView implements tlv {
    public MostSharedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextAppearance(2132018006);
    }

    public final void a(boolean z) {
        if (z) {
            setText(getContext().getString(2131958903));
            setTextColor(getContext().getColor(2131101506));
        }
        setVisibility(z ? 0 : 8);
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MostSharedView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ MostSharedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
