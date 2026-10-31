package p;

import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pye1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ParagraphView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pye1(ParagraphView paragraphView, byte b) {
        super(1);
        this.a = b;
        this.b = paragraphView;
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
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        AppCompatTextView appCompatTextView = this.b;
        switch (b) {
            case 0:
                appCompatTextView.setTranslationY(((Number) obj).floatValue());
                break;
            default:
                appCompatTextView.setTranslationY(((Number) obj).floatValue());
                break;
        }
        return rih1Var;
    }
}
