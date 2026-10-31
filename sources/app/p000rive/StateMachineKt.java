package app.p000rive;

import com.comscore.streaming.ContentType;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.adt;
import p.b0k;
import p.d9n;
import p.eg;
import p.fkj0;
import p.hab0;
import p.hm5;
import p.iu30;
import p.l1d;
import p.lnm;
import p.nku;
import p.nsw0;
import p.oku;
import p.psw0;
import p.q8r;
import p.qxd0;
import p.rih1;
import p.vu30;
import p.x340;
import p.yto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/rive/Artboard;", "artboard", "", "stateMachineName", "Lapp/rive/StateMachine;", "rememberStateMachine", "(Lapp/rive/Artboard;Ljava/lang/String;Lp/b0k;II)Lapp/rive/StateMachine;", "Lapp/rive/Result;", "rememberStateMachineResult", "(Lapp/rive/Artboard;Ljava/lang/String;Lp/b0k;II)Lapp/rive/Result;", "STATE_MACHINE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StateMachineKt {
    private static final String STATE_MACHINE_TAG = "Rive/StateMachine";

    /* JADX INFO: renamed from: app.rive.StateMachineKt$rememberStateMachine$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ StateMachine $stateMachine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateMachine stateMachine) {
            super(1);
            this.$stateMachine = stateMachine;
        }

        public final nku invoke(oku okuVar) {
            final StateMachine stateMachine = this.$stateMachine;
            return new nku() { // from class: app.rive.StateMachineKt$rememberStateMachine$1$invoke$$inlined$onDispose$1
                public void dispose() {
                    stateMachine.close();
                }
            };
        }
    }

    @adt
    public static final StateMachine rememberStateMachine(Artboard artboard, String str, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(735754808);
        if ((i2 & 2) != 0) {
            str = null;
        }
        x340Var.i0(-195428504);
        boolean zG = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.g(str)) || (i & 48) == 32) | x340Var.g(artboard);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = StateMachine.INSTANCE.fromArtboard(artboard, str);
            x340Var.s0(objT);
        }
        StateMachine stateMachine = (StateMachine) objT;
        x340Var.r(false);
        qxd0.i(stateMachine, new AnonymousClass1(stateMachine), x340Var);
        x340Var.r(false);
        return stateMachine;
    }

    public static final Result<StateMachine> rememberStateMachineResult(Artboard artboard, String str, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-479417918);
        if ((i2 & 2) != 0) {
            str = null;
        }
        x340Var.f0(1915972974, x340Var.K(artboard, str));
        Result<StateMachine> result = (Result) yto.q(Result.Loading.INSTANCE, x340Var, new C00541(artboard, str, null)).getValue();
        x340Var.r(false);
        x340Var.r(false);
        return result;
    }

    /* JADX INFO: renamed from: app.rive.StateMachineKt$rememberStateMachineResult$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.StateMachineKt$rememberStateMachineResult$1", f = "StateMachine.kt", l = {721, 730}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp/nsw0;", "Lapp/rive/Result;", "Lapp/rive/StateMachine;", "Lp/rih1;", "<anonymous>", "(Lp/nsw0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00541 extends a8d1 implements vu30 {
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ String $stateMachineName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00541(Artboard artboard, String str, lnm<? super C00541> lnmVar) {
            super(2, lnmVar);
            this.$artboard = artboard;
            this.$stateMachineName = str;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            C00541 c00541 = new C00541(this.$artboard, this.$stateMachineName, lnmVar);
            c00541.L$0 = obj;
            return c00541;
        }

        public final Object invoke(nsw0 nsw0Var, lnm<? super rih1> lnmVar) {
            return create(nsw0Var, lnmVar).invokeSuspend(rih1.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final Object invokeSuspend(Object obj) {
            ?? r0 = this.label;
            d9n d9nVar = d9n.a;
            try {
                if (r0 == 0) {
                    hm5.M(obj);
                    nsw0 nsw0Var = (nsw0) this.L$0;
                    StateMachine.Companion companion = StateMachine.INSTANCE;
                    Artboard artboard = this.$artboard;
                    String str = this.$stateMachineName;
                    this.L$0 = nsw0Var;
                    this.label = 1;
                    obj = companion.create(artboard, str, this);
                    r0 = nsw0Var;
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (r0 != 1) {
                        if (r0 == 2) {
                            throw l1d.v(obj);
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nsw0 nsw0Var2 = (nsw0) this.L$0;
                    hm5.M(obj);
                    r0 = nsw0Var2;
                }
                StateMachine stateMachine = (StateMachine) obj;
                psw0 psw0Var = (psw0) r0;
                psw0Var.setValue(new Result.Success(stateMachine));
                C00111 c00111 = new C00111(stateMachine);
                this.L$0 = null;
                this.label = 2;
                psw0Var.d(c00111, this);
                return d9nVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ((psw0) r0).setValue(new Result.Error(e2));
                return rih1.a;
            }
        }

        /* JADX INFO: renamed from: app.rive.StateMachineKt$rememberStateMachineResult$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C00111 extends hab0 implements Function0 {
            final /* synthetic */ StateMachine $stateMachine;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00111(StateMachine stateMachine) {
                super(0);
                this.$stateMachine = stateMachine;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m114invoke();
                return rih1.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m114invoke() {
                this.$stateMachine.close();
            }
        }
    }
}
