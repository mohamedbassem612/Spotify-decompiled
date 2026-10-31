package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class ViewModelProperty$pollChanges$1 extends hab0 implements Function0 {
    final /* synthetic */ ViewModelProperty<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelProperty$pollChanges$1(ViewModelProperty<T> viewModelProperty) {
        super(0);
        this.this$0 = viewModelProperty;
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
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m527invoke() {
        ViewModelProperty<T> viewModelProperty = this.this$0;
        if (viewModelProperty.cppHasChanged(viewModelProperty.getCppPointer())) {
            ((ViewModelProperty) this.this$0)._valueFlow.l(this.this$0.nativeGetValue());
            ViewModelProperty<T> viewModelProperty2 = this.this$0;
            viewModelProperty2.cppFlushChanges(viewModelProperty2.getCppPointer());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m527invoke();
        return rih1.a;
    }
}
