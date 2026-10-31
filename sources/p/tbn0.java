package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tbn0 extends hab0 implements dv30 {
    public final /* synthetic */ pbn0 a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ rbn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbn0(pbn0 pbn0Var, j2i j2iVar, j2i j2iVar2, rbn0 rbn0Var) {
        super(6);
        this.a = pbn0Var;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = rbn0Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        cbn0 cbn0Var = (cbn0) obj;
        Function0 function0 = (Function0) obj2;
        Function0 function1 = (Function0) obj3;
        vu30 vu30Var = (vu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(cbn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(function0) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(function1) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 9363) != 9362)) {
            nbn0 nbn0Var = (nbn0) this.a;
            String str = nbn0Var.c;
            if (str == null) {
                str = "";
            }
            String str2 = nbn0Var.a;
            String str3 = str;
            String str4 = nbn0Var.b;
            u7h u7hVar = nbn0Var.d;
            rbn0 rbn0Var = this.d;
            boolean z = rbn0Var.b;
            j2i j2iVar = !z ? this.c : null;
            boolean z2 = true ^ z;
            Set set = s4b1.f;
            int i2 = i << 12;
            ybn0.b(str3, str2, str4, u7hVar, cbn0Var, function0, function1, vu30Var, this.b, j2iVar, z2, uic.g(rbn0Var.a, blc0.M3), (qim0) null, x340Var2, (i2 & 29360128) | (57344 & i2) | 100663296 | (458752 & i2) | (3670016 & i2));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
