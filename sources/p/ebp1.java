package p;

import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ebp1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Uri uri, qim0 qim0Var, zvx zvxVar, p3v p3vVar, b0k b0kVar, int i, int i2) {
        zvx zvxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(191811691);
        int i3 = (x340Var.g(uri) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                zvxVar2 = zvxVar;
                int i4 = x340Var.g(zvxVar2) ? 256 : 128;
                i3 |= i4;
            } else {
                zvxVar2 = zvxVar;
            }
            i3 |= i4;
        } else {
            zvxVar2 = zvxVar;
        }
        int i5 = i3 | (x340Var.g(p3vVar) ? 2048 : 1024);
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar2 = new zvx();
                i5 &= -897;
            }
            zvx zvxVar3 = zvxVar2;
            x340Var.s();
            eso1.e(uri, isl.a, qim0Var, p3vVar, zvxVar3, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, (i5 & 14) | 48 | ((i5 << 3) & 896) | (i5 & 7168) | ((i5 << 6) & 57344), 0, 4000);
            zvxVar2 = zvxVar3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m82(i, uri, qim0Var, zvxVar2, p3vVar, i2, (byte) 0);
        }
    }

    public static final void b(Object obj, qyl qylVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-732666071);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (x340Var.i(qylVar) ? 32 : 16);
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                qylVar = oyl.a;
            }
            fq7.r(qylVar, upn1.y(obj, j2iVar, x340Var, (i4 & 14) | 48), x340Var, (i4 >> 3) & 14);
        } else {
            x340Var.b0();
        }
        qyl qylVar2 = qylVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(obj, qylVar2, j2iVar, i, i2, (byte) 2);
        }
    }

    public static final void c(ziv0 ziv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1089662030);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ziv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("presave_button_".concat(lzu0.g(ziv0Var.a)), qim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new qjv0(ziv0Var, (byte) 0);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, new smt0(iu30Var, (byte) 16)), i(ziv0Var), s161.b(qim0VarN, false, (iu30) objT), jax.a, yla.s(x340Var), null, false, null, null, apo.r(331228233, new rjv0(ziv0Var, (byte) 0), x340Var), x340Var, 0, 6, 968);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sjv0(ziv0Var, iu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(tte0 tte0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1390305364);
        int i2 = (x340Var.g(tte0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            iho1.j(nho1.E(tte0Var.e, x340Var), apo.r(-747083794, new mte0(tte0Var, (byte) 1), x340Var), null, null, null, x340Var, 56, 28);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(tte0Var, qim0Var, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(ziv0 ziv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(124649655);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ziv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(ziv0Var.e);
            qim0 qim0Var3 = nim0.a;
            if (iC == 0) {
                x340Var.i0(-470759635);
                f(ziv0Var, iu30Var, qim0Var3, x340Var, i3 & 1022);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -470761424, false);
                }
                x340Var.i0(-470756530);
                c(ziv0Var, iu30Var, qim0Var3, x340Var, i3 & 1022);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sjv0(ziv0Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(ziv0 ziv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1167410711);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(ziv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("presave_button_".concat(lzu0.g(ziv0Var.a)), qim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new qjv0(ziv0Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, new smt0(iu30Var, (byte) 16)), i(ziv0Var), s161.b(qim0VarN, false, (iu30) objT), jax.a, yla.s(b0kVar3), null, null, null, apo.r(-1175515737, new rjv0(ziv0Var, (byte) 1), b0kVar3), null, apo.r(-1061379016, new rjv0(ziv0Var, (byte) 2), b0kVar3), b0kVar2, 805306368, 48, 1480);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sjv0(ziv0Var, iu30Var, qim0Var, i, (byte) 2);
        }
    }

    public static final sck1 g(znb0 znb0Var) {
        return (sck1) znb0Var.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
        c9t c9tVar;
        if (onmVar instanceof c9t) {
            c9tVar = (c9t) onmVar;
            int i = c9tVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9tVar.b = i - Integer.MIN_VALUE;
            } else {
                c9tVar = new c9t(onmVar);
            }
        } else {
            c9tVar = new c9t(onmVar);
        }
        Object objJ = c9tVar.a;
        int i2 = c9tVar.b;
        if (i2 == 0) {
            hm5.M(objJ);
            jte jteVar = new jte(2, (lnm) null, (byte) 25);
            c9tVar.b = 1;
            objJ = b5p1.j(ay8Var, jteVar, c9tVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    public static final yf i(ziv0 ziv0Var) {
        int i = ziv0Var.a;
        int i2 = ziv0Var.d;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    return jdx.c;
                }
                if (iC2 == 1) {
                    return new idx(18);
                }
                eg.o();
                return null;
            }
            if (iC != 2) {
                eg.o();
                return null;
            }
        }
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            return new idx(4);
        }
        if (iC3 == 1) {
            return new idx(6);
        }
        eg.o();
        return null;
    }

    public static final bck1 j(zf30 zf30Var, tka0 tka0Var, Function0 function0, Function0 function1, Function0 function2) {
        return new bck1(tka0Var, function0, function2, function1);
    }

    public static void k(View view, Rect rect, boolean z) {
        ekk1 ekk1Var;
        if (z) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.content);
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    ekk1Var = null;
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (ekk1.class.isInstance(childAt) && childAt.getId() == 2131428426) {
                    ekk1Var = (ekk1) childAt;
                    break;
                }
                i++;
            }
            if (ekk1Var == null) {
                ekk1Var = new ekk1(view.getContext());
                ekk1Var.setId(2131428426);
                ekk1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                viewGroup.addView(ekk1Var);
            }
            ekk1Var.bringToFront();
            ekk1Var.setVisibleRect(new RectF(rect.left, rect.top, rect.right, rect.bottom));
            viewGroup.requestLayout();
            ekk1Var.invalidate();
        }
    }

    public static jwp0 l(int i) {
        return new jwp0(i);
    }

    public static rr80 m(int i, int i2, int i3) {
        return new rr80(i, i2, i3);
    }

    public static final lsm0 n(r091 r091Var) {
        return ((i091) r091Var.g.getValue()).a;
    }

    public static final long o(i091 i091Var, Long l) {
        long j = i091Var.d;
        float f = i091Var.f;
        if (!q(i091Var) || Math.abs(f) > Float.MAX_VALUE || l == null) {
            return j;
        }
        double dLongValue = l.longValue() - i091Var.c;
        if (dLongValue < 0.0d) {
            dLongValue = 0.0d;
        }
        return (long) ((dLongValue * ((double) f)) + j);
    }

    public static final boolean p(i091 i091Var) {
        if (i091Var.f != 0.0f) {
            return false;
        }
        k091 k091Var = i091Var.h;
        return (k091Var instanceof k091) && (k091Var.a instanceof e091);
    }

    public static final boolean q(i091 i091Var) {
        return i091Var.f > 0.0f;
    }

    public static final boolean r(r091 r091Var) {
        return ((i091) r091Var.g.getValue()).f > 0.0f;
    }

    public static void s(r091 r091Var, lsm0 lsm0Var, tv80 tv80Var, yjp1 yjp1Var, int i) {
        if ((i & 2) != 0) {
            tv80Var = null;
        }
        if (u890.j(n(r091Var), lsm0Var)) {
            return;
        }
        r091Var.b(lsm0Var);
        r091Var.e(tv80Var, (Long) null, (String) null, yjp1Var);
    }

    public static rol0 t() {
        return new rol0();
    }

    public static vwp0 u(int i, int i2) {
        return new vwp0(i, i2);
    }
}
