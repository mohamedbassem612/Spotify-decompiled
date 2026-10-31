package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kn1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn1(String str, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                kn1 kn1Var = new kn1(str, lnmVar, (byte) 0);
                kn1Var.b = th;
                kn1Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                kn1 kn1Var2 = new kn1(str, lnmVar, (byte) 1);
                kn1Var2.b = th;
                kn1Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                kn1 kn1Var3 = new kn1(str, lnmVar, (byte) 2);
                kn1Var3.b = th;
                kn1Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                kn1 kn1Var4 = new kn1(str, lnmVar, (byte) 3);
                kn1Var4.b = th;
                kn1Var4.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                kn1 kn1Var5 = new kn1(str, lnmVar, (byte) 4);
                kn1Var5.b = th;
                kn1Var5.invokeSuspend(rih1Var);
                throw null;
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        Throwable th = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Logger.e(th, f4i1.f("Metadata loading failed for Uri: ", str, "."), new Object[0]);
                return rih1Var;
            case 1:
                hm5.M(obj);
                Logger.e(th, "Failed to load party metadata for ".concat(str), new Object[0]);
                return rih1Var;
            case 2:
                hm5.M(obj);
                Logger.e(th, "Chat stream failed for party %s", new Object[]{str});
                return rih1Var;
            case 3:
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                Logger.e(th, str, new Object[0]);
                return rih1Var;
            default:
                hm5.M(obj);
                throw new IllegalStateException("Error while receiving pubsub message for ident: ".concat(str), th);
        }
    }
}
