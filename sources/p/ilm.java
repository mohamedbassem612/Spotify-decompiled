package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ilm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ klm b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ilm(klm klmVar, String str, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = klmVar;
        this.c = str;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        Function0 function0 = this.d;
        String str = this.c;
        klm klmVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return klmVar.c(str, function0);
    }
}
