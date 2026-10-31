package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uvc extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvc(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                uvc uvcVar = new uvc(b2, (lnm) obj3, (byte) 0);
                uvcVar.b = (m84) obj;
                uvcVar.c = (Integer) obj2;
                return uvcVar.invokeSuspend(rih1Var);
            case 1:
                uvc uvcVar2 = new uvc(b2, (lnm) obj3, (byte) 1);
                uvcVar2.b = (igk) obj;
                uvcVar2.c = (Boolean) obj2;
                return uvcVar2.invokeSuspend(rih1Var);
            case 2:
                uvc uvcVar3 = new uvc(b2, (lnm) obj3, (byte) 2);
                uvcVar3.b = (PlayerState) obj;
                uvcVar3.c = (Boolean) obj2;
                return uvcVar3.invokeSuspend(rih1Var);
            case 3:
                uvc uvcVar4 = new uvc(b2, (lnm) obj3, b2);
                uvcVar4.b = (cot0) obj;
                uvcVar4.c = (tb2) obj2;
                return uvcVar4.invokeSuspend(rih1Var);
            case 4:
                uvc uvcVar5 = new uvc(b2, (lnm) obj3, (byte) 4);
                uvcVar5.b = (mmr0) obj;
                uvcVar5.c = obj2;
                return uvcVar5.invokeSuspend(rih1Var);
            default:
                uvc uvcVar6 = new uvc(b2, (lnm) obj3, (byte) 5);
                uvcVar6.b = (cn41) obj;
                uvcVar6.c = (cn41) obj2;
                return uvcVar6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                m84 m84Var = (m84) this.b;
                Integer num = (Integer) this.c;
                hm5.M(obj);
                return oqn1.n(m84Var, num);
            case 1:
                igk igkVar = (igk) this.b;
                Boolean bool = (Boolean) this.c;
                hm5.M(obj);
                j6k j6kVarA = igkVar.a();
                lhe0 lhe0VarB = igkVar.b();
                bool.getClass();
                return new mgk(j6kVarA, lhe0VarB, bool.booleanValue());
            case 2:
                PlayerState playerState = (PlayerState) this.b;
                Boolean bool2 = (Boolean) this.c;
                hm5.M(obj);
                return yah0.m(!playerState.isPaused() && playerState.isPlaying() && bool2.booleanValue());
            case 3:
                cot0 cot0Var = (cot0) this.b;
                tb2 tb2Var = (tb2) this.c;
                hm5.M(obj);
                return new r7z(cot0Var, tb2Var);
            case 4:
                mmr0 mmr0Var = (mmr0) this.b;
                Object obj2 = this.c;
                hm5.M(obj);
                return oqn1.n(mmr0Var.b, obj2);
            default:
                cn41 cn41Var = (cn41) this.b;
                cn41 cn41Var2 = (cn41) this.c;
                hm5.M(obj);
                int i = ama1.a;
                return upn1.j(cn41Var, cn41Var2);
        }
    }
}
