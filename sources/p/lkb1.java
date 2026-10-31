package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lkb1 extends xic0 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lkb1(byte b) {
        super((byte) 1);
        this.g = b;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a7 A[PHI: r5
      0x00a7: PHI (r5v7 int) = (r5v5 int), (r5v8 int) binds: [B:43:0x00ae, B:38:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.xic0
    public final int[] c(a aVar, View view) {
        int iD;
        int i;
        int iM;
        switch (this.g) {
            case 0:
                if (!aVar.q()) {
                    return super.c(aVar, view);
                }
                uqq0 uqq0Var = new uqq0(aVar);
                boolean z = aVar.S() == 1;
                int iD2 = z ? uqq0Var.d(view) - uqq0Var.i() : uqq0Var.g(view);
                View viewD = aVar.D(aVar.R() - 1);
                if (viewD != null) {
                    if (z) {
                        iD = uqq0Var.g(viewD);
                        i = ((a) uqq0Var.b).getPaddingLeft();
                    } else {
                        iD = uqq0Var.d(viewD);
                        i = uqq0Var.i();
                    }
                    int i2 = iD - i;
                    if (z) {
                        if (iD2 < 0) {
                            if (i2 > 0) {
                                i2 = 0;
                            }
                            if (iD2 < i2) {
                                iD2 = i2;
                            }
                        }
                    } else if (iD2 > 0) {
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        if (iD2 > i2) {
                            iD2 = i2;
                        }
                    }
                }
                return new int[]{iD2, 0};
            default:
                if (!aVar.q()) {
                    return super.c(aVar, view);
                }
                new Rect();
                boolean z2 = aVar.S() == 1;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167226);
                if (z2) {
                    iM = a.P(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                    dimensionPixelSize = aVar.O0 - aVar.getPaddingRight();
                } else {
                    iM = a.M(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                }
                return new int[]{iM - dimensionPixelSize, 0};
        }
    }

    @Override // p.xic0
    public final View i(a aVar) {
        View viewD;
        int iD;
        int i;
        int iD2;
        int i2;
        boolean z = false;
        switch (this.g) {
            case 0:
                if (aVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
                    if (linearLayoutManager.q()) {
                        uqq0 uqq0Var = new uqq0(aVar);
                        boolean z2 = linearLayoutManager.S() == 1;
                        int iF1 = linearLayoutManager.f1();
                        if (iF1 == -1 || linearLayoutManager.f1() == linearLayoutManager.R() - 1 || linearLayoutManager.g1() == linearLayoutManager.R() - 1) {
                            viewD = null;
                        } else {
                            viewD = linearLayoutManager.D(iF1);
                            int iE = uqq0Var.e(viewD);
                            if (!z2 ? (iD2 = uqq0Var.d(viewD)) < iE / 2 || iD2 <= 0 : (i2 = uqq0Var.i() - uqq0Var.g(viewD)) < iE / 2 || i2 <= 0) {
                                viewD = linearLayoutManager.D(iF1 + 1);
                            }
                        }
                        if (viewD == null) {
                            return null;
                        }
                        boolean z3 = aVar.S() == 1;
                        View viewD2 = aVar.D(aVar.R() - 1);
                        if (viewD2 != null) {
                            if (z3) {
                                iD = uqq0Var.g(viewD2);
                                i = ((a) uqq0Var.b).getPaddingLeft();
                            } else {
                                iD = uqq0Var.d(viewD2);
                                i = uqq0Var.i();
                            }
                            int i3 = iD - i;
                            int iD3 = z3 ? uqq0Var.d(viewD) - uqq0Var.i() : uqq0Var.g(viewD);
                            boolean z4 = !z3 ? iD3 >= 0 : iD3 <= 0;
                            if (i3 != 0 && Math.abs(i3) < Math.abs(iD3)) {
                                z = true;
                            }
                            if (z4 && z) {
                                return viewD2;
                            }
                        }
                        return viewD;
                    }
                }
                return super.i(aVar);
            default:
                if (aVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) aVar;
                    if (linearLayoutManager2.q()) {
                        new Rect();
                        z = linearLayoutManager2.S() == 1;
                        int iF2 = linearLayoutManager2.f1();
                        if (iF2 == -1 || linearLayoutManager2.f1() == linearLayoutManager2.R() - 1) {
                            return null;
                        }
                        View viewD3 = linearLayoutManager2.D(iF2);
                        g611 layoutParams = viewD3.getLayoutParams();
                        int iO = aVar.O(viewD3) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (z) {
                            int paddingRight = (aVar.O0 - aVar.getPaddingRight()) - (a.M(viewD3) - ((ViewGroup.MarginLayoutParams) viewD3.getLayoutParams()).leftMargin);
                            if (paddingRight >= iO / 2 && paddingRight > 0) {
                                return viewD3;
                            }
                        } else {
                            int iP = a.P(viewD3) + ((ViewGroup.MarginLayoutParams) viewD3.getLayoutParams()).rightMargin;
                            if (iP >= iO / 2 && iP > 0) {
                                return viewD3;
                            }
                        }
                        return linearLayoutManager2.D(iF2 + 1);
                    }
                }
                return super.i(aVar);
        }
    }
}
