package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cpw extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpw(String str, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                cpw cpwVar = new cpw(str, lnmVar, (byte) 0);
                cpwVar.c = vr20Var;
                cpwVar.d = th;
                return cpwVar.invokeSuspend(rih1Var);
            case 1:
                cpw cpwVar2 = new cpw(str, lnmVar, (byte) 1);
                cpwVar2.c = vr20Var;
                cpwVar2.d = th;
                return cpwVar2.invokeSuspend(rih1Var);
            default:
                cpw cpwVar3 = new cpw(str, lnmVar, (byte) 2);
                cpwVar3.c = vr20Var;
                cpwVar3.d = th;
                return cpwVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.t("Could not load progress for " + str, th);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e331 e331Var = new e331(new m231(new RuntimeException(l1d.m("Failed to search for ", str), th2)));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(e331Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = this.c;
                Throwable th3 = this.d;
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
                Logger.e(th3, "Failed to observe pre-save state for %s", new Object[]{str});
                Boolean bool = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var3.emit(bool, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
