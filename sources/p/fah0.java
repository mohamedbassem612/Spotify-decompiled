package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fah0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ UnmatchedItem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fah0(iu30 iu30Var, UnmatchedItem unmatchedItem, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = unmatchedItem;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        UnmatchedItem unmatchedItem = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(unmatchedItem.getId());
                break;
            default:
                iu30Var.invoke(unmatchedItem.getId());
                break;
        }
        return rih1Var;
    }
}
