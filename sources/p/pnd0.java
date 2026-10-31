package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.encoreconsumermobile.elements.badge.live.LiveEventBadgeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pnd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ LiveEventBadgeView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd0(Context context, LiveEventBadgeView liveEventBadgeView, byte b) {
        super(0);
        this.a = b;
        this.b = context;
        this.c = liveEventBadgeView;
    }

    public final Object invoke() {
        byte b = this.a;
        LiveEventBadgeView liveEventBadgeView = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                Drawable drawable = context.getDrawable(2131232979);
                if (drawable != null) {
                    drawable.setTintList(liveEventBadgeView.getEndedColor());
                    return drawable;
                }
                eg.m("Could not get drawable resource");
                return null;
            case 1:
                Drawable drawable2 = context.getDrawable(2131232979);
                if (drawable2 != null) {
                    drawable2.setTintList(liveEventBadgeView.getLiveColor());
                    return drawable2;
                }
                eg.m("Could not get drawable resource");
                return null;
            default:
                Drawable drawable3 = context.getDrawable(2131232979);
                if (drawable3 != null) {
                    drawable3.setTintList(liveEventBadgeView.getScheduledColor());
                    return drawable3;
                }
                eg.m("Could not get drawable resource");
                return null;
        }
    }
}
