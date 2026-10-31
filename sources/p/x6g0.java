package p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x6g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6g0(z6g0 z6g0Var, byte b) {
        super(2);
        this.a = b;
        this.b = z6g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        r6g0 r6g0Var;
        i7g0 i7g0Var;
        i7g0 i7g0Var2;
        byte b = this.a;
        i7g0 i7g0Var3 = i7g0.a;
        z6g0 z6g0Var = this.b;
        switch (b) {
            case 0:
                w0e0 w0e0Var = (w0e0) obj;
                Bundle bundle = (Bundle) obj2;
                r6g0Var = bundle != null ? (r6g0) jhc1.t(bundle, "ManageBlockedContentModel", r6g0.class) : null;
                e7g0 e7g0Var = z6g0Var.f;
                String str = e7g0Var.a;
                iyr0 iyr0Var = e7g0Var.c;
                i7g0 i7g0Var4 = (r6g0Var == null || (i7g0Var = r6g0Var.d) == null) ? i7g0Var3 : i7g0Var;
                boolean z = w0e0Var.a;
                ArrayList arrayList = w0e0Var.c;
                ArrayList arrayList2 = w0e0Var.b;
                z6x z6xVar = z6x.a;
                return new r6g0(str, "", iyr0Var, i7g0Var4, z, arrayList, arrayList2, z6xVar, z6xVar, e7g0Var.d);
            default:
                b4e0 b4e0Var = (b4e0) obj;
                Bundle bundle2 = (Bundle) obj2;
                r6g0Var = bundle2 != null ? (r6g0) jhc1.t(bundle2, "ManageBlockedContentModel", r6g0.class) : null;
                e7g0 e7g0Var2 = z6g0Var.f;
                String str2 = e7g0Var2.a;
                String str3 = b4e0Var.a;
                iyr0 iyr0Var2 = b4e0Var.b;
                i7g0 i7g0Var5 = (r6g0Var == null || (i7g0Var2 = r6g0Var.d) == null) ? i7g0Var3 : i7g0Var2;
                boolean z2 = b4e0Var.c;
                ArrayList arrayList3 = b4e0Var.e;
                ArrayList arrayList4 = b4e0Var.d;
                String str4 = e7g0Var2.d;
                z6x z6xVar2 = z6x.a;
                return new r6g0(str2, str3, iyr0Var2, i7g0Var5, z2, z6xVar2, z6xVar2, arrayList3, arrayList4, str4);
        }
    }
}
