package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class emo extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gmo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emo(gmo gmoVar, byte b) {
        super(0);
        this.a = b;
        this.b = gmoVar;
    }

    public final Object invoke() {
        byte b = this.a;
        gmo gmoVar = this.b;
        switch (b) {
            case 0:
                return new View(gmoVar.d);
            default:
                return gmoVar.b(gmoVar.a.k());
        }
    }
}
