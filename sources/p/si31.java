package p;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class si31 extends a8d1 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ti31 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si31(String str, ti31 ti31Var, int i, lnm lnmVar) {
        super(1, lnmVar);
        this.a = str;
        this.b = ti31Var;
        this.c = i;
    }

    public final lnm create(lnm lnmVar) {
        return new si31(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        hm5.M(obj);
        InputStream inputStreamOpenRawResource = this.b.a.getResources().openRawResource(this.c);
        try {
            inputStreamOpenRawResource.getClass();
            byte[] bArrK = o0c.K(inputStreamOpenRawResource);
            inputStreamOpenRawResource.close();
            return new mmr0(this.a, bArrK);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }
}
