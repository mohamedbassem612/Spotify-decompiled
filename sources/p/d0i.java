package p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d0i extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g0i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0i(g0i g0iVar, byte b) {
        super(0);
        this.a = b;
        this.b = g0iVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g0i g0iVar = this.b;
        switch (b) {
            case 0:
                return new we41(g0iVar.getApplication(), g0iVar, g0iVar.getIntent() != null ? g0iVar.getIntent().getExtras() : null);
            case 1:
                g0iVar.reportFullyDrawn();
                return rih1.a;
            default:
                r1q0 r1q0Var = new r1q0(new fe(g0iVar, (byte) 24));
                if (Build.VERSION.SDK_INT >= 33) {
                    byte b2 = 0;
                    if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                        ((f0i) g0iVar).a.a(new zzh(r1q0Var, g0iVar, b2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new e0i(g0iVar, r1q0Var, b2));
                    }
                }
                return r1q0Var;
        }
    }
}
