package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pq0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                pq0 pq0Var = new pq0(b2, lnmVar, (byte) 0);
                pq0Var.b = th;
                pq0Var.invokeSuspend(rih1Var);
                break;
            case 1:
                pq0 pq0Var2 = new pq0(b2, lnmVar, (byte) 1);
                pq0Var2.b = th;
                pq0Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                pq0 pq0Var3 = new pq0(b2, lnmVar, (byte) 2);
                pq0Var3.b = th;
                pq0Var3.invokeSuspend(rih1Var);
                break;
            default:
                pq0 pq0Var4 = new pq0(b2, lnmVar, b2);
                pq0Var4.b = th;
                pq0Var4.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Throwable th = this.b;
                hm5.M(obj);
                n57.g("Error fetching ad from InStreamApi", th);
                break;
            case 1:
                Throwable th2 = this.b;
                hm5.M(obj);
                Logger.d("Categorization failed. Could not resolve category for AccessoryConnector: " + th2, new Object[0]);
                break;
            case 2:
                Throwable th3 = this.b;
                hm5.M(obj);
                Logger.e(th3, "LikedSongsElement stream failed", new Object[0]);
                break;
            default:
                Throwable th4 = this.b;
                hm5.M(obj);
                op71.x(getContext());
                n57.g("Cosmos: Ads ServerTimeProvider Request Failed: serverTimeUnavailable", th4);
                break;
        }
        return rih1Var;
    }
}
