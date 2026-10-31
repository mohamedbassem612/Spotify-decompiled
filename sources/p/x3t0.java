package p;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator.WatchFeedPagerIndicatorView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x3t0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q9l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3t0(q9l1 q9l1Var, byte b) {
        super(1);
        this.a = b;
        this.b = q9l1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q9l1 q9l1Var = this.b;
        switch (b) {
            case 0:
                WatchFeedPagerIndicatorView watchFeedPagerIndicatorView = new WatchFeedPagerIndicatorView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                watchFeedPagerIndicatorView.setClipToOutline(true);
                ViewPager2 viewPager2 = q9l1Var.g;
                if (viewPager2 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                watchFeedPagerIndicatorView.O0 = viewPager2;
                i2k i2kVar = watchFeedPagerIndicatorView.i;
                if (i2kVar != null) {
                    viewPager2.c.f(i2kVar);
                }
                i2k i2kVar2 = new i2k(watchFeedPagerIndicatorView, (byte) 2);
                viewPager2.b(i2kVar2);
                watchFeedPagerIndicatorView.i = i2kVar2;
                return watchFeedPagerIndicatorView;
            case 1:
                ((bpb1) q9l1Var.n.b.c).m((Object) null, Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            default:
                if (((Boolean) obj).booleanValue()) {
                    q9l1Var.b.m((Object) null, o9l1.a);
                } else {
                    q9l1Var.b.m((Object) null, n9l1.a);
                }
                return rih1Var;
        }
    }
}
