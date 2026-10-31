package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c0e extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(int i, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, i3u i3uVar, int i2) {
        super(2);
        this.b = i;
        this.c = z;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = i3uVar;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                boolean z = this.c;
                wgo1.d((oo41) obj7, i2, (zau0) obj6, z, (vu30) obj5, (lz20) obj4, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                i3u i3uVar = (i3u) obj3;
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                boolean z2 = this.c;
                exd0.b(i3, z2, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, i3uVar, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                boolean z3 = this.c;
                ftg0.f((cdo0) obj7, z3, (ctg0) obj6, (iu30) obj5, (iu30) obj4, (lee1) obj3, this.b, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z4 = this.c;
                int i4 = this.b;
                ((wik0) obj7).f((kak0) obj6, z4, (t4h1) obj5, (hdn0) obj4, i4, (wat) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(wik0 wik0Var, kak0 kak0Var, boolean z, t4h1 t4h1Var, hdn0 hdn0Var, int i, wat watVar, int i2) {
        super(2);
        this.e = wik0Var;
        this.f = kak0Var;
        this.c = z;
        this.g = t4h1Var;
        this.h = hdn0Var;
        this.b = i;
        this.i = watVar;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(cdo0 cdo0Var, boolean z, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, int i2) {
        super(2);
        this.e = cdo0Var;
        this.c = z;
        this.f = ctg0Var;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = lee1Var;
        this.b = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(oo41 oo41Var, int i, zau0 zau0Var, boolean z, vu30 vu30Var, lz20 lz20Var, qim0 qim0Var, int i2) {
        super(2);
        this.e = oo41Var;
        this.b = i;
        this.f = zau0Var;
        this.c = z;
        this.g = vu30Var;
        this.h = lz20Var;
        this.i = qim0Var;
        this.d = i2;
    }
}
