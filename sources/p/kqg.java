package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqg extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqg(lqg lqgVar, byte b) {
        super(1);
        this.a = b;
        this.b = lqgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lqg lqgVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lag lagVar = lqgVar.d;
                rng rngVar = rng.f;
                tpg tpgVar = tpg.i;
                rng rngVar2 = rng.d;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(rqg.class, r4o1.P(tpgVar, w7x.a, rngVar, rngVar2));
                qff qffVar = new qff(lagVar, (byte) 12);
                q4o.D.getClass();
                linkedHashMap.put(qqg.class, r4o1.Q(tpg.X, n4o.b, qffVar, rng.e));
                return rih1.a;
            default:
                lqgVar.j = fn31.T(lqgVar.i, (o8n) null, 0, new zx0(lqgVar, (lnm) null, (byte) 4), 3);
                return new rm(lqgVar, (byte) 21);
        }
    }
}
