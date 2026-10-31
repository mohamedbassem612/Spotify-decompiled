package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.runtime.kotlin.core.ViewModel;
import kotlin.Metadata;
import p.a8d1;
import p.d9n;
import p.eg;
import p.enc1;
import p.hm5;
import p.l4p1;
import p.l811;
import p.lnm;
import p.mr20;
import p.o4p1;
import p.onm;
import p.os00;
import p.q8r;
import p.rih1;
import p.u890;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.ViewModelInstance$getTriggerFlow$1$1", f = "ViewModelInstance.kt", l = {676}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/vr20;", "Lp/rih1;", "<anonymous>", "(Lp/vr20;)V"}, k = 3, mv = {1, 9, 0})
public final class ViewModelInstance$getTriggerFlow$1$1 extends a8d1 implements vu30 {
    final /* synthetic */ String $propertyPath;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$1, reason: invalid class name */
    @q8r(c = "app.rive.ViewModelInstance$getTriggerFlow$1$1$1", f = "ViewModelInstance.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp/vr20;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lp/rih1;", "<anonymous>", "(Lp/vr20;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ l811 $subscriptionAcquired;
        final /* synthetic */ PropertySubscriptionKey $subscriptionKey;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l811 l811Var, ViewModelInstance viewModelInstance, PropertySubscriptionKey propertySubscriptionKey, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$subscriptionAcquired = l811Var;
            this.this$0 = viewModelInstance;
            this.$subscriptionKey = propertySubscriptionKey;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass1(this.$subscriptionAcquired, this.this$0, this.$subscriptionKey, lnmVar);
        }

