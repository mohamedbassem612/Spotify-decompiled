package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gm0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm0(im0 im0Var, byte b) {
        super(4);
        this.a = b;
        this.b = im0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        im0 im0Var = this.b;
        switch (b) {
            case 0:
                return ((Observable) im0Var.d).firstOrError().zipWith(im0Var.b.z(), uwg.d).observeOn((Scheduler) im0Var.e).flatMapCompletable(new ymm0(im0Var, (byte) 4));
            default:
                return new vh(im0Var, (Context) obj2, (iu30) obj4);
        }
    }
}
