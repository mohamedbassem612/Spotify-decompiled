package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jie1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jie1(vzx vzxVar, byte b) {
        super(4);
        this.a = b;
        this.b = vzxVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        vzx vzxVar = this.b;
        switch (b) {
            case 0:
                lie1 lie1Var = (lie1) obj3;
                lhe1 lhe1Var = lie1Var.b;
                if (lhe1Var == lhe1.a) {
                    ((PublishSubject) vzxVar.N0).onNext(rih1.a);
                }
                ((PublishSubject) vzxVar.O0).onNext(lhe1Var);
                return ((Observable) vzxVar.g).firstOrError().zipWith(vzxVar.b.z(), new ezb1(vzxVar, lie1Var)).observeOn(vzxVar.c).doOnSuccess(new z2a1(vzxVar, (byte) 14)).ignoreElement();
            default:
                return new wc3(vzxVar, (Context) obj2, (iu30) obj4);
        }
    }
}
