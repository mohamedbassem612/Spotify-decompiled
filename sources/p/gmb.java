package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gmb extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmb(gw70 gw70Var, byte b) {
        super(4);
        this.a = b;
        this.b = gw70Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        gw70 gw70Var = this.b;
        switch (b) {
            case 0:
                return new b14((Context) obj2, gw70Var, (iu30) obj4);
            case 1:
                return new as0((Context) obj2, gw70Var, (iu30) obj4, (byte) 8);
            default:
                return new as0((Context) obj2, gw70Var, (iu30) obj4, (byte) 21);
        }
    }
}
