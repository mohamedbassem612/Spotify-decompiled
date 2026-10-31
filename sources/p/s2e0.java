package p;

import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.Event;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2e0 extends a8d1 implements vu30 {
    public Boolean a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y2e0 d;
    public final /* synthetic */ Effect.LoadHomeStructure e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2e0(Effect.LoadHomeStructure loadHomeStructure, lnm lnmVar, y2e0 y2e0Var) {
        super(2, lnmVar);
        this.d = y2e0Var;
        this.e = loadHomeStructure;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        s2e0 s2e0Var = new s2e0(this.e, lnmVar, this.d);
        s2e0Var.c = obj;
        return s2e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objS;
        Boolean bool;
        d9n d9nVar;
        Boolean bool2;
        Object objM;
        Event.GotSlotBasedHomeContent gotSlotBasedHomeContent;
        Event.FailedToLoadHomeStructure failedToLoadHomeStructure;
        cq60 cq60VarH;
        y2e0 y2e0Var = this.d;
        lmo lmoVar = y2e0Var.f;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        Effect.LoadHomeStructure loadHomeStructure = this.e;
        d9n d9nVar2 = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                objS = obj;
            } else {
                if (b != 2) {
                    if (b == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    if (b == 4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    if (b == 5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Boolean bool3 = this.a;
                hm5.M(obj);
                bool2 = null;
                d9nVar = d9nVar2;
                bool = bool3;
                objM = obj;
            }
            gotSlotBasedHomeContent = (Event.GotSlotBasedHomeContent) objM;
            if (gotSlotBasedHomeContent != null) {
                cq60VarH = n3p1.h(gotSlotBasedHomeContent.getLoadSource());
                if (cq60VarH != null) {
                    y2e0Var.k.i(cq60VarH);
                }
                this.c = bool2;
                this.a = bool2;
                this.b = (byte) 3;
                if (vr20Var.emit(gotSlotBasedHomeContent, this) == d9nVar) {
                    return d9nVar;
                }
            } else {
                failedToLoadHomeStructure = new Event.FailedToLoadHomeStructure(new NoSuchElementException("Slot-based home content flow completed without emitting"), loadHomeStructure.getLoadingStrategy(), lmoVar.a, bool.booleanValue());
                this.c = bool2;
                this.a = bool2;
                this.b = (byte) 4;
                if (vr20Var.emit(failedToLoadHomeStructure, this) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        hm5.M(obj);
        k1e0 k1e0Var = new k1e0(y2e0Var, null, (byte) 2);
        this.c = vr20Var;
        this.b = (byte) 1;
        objS = smo1.s(k1e0Var, this);
        if (objS == d9nVar2) {
            return d9nVar2;
        }
        mmr0 mmr0Var = (mmr0) objS;
        Boolean bool4 = (Boolean) mmr0Var.a;
        Boolean bool5 = (Boolean) mmr0Var.b;
        cd91 cd91Var = y2e0Var.b;
        boolean z = loadHomeStructure.getLoadingStrategy() == ice0.f;
        String str = lmoVar.a;
        boolean zBooleanValue = bool4.booleanValue();
        boolean zBooleanValue2 = bool5.booleanValue();
        String refreshToken = loadHomeStructure.getRefreshToken();
        String sessionId = loadHomeStructure.getSessionId();
        cd91Var.getClass();
        bool = bool4;
        d9nVar = d9nVar2;
        bool2 = null;
        lt20 lt20Var = new lt20(new sr0(h4p1.g(new bd91(cd91Var, sessionId, z, str, zBooleanValue, zBooleanValue2, refreshToken, null)), y2e0Var, bool, bool5, (byte) 12), new r2e0(loadHomeStructure, vr20Var, y2e0Var, null), (byte) 0);
        if (loadHomeStructure.getLoadingStrategy() == ice0.b) {
            this.c = vr20Var;
            this.a = bool;
            this.b = (byte) 2;
            objM = b5p1.m(lt20Var, this);
            if (objM == d9nVar) {
                return d9nVar;
            }
            gotSlotBasedHomeContent = (Event.GotSlotBasedHomeContent) objM;
            if (gotSlotBasedHomeContent != null) {
                cq60VarH = n3p1.h(gotSlotBasedHomeContent.getLoadSource());
                if (cq60VarH != null) {
                    y2e0Var.k.i(cq60VarH);
                }
                this.c = bool2;
                this.a = bool2;
                this.b = (byte) 3;
                if (vr20Var.emit(gotSlotBasedHomeContent, this) == d9nVar) {
                    return d9nVar;
                }
            } else {
                failedToLoadHomeStructure = new Event.FailedToLoadHomeStructure(new NoSuchElementException("Slot-based home content flow completed without emitting"), loadHomeStructure.getLoadingStrategy(), lmoVar.a, bool.booleanValue());
                this.c = bool2;
                this.a = bool2;
                this.b = (byte) 4;
                if (vr20Var.emit(failedToLoadHomeStructure, this) == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            l811 l811Var = new l811();
            l811Var.a = true;
            this.c = null;
            this.a = null;
            this.b = (byte) 5;
            u4p1.S(vr20Var);
            Object objCollect = lt20Var.collect(new ap70(vr20Var, l811Var, y2e0Var, (byte) 11), this);
            if (objCollect != d9nVar) {
                objCollect = rih1Var;
            }
            if (objCollect != d9nVar) {
                objCollect = rih1Var;
            }
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
