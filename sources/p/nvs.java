package p;

import android.view.ViewStub;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nvs extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ odr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvs(odr odrVar, byte b) {
        super(0);
        this.a = b;
        this.b = odrVar;
    }

    public final Object invoke() {
        byte b = this.a;
        odr odrVar = this.b;
        switch (b) {
            case 0:
                return ((tzf1) odrVar.b).g();
            default:
                ViewStub viewStubE = ((tzf1) odrVar.b).e();
                viewStubE.setLayoutResource(2131625451);
                return viewStubE.inflate();
        }
    }
}
