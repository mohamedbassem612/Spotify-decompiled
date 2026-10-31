package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uhg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vhg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uhg0(vhg0 vhg0Var, byte b) {
        super(0);
        this.a = b;
        this.b = vhg0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vhg0 vhg0Var = this.b;
        switch (b) {
            case 0:
                xf01 xf01Var = vhg0Var.a;
                qpc qpcVar = xf01Var.c;
                if (qpcVar != null) {
                    try {
                        qpcVar.a();
                    } catch (IOException unused) {
                        Logger.d("Could not clear cache, %s", new Object[]{xf01Var.a.getAbsolutePath()});
                    }
                }
                break;
            default:
                vhg0Var.b.clearCache();
                break;
        }
        return rih1Var;
        return rih1Var;
    }
}
