package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ts4 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts4(String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                ts4 ts4Var = new ts4(this.d, lnmVar, (byte) 0);
                ts4Var.c = obj;
                return ts4Var;
            case 1:
                ts4 ts4Var2 = new ts4(this.d, lnmVar, (byte) 1);
                ts4Var2.c = obj;
                return ts4Var2;
            default:
                ts4 ts4Var3 = new ts4(this.d, lnmVar, (byte) 2);
                ts4Var3.c = obj;
                return ts4Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                ogl1 ogl1Var = new ogl1(str);
                this.c = null;
                this.b = true;
                return vr20Var.emit(ogl1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
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
                tr80 tr80Var = new tr80(1, 20, 1);
                ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                lr80 it = tr80Var.iterator();
                while (((sr80) it).c) {
                    arrayList.add(new zx31(f4i1.c(it.nextInt(), "FindInShowLoading-")));
                }
                vh20 vh20Var = new vh20(str, new wdr0(arrayList));
                this.c = null;
                this.b = true;
                return vr20Var2.emit(vh20Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = (vr20) this.c;
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
                mmr0 mmr0Var = new mmr0(str, cji0.a);
                this.c = null;
                this.b = true;
                return vr20Var3.emit(mmr0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
