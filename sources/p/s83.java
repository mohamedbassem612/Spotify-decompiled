package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s83 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wto b;
    public final /* synthetic */ x83 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s83(byte b, x83 x83Var, wto wtoVar) {
        super(1);
        this.a = b;
        this.b = wtoVar;
        this.c = x83Var;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        wto wtoVar = this.b;
        x83 x83Var = this.c;
        switch (b) {
            case 0:
                return new hb3(wtoVar.a, ((t53) obj).a, x83Var.a.getString(2131952182));
            default:
                w53 w53Var = (w53) obj;
                uto utoVar = (uto) o7h.s0(wtoVar.b);
                String str2 = "";
                String strE = utoVar != null ? f4i1.e(utoVar.a, ":releases") : "";
                List list = w53Var.a;
                Context context = x83Var.a;
                if (utoVar != null && (str = utoVar.b) != null) {
                    str2 = str;
                }
                return new lm11(new hvl1(context.getString(2131961034, str2), 242, (String) null, x83Var.a.getString(2131961033), false, strE), list);
        }
    }
}
