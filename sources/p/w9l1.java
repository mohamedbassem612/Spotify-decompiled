package p;

import android.os.Bundle;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w9l1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x9l1 b;
    public final /* synthetic */ o0i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9l1(x9l1 x9l1Var, o0i o0iVar, byte b) {
        super(1);
        this.a = b;
        this.b = x9l1Var;
        this.c = o0iVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0i o0iVar = this.c;
        x9l1 x9l1Var = this.b;
        switch (b) {
            case 0:
                s3t0 s3t0Var = (s3t0) obj;
                aod aodVar = x9l1Var.d;
                hp80 hp80Var = o0iVar.e;
                String str = s3t0Var.i;
                String str2 = s3t0Var.a;
                String str3 = s3t0Var.g;
                Integer num = s3t0Var.h;
                r6h1 r6h1VarB = ((bcl1) aodVar.b).i(hp80Var).b();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-watch-feed-carousel-card-entrypoint";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.c = num;
                x6h1VarI.e = str3;
                x6h1VarI.d = str2;
                y6h1 y6h1VarA = x6h1VarI.a();
                i8h1 i8h1Var = (i8h1) aodVar.c;
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1VarB;
                k7h1Var.c(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            default:
                s3t0 s3t0Var2 = (s3t0) obj;
                aod aodVar2 = x9l1Var.d;
                hp80 hp80Var2 = o0iVar.e;
                String str4 = s3t0Var2.a;
                String str5 = s3t0Var2.g;
                String str6 = s3t0Var2.i;
                Integer num2 = s3t0Var2.h;
                String str7 = s3t0Var2.c;
                String str8 = (String) o7h.q0(ihc1.Q0(str7, new String[]{"?"}, 0, 6));
                r6h1 r6h1VarB2 = ((bcl1) aodVar2.b).i(hp80Var2).b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-watch-feed-carousel-card-entrypoint";
                x6h1VarI2.f = "2.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = str6;
                x6h1VarI2.c = num2;
                x6h1VarI2.e = str5;
                x6h1VarI2.d = str4;
                x9l1Var.c.a(str7, ((i8h1) aodVar2.c).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), x6h1VarI2.a(), r6h1VarB2, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
        }
        return rih1Var;
    }
}
