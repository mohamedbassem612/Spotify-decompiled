package p;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xbx0 extends a8d1 implements xu30 {
    public s4b1 a;
    public boolean b;
    public /* synthetic */ Intent c;
    public /* synthetic */ th61 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ o030 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbx0(iu30 iu30Var, o030 o030Var, boolean z, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.e = iu30Var;
        this.f = o030Var;
        this.g = z;
        this.h = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.g;
        String str = this.h;
        xbx0 xbx0Var = new xbx0(this.e, this.f, z, str, (lnm) obj3);
        xbx0Var.c = (Intent) obj;
        xbx0Var.d = (th61) obj2;
        return xbx0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        s4b1 s4b1VarX;
        Intent intent = this.c;
        th61 th61Var = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Set set = s4b1.f;
            s4b1VarX = uic.x(intent.getDataString());
            mmr0 mmr0Var = (mmr0) this.e.invoke(s4b1VarX);
            if (mmr0Var != null) {
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                sbi1 sbi1Var = this.f.b;
                this.c = intent;
                this.d = th61Var;
                this.a = s4b1VarX;
                this.b = true;
                obj = sbi1Var.b(str, str2, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            }
            return crn0.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        s4b1VarX = this.a;
        hm5.M(obj);
        String str3 = (String) obj;
        if (str3 == null) {
            String strD = s4b1VarX.D();
            if (strD != null) {
                return new hrn0(hkh1.class, new kkh1(strD, intent.getExtras()), ikh1.a);
            }
        } else if (!this.g || str3.equals(th61Var.a)) {
            Set set2 = s4b1.f;
            String strZ = uic.C(str3, this.h).z();
            if (strZ != null) {
                return new hrn0(rbx0.class, new sbx0(strZ, th61Var.a), a6w0.a);
            }
        }
        return crn0.a;
    }
}
