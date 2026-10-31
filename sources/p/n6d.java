package p;

import android.content.Intent;
import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n6d extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6d(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                n6d n6dVar = new n6d(this.d, (lnm) obj3, (byte) 0);
                n6dVar.c = (Intent) obj;
                return n6dVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                n6d n6dVar2 = new n6d(this.d, (lnm) obj3, (byte) 1);
                n6dVar2.c = (Boolean) obj;
                n6dVar2.b = zBooleanValue;
                return n6dVar2.invokeSuspend(rih1Var);
            case 2:
                n6d n6dVar3 = new n6d(this.d, (lnm) obj3, (byte) 2);
                n6dVar3.c = (x610) obj;
                return n6dVar3.invokeSuspend(rih1Var);
            case 3:
                n6d n6dVar4 = new n6d(b2, (lnm) obj3, b2);
                n6dVar4.c = (vr20) obj;
                n6dVar4.d = (mr20) obj2;
                return n6dVar4.invokeSuspend(rih1Var);
            default:
                n6d n6dVar5 = new n6d((int) b2, (lnm) obj3, (byte) 4);
                n6dVar5.c = (vr20) obj;
                n6dVar5.d = (Object[]) obj2;
                return n6dVar5.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                Intent intent = (Intent) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                s6d s6dVar = (s6d) this.d;
                this.c = null;
                this.b = true;
                List list = s6d.e;
                Object objC = s6dVar.c(intent, this);
                return objC == d9nVar ? d9nVar : objC;
            case 1:
                Boolean bool = (Boolean) this.c;
                boolean zBooleanValue = this.b;
                hm5.M(obj);
                if (!((ffb0) this.d).b.g()) {
                    zBooleanValue = false;
                } else if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return yah0.m(zBooleanValue);
            case 2:
                x610 x610Var = (x610) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Single singleA = x610Var.c().k.a(q9u0.i(SignalCommand.create(((t461) this.d).b())));
                    this.c = null;
                    this.b = true;
                    obj = fc11.j(singleA, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                feh fehVar = (feh) obj;
                if (!fehVar.c()) {
                    kzq.Companion.getClass();
                    return jzq.b();
                }
                jzq jzqVar = kzq.Companion;
                String strG = fehVar.a().g();
                jzqVar.getClass();
                return jzq.a(strG);
            case 3:
                vr20 vr20Var = (vr20) this.c;
                mr20 mr20Var = (mr20) this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, mr20Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
                Object[] objArr = (Object[]) this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9 c9VarF = mqo1.F(f46.i0((av61[]) objArr));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(c9VarF, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6d(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
