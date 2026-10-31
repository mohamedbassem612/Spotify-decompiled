package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lly implements mi90, sek1 {
    public final Context a;
    public final gw70 b;
    public final EncoreListRow c;
    public iu30 d;
    public cjy e;
    public final q4u f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public lly(Context context, gw70 gw70Var, int i, boolean z, boolean z2, boolean z3, int i2) throws NoWhenBranchMatchedException {
        int i3 = (i2 & 4) != 0 ? 4 : i;
        boolean z4 = (i2 & 8) != 0 ? true : z;
        boolean z5 = (i2 & 16) != 0 ? false : z2;
        boolean z6 = (i2 & 32) != 0 ? true : z3;
        this.a = context;
        this.b = gw70Var;
        EncoreListRow encoreListRow = new EncoreListRow(context, null, pxd0.U(i3));
        encoreListRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        af afVarA = new bf(encoreListRow.getContext()).a();
        int iCompareTo = afVarA.compareTo(af.i);
        ay31 ay31Var = ay31.Regular;
        ay31 ay31Var2 = ay31.Narrow;
        encoreListRow.setRowType((iCompareTo > 0 || afVarA.compareTo(af.e) < 0 || !z4) ? ay31Var : ay31Var2);
        if (z6) {
            ConstraintLayout constraintLayoutA = encoreListRow.getBinding().a();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165952);
            constraintLayoutA.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        View viewFindViewById = encoreListRow.getBinding().a.findViewById(2131428936);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            throw null;
        }
        qhl qhlVar = (qhl) layoutParams;
        qhlVar.t = 0;
        qhlVar.v = 0;
        if (z5) {
            qhlVar.l = 0;
            qhlVar.setMargins(0, 0, 0, 0);
        } else {
            qhlVar.setMarginStart(encoreListRow.getResources().getDimensionPixelSize(2131165835));
            qhlVar.setMarginEnd(encoreListRow.getResources().getDimensionPixelSize(2131165834));
        }
        viewFindViewById.setLayoutParams(qhlVar);
        if (encoreListRow.getRowType() == ay31Var) {
            View viewD = encoreListRow.getBinding().d();
            ViewGroup.LayoutParams layoutParams2 = viewD.getLayoutParams();
            if (layoutParams2 == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            qhl qhlVar2 = (qhl) layoutParams2;
            qhlVar2.v = 0;
            qhlVar2.setMarginEnd(encoreListRow.getResources().getDimensionPixelSize(2131165834));
            viewD.setLayoutParams(qhlVar2);
        } else if (encoreListRow.getRowType() == ay31Var2) {
            View viewD2 = encoreListRow.getBinding().d();
            ViewGroup.LayoutParams layoutParams3 = viewD2.getLayoutParams();
            if (layoutParams3 == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            qhl qhlVar3 = (qhl) layoutParams3;
            qhlVar3.t = 0;
            qhlVar3.setMarginStart(encoreListRow.getResources().getDimensionPixelSize(2131165836));
            viewD2.setLayoutParams(qhlVar3);
        }
        this.c = encoreListRow;
        this.e = ajy.a;
        this.f = nln.w(new q4u[]{nln.x(fly.b, nln.v(new s20(this, (byte) 23))), nln.x(hly.b, nln.v(new gcy(encoreListRow, (byte) 16))), nln.x(ily.b, nln.v(new gcy(encoreListRow, (byte) 17))), nln.x(jly.b, nln.v(new zky(this, (byte) 3))), nln.x(kly.b, nln.v(new zky(this, (byte) 0))), nln.x(aly.b, nln.v(new zky(this, (byte) 1))), nln.x(bly.b, nln.v(new gcy(this, (byte) 13))), nln.x(cly.b, nln.v(new cb8(this, z5, (byte) 7))), nln.x(dly.b, nln.v(new gcy(this, (byte) 14))), nln.x(ely.b, nln.v(new gcy(this, (byte) 15))), nln.x(gly.b, nln.v(new zky(this, (byte) 2)))});
    }

    @Override // p.mi90
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(cky ckyVar) {
        this.f.a((g590) ckyVar.o.getValue());
        int i = EncoreListRow.X0;
        this.c.setAdditionalAccessibilityActions(null);
    }

    @Override // p.sek1
    public final View getView() {
        return this.c;
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        this.d = iu30Var;
        View.OnClickListener ondVar = new ond(iu30Var, this, (byte) 1);
        EncoreListRow encoreListRow = this.c;
        encoreListRow.setOnClickListener(ondVar);
        encoreListRow.setOnLongClickListener(new gws(iu30Var, this));
        encoreListRow.getBinding().b().setOnClickListener(new cvr(iu30Var, this, (byte) 25));
        encoreListRow.getBinding().b().setOnLongClickListener(new n8r(iu30Var, this, (byte) 2));
        View viewD = encoreListRow.getBinding().d();
        EntityActionView entityActionView = viewD instanceof EntityActionView ? (EntityActionView) viewD : null;
        if (entityActionView != null) {
            lvx.x(entityActionView, iu30Var, new d4e(this, (byte) 27));
        }
        KeyEvent.Callback callbackFindViewById = encoreListRow.getBinding().a.findViewById(2131428936);
        fcy fcyVar = callbackFindViewById instanceof fcy ? (fcy) callbackFindViewById : null;
        if (fcyVar != null) {
            lvx.v(fcyVar, iu30Var, new yky(this, (byte) 3));
        }
        View viewB = encoreListRow.getBinding().b();
        mmy mmyVar = viewB instanceof mmy ? (mmy) viewB : null;
        if (mmyVar != null) {
            lvx.w(mmyVar, iu30Var, new yky(this, (byte) 4));
        }
    }
}
