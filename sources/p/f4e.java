package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f4e extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i4e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4e(i4e i4eVar, byte b) {
        super(0);
        this.a = b;
        this.b = i4eVar;
    }

    public final Object invoke() {
        byte b = this.a;
        i4e i4eVar = this.b;
        switch (b) {
            case 0:
                return (lg61) i4eVar.e.get();
            default:
                i4eVar.e.set(new lg61());
                i4eVar.c.a();
                return rih1.a;
        }
    }
}
