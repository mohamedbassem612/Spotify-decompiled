package p;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class irk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jrk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ irk(jrk jrkVar, byte b) {
        super(0);
        this.a = b;
        this.b = jrkVar;
    }

    public final Object invoke() {
        byte b = this.a;
        jrk jrkVar = this.b;
        switch (b) {
            case 0:
                v1k v1kVar = jrkVar.b;
                return new tgk((gw70) v1kVar.b, new idd1(new vjh(v1kVar, (byte) 14)), (lo60) v1kVar.c);
            default:
                return (FrameLayout) b8k1.n(jrkVar.g, 2131429104);
        }
    }
}
