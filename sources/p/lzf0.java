package p;

import android.content.Context;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ozf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzf0(ozf0 ozf0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ozf0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ozf0 ozf0Var = this.b;
        switch (b) {
            case 0:
                rzf0 rzf0Var = (rzf0) obj;
                int iOrdinal = ozf0Var.b.getMode().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return rzf0Var.d();
                }
                if (iOrdinal == 2) {
                    return poo1.r(0, 14);
                }
                eg.o();
                return null;
            case 1:
                rzf0 rzf0Var2 = (rzf0) obj;
                int iOrdinal2 = ozf0Var.b.getMode().ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    return rzf0Var2.d();
                }
                if (iOrdinal2 == 2) {
                    return poo1.r(0, 14);
                }
                eg.o();
                return null;
            case 2:
                MainLayoutFragmentContainerView mainLayoutFragmentContainerView = new MainLayoutFragmentContainerView((Context) obj);
                mainLayoutFragmentContainerView.setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view(ozf0Var.b.getLegacyOverlayPageInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view());
                return mainLayoutFragmentContainerView;
            case 3:
                return new t6p0(new mzf0(ozf0Var, (byte) 1), (Integer) obj);
            case 4:
                int iOrdinal3 = ((c7p0) obj).ordinal();
                if (iOrdinal3 == 0) {
                    return gio1.b(new u6p0(new mzf0(ozf0Var, (byte) 0)));
                }
                if (iOrdinal3 == 1) {
                    return new ypg0(new lzf0(ozf0Var, (byte) 3), d5p1.t(new zx60(h4p1.f(new m2a0(ozf0Var, (lnm) null, (byte) 19)), (byte) 19), ozf0Var.a, new alb1(0L, Long.MAX_VALUE), (Object) null));
                }
                eg.o();
                return null;
            default:
                if (u890.j((Boolean) obj, Boolean.TRUE)) {
                    return new q6p0(new p6p0(ozf0Var.b()));
                }
                return null;
        }
    }
}
