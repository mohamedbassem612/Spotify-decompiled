package p;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q2c extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k4m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2c(k4m k4mVar, byte b) {
        super(1);
        this.a = b;
        this.b = k4mVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        k4m k4mVar = this.b;
        switch (b) {
            case 0:
                ((ContentRestrictionBadgeView) obj).c(k4mVar);
                return rih1.a;
            case 1:
                ContentRestrictionBadgeView contentRestrictionBadgeView = new ContentRestrictionBadgeView((Context) obj, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
                contentRestrictionBadgeView.c(k4mVar);
                return contentRestrictionBadgeView;
            default:
                ContentRestrictionBadgeView contentRestrictionBadgeView2 = new ContentRestrictionBadgeView((Context) obj, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
                contentRestrictionBadgeView2.c(k4mVar);
                return contentRestrictionBadgeView2;
        }
    }
}
