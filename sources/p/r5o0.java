package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r5o0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5o0(sbk sbkVar, byte b) {
        super(4);
        this.a = b;
        this.b = sbkVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        sbk sbkVar = this.b;
        switch (b) {
            case 0:
                return ((Flowable) sbkVar.c).z().flatMapCompletable(new ruc0(sbkVar, (byte) 22));
            default:
                return new wc3(sbkVar, (iu30) obj4);
        }
    }
}
