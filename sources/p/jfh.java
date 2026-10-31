package p;

import com.spotify.mobius.EventSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jfh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EventSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jfh(EventSource eventSource, byte b) {
        super(1);
        this.a = b;
        this.b = eventSource;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        EventSource eventSource = this.b;
        switch (b) {
            case 0:
                cas casVar = (a7m0) obj;
                casVar.a = rng.T0;
                casVar.d = nyf.T0;
                casVar.b = eventSource;
                break;
            case 1:
                cas casVar2 = (a7m0) obj;
                casVar2.a = cps0.V0;
                casVar2.b = eventSource;
                casVar2.d = v0r0.b1;
                break;
            default:
                cas casVar3 = (a7m0) obj;
                casVar3.a = h6d1.a;
                casVar3.b = eventSource;
                break;
        }
        return rih1Var;
    }
}
