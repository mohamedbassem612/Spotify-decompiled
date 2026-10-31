package p;

import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e2g0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ f2g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2g0(f2g0 f2g0Var, byte b) {
        super((Object) null);
        this.b = b;
        this.c = f2g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.ViewGroup, com.spotify.mainlayout.ui.view.MainLayout] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        f2g0 f2g0Var = this.c;
        switch (b) {
            case 0:
                if (!u890.j((hgr0) obj, (hgr0) obj2)) {
                    f2g0Var.a();
                }
                break;
            case 1:
                if (!u890.j((Boolean) obj, (Boolean) obj2)) {
                    f2g0Var.a();
                }
                break;
            default:
                ?? r6 = f2g0Var.a;
                b2g0 b2g0Var = (b2g0) obj2;
                if (!u890.j((b2g0) obj, b2g0Var) && b2g0Var != null) {
                    z1g0 z1g0Var = f2g0Var.b;
                    List listH = z1g0Var.h(r6, b2g0Var, new a2g0(r6.getNowPlayingViewMode()));
                    if (listH.isEmpty()) {
                        listH = null;
                    }
                    if (listH != null) {
                        fjg1.b((ViewGroup) r6);
                        glg1 glg1Var = new glg1();
                        fad0 fad0Var = f2g0Var.c;
                        glg1Var.W(((Number) ((idd1) fad0Var.b).getValue()).longValue());
                        glg1Var.X((DecelerateInterpolator) fad0Var.c);
                        glg1Var.T(new d2g0(f2g0Var, (byte) 0));
                        Iterator it = listH.iterator();
                        while (it.hasNext()) {
                            glg1Var.U((jhg1) it.next());
                        }
                        fjg1.a((ViewGroup) r6, glg1Var);
                    }
                    z1g0Var.a(r6, b2g0Var);
                    break;
                }
                break;
        }
    }
}
