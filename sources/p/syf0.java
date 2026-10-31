package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutConstrainedContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syf0(MainLayout mainLayout, byte b) {
        super(0);
        this.a = b;
        this.b = mainLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        l7c c9cVar;
        byte b = this.a;
        MainLayout mainLayout = this.b;
        switch (b) {
            case 0:
                Barrier bottomGradientBarrier = mainLayout.getBottomGradientBarrier();
                if (bottomGradientBarrier != null) {
                    return new xyf0(bottomGradientBarrier, ((Boolean) mainLayout.N1.getValue()).booleanValue());
                }
                return null;
            case 1:
                return dm61.B0(new View[]{mainLayout.getBottomGradient(), mainLayout.getBottomGradientWindowInsets(), mainLayout.getBottomGradientBlackFade(), mainLayout.getFragmentContainerInsetBottomSpacing()});
            case 2:
                vzf0.i.getClass();
                return Boolean.valueOf(vzf0.k || mainLayout.getMode() != qyf0.a);
            case 3:
                MainLayoutConstrainedContainerView navigationContainerWrapper = mainLayout.getNavigationContainerWrapper();
                return navigationContainerWrapper != null ? navigationContainerWrapper : mainLayout.getNavigationContainer();
            case 4:
                if (uyf0.a[mainLayout.getMode().ordinal()] == 1) {
                    return new i0g0(mainLayout);
                }
                return null;
            case 5:
                return dm61.B0(new ViewGroup[]{mainLayout.getNowPlayingMiniContainer(), mainLayout.getNowPlayingViewContainer(), mainLayout.getNowPlayingViewAttachmentsContainer()});
            default:
                int iOrdinal = mainLayout.getMode().ordinal();
                if (iOrdinal == 0) {
                    c9cVar = new c9c((byte) 15);
                } else if (iOrdinal == 1) {
                    c9cVar = new m4c((byte) 15);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    c9cVar = new l7c((byte) 15);
                }
                return new f2g0(mainLayout, c9cVar);
        }
    }
}
