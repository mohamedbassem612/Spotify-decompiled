package p;

import com.spotify.tome.pageactivity.PageActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j0r0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PageActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0r0(PageActivity pageActivity, byte b) {
        super(0);
        this.a = b;
        this.b = pageActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PageActivity pageActivity = this.b;
        switch (b) {
            case 0:
                pageActivity.x1 = true;
                return rih1Var;
            default:
                a1r0 a1r0Var = pageActivity.g1;
                if (a1r0Var != null) {
                    a1r0Var.g();
                    return rih1Var;
                }
                u890.C("pageActivityNavigator");
                throw null;
        }
    }
}
