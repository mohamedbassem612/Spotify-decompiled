package p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.encoremobile.component.icons.IconEnhanceBadge;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqf1 implements View.OnClickListener {
    public final /* synthetic */ qqf1 a;
    public final /* synthetic */ aqf1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ IconAddBadgeView d;
    public final /* synthetic */ IconRemoveBadgeView e;
    public final /* synthetic */ IconEnhanceBadge f;

    public oqf1(qqf1 qqf1Var, aqf1 aqf1Var, int i, IconAddBadgeView iconAddBadgeView, IconRemoveBadgeView iconRemoveBadgeView, IconEnhanceBadge iconEnhanceBadge) {
        this.a = qqf1Var;
        this.b = aqf1Var;
        this.c = i;
        this.d = iconAddBadgeView;
        this.e = iconRemoveBadgeView;
        this.f = iconEnhanceBadge;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqf1 aqf1Var = this.b;
        String str = aqf1Var.h;
        String str2 = aqf1Var.a;
        qqf1 qqf1Var = this.a;
        if (qqf1Var.t) {
            return;
        }
        boolean z = aqf1Var.c;
        IconRemoveBadgeView iconRemoveBadgeView = this.e;
        IconAddBadgeView iconAddBadgeView = this.d;
        int i = this.c;
        uaa uaaVar = this.f;
        if (z) {
            qqf1Var.h.invoke(new irf1(str2, i, str));
            iconAddBadgeView.setIconActive(false);
            iconRemoveBadgeView.setIconVisible(true);
            uaaVar.setVisibility(8);
            return;
        }
        uaaVar.animate().setDuration(300L).translationXBy(-uaaVar.getWidth()).start();
        qqf1Var.h.invoke(new jrf1(str2, i, str));
        iconAddBadgeView.setIconActive(true);
        iconRemoveBadgeView.setIconVisible(false);
        uaaVar.setVisibility(aqf1Var.j ? 0 : 8);
    }
}
