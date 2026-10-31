package p;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rcp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ pug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcp0(ui8 ui8Var, nx9 nx9Var, pug pugVar) {
        super(0);
        this.b = pugVar;
    }

    public final Object invoke() {
        byte b = this.a;
        pug pugVar = this.b;
        switch (b) {
            case 0:
                return (Map) pugVar.g;
            default:
                return Collections.singletonList(new fjg((rh61) new qcp0(0, (kly0) pugVar.p, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15).invoke(), (byte) 9));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcp0(pug pugVar) {
        super(0);
        this.b = pugVar;
    }
}
