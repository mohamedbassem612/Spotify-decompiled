package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mtw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mtw(maa maaVar, byte b) {
        super(0);
        this.a = b;
        this.b = maaVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.getBehavior().b((Object) null, (dts) null, (String) null);
    }
}
