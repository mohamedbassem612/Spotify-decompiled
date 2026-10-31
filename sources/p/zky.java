package p;

import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoreconsumermobile.elements.entitymetadata.EntityMetadataView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zky extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zky(lly llyVar, byte b) {
        super(1);
        this.a = b;
        this.b = llyVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, android.view.ViewGroup, p.gdy] */
    public final Object invoke(Object obj) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lly llyVar = this.b;
        switch (b) {
            case 0:
                c590 c590Var = (f590) obj;
                EncoreListRow encoreListRow = llyVar.c;
                iu30 iu30Var = llyVar.d;
                yky ykyVar = new yky(llyVar, (byte) 0);
                if (c590Var instanceof c590) {
                    k8p1.o(encoreListRow.getBinding().d(), c590Var.a);
                    return rih1Var;
                }
                if (c590Var instanceof e590) {
                    txy txyVarD = encoreListRow.getBinding().d();
                    zby zbyVar = ((e590) c590Var).a;
                    txyVarD.setVisibility(0);
                    EntityActionView entityActionView = (EntityActionView) (txyVarD instanceof EntityActionView ? txyVarD : null);
                    if (entityActionView != null) {
                        entityActionView.a(zbyVar);
                        return rih1Var;
                    }
                    EntityActionView entityActionView2 = new EntityActionView(encoreListRow.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    entityActionView2.a(zbyVar);
                    if (iu30Var != null) {
                        lvx.x(entityActionView2, iu30Var, ykyVar);
                    }
                    k8p1.o(txyVarD, entityActionView2);
                    return rih1Var;
                }
                if (!(c590Var instanceof d590)) {
                    if (c590Var == null) {
                        encoreListRow.getBinding().d().setVisibility(8);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                txy txyVarD2 = encoreListRow.getBinding().d();
                ncy ncyVar = ((d590) c590Var).a;
                txyVarD2.setVisibility(0);
                qcy qcyVar = (qcy) (txyVarD2 instanceof qcy ? txyVarD2 : null);
                if (qcyVar != null) {
                    qcyVar.f(ncyVar);
                    return rih1Var;
                }
                qcy qcyVar2 = new qcy(encoreListRow.getContext());
                qcyVar2.b.a(ncyVar);
                if (iu30Var != null) {
                    lvx.x(qcyVar2, iu30Var, ykyVar);
                }
                k8p1.o(txyVarD2, qcyVar2);
                return rih1Var;
            case 1:
                bdy bdyVar = (bdy) obj;
                EncoreListRow encoreListRow2 = llyVar.c;
                txy txyVarFindViewById = encoreListRow2.getBinding().a.findViewById(2131427732);
                if (bdyVar != null) {
                    txyVarFindViewById.setVisibility(0);
                    gdy gdyVar = (gdy) (txyVarFindViewById instanceof gdy ? txyVarFindViewById : null);
                    if (gdyVar != null) {
                        gdyVar.f(bdyVar);
                    } else {
                        ?? gdyVar2 = new gdy(encoreListRow2.getContext());
                        gdyVar2.V0.a(bdyVar);
                        lvx.n(gdyVar2);
                        k8p1.o(txyVarFindViewById, (View) gdyVar2);
                    }
                } else {
                    txyVarFindViewById.setVisibility(8);
                }
                return rih1Var;
            case 2:
                nhy nhyVar = (nhy) obj;
                EncoreListRow encoreListRow3 = llyVar.c;
                txy txyVarFindViewById2 = encoreListRow3.getBinding().a.findViewById(2131429734);
                if (nhyVar != null) {
                    txyVarFindViewById2.setVisibility(0);
                    qhy qhyVar = (qhy) (txyVarFindViewById2 instanceof qhy ? txyVarFindViewById2 : null);
                    if (qhyVar != null) {
                        qhyVar.f(nhyVar);
                    } else {
                        qhy qhyVar2 = new qhy(encoreListRow3.getContext());
                        qhyVar2.b.a(nhyVar);
                        k8p1.o(txyVarFindViewById2, qhyVar2);
                    }
                } else {
                    txyVarFindViewById2.setVisibility(8);
                }
                return rih1Var;
            default:
                a590 a590Var = (b590) obj;
                EncoreListRow encoreListRow4 = llyVar.c;
                gw70 gw70Var = llyVar.b;
                if (a590Var instanceof a590) {
                    nmy nmyVar = a590Var.a;
                    txy txyVarC = encoreListRow4.getBinding().c();
                    txyVarC.setVisibility(0);
                    EntityMetadataView entityMetadataView = (EntityMetadataView) (txyVarC instanceof EntityMetadataView ? txyVarC : null);
                    if (entityMetadataView != null) {
                        entityMetadataView.f(nmyVar);
                        return rih1Var;
                    }
                    EntityMetadataView entityMetadataView2 = new EntityMetadataView(encoreListRow4.getContext(), null, 0, 6, null);
                    entityMetadataView2.f(nmyVar);
                    lvx.n(entityMetadataView2);
                    k8p1.o(txyVarC, entityMetadataView2);
                    return rih1Var;
                }
                if (!(a590Var instanceof z490)) {
                    if (a590Var == null) {
                        encoreListRow4.getBinding().c().setVisibility(8);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                gxy gxyVar = ((z490) a590Var).a;
                txy txyVarC2 = encoreListRow4.getBinding().c();
                txyVarC2.setVisibility(0);
                txy txyVar = txyVarC2 instanceof txy ? txyVarC2 : null;
                if (txyVar != null) {
                    txyVar.f(gxyVar);
                    return rih1Var;
                }
                txy txyVar2 = new txy(encoreListRow4.getContext());
                lvx.n(txyVar2);
                txyVar2.setImageLoader(gw70Var);
                txyVar2.e.a(gxyVar);
                k8p1.o(txyVarC2, txyVar2);
                return rih1Var;
        }
    }
}
