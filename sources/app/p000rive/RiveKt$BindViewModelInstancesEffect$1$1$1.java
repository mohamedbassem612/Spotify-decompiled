package app.p000rive;

import app.p000rive.core.StateMachineHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.at71;
import p.c9n;
import p.d9n;
import p.eg;
import p.gvg;
import p.hab0;
import p.hm5;
import p.jah;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveKt$BindViewModelInstancesEffect$1$1$1", f = "Rive.kt", l = {887}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
public final class RiveKt$BindViewModelInstancesEffect$1$1$1 extends a8d1 implements vu30 {
    final /* synthetic */ ViewModelInstance $instance;
    final /* synthetic */ Function0 $requestPausedFrame;
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ long $stateMachineHandle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$BindViewModelInstancesEffect$1$1$1(ViewModelInstance viewModelInstance, StateMachine stateMachine, Function0 function0, long j, lnm<? super RiveKt$BindViewModelInstancesEffect$1$1$1> lnmVar) {
        super(2, lnmVar);
        this.$instance = viewModelInstance;
        this.$stateMachine = stateMachine;
        this.$requestPausedFrame = function0;
        this.$stateMachineHandle = j;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new RiveKt$BindViewModelInstancesEffect$1$1$1(this.$instance, this.$stateMachine, this.$requestPausedFrame, this.$stateMachineHandle, lnmVar);
    }

    public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            hm5.M(obj);
            at71 dirtyFlow = this.$instance.getDirtyFlow();
            final StateMachine stateMachine = this.$stateMachine;
            final Function0 function0 = this.$requestPausedFrame;
            final ViewModelInstance viewModelInstance = this.$instance;
            final long j = this.$stateMachineHandle;
            vr20 vr20Var = new vr20() { // from class: app.rive.RiveKt$BindViewModelInstancesEffect$1$1$1.1

                /* JADX INFO: renamed from: app.rive.RiveKt$BindViewModelInstancesEffect$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C00051 extends hab0 implements Function0 {
                    final /* synthetic */ ViewModelInstance $instance;
                    final /* synthetic */ long $stateMachineHandle;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00051(ViewModelInstance viewModelInstance, long j) {
                        super(0);
                        this.$instance = viewModelInstance;
                        this.$stateMachineHandle = j;
                    }

                    public final String invoke() {
                        return gvg.h("View model instance ", ViewModelInstanceHandle.m455toStringimpl(this.$instance.getInstanceHandle()), " dirty, unsettling ", StateMachineHandle.m439toStringimpl(this.$stateMachineHandle));
                    }
                }

                public final Object emit(rih1 rih1Var, lnm<? super rih1> lnmVar) {
                    RiveLog.INSTANCE.getLogger().v(ViewModelInstanceKt.VM_INSTANCE_TAG, new C00051(viewModelInstance, j));
                    stateMachine.unsettle$kotlin_release();
                    function0.invoke();
                    return rih1.a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj2, lnm lnmVar) {
                    return emit((rih1) obj2, (lnm<? super rih1>) lnmVar);
                }
            };
            this.label = 1;
            Object objCollect = dirtyFlow.collect(vr20Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }
}
