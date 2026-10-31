package p;

import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jzy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kzy b;
    public final /* synthetic */ tto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzy(kzy kzyVar, tto0 tto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kzyVar;
        this.c = tto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tto0 tto0Var = this.c;
        kzy kzyVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = kzyVar.c;
                String str = tto0Var.c.c;
                cvy0 cvy0Var = tto0Var.h;
                return wmyVar.q("PLAY_AND_NAVIGATE_INTENT_ACTION", AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE, new bet0(iIntValue, cvy0Var.a, cvy0Var.c, str, cvy0Var.b));
            case 1:
                return t3p1.w(kzyVar.c, ((Number) obj).intValue(), tto0Var.c.c, tto0Var.h);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                wmy wmyVar2 = kzyVar.c;
                cvy0 cvy0Var2 = tto0Var.h;
                return wmyVar2.m(iIntValue2, cvy0Var2.a, cvy0Var2.c, cvy0Var2.b, null);
        }
    }
}
