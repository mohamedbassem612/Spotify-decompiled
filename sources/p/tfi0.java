package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tfi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfi0(String str, String str2, long j, String str3, Locale locale, long j2, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = j;
        this.f = str3;
        this.g = locale;
        this.e = j2;
        this.h = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ira iraVar = (ira) obj3;
                int iP = czo1.p(1);
                String str = this.b;
                String str2 = this.c;
                fqo1.z(str, str2, (ArrayList) serializable, (lee1) obj4, this.d, this.e, iraVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                String str3 = this.b;
                String str4 = this.c;
                long j = this.d;
                long j2 = this.e;
                grn1.f(str3, str4, j, (String) serializable, (Locale) obj4, j2, (qim0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfi0(String str, String str2, ArrayList arrayList, lee1 lee1Var, long j, long j2, ira iraVar, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.f = arrayList;
        this.g = lee1Var;
        this.d = j;
        this.e = j2;
        this.h = iraVar;
    }
}
