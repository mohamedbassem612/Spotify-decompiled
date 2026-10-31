package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.runtime.kotlin.core.ViewModel;
import kotlin.Metadata;
import p.a8d1;
import p.at71;
import p.d9n;
import p.eg;
import p.enc1;
import p.hm5;
import p.l4p1;
import p.l811;
import p.lnm;
import p.mr20;
import p.onm;
import p.os00;
import p.q8r;
import p.rih1;
import p.rqt0;
import p.u890;
import p.vr20;
import p.vu30;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1", f = "ViewModelInstance.kt", l = {486}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lp/vr20;", "Lp/rih1;", "<anonymous>", "(Lp/vr20;)V"}, k = 3, mv = {1, 9, 0})
public final class ViewModelInstance$getPropertyFlow$1$1 extends a8d1 implements vu30 {
    final /* synthetic */ xu30 $getter;
    final /* synthetic */ String $propertyPath;
    final /* synthetic */ ViewModel.PropertyDataType $propertyType;
    final /* synthetic */ at71 $updateFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$1, reason: invalid class name */
    @q8r(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1$1", f = "ViewModelInstance.kt", l = {496}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00030\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp/vr20;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lapp/rive/core/RivePropertyUpdate;", "Lp/rih1;", "<anonymous>", "(Lp/vr20;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ xu30 $getter;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ l811 $subscriptionAcquired;
        final /* synthetic */ PropertySubscriptionKey $subscriptionKey;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l811 l811Var, ViewModelInstance viewModelInstance, PropertySubscriptionKey propertySubscriptionKey, xu30 xu30Var, String str, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$subscriptionAcquired = l811Var;
            this.this$0 = viewModelInstance;
            this.$subscriptionKey = propertySubscriptionKey;
            this.$getter = xu30Var;
            this.$propertyPath = str;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass1(this.$subscriptionAcquired, this.this$0, this.$subscriptionKey, this.$getter, this.$propertyPath, lnmVar);
        }

        public final Object invoke(vr20 vr20Var, lnm<? super rih1> lnmVar) {
            return create(vr20Var, lnmVar).invokeSuspend(rih1.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v9 */
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    hm5.M(obj);
                    this.$subscriptionAcquired.a = this.this$0.propertySubscriptions.acquire(this.$subscriptionKey);
                    if (this.$subscriptionAcquired.a) {
                        xu30 xu30Var = this.$getter;
                        ViewModelInstanceHandle viewModelInstanceHandleM450boximpl = ViewModelInstanceHandle.m450boximpl(this.this$0.getInstanceHandle());
                        String str = this.$propertyPath;
                        this.label = 1;
                        Object objInvoke = xu30Var.invoke(viewModelInstanceHandleM450boximpl, str, this);
                        d9n d9nVar = d9n.a;
                        this = objInvoke;
                        if (objInvoke == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1.a;
                }
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this = this;
            } catch (RiveViewModelInstanceException e) {
                if (!this.this$0.closer.getClosed()) {
                    throw e;
                }
            }
            return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getPropertyFlow$1$1(ViewModelInstance viewModelInstance, String str, ViewModel.PropertyDataType propertyDataType, at71 at71Var, xu30 xu30Var, lnm<? super ViewModelInstance$getPropertyFlow$1$1> lnmVar) {
        super(2, lnmVar);
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
        this.$propertyType = propertyDataType;
        this.$updateFlow = at71Var;
        this.$getter = xu30Var;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        ViewModelInstance$getPropertyFlow$1$1 viewModelInstance$getPropertyFlow$1$1 = new ViewModelInstance$getPropertyFlow$1$1(this.this$0, this.$propertyPath, this.$propertyType, this.$updateFlow, this.$getter, lnmVar);
        viewModelInstance$getPropertyFlow$1$1.L$0 = obj;
        return viewModelInstance$getPropertyFlow$1$1;
    }

    public final Object invoke(vr20 vr20Var, lnm<? super rih1> lnmVar) {
        return create(vr20Var, lnmVar).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:? A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        l811 l811Var;
        PropertySubscriptionKey propertySubscriptionKey;
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
            } catch (Throwable th2) {
                th = th2;
                if (l811Var.a) {
                    throw th;
                }
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                throw th;
            }
        }
        hm5.M(obj);
        vr20 vr20Var = (vr20) this.L$0;
        this.this$0.closer.checkOpen();
        PropertySubscriptionKey propertySubscriptionKey2 = new PropertySubscriptionKey(this.$propertyPath, this.$propertyType);
        l811 l811Var2 = new l811();
        try {
            ViewModelInstance viewModelInstance = this.this$0;
            final enc1 enc1Var = new enc1(this.$updateFlow, new AnonymousClass1(l811Var2, viewModelInstance, propertySubscriptionKey2, this.$getter, this.$propertyPath, null));
            final ViewModelInstance viewModelInstance2 = this.this$0;
            final String str = this.$propertyPath;
            final mr20 mr20Var = new mr20() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lp/rih1;", "emit", "(Ljava/lang/Object;Lp/lnm;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class AnonymousClass2<T> implements vr20 {
                    final /* synthetic */ String $propertyPath$inlined;
                    final /* synthetic */ vr20 $this_unsafeFlow;
                    final /* synthetic */ ViewModelInstance this$0;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @q8r(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
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
            mr20 mr20VarCompleteWhenClosed = viewModelInstance.completeWhenClosed(rqt0.u(new mr20() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lp/rih1;", "emit", "(Ljava/lang/Object;Lp/lnm;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class AnonymousClass2<T> implements vr20 {
                    final /* synthetic */ vr20 $this_unsafeFlow;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @q8r(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
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
                        if (i2 == 0) {
                            hm5.M(obj2);
                            vr20 vr20Var = this.$this_unsafeFlow;
                            Object value = ((CommandQueue.PropertyUpdate) obj).getValue();
                            anonymousClass1.label = 1;
                            Object objEmit = vr20Var.emit(value, anonymousClass1);
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
                        return rih1.a;
                    }
                }

                public Object collect(vr20 vr20Var2, lnm lnmVar) {
                    Object objCollect = mr20Var.collect(new AnonymousClass2(vr20Var2), lnmVar);
                    return objCollect == d9n.a ? objCollect : rih1.a;
                }
            }));
            this.L$0 = propertySubscriptionKey2;
            this.L$1 = l811Var2;
            this.label = 1;
            Object objS = l4p1.s(vr20Var, mr20VarCompleteWhenClosed, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            l811Var = l811Var2;
            propertySubscriptionKey = propertySubscriptionKey2;
            if (l811Var.a) {
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            }
            return rih1.a;
        } catch (Throwable th3) {
            th = th3;
            l811Var = l811Var2;
            propertySubscriptionKey = propertySubscriptionKey2;
            if (l811Var.a) {
                throw th;
            }
            this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            throw th;
        }
    }
}
