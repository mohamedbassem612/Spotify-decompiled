package p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xn31 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo31 b;

    public /* synthetic */ xn31(bo31 bo31Var, byte b) {
        this.a = b;
        this.b = bo31Var;
    }

    public final void accept(Object obj) {
        Object value;
        Object value2;
        gz51 gz51VarA;
        byte b = this.a;
        bo31 bo31Var = this.b;
        switch (b) {
            case 0:
                bo31Var.g.c(((fo3) obj).d);
                break;
            case 1:
                nn3 nn3Var = (nn3) obj;
                bo31Var.d.b(nn3Var.d, nn3Var.e);
                break;
            case 2:
                bo31Var.h.a(((go3) obj).d);
                break;
            case 3:
                bo31Var.f3p.invoke();
                break;
            case 4:
                bo31Var.c.b(((co3) obj).d);
                break;
            case 5:
                bo3 bo3Var = (bo3) obj;
                td41 td41Var = bo31Var.c;
                dia1 dia1Var = bo3Var.d;
                uia1 uia1Var = bo3Var.e;
                td41Var.e(dia1Var, uia1Var.a, uia1Var.b);
                break;
            case 6:
                k9r k9rVar = bo31Var.r;
                jv51 jv51Var = ((to3) obj).d;
                bpb1 bpb1Var = ((zns) k9rVar.d).c;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sqg0.P((Map) value, new mmr0(jv51Var.a, jv51Var))));
                fn31.T((c9n) k9rVar.c, (o8n) null, 0, new clo(new n5s(jv51Var, null, (byte) 0), k9rVar, (lnm) null, (byte) 29), 3);
                break;
            case 7:
                k9r k9rVar2 = bo31Var.r;
                Set set = ((ln3) obj).d;
                bpb1 bpb1Var2 = ((zns) k9rVar2.d).b;
                do {
                    value2 = bpb1Var2.getValue();
                    gz51VarA = (gz51) value2;
                    if (gz51VarA.a) {
                        gz51VarA = gz51.a(gz51VarA, dm61.v0(gz51VarA.b, set), 1);
                    }
                } while (!bpb1Var2.k(value2, gz51VarA));
                break;
            default:
                q2u q2uVar = bo31Var.g;
                String str = ((do3) obj).d;
                y380 y380Var = bo31Var.i;
                Activity activity = q2uVar.a;
                mw40 mw40VarT = yoi1.T(activity, activity.getText(2131964087), activity.getText(2131964085));
                CharSequence text = activity.getText(2131964086);
                ln5 ln5Var = new ln5(y380Var, str, (byte) 8);
                mw40VarT.a = text;
                mw40VarT.c = ln5Var;
                mw40VarT.h = new kqs(y380Var, str, (byte) 1);
                mw40VarT.e = false;
                mw40VarT.b().b();
                break;
        }
    }
}
