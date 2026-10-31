package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zko extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dlo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zko(dlo dloVar, byte b) {
        super(0);
        this.a = b;
        this.b = dloVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dlo dloVar = this.b;
        switch (b) {
            case 0:
                mko mkoVar = dloVar.c;
                if (mkoVar != null) {
                    mkoVar.start();
                    return rih1Var;
                }
                u890.C("curationStateApiService");
                throw null;
            default:
                mko mkoVar2 = dloVar.c;
                if (mkoVar2 != null) {
                    mkoVar2.stop();
                    return rih1Var;
                }
                u890.C("curationStateApiService");
                throw null;
        }
    }
}
