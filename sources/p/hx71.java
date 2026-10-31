package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hx71 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx71(res resVar, byte b) {
        super(2);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gx71 gx71Var = (gx71) obj;
                xx71 xx71Var = (xx71) obj2;
                quc0 quc0Var = (quc0) resVar.f;
                dw71 dw71Var = xx71Var.c;
                int i = dw71Var.c;
                String strY = o4p1.y(gx71Var, quc0Var);
                dw71 dw71VarQ = o4p1.q(gx71Var);
                int i2 = dw71VarQ.c;
                if (!u890.j(gx71Var.a, xx71Var.a)) {
                    xx71 xx71VarA = o4p1.A(xx71.a(xx71Var, gx71Var.a, strY, dw71VarQ, null, false, null, false, false, null, null, mw71.d, 0L, 0L, true, false, null, null, 104952), i2 == 2);
                    return i2 == 2 ? Next.i(xx71VarA, Collections.singleton(new pw71(r4p1.x(xx71VarA)))) : Next.h(xx71VarA);
                }
                if (i2 == 1) {
                    dw71VarQ = new dw71(dw71VarQ.b, i, dw71VarQ.a);
                }
                int i3 = dw71VarQ.c;
                if (u890.j(strY, xx71Var.b) && dw71VarQ.equals(dw71Var)) {
                    return Next.j();
                }
                xx71 xx71VarA2 = xx71.a(xx71Var, null, strY, dw71VarQ, null, false, null, false, false, null, null, null, 0L, 0L, false, false, null, null, 131065);
                if (i == 2 || i3 != 2) {
                    return (i != 2 || i3 == 2) ? Next.h(xx71VarA2) : Next.h(o4p1.A(xx71VarA2, false));
                }
                xx71 xx71VarA3 = o4p1.A(xx71VarA2, true);
                return Next.i(xx71VarA3, Collections.singleton(new pw71(r4p1.x(xx71VarA3))));
            default:
                gx71 gx71Var2 = (gx71) obj;
                xx71 xx71VarA4 = xx71.a((xx71) obj2, gx71Var2.a, o4p1.y(gx71Var2, (quc0) resVar.f), o4p1.q(gx71Var2), null, false, null, false, false, null, null, null, 0L, 0L, false, false, null, null, 131064);
                return xx71VarA4.c.c == 2 ? First.c(xx71VarA4, Collections.singleton(new pw71(r4p1.x(xx71VarA4)))) : First.b(xx71.a(xx71VarA4, null, null, null, null, false, null, false, false, null, null, null, 0L, 0L, false, false, null, null, 131055));
        }
    }
}
