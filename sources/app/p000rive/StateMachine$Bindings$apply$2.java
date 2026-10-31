package app.p000rive;

import app.p000rive.core.StateMachineHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StateMachine$Bindings$apply$2 extends hab0 implements Function0 {
    final /* synthetic */ StateMachine.Bindings.BindingSnapshot $next;
    final /* synthetic */ StateMachine.Bindings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$Bindings$apply$2(StateMachine.Bindings bindings, StateMachine.Bindings.BindingSnapshot bindingSnapshot) {
        super(0);
        this.this$0 = bindings;
        this.$next = bindingSnapshot;
    }

    public final String invoke() {
        String strM439toStringimpl = StateMachineHandle.m439toStringimpl(this.this$0.stateMachineHandle);
        Object objM105getMainspIyslc = this.$next.m105getMainspIyslc();
        if (objM105getMainspIyslc == null) {
            objM105getMainspIyslc = "none";
        }
        return "Binding view models to " + strM439toStringimpl + ": main override=" + objM105getMainspIyslc + ", global overrides=" + this.$next.getGlobals().keySet();
    }
}
