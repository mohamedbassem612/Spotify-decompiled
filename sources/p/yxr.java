package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yxr implements qzh {
    public final /* synthetic */ byte a;
    public final idd1 b;

    public yxr(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new idd1(new mo2(context, (byte) 11));
                break;
            case 2:
                this.b = new idd1(new d4e(context, (byte) 17));
                break;
            default:
                this.b = new idd1(new mo2(context, (byte) 9));
                break;
        }
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
    public final void f(Object obj) {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                ((ffz) idd1Var.getValue()).c.f(((efz) obj).a);
                ((ffz) idd1Var.getValue()).d.setText((CharSequence) null);
                ((ffz) idd1Var.getValue()).b.setText((CharSequence) null);
                break;
            case 1:
                ((lc90) idd1Var.getValue()).b.setText(((kc90) obj).a);
                break;
            default:
                u8w0 u8w0Var = (u8w0) obj;
                ((v8w0) idd1Var.getValue()).c.setText(u8w0Var.a);
                ((v8w0) idd1Var.getValue()).b.setVisibility(u8w0Var.b ? 0 : 8);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                return ((ffz) idd1Var.getValue()).a;
            case 1:
                return ((lc90) idd1Var.getValue()).a;
            default:
                return ((v8w0) idd1Var.getValue()).a;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                ((ffz) idd1Var.getValue()).c.W0 = iu30Var;
                break;
            case 1:
                ((lc90) idd1Var.getValue()).b.setOnClickListener(new o0s(iu30Var, (byte) 6));
                break;
            default:
                ((v8w0) idd1Var.getValue()).a.setOnClickListener(new vhs(iu30Var, (byte) 0));
                break;
        }
    }
}
