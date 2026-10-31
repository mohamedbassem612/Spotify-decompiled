package p;

import android.view.View;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator.WatchFeedPagerIndicatorView;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i2k extends udk1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public i2k() {
        this.a = (byte) 0;
        this.b = new ArrayList(3);
    }

    @Override // p.udk1
    public void a(int i) {
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((udk1) it.next()).a(i);
                    }
                } catch (ConcurrentModificationException e) {
                    k220.p("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // p.udk1
    public final void b(int i, int i2, float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((udk1) it.next()).b(i, i2, f);
                    }
                } catch (ConcurrentModificationException e) {
                    k220.p("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
            case 1:
                ((ViewPagerIndicator) obj).c(f, i);
                break;
            default:
                WatchFeedPagerIndicatorView watchFeedPagerIndicatorView = (WatchFeedPagerIndicatorView) obj;
                watchFeedPagerIndicatorView.h.x(f, i);
                watchFeedPagerIndicatorView.invalidate();
                break;
        }
    }

    @Override // p.udk1
    public void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((udk1) it.next()).c(i);
                    }
                } catch (ConcurrentModificationException e) {
                    k220.p("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
            case 1:
                ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) obj;
                viewPagerIndicator.c = i;
                viewPagerIndicator.postInvalidate();
                break;
        }
    }

    public void d(udk1 udk1Var) {
        ((ArrayList) this.b).add(udk1Var);
    }

    public void f(udk1 udk1Var) {
        ((ArrayList) this.b).remove(udk1Var);
    }

    public /* synthetic */ i2k(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    private final void e(int i) {
    }
}
