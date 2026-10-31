package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class np7 extends a8d1 implements bv30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ PlayerState b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ fdc e;
    public final /* synthetic */ i7e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np7(fdc fdcVar, i7e0 i7e0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = fdcVar;
        this.f = i7e0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        np7 np7Var = new np7(this.e, this.f, (lnm) obj5);
        np7Var.a = zBooleanValue;
        np7Var.b = (PlayerState) obj2;
        np7Var.c = zBooleanValue2;
        np7Var.d = zBooleanValue3;
        return np7Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        boolean z = this.a;
        PlayerState playerState = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        hm5.M(obj);
        boolean z4 = this.e.b;
        i7e0 i7e0Var = this.f;
        if (!z4) {
            boolean z5 = playerState.isPlaying() && !playerState.isPaused();
            String str = ((k8e0) i7e0Var).c;
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            boolean zJ = u890.j(str, contextTrack != null ? l4o1.a0(contextTrack, "context_uri") : null);
            if (zJ && z5) {
                i2 = 1;
            } else {
                i = zJ ? 2 : 3;
            }
            return new dob1((k8e0) i7e0Var, z, z3, i2, z2);
        }
        i = ((k8e0) i7e0Var).k;
        i2 = i;
        return new dob1((k8e0) i7e0Var, z, z3, i2, z2);
    }
}
