package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sq6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq6(ldo ldoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                return ((Observable) ((w4b1) ldoVar.d).b).map(wcp1.g).toFlowable(BackpressureStrategy.d);
            default:
                ((qtr) obj).b(new lu(ldoVar, (lnm) null, (byte) 7));
                return rih1.a;
        }
    }
}
