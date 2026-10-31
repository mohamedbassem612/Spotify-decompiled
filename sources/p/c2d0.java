package p;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c2d0 extends a8d1 implements xu30 {
    public String a;
    public String b;
    public boolean c;
    public /* synthetic */ Intent d;
    public /* synthetic */ th61 e;
    public final /* synthetic */ d2d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2d0(d2d0 d2d0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.f = d2d0Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c2d0 c2d0Var = new c2d0(this.f, (lnm) obj3);
        c2d0Var.d = (Intent) obj;
        c2d0Var.e = (th61) obj2;
        return c2d0Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        String str;
        String str2;
        Object m231Var;
        Intent intent = this.d;
        th61 th61Var = this.e;
        boolean z = this.c;
        d2d0 d2d0Var = this.f;
        if (!z) {
            hm5.M(obj);
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(intent.getDataString());
            v1d0 v1d0VarC = d2d0Var.c(intent, th61Var.a, d2d0.d(s4b1VarX));
            if (v1d0VarC instanceof v1d0) {
                return v1d0VarC.a();
            }
            if (!(v1d0VarC instanceof w1d0)) {
                eg.o();
                return null;
            }
            String strA = ((w1d0) v1d0VarC).a();
            String strD = s4b1VarX.d();
            if (strD == null || strD.length() == 0) {
                d2d0Var.b(new z1d0(3), intent, strA);
                return lfb.m(yyc0.class, fzc0.a(new fzc0(strA, intent), (String) null, dzc0.a, 3));
            }
            try {
                q8n q8nVar = (q8n) d2d0Var.d;
                try {
                    b2d0 b2d0Var = new b2d0(d2d0Var, strA, strD, (lnm) null, (byte) 1);
                    this.d = intent;
                    this.e = null;
                    this.a = strA;
                    this.b = strD;
                    this.c = true;
                    obj = c921.H(q8nVar, b2d0Var, this);
                    d9n d9nVar = d9n.a;
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    str = strA;
                    str2 = strD;
                } catch (Throwable th2) {
                    th = th2;
                    str = strA;
                    str2 = strD;
                    m231Var = new m231(th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.b;
            str = this.a;
            try {
                hm5.M(obj);
            } catch (Throwable th4) {
                th = th4;
                m231Var = new m231(th);
            }
        }
        m231Var = (String) obj;
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str3 = (String) m231Var;
        if (str3 != null) {
            d2d0Var.b(new z1d0(2), intent, str);
            return lfb.m(yyc0.class, fzc0.a(new fzc0(str, intent), (String) null, new czc0(str2, str3), 3));
        }
        d2d0Var.b(new y1d0(4), intent, str2);
        Set set2 = s4b1.f;
        return lfb.j(uic.x(str2));
    }
}
