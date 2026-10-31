package p;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y4e0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tqt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4e0(tqt tqtVar, byte b) {
        super(0);
        this.a = b;
        this.b = tqtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        tqt tqtVar = this.b;
        switch (b) {
            case 0:
                try {
                    String strH = y520.H(new File("/proc/self/stat"));
                    tqtVar.b = 0;
                    return strH;
                } catch (IOException e) {
                    tqtVar.D(e);
                    return null;
                }
            default:
                try {
                    Integer numC0 = nhc1.c0(ihc1.e1(y520.H(new File("/proc/self/oom_score_adj"))).toString());
                    if (numC0 == null) {
                        tqtVar.D((Throwable) null);
                    } else {
                        tqtVar.b = 0;
                    }
                    return numC0;
                } catch (IOException e2) {
                    tqtVar.D(e2);
                    return null;
                }
        }
    }
}
