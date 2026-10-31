package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o8b0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8b0(p8b0 p8b0Var, byte b) {
        super(2);
        this.a = b;
        this.b = p8b0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ufd ufdVar;
        ngs0 ngs0Var;
        byte b = this.a;
        p8b0 p8b0Var = this.b;
        switch (b) {
            case 0:
                esw eswVar = p8b0Var.a;
                return new jpg0(eswVar.n.a(p8b0Var.b), t5b0.Q0);
            default:
                esw eswVar2 = p8b0Var.a;
                iu30 iu30Var = p8b0Var.b;
                mnp mnpVar = eswVar2.S;
                switch (eswVar2.T.a) {
                    case 0:
                        ufdVar = new ufd(new urk0((byte) 4), iu30Var);
                        break;
                    default:
                        ufdVar = new ufd(new urk0((byte) 4), iu30Var);
                        break;
                }
                switch (mnpVar.a) {
                    case 0:
                        ngs0Var = new ngs0(ufdVar);
                        break;
                    default:
                        ngs0Var = new ngs0(ufdVar);
                        break;
                }
                return new jpg0(f6o1.A(ngs0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), t5b0.S0);
        }
    }
}