        public final Object invoke(vr20 vr20Var, lnm<? super rih1> lnmVar) {
            return create(vr20Var, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            this.$subscriptionAcquired.a = this.this$0.propertySubscriptions.acquire(this.$subscriptionKey);
            return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getTriggerFlow$1$1(ViewModelInstance viewModelInstance, String str, lnm<? super ViewModelInstance$getTriggerFlow$1$1> lnmVar) {
        super(2, lnmVar);
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        ViewModelInstance$getTriggerFlow$1$1 viewModelInstance$getTriggerFlow$1$1 = new ViewModelInstance$getTriggerFlow$1$1(this.this$0, this.$propertyPath, lnmVar);
        viewModelInstance$getTriggerFlow$1$1.L$0 = obj;
        return viewModelInstance$getTriggerFlow$1$1;
    }

    public final Object invoke(vr20 vr20Var, lnm<? super rih1> lnmVar) {
        return create(vr20Var, lnmVar).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PropertySubscriptionKey propertySubscriptionKey;
        l811 l811Var;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l811Var = (l811) this.L$1;
            propertySubscriptionKey = (PropertySubscriptionKey) this.L$0;
            try {
                hm5.M(obj);
                if (l811Var.a) {
                    this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                }
                return rih1.a;
            } catch (Throwable th) {
                th = th;
                if (l811Var.a) {
                    this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                }
                throw th;
            }
        }
        hm5.M(obj);
        vr20 vr20Var = (vr20) this.L$0;
        this.this$0.closer.checkOpen();
        PropertySubscriptionKey propertySubscriptionKey2 = new PropertySubscriptionKey(this.$propertyPath, ViewModel.PropertyDataType.TRIGGER);
        l811 l811Var2 = new l811();
        try {
            ViewModelInstance viewModelInstance = this.this$0;
            final enc1 enc1Var = new enc1(viewModelInstance.riveWorker.getTriggerPropertyFlow(), new AnonymousClass1(l811Var2, this.this$0, propertySubscriptionKey2, null));
            final ViewModelInstance viewModelInstance2 = this.this$0;
            final String str = this.$propertyPath;
            final mr20 mr20Var = new mr20() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lp/rih1;", "emit", "(Ljava/lang/Object;Lp/lnm;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class AnonymousClass2<T> implements vr20 {
                    final /* synthetic */ String $propertyPath$inlined;
                    final /* synthetic */ vr20 $this_unsafeFlow;
                    final /* synthetic */ ViewModelInstance this$0;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @q8r(c = "app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class AnonymousClass1 extends onm {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(lnm lnmVar) {
                            super(lnmVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= os00.INVALID_ID;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(vr20 vr20Var, ViewModelInstance viewModelInstance, String str) {
                        this.$this_unsafeFlow = vr20Var;
                        this.this$0 = viewModelInstance;
                        this.$propertyPath$inlined = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    public final Object emit(Object obj, lnm lnmVar) {
                        AnonymousClass1 anonymousClass1;
                        if (lnmVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) lnmVar;
                            int i = anonymousClass1.label;
                            if ((i & os00.INVALID_ID) != 0) {
                                anonymousClass1.label = i - os00.INVALID_ID;
                            } else {
                                anonymousClass1 = new AnonymousClass1(lnmVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(lnmVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            hm5.M(obj2);
                            vr20 vr20Var = this.$this_unsafeFlow;
                            CommandQueue.PropertyUpdate propertyUpdate = (CommandQueue.PropertyUpdate) obj;
                            if (ViewModelInstanceHandle.m453equalsimpl0(propertyUpdate.m299getHandleVPLto4w(), this.this$0.getInstanceHandle()) && u890.j(propertyUpdate.getPropertyPath(), this.$propertyPath$inlined)) {
                                anonymousClass1.label = 1;
                                Object objEmit = vr20Var.emit(obj, anonymousClass1);
                                d9n d9nVar = d9n.a;
                                if (objEmit == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj2);
                        }
                        return rih1.a;
                    }
                }

                public Object collect(vr20 vr20Var2, lnm lnmVar) {
                    Object objCollect = enc1Var.collect(new AnonymousClass2(vr20Var2, viewModelInstance2, str), lnmVar);
                    return objCollect == d9n.a ? objCollect : rih1.a;
                }
            };
            mr20 mr20VarCompleteWhenClosed = viewModelInstance.completeWhenClosed(o4p1.j(new mr20() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lp/rih1;", "emit", "(Ljava/lang/Object;Lp/lnm;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class AnonymousClass2<T> implements vr20 {
                    final /* synthetic */ vr20 $this_unsafeFlow;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @q8r(c = "app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class AnonymousClass1 extends onm {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(lnm lnmVar) {
                            super(lnmVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= os00.INVALID_ID;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(vr20 vr20Var) {
                        this.$this_unsafeFlow = vr20Var;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    public final Object emit(Object obj, lnm lnmVar) {
                        AnonymousClass1 anonymousClass1;
                        if (lnmVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) lnmVar;
                            int i = anonymousClass1.label;
                            if ((i & os00.INVALID_ID) != 0) {
                                anonymousClass1.label = i - os00.INVALID_ID;
                            } else {
                                anonymousClass1 = new AnonymousClass1(lnmVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(lnmVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        int i2 = anonymousClass1.label;
                        rih1 rih1Var = rih1.a;
                        if (i2 == 0) {
                            hm5.M(obj2);
                            vr20 vr20Var = this.$this_unsafeFlow;
                            anonymousClass1.label = 1;
                            Object objEmit = vr20Var.emit(rih1Var, anonymousClass1);
                            d9n d9nVar = d9n.a;
                            if (objEmit == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (i2 != 1) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj2);
                        }
                        return rih1Var;
                    }
                }

                public Object collect(vr20 vr20Var2, lnm lnmVar) {
                    Object objCollect = mr20Var.collect(new AnonymousClass2(vr20Var2), lnmVar);
                    return objCollect == d9n.a ? objCollect : rih1.a;
                }
            }, 32, 2));
            this.L$0 = propertySubscriptionKey2;
            this.L$1 = l811Var2;
            this.label = 1;
            Object objS = l4p1.s(vr20Var, mr20VarCompleteWhenClosed, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            propertySubscriptionKey = propertySubscriptionKey2;
            l811Var = l811Var2;
            if (l811Var.a) {
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            }
            return rih1.a;
        } catch (Throwable th2) {
            th = th2;
            propertySubscriptionKey = propertySubscriptionKey2;
            l811Var = l811Var2;
            if (l811Var.a) {
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            }
            throw th;
        }
    }
}
