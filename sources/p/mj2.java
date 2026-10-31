package p;

import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mj2 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ cv30 Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ short g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mj2(String str, String str2, qim0 qim0Var, String str3, String str4, String str5, Function0 function0, String str6, Function0 function1, Function0 function2, int i, int i2) {
        super(2);
        this.b = str;
        this.c = str2;
        this.e = qim0Var;
        this.f = str3;
        this.h = str4;
        this.i = str5;
        this.X = function0;
        this.t = str6;
        this.Y = function1;
        this.Z = function2;
        this.d = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) iu30Var;
                int iP = czo1.p(this.d | 1);
                short s = this.g;
                String str = this.b;
                String str2 = this.c;
                qim0 qim0Var = this.e;
                String str3 = this.f;
                c97.a(str, str2, qim0Var, str3, (String) obj7, (String) obj6, (Function0) obj4, (String) obj5, function0, function1, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(196609);
                short s2 = this.g;
                String str4 = this.b;
                String str5 = this.c;
                int i = this.d;
                qim0 qim0Var2 = this.e;
                String str6 = this.f;
                yzo1.i((jtl1) obj7, str4, str5, (c380) obj6, i, (j2i) obj5, qim0Var2, str6, (a0e1) obj4, (TextUnit) obj3, iu30Var, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mj2(jtl1 jtl1Var, String str, String str2, c380 c380Var, int i, j2i j2iVar, qim0 qim0Var, String str3, a0e1 a0e1Var, TextUnit textUnit, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.h = jtl1Var;
        this.b = str;
        this.c = str2;
        this.i = c380Var;
        this.d = i;
        this.t = j2iVar;
        this.e = qim0Var;
        this.f = str3;
        this.X = a0e1Var;
        this.Y = textUnit;
        this.Z = iu30Var;
        this.g = i3;
    }
}
