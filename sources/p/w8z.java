package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w8z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ymd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8z(ymd0 ymd0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ymd0Var;
    }

    public final Object invoke(Object obj) {
        hoj0 hoj0VarC;
        goj0 goj0VarA;
        mdz mdzVar;
        Set setA;
        byte b = this.a;
        ymd0 ymd0Var = this.b;
        switch (b) {
            case 0:
                String str = ((uv11) obj).a;
                ioj0 ioj0Var = (ioj0) ymd0Var.e();
                boolean z = false;
                if (ioj0Var != null && (hoj0VarC = ioj0Var.c(mdz.class, str)) != null && (goj0VarA = hoj0VarC.a()) != null && (mdzVar = (mdz) goj0VarA.a) != null && (setA = mdzVar.a()) != null && setA.contains(jdz.b)) {
                    z = true;
                }
                return new qr11(str, xpn1.r(str, ymd0Var), z);
            case 1:
                String str2 = ((uv11) obj).a;
                return new uho(str2, (String) null, (tho) null, (nho) null, xpn1.r(str2, ymd0Var), (Function0) null, 238);
            case 2:
                uv11 uv11Var = (uv11) obj;
                String str3 = uv11Var.a;
                return new gvu(8, str3, uv11Var.b, false, xpn1.r(str3, ymd0Var));
            case 3:
                return new hnd0(ymd0Var);
            default:
                return new hnd0(ymd0Var);
        }
    }
}
