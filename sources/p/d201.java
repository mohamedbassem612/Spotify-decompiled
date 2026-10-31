package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d201 extends hab0 implements iu30 {
    public final /* synthetic */ MobiusLoop.Controller a;
    public final /* synthetic */ e201 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d201(MobiusLoop.Controller controller, e201 e201Var) {
        super(1);
        this.a = controller;
        this.b = e201Var;
    }

    public final Object invoke(Object obj) {
        return new w9d0(this.a, this.b, (byte) 13);
    }
}
