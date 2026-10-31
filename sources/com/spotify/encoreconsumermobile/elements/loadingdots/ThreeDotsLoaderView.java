package com.spotify.encoreconsumermobile.elements.loadingdots;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.cdf0;
import p.fjc1;
import p.idd1;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/loadingdots/ThreeDotsLoaderView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/cdf0;", "d", "Lp/znb0;", "getDotAnimation", "()Lp/cdf0;", "dotAnimation", "src_main_java_com_spotify_encoreconsumermobile_elements_loadingdots-loadingdots"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ThreeDotsLoaderView extends AppCompatImageView implements tlv {
    public final idd1 d;

    public ThreeDotsLoaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new idd1(new fjc1(this, (byte) 20));
        setContentDescription(context.getString(2131955015));
        setImageDrawable(getDotAnimation());
        getDotAnimation().k();
    }

    private final cdf0 getDotAnimation() {
        return (cdf0) this.d.getValue();
    }

    @Override // p.mi90
    public final /* bridge */ /* synthetic */ void f(Object obj) {
    }

    public ThreeDotsLoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ThreeDotsLoaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ThreeDotsLoaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
