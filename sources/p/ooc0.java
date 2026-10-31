package p;

import com.spotify.listuxplatform.datasourceimpl.ListDataSourceImpl$UnknownErrorException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ooc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ roc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ooc0(roc0 roc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = roc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        roc0 roc0Var = this.b;
        switch (b) {
            case 0:
                jy21 jy21Var = (jy21) obj;
                if (roc0.b(jy21Var)) {
                    return new huz(roc0Var.x, (byte) 10);
                }
                throw new ListDataSourceImpl$UnknownErrorException(jy21Var.b());
            default:
                jy21 jy21Var2 = (jy21) obj;
                if (roc0.b(jy21Var2)) {
                    return new huz(roc0Var.x, (byte) 10);
                }
                throw new ListDataSourceImpl$UnknownErrorException(jy21Var2.b());
        }
    }
}
