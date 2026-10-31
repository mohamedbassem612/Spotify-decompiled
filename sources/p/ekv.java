package p;

import com.spotify.base.java.logging.Logger;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ekv extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public vr20 b;
    public byte c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekv(iu30 iu30Var, iu30 iu30Var2, lnm lnmVar) {
        super(3, lnmVar);
        this.e = iu30Var;
        this.f = iu30Var2;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        vr20 vr20Var = (vr20) obj;
        switch (b) {
            case 0:
                ekv ekvVar = new ekv((iu30) this.e, (iu30) obj4, (lnm) obj3);
                ekvVar.b = vr20Var;
                ekvVar.d = (Map) obj2;
                return ekvVar.invokeSuspend(rih1Var);
            case 1:
                ekv ekvVar2 = new ekv((xu30) obj4, (lnm) obj3);
                ekvVar2.d = vr20Var;
                ekvVar2.e = (Object[]) obj2;
                return ekvVar2.invokeSuspend(rih1Var);
            default:
                ekv ekvVar3 = new ekv((lnm) obj3, (vi11) obj4);
                ekvVar3.d = vr20Var;
                ekvVar3.e = obj2;
                return ekvVar3.invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj2;
                vr20 vr20Var = this.b;
                Map map = (Map) this.d;
                byte b2 = this.c;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            hm5.M(obj);
                        } else if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                if (((Boolean) ((iu30) this.e).invoke(map)).booleanValue()) {
                    Object objInvoke = iu30Var.invoke(map);
                    this.b = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (vr20Var.emit(objInvoke, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    this.b = vr20Var;
                    this.d = map;
                    this.c = (byte) 2;
                    if (hap1.i(2000L, this) != d9nVar) {
                    }
                }
                return d9nVar;
                Logger.k("EIS: Decoration sync timed out, using current decorations", new Object[0]);
                Object objInvoke2 = iu30Var.invoke(map);
                this.b = null;
                this.d = null;
                this.c = (byte) 3;
                if (vr20Var.emit(objInvoke2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                vr20 vr20Var2 = (vr20) this.d;
                Object[] objArr = (Object[]) this.e;
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.d = null;
                    this.e = null;
                    this.b = vr20Var2;
                    this.c = (byte) 1;
                    obj = ((xu30) obj2).invoke(obj3, obj4, this);
                    if (obj != d9nVar) {
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
                vr20Var2 = this.b;
                hm5.M(obj);
                this.d = null;
                this.e = null;
                this.b = null;
                this.c = (byte) 2;
                if (vr20Var2.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                vi11 vi11Var = (vi11) obj2;
                vr20 vr20Var3 = (vr20) this.d;
                Object obj5 = this.e;
                byte b4 = this.c;
                if (b4 == 0) {
                    hm5.M(obj);
                    mmr0 mmr0Var = (mmr0) obj5;
                    e090 e090Var = (e090) mmr0Var.a;
                    String str = (String) mmr0Var.b;
                    if (u890.j(e090Var, c090.a)) {
                        this.d = null;
                        this.e = null;
                        this.b = vr20Var3;
                        this.c = (byte) 1;
                        obj = vi11.b(vi11Var, str, this);
                        if (obj != d9nVar) {
                        }
                    } else if (u890.j(e090Var, d090.a)) {
                        this.d = null;
                        this.e = null;
                        this.b = vr20Var3;
                        this.c = (byte) 2;
                        obj = vi11.c(vi11Var, this);
                        if (obj != d9nVar) {
                        }
                    } else {
                        obj = u890.j(e090Var, yz80.a) ? vi11.a(str, vi11Var) : r6x.a;
                    }
                    return d9nVar;
                }
                if (b4 != 1 && b4 != 2) {
                    if (b4 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var3 = this.b;
                hm5.M(obj);
                this.d = null;
                this.e = null;
                this.b = null;
                this.c = (byte) 3;
                if (l4p1.s(vr20Var3, (mr20) obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekv(lnm lnmVar, vi11 vi11Var) {
        super(3, lnmVar);
        this.f = vi11Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekv(xu30 xu30Var, lnm lnmVar) {
        super(3, lnmVar);
        this.f = xu30Var;
    }
}
