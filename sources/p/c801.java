package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c801 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ ContextTrack c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c801(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                c801 c801Var = new c801(i, (lnm) obj3, (byte) 0);
                c801Var.b = zBooleanValue;
                c801Var.c = (ContextTrack) obj2;
                return c801Var.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                c801 c801Var2 = new c801(i, (lnm) obj3, (byte) 1);
                c801Var2.b = zBooleanValue2;
                c801Var2.c = (ContextTrack) obj2;
                return c801Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                ContextTrack contextTrack = this.c;
                hm5.M(obj);
                if (z2) {
                    contextTrack.getClass();
                    if (!b3o1.w(contextTrack)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                boolean z3 = this.b;
                ContextTrack contextTrack2 = this.c;
                hm5.M(obj);
                if (z3) {
                    contextTrack2.getClass();
                    if (!b3o1.w(contextTrack2) && !Boolean.parseBoolean((String) contextTrack2.metadata().get("transcripts_disallowed_in_content_layer"))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
