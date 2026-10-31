package p;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v961 extends hab0 implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v961(Context context, Intent intent) {
        super(0);
        this.a = context;
        this.b = intent;
    }

    public final Object invoke() {
        this.a.startForegroundService(this.b);
        return rih1.a;
    }
}
