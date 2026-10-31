package com.spotify.encoremobile.component.slottextview;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.pca;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/encoremobile/component/slottextview/EncoreTitleView;", "Lp/pca;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_encoremobile_component_slottextview-slottextview"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EncoreTitleView extends pca {
    public /* synthetic */ EncoreTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public EncoreTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2132018020);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncoreTitleView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }
}
