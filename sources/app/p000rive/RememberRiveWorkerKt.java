package app.p000rive;

import app.p000rive.core.AudioEngine;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.FrameTicker;
import app.p000rive.core.FrameTickerKt;
import com.comscore.streaming.ContentType;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import p.a8d1;
import p.b0k;
import p.c9n;
import p.d9n;
import p.e331;
import p.eg;
import p.fkj0;
import p.hab0;
import p.hap1;
import p.hm5;
import p.iac0;
import p.iu30;
import p.jfe0;
import p.lnm;
import p.m231;
import p.nku;
import p.oku;
import p.q8r;
import p.qxd0;
import p.rih1;
import p.v8r;
import p.ven0;
import p.vu30;
import p.w8c0;
import p.x340;
import p.x8c0;
import p.z8p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\f\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\b\u001aG\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "autoPoll", "tracingEnabled", "Lapp/rive/RenderBackend;", "renderBackend", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "rememberRiveWorker", "(ZZLapp/rive/RenderBackend;Lp/b0k;II)Lapp/rive/core/CommandQueue;", "Lp/ven0;", "", "errorState", "rememberRiveWorkerOrNull", "(Lp/ven0;ZZLapp/rive/RenderBackend;Lp/b0k;II)Lapp/rive/core/CommandQueue;", "rememberDeferredRiveWorker", "deferred", "rememberRiveWorkerImpl", "(Lp/ven0;ZZZLapp/rive/RenderBackend;Lp/b0k;I)Lapp/rive/core/CommandQueue;", "createRiveWorker", "(Lapp/rive/RenderBackend;ZZ)Lapp/rive/core/CommandQueue;", "", "RIVE_WORKER_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RememberRiveWorkerKt {
    public static final String RIVE_WORKER_TAG = "Rive/Worker";

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$1, reason: invalid class name */
    @q8r(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$1", f = "RememberRiveWorker.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ boolean $tracingEnabled;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, boolean z, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$worker = commandQueue;
            this.$tracingEnabled = z;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass1(this.$worker, this.$tracingEnabled, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            CommandQueue commandQueue = this.$worker;
            rih1 rih1Var = rih1.a;
            if (commandQueue == null) {
                return rih1Var;
            }
            commandQueue.setTracingEnabled(this.$tracingEnabled);
            return rih1Var;
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$2, reason: invalid class name */
    @q8r(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$2", f = "RememberRiveWorker.kt", l = {168}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends a8d1 implements vu30 {
        final /* synthetic */ boolean $autoPoll;
        final /* synthetic */ iac0 $lifecycleOwner;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue, boolean z, iac0 iac0Var, lnm<? super AnonymousClass2> lnmVar) {
            super(2, lnmVar);
            this.$worker = commandQueue;
            this.$autoPoll = z;
            this.$lifecycleOwner = iac0Var;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass2(this.$worker, this.$autoPoll, this.$lifecycleOwner, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            rih1 rih1Var = rih1.a;
            if (i == 0) {
                hm5.M(obj);
                CommandQueue commandQueue = this.$worker;
                if (commandQueue != null && this.$autoPoll) {
                    x8c0 lifecycle = this.$lifecycleOwner.getLifecycle();
                    FrameTicker composeFrameTicker = FrameTickerKt.getComposeFrameTicker();
                    this.label = 1;
                    Object objBeginPolling = commandQueue.beginPolling(lifecycle, composeFrameTicker, this);
                    d9n d9nVar = d9n.a;
                    if (objBeginPolling == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1Var;
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$3, reason: invalid class name */
    @q8r(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$3", f = "RememberRiveWorker.kt", l = {178}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass3 extends a8d1 implements vu30 {
        final /* synthetic */ iac0 $lifecycleOwner;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1, reason: invalid class name */
        @q8r(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1", f = "RememberRiveWorker.kt", l = {182}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass1 extends a8d1 implements vu30 {
            int label;

            public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
                super(2, lnmVar);
            }

            public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
                return new AnonymousClass1(lnmVar);
            }

            public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
                return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
            }

            public final Object invokeSuspend(Object obj) {
                d9n d9nVar = d9n.a;
                int i = this.label;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    AudioEngine.INSTANCE.acquire();
                    this.label = 1;
                    hap1.f(this);
                    return d9nVar;
                } catch (Throwable th) {
                    AudioEngine.INSTANCE.release();
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CommandQueue commandQueue, iac0 iac0Var, lnm<? super AnonymousClass3> lnmVar) {
            super(2, lnmVar);
            this.$worker = commandQueue;
            this.$lifecycleOwner = iac0Var;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass3(this.$worker, this.$lifecycleOwner, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            rih1 rih1Var = rih1.a;
            if (i == 0) {
                hm5.M(obj);
                if (this.$worker == null) {
                    return rih1Var;
                }
                x8c0 lifecycle = this.$lifecycleOwner.getLifecycle();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                Object objT = z8p1.t(lifecycle, w8c0.e, anonymousClass1, this);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1Var;
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass4 extends hab0 implements iu30 {
        final /* synthetic */ CommandQueue $worker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CommandQueue commandQueue) {
            super(1);
            this.$worker = commandQueue;
        }

        public final nku invoke(oku okuVar) {
            final CommandQueue commandQueue = this.$worker;
            return commandQueue == null ? new nku() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$4$invoke$$inlined$onDispose$1
                public void dispose() {
                }
            } : new nku() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$4$invoke$$inlined$onDispose$2
                public void dispose() {
                    commandQueue.release(RememberRiveWorkerKt.RIVE_WORKER_TAG, "Compose dispose");
                }
            };
        }
    }

    private static final CommandQueue createRiveWorker(RenderBackend renderBackend, boolean z, boolean z2) {
        return z2 ? CommandQueue.INSTANCE.createDeferred$kotlin_release(renderBackend, z) : new CommandQueue(renderBackend, z);
    }

    public static final CommandQueue rememberDeferredRiveWorker(boolean z, boolean z2, RenderBackend renderBackend, b0k b0kVar, int i, int i2) throws RiveInitializationException {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1742653188);
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 2) != 0 ? false : z2;
        if ((i2 & 4) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        RenderBackend renderBackend2 = renderBackend;
        x340Var.i0(-439095368);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = v8r.q((Object) null);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        int i3 = i << 3;
        CommandQueue commandQueueRememberRiveWorkerImpl = rememberRiveWorkerImpl(ven0Var, z3, z4, true, renderBackend2, x340Var, (i3 & 896) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | 3078 | ((i << 6) & 57344));
        if (commandQueueRememberRiveWorkerImpl == null) {
            throw new RiveInitializationException("Failed to create Rive worker", (Throwable) ven0Var.getValue());
        }
        x340Var.r(false);
        return commandQueueRememberRiveWorkerImpl;
    }

    public static final CommandQueue rememberRiveWorker(boolean z, boolean z2, RenderBackend renderBackend, b0k b0kVar, int i, int i2) throws RiveInitializationException {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1320975267);
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 2) != 0 ? false : z2;
        if ((i2 & 4) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        RenderBackend renderBackend2 = renderBackend;
        x340Var.i0(1768107385);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = v8r.q((Object) null);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        int i3 = i << 3;
        CommandQueue commandQueueRememberRiveWorkerOrNull = rememberRiveWorkerOrNull(ven0Var, z3, z4, renderBackend2, x340Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i3 & 896) | (i3 & 7168), 0);
        if (commandQueueRememberRiveWorkerOrNull == null) {
            throw new RiveInitializationException("Failed to create Rive worker", (Throwable) ven0Var.getValue());
        }
        x340Var.r(false);
        return commandQueueRememberRiveWorkerOrNull;
    }

    private static final CommandQueue rememberRiveWorkerImpl(ven0 ven0Var, boolean z, boolean z2, boolean z3, RenderBackend renderBackend, b0k b0kVar, int i) {
        Object m231Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1447310134);
        iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
        x340Var.i0(2035597763);
        boolean z4 = true;
        boolean z5 = (((57344 & i) ^ 24576) > 16384 && x340Var.g(renderBackend)) || (i & 24576) == 16384;
        if ((((i & 7168) ^ 3072) <= 2048 || !x340Var.h(z3)) && (i & 3072) != 2048) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object objT = x340Var.T();
        if (z6 || objT == fkj0.X) {
            try {
                m231Var = createRiveWorker(renderBackend, z2, z3);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                if (ven0Var.getValue() == null) {
                    ven0Var.setValue(thA);
                }
                RiveLog.INSTANCE.getLogger().e(RIVE_WORKER_TAG, null, new RememberRiveWorkerKt$rememberRiveWorkerImpl$worker$1$2$1(thA));
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            objT = (CommandQueue) m231Var;
            x340Var.s0(objT);
        }
        CommandQueue commandQueue = (CommandQueue) objT;
        x340Var.r(false);
        qxd0.s(commandQueue, Boolean.valueOf(z2), new AnonymousClass1(commandQueue, z2, null), x340Var);
        qxd0.r(iac0Var, commandQueue, Boolean.valueOf(z), new AnonymousClass2(commandQueue, z, iac0Var, null), x340Var);
        qxd0.s(commandQueue, iac0Var, new AnonymousClass3(commandQueue, iac0Var, null), x340Var);
        qxd0.i(commandQueue, new AnonymousClass4(commandQueue), x340Var);
        x340Var.r(false);
        return commandQueue;
    }

    public static final CommandQueue rememberRiveWorkerOrNull(ven0 ven0Var, boolean z, boolean z2, RenderBackend renderBackend, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1731954884);
        if ((i2 & 1) != 0) {
            ven0Var = v8r.q((Object) null);
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        CommandQueue commandQueueRememberRiveWorkerImpl = rememberRiveWorkerImpl(ven0Var, z, z2, false, renderBackend, x340Var, (i & 14) | 3072 | (i & ContentType.LONG_FORM_ON_DEMAND) | (i & 896) | ((i << 3) & 57344));
        x340Var.r(false);
        return commandQueueRememberRiveWorkerImpl;
    }
}
