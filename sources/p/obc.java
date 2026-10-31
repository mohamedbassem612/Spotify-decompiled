package p;

import com.google.protobuf.StringValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class obc extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vn70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obc(vn70 vn70Var, byte b) {
        super(1);
        this.a = b;
        this.b = vn70Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vn70 vn70Var = this.b;
        switch (b) {
            case 0:
                vn70Var.q((StringValue) obj);
                break;
            default:
                vn70Var.n((StringValue) obj);
                break;
        }
        return rih1Var;
    }
}
