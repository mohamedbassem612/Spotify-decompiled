package p;

import android.provider.Settings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg(ch chVar, byte b) {
        super(0);
        this.a = b;
        this.b = chVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ch chVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(Settings.Global.getFloat(chVar.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
            default:
                return Boolean.valueOf(chVar.a());
        }
    }
}
