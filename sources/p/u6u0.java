package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6u0 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ Throwable c;

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u6u0 u6u0Var = new u6u0(3, (lnm) obj3);
        u6u0Var.b = (vr20) obj;
        u6u0Var.c = (Throwable) obj2;
        return u6u0Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        vr20 vr20Var = this.b;
        Throwable th = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Logger.d("Error observing player error", new Object[]{th});
            PlayerError playerErrorBuild = PlayerError.builder(ErrorType.UNKNOWN).build();
            this.b = null;
            this.c = null;
            this.a = true;
            Object objEmit = vr20Var.emit(playerErrorBuild, this);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
