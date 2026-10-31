package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzx extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzx(vzx vzxVar, byte b) {
        super(4);
        this.a = b;
        this.b = vzxVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        vzx vzxVar = this.b;
        switch (b) {
            case 0:
                return Single.zip(((Flowable) ((idd1) vzxVar.O0).getValue()).z(), vzxVar.b.z(), drm0.Z0).observeOn(vzxVar.c).flatMapCompletable(new gmt(vzxVar, (tqw) obj4, (byte) 27));
            default:
                return new wc3(vzxVar, (iu30) obj4);
        }
    }
}
