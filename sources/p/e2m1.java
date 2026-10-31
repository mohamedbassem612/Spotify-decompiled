package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e2m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zxl1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2m1(zxl1 zxl1Var, byte b) {
        super(1);
        this.a = b;
        this.b = zxl1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        zxl1 zxl1Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                i8h1 i8h1Var = (i8h1) zxl1Var.b;
                zok0 zok0Var = (zok0) zxl1Var.c;
                zok0Var.getClass();
                x6h1 x6h1VarC = zok0Var.b.c();
                x6h1VarC.i.add(new a7h1("duration_wheel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                String strValueOf = String.valueOf(iIntValue * 60);
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("set_duration", 1, Collections.singletonMap("duration_seconds", strValueOf != null ? strValueOf : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                i8h1 i8h1Var2 = (i8h1) zxl1Var.b;
                zok0 zok0Var2 = (zok0) zxl1Var.c;
                zok0Var2.getClass();
                x6h1 x6h1VarC2 = zok0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("target_bpm_wheel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
                String strValueOf2 = String.valueOf(iIntValue2);
                i8h1Var2.m(new w7h1("", "", z7h1Var2, new x7h1("set_slider_value", 1, Collections.singletonMap("value", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
