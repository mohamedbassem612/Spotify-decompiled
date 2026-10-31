package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class snb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snb0(Context context, String str, byte b) {
        super(0);
        this.a = b;
        this.b = context;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        String str = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                return jch0.w(context, str);
            case 1:
                return jch0.w(context, u890.A(".preferences_pb", str));
            default:
                return v441.a.a(context, str);
        }
    }
}
