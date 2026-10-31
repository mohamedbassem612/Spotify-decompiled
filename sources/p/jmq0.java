package p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jmq0 implements g50 {
    public final /* synthetic */ byte a;
    public final dg30 b;
    public final gmq0 c;

    public /* synthetic */ jmq0(dg30 dg30Var, gmq0 gmq0Var, byte b) {
        this.a = b;
        this.b = dg30Var;
        this.c = gmq0Var;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                Serializable serializable = bundle.getSerializable("CLICK_ACTION_METADATA");
                fn31.T(cto1.q(dg30Var), (o8n) null, 0, new wkk0(this, str2, serializable instanceof HashMap ? (HashMap) serializable : null, null, (byte) 27), 3);
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                Serializable serializable2 = bundle.getSerializable("CLICK_ACTION_METADATA");
                fn31.T(cto1.q(dg30Var), (o8n) null, 0, new wkk0(this, str2, serializable2 instanceof HashMap ? (HashMap) serializable2 : null, null, (byte) 28), 3);
                break;
        }
    }
}
