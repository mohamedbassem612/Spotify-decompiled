package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dci0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dci0(qq qqVar, byte b) {
        super(0);
        this.a = b;
        this.b = qqVar;
    }

    public final Object invoke() {
        byte b = this.a;
        qq qqVar = this.b;
        switch (b) {
            case 0:
                return ycm.a((ycm) qqVar.i);
            case 1:
                return new xho((kko) qqVar.f);
            case 2:
                return ((myq0) qqVar.k).e();
            case 3:
                return ((aru0) qqVar.h).c();
            default:
                return ((e9g1) qqVar.m).create();
        }
    }
}
