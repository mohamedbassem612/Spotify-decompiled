package p;

import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class izb1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickyHeaderLinearLayoutManager b;
    public final /* synthetic */ s611 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izb1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, s611 s611Var, byte b) {
        super(0);
        this.a = b;
        this.b = stickyHeaderLinearLayoutManager;
        this.c = s611Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s611 s611Var = this.c;
        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.W0(s611Var));
            case 1:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.X0(s611Var));
            case 2:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.Y0(s611Var));
            case 3:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.W0(s611Var));
            case 4:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.X0(s611Var));
            default:
                return Integer.valueOf(stickyHeaderLinearLayoutManager.Y0(s611Var));
        }
    }
}
