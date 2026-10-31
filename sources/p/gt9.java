package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gt9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt9(boolean z, String str, boolean z2) {
        super(3);
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ecx ecxVarA;
        ecx ecxVarA2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        boolean z = this.b;
        String str = this.c;
        boolean z2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uwr uwrVar = cbx.a;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1031658172);
                    qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                    if (z2) {
                        cbx.a.getClass();
                        ecxVarA2 = uwr.d();
                    } else {
                        cbx.a.getClass();
                        ecxVarA2 = uwr.a();
                    }
                    qim0 qim0VarF = hno1.f(qim0VarC, ecxVarA2);
                    long jA = cbx.a(x340Var2).a.b.a();
                    cua cuaVar = cbx.b(x340Var2).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarF, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var2, 0);
                    x340Var2.r(false);
                } else if (str == null) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1032372784);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(1032115236);
                    Uri uri = Uri.parse(str);
                    if (z2) {
                        cbx.a.getClass();
                        ecxVarA = uwr.d();
                    } else {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                    }
                    eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var4, 48, 0, 4060);
                    x340Var4.r(false);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if (!z) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(1805209205);
                    x340Var6.r(false);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var6).g;
                    boolean zG = x340Var6.g(str);
                    Object objT = x340Var6.T();
                    if (zG || objT == m4cVar) {
                        ye5 ye5Var = new ye5();
                        z6p1.r(ye5Var, "PlayIndicator", "�");
                        ye5Var.g(str);
                        objT = ye5Var.p();
                        x340Var6.s0(objT);
                    }
                    af5 af5Var = (af5) objT;
                    zma1 zma1Var = lee1Var.a;
                    boolean zF = x340Var6.f(zma1Var.b) | x340Var6.h(z2);
                    Object objT2 = x340Var6.T();
                    if (zF || objT2 == m4cVar) {
                        long j = zma1Var.b;
                        fc11.o(j);
                        objT2 = mqo1.t(new mmr0("PlayIndicator", new gh80(new d6t0(1, fc11.Y(TextUnit.c(j) * 1.15f, j & 1095216660480L), zma1Var.b), new j2i(-1739997138, new aw1((byte) 5, z2), true))));
                        x340Var6.s0(objT2);
                    }
                    long j2 = cbx.a(x340Var6).c.c;
                    cjc0 cjc0Var = new cjc0(1);
                    uwo1.d(af5Var, j2, e9k.n(63, nim0Var), lee1Var, null, null, 0, false, cjc0Var, 0, null, (cqs0) objT2, x340Var6, 0, 0, 1776);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(1805086197);
                    uwr uwrVar3 = cbx.a;
                    n3p1.c(cbx.d(x340Var7).g, 0.6f, x340Var7, 48);
                    x340Var7.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt9(boolean z, boolean z2, String str) {
        super(3);
        this.b = z;
        this.d = z2;
        this.c = str;
    }
}
