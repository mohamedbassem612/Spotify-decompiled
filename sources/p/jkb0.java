package p;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkb0 extends hab0 implements iu30 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ q8n c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ pbr0 f;
    public final /* synthetic */ yqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkb0(c9n c9nVar, Context context, q8n q8nVar, long j, ven0 ven0Var, pbr0 pbr0Var, yqg yqgVar) {
        super(1);
        this.a = c9nVar;
        this.b = context;
        this.c = q8nVar;
        this.d = j;
        this.e = ven0Var;
        this.f = pbr0Var;
        this.g = yqgVar;
    }

    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            fn31.T(this.a, (o8n) null, 0, new gkb0(this.b, uri, this.c, this.d, this.e, this.f, this.g, null, (byte) 1), 3);
        }
        return rih1.a;
    }
}
