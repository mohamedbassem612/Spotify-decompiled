package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ube1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vbe1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tbe1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ube1(vbe1 vbe1Var, String str, tbe1 tbe1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vbe1Var;
        this.d = str;
        this.e = tbe1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ube1(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new ube1(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        m231 m231Var;
        byte b = this.a;
        m231 m231Var2 = rih1.a;
        tbe1 tbe1Var = this.e;
        vbe1 vbe1Var = this.c;
        m231 m231Var3 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    Object obj2 = ((e331) obj).a;
                    return m231Var2;
                }
                hm5.M(obj);
                fta ftaVar = (fta) vbe1Var.g;
                String str = this.d;
                String str2 = tbe1Var.b;
                String str3 = tbe1Var.a;
                this.b = true;
                try {
                    ((g310) ((g310) ((kly0) ftaVar.d).get()).b.b).a.a(new a310(new b310(new vol(str, (String) null), new lpl(str2, (bc71) null, (String) null, new bpl("", str3), (hmp0) null, (String) null, (String) null, 118)), ((yqg) ftaVar.b).b() / 1000));
                    m231Var = m231Var2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.d("BUZZ: ChatContributionService", new Object[]{"Failed to send text reaction to current chat", thA});
                }
                return m231Var == m231Var3 ? m231Var3 : m231Var2;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    Object obj3 = ((e331) obj).a;
                    return m231Var2;
                }
                hm5.M(obj);
                fta ftaVar2 = (fta) vbe1Var.g;
                String str4 = tbe1Var.b;
                String str5 = tbe1Var.a;
                sbe1 sbe1Var = tbe1Var.d;
                qbe1 qbe1Var = sbe1Var instanceof qbe1 ? (qbe1) sbe1Var : null;
                String str6 = qbe1Var != null ? qbe1Var.a : null;
                this.b = true;
                return ftaVar2.A(this.d, str4, str5, str6, this) == m231Var3 ? m231Var3 : m231Var2;
        }
    }
}
