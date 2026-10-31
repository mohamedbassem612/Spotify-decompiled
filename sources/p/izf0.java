package p;

import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainLayoutContentContainerView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izf0(MainLayoutContentContainerView mainLayoutContentContainerView, byte b) {
        super(0);
        this.a = b;
        this.b = mainLayoutContentContainerView;
    }

    public final Object invoke() {
        byte b = this.a;
        o6 o6Var = this.b;
        switch (b) {
            case 0:
                return z1a1.b(o6Var.getContext());
            default:
                return hap1.w(o6Var);
        }
    }
}
