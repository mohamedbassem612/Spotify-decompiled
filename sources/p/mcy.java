package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mcy extends LinearLayout implements fcy {
    public final tjq a;
    public final q4u b;

    public mcy(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(2131624584, this);
        int i = 2131428668;
        EntityActionView entityActionViewT = m5n1.t(this, 2131428668);
        if (entityActionViewT != null) {
            i = 2131428669;
            EntityActionView entityActionViewT2 = m5n1.t(this, 2131428669);
            if (entityActionViewT2 != null) {
                i = 2131428670;
                EntityActionView entityActionViewT3 = m5n1.t(this, 2131428670);
                if (entityActionViewT3 != null) {
                    i = 2131428671;
                    EntityActionView entityActionViewT4 = m5n1.t(this, 2131428671);
                    if (entityActionViewT4 != null) {
                        i = 2131428672;
                        EntityActionView entityActionViewT5 = m5n1.t(this, 2131428672);
                        if (entityActionViewT5 != null) {
                            tjq tjqVar = new tjq(this, entityActionViewT, entityActionViewT2, entityActionViewT3, entityActionViewT4, entityActionViewT5);
                            getRootView().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            setOrientation(0);
                            this.a = tjqVar;
                            ViewGroup viewGroup = (ViewGroup) getRootView();
                            viewGroup.post(new wr3(entityActionViewT3, entityActionViewT3.getContext().getResources().getDimensionPixelSize(2131166820), viewGroup, (byte) 5));
                            this.b = nln.w(new q4u[]{nln.x(hcy.b, nln.v(new gcy(1, this, mcy.class, "renderPrimaryAction", "renderPrimaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 1))), nln.x(icy.b, nln.v(new gcy(1, this, mcy.class, "renderFirstSecondaryAction", "renderFirstSecondaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 2))), nln.x(jcy.b, nln.v(new gcy(1, this, mcy.class, "renderSecondSecondaryAction", "renderSecondSecondaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 3))), nln.x(kcy.b, nln.v(new gcy(1, this, mcy.class, "renderThirdSecondaryAction", "renderThirdSecondaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 4))), nln.x(lcy.b, nln.v(new r1t(1, this, mcy.class, "renderFourthSecondaryAction", "renderFourthSecondaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 29))), nln.v(new gcy(1, this, mcy.class, "renderContentDescription", "renderContentDescription(Lcom/spotify/encoreconsumermobile/elements/entityactionrow/EntityActionRow$Model;)V", 0, (byte) 0))});
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static void a(EntityActionView entityActionView, zby zbyVar) {
        if (zbyVar == null) {
            entityActionView.setVisibility(8);
        } else {
            entityActionView.setVisibility(0);
            entityActionView.a(zbyVar);
        }
    }

    public final void f(Object obj) {
        this.b.a((ecy) obj);
    }

    public final void n(iu30 iu30Var) {
        tjq tjqVar = this.a;
        ((EntityActionView) tjqVar.b).n(iu30Var);
        ((EntityActionView) tjqVar.d).n(iu30Var);
        ((EntityActionView) tjqVar.e).n(iu30Var);
        ((EntityActionView) tjqVar.c).n(iu30Var);
        ((EntityActionView) tjqVar.a).n(iu30Var);
    }
}
