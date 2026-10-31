package p;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nvg1 extends hab0 implements Function0 {
    public final /* synthetic */ ovg1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvg1(ovg1 ovg1Var) {
        super(0);
        this.a = ovg1Var;
    }

    public final Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a.a;
        return i >= 31 ? tw20.m(context.getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) context.getSystemService("vibrator");
    }
}
