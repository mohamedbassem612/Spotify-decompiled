package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hs9 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ cv30 i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs9(e5h e5hVar, y0q0 y0q0Var, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var, d0r d0rVar, ycm ycmVar, l6q l6qVar, me30 me30Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.f = e5hVar;
        this.g = y0q0Var;
        this.b = function0;
        this.h = function1;
        this.i = function2;
        this.t = vu30Var;
        this.X = d0rVar;
        this.Y = ycmVar;
        this.Z = l6qVar;
        this.N0 = me30Var;
        this.c = z;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Function0 function0 = this.i;
        Function0 function1 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                iu30 iu30Var2 = (iu30) obj3;
                int iP = czo1.p(920346625);
                boolean z = this.c;
                int i = this.e;
                l3p1.e(z, i, (w2k1) obj8, (j2i) obj7, (j2i) function1, (j2i) function0, this.t, (j2i) obj6, (j2i) obj5, this.d, iu30Var, this.b, iu30Var2, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.e | 1);
                Function0 function2 = this.b;
                vu30 vu30Var = this.t;
                w3p1.b((e5h) obj8, (y0q0) obj7, function2, function1, function0, vu30Var, (d0r) obj6, (ycm) obj5, (l6q) obj4, (me30) obj3, this.c, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs9(boolean z, int i, w2k1 w2k1Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6, qim0 qim0Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, int i2) {
        super(2);
        this.c = z;
        this.e = i;
        this.f = w2k1Var;
        this.g = j2iVar;
        this.h = j2iVar2;
        this.i = j2iVar3;
        this.t = j2iVar4;
        this.X = j2iVar5;
        this.Y = j2iVar6;
        this.d = qim0Var;
        this.Z = iu30Var;
        this.b = function0;
        this.N0 = iu30Var2;
    }
}
