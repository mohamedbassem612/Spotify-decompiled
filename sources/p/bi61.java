package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bi61 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi61(byte b) {
        super(3, (lnm) null);
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
                bi61 bi61Var = new bi61(b2, lnmVar, (byte) 0);
                bi61Var.b = th;
                bi61Var.invokeSuspend(rih1Var);
                break;
            case 1:
                bi61 bi61Var2 = new bi61(b2, lnmVar, (byte) 1);
                bi61Var2.b = th;
                bi61Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                bi61 bi61Var3 = new bi61(b2, lnmVar, (byte) 2);
                bi61Var3.b = th;
                bi61Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                bi61 bi61Var4 = new bi61(b2, lnmVar, b2);
                bi61Var4.b = th;
                bi61Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                bi61 bi61Var5 = new bi61(b2, lnmVar, (byte) 4);
                bi61Var5.b = th;
                bi61Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                bi61 bi61Var6 = new bi61(b2, lnmVar, (byte) 5);
                bi61Var6.b = th;
                bi61Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                bi61 bi61Var7 = new bi61(b2, lnmVar, (byte) 6);
                bi61Var7.b = th;
                bi61Var7.invokeSuspend(rih1Var);
                break;
            case 7:
                bi61 bi61Var8 = new bi61(b2, lnmVar, (byte) 7);
                bi61Var8.b = th;
                bi61Var8.invokeSuspend(rih1Var);
                break;
            case 8:
                bi61 bi61Var9 = new bi61(b2, lnmVar, (byte) 8);
                bi61Var9.b = th;
                bi61Var9.invokeSuspend(rih1Var);
                break;
            default:
                bi61 bi61Var10 = new bi61(b2, lnmVar, (byte) 9);
                bi61Var10.b = th;
                bi61Var10.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Throwable th = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                n57.s("Failed to observe session state: " + th.getMessage() + ".");
                break;
            case 1:
                hm5.M(obj);
                n57.t("Failed to get cold startup reason", th);
                break;
            case 2:
                hm5.M(obj);
                n57.e("[Puffin] Error syncing cross device filters: " + th);
                break;
            case 3:
                hm5.M(obj);
                Logger.e(th, "GOS->Error while waiting for system route selection event", new Object[0]);
                break;
            case 4:
                hm5.M(obj);
                Logger.e(th, "Error listening for verification request", new Object[0]);
                break;
            case 5:
                hm5.M(obj);
                Logger.d("Video bandwidth advice stream error", new Object[]{th});
                break;
            case 6:
                hm5.M(obj);
                Logger.e(th, "Failed to observe coaching preferences", new Object[0]);
                break;
            case 7:
                hm5.M(obj);
                Logger.e(th, "Failed to observe watch coaching toggles", new Object[0]);
                break;
            case 8:
                hm5.M(obj);
                Logger.e(th, "Failed to observe workout preferences", new Object[0]);
                break;
            default:
                hm5.M(obj);
                Logger.e(th, "Failed to observe watch workout-mode toggles", new Object[0]);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi61(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
