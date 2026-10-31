package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gsd1 extends yrd1 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd1(String str, Function0 function0) {
        super(str, true);
        this.f = function0;
    }

    @Override // p.yrd1
    public final long a() {
        byte b = this.e;
        Function0 function0 = this.f;
        switch (b) {
            case 0:
                function0.invoke();
                return -1L;
            default:
                return ((Number) function0.invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd1(String str, boolean z, Function0 function0) {
        super(str, z);
        this.f = function0;
    }
}
