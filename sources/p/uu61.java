package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uu61 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public vr20 b;
    public byte c;
    public /* synthetic */ vr20 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu61(lnm lnmVar, kv61 kv61Var, c380 c380Var, zu61 zu61Var) {
        super(3, lnmVar);
        this.f = kv61Var;
        this.g = c380Var;
        this.h = zu61Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                uu61 uu61Var = new uu61(lnmVar, (kv61) obj5, (c380) obj4, (zu61) this.h);
                uu61Var.d = vr20Var;
                uu61Var.e = obj2;
                return uu61Var.invokeSuspend(rih1Var);
            default:
                uu61 uu61Var2 = new uu61(lnmVar, (v0b1) obj5, (dg30) obj4);
                uu61Var2.d = vr20Var;
                uu61Var2.e = obj2;
                return uu61Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        PlayerState playerState;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        d9n d9nVar = d9n.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                vr20 vr20Var = this.d;
                Object obj4 = this.e;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                    zu61 zu61Var = (zu61) this.h;
                    this.d = null;
                    this.e = null;
                    this.b = vr20Var;
                    this.c = (byte) 1;
                    int i = kv61.r;
                    objG = ((kv61) obj3).g((c380) obj2, zu61Var, zBooleanValue, this);
                    if (objG != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var = this.b;
                hm5.M(obj);
                objG = obj;
                this.d = null;
                this.e = null;
                this.b = null;
                this.c = (byte) 2;
                if (l4p1.s(vr20Var, (mr20) objG, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                v0b1 v0b1Var = (v0b1) obj3;
                vr20 vr20Var2 = this.d;
                Object obj5 = this.e;
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    PlayerState playerState2 = (PlayerState) obj5;
                    String strContextUri = playerState2.contextUri();
                    if (strContextUri == null) {
                        strContextUri = "";
                    }
                    this.d = null;
                    this.e = null;
                    this.b = vr20Var2;
                    this.h = playerState2;
                    this.c = (byte) 1;
                    if (v0b1Var.b(strContextUri, this) != d9nVar) {
                        playerState = playerState2;
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PlayerState playerState3 = (PlayerState) this.h;
                vr20 vr20Var3 = this.b;
                hm5.M(obj);
                playerState = playerState3;
                vr20Var2 = vr20Var3;
                jge jgeVarE = hu20.e(new x010(yoi1.g(v0b1Var.d), new ht20(v0b1Var.a.m, new egv0(2, (lnm) null, (byte) 23)), new xx0(3, (lnm) null, (byte) 25), (byte) 1), new m53(v0b1Var, playerState, (dg30) obj2, (lnm) null, (byte) 14));
                this.d = null;
                this.e = null;
                this.b = null;
                this.h = null;
                this.c = (byte) 2;
                if (l4p1.s(vr20Var2, jgeVarE, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu61(lnm lnmVar, v0b1 v0b1Var, dg30 dg30Var) {
        super(3, lnmVar);
        this.f = v0b1Var;
        this.g = dg30Var;
    }
}
