package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m62 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PublishSubject b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m62(PublishSubject publishSubject, byte b) {
        super(0);
        this.a = b;
        this.b = publishSubject;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PublishSubject publishSubject = this.b;
        switch (b) {
            case 0:
                publishSubject.onNext(rih1Var);
                break;
            default:
                publishSubject.onNext(rih1Var);
                break;
        }
        return rih1Var;
    }
}
