package p;

import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jzb1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickyHeaderLinearLayoutManager b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n611 d;
    public final /* synthetic */ s611 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzb1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, n611 n611Var, s611 s611Var, byte b) {
        super(0);
        this.a = b;
        this.b = stickyHeaderLinearLayoutManager;
        this.c = i;
        this.d = n611Var;
        this.e = s611Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s611 s611Var = this.e;
        n611 n611Var = this.d;
        int i = this.c;
        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.G0(i, n611Var, s611Var));
            default:
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.I0(i, n611Var, s611Var));
        }
    }
}
