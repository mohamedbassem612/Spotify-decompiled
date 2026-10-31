package app.p000rive;

import app.p000rive.core.CommandQueue;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a*\u0010\r\u001a\u00020\u0001*\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u0001*\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lapp/rive/ViewModelInstanceSource;", "Lp/rih1;", "checkOpen", "(Lapp/rive/ViewModelInstanceSource;)V", "Lapp/rive/ViewModelSource;", "(Lapp/rive/ViewModelSource;)V", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "worker", "Lapp/rive/core/FileHandle;", "fileHandle", "requireCompatibleWith-gj6um3I", "(Lapp/rive/ViewModelInstanceSource;Lapp/rive/core/CommandQueue;J)V", "requireCompatibleWith", "(Lapp/rive/ViewModelSource;Lapp/rive/core/CommandQueue;J)V", "Lapp/rive/RiveFile;", "file", "source", "Lapp/rive/ViewModelInstance;", "rememberViewModelInstance", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;Lp/b0k;II)Lapp/rive/ViewModelInstance;", "Lapp/rive/Result;", "rememberViewModelInstanceResult", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;Lp/b0k;II)Lapp/rive/Result;", "rememberViewModelInstanceResultFromSource", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;Lp/b0k;I)Lapp/rive/Result;", "", "VM_INSTANCE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewModelInstanceKt {
    public static final String VM_INSTANCE_TAG = "Rive/VMI";

    /* JADX INFO: renamed from: app.rive.ViewModelInstanceKt$rememberViewModelInstance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ ViewModelInstance $instance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewModelInstance viewModelInstance) {
            super(1);
            this.$instance = viewModelInstance;
        }

        public final nku invoke(oku okuVar) {
            final ViewModelInstance viewModelInstance = this.$instance;
            return new nku() { // from class: app.rive.ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1
                public void dispose() {
                    viewModelInstance.close();
                }
            };
        }
    }

    public static final void checkOpen(ViewModelInstanceSource viewModelInstanceSource) {
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Blank) {
            checkOpen(((ViewModelInstanceSource.Blank) viewModelInstanceSource).m150unboximpl());
            return;
        }
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Default) {
            checkOpen(((ViewModelInstanceSource.Default) viewModelInstanceSource).m157unboximpl());
            return;
        }
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Named) {
            checkOpen(((ViewModelInstanceSource.Named) viewModelInstanceSource).getVmSource());
        } else if (viewModelInstanceSource instanceof ViewModelInstanceSource.Reference) {
            ((ViewModelInstanceSource.Reference) viewModelInstanceSource).getParentInstance().checkOpen$kotlin_release();
        } else if (viewModelInstanceSource instanceof ViewModelInstanceSource.ReferenceListItem) {
            ((ViewModelInstanceSource.ReferenceListItem) viewModelInstanceSource).getParentInstance().checkOpen$kotlin_release();
        }
    }

    @adt
    public static final ViewModelInstance rememberViewModelInstance(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-2097877121);
        if ((i2 & 2) != 0) {
            viewModelInstanceSource = null;
        }
        x340Var.i0(-1219402425);
        if (viewModelInstanceSource == null) {
            viewModelInstanceSource = ViewModelSource.DefaultForArtboard.m161defaultInstanceimpl(ViewModelSource.DefaultForArtboard.m160constructorimpl(ArtboardKt.rememberArtboard(riveFile, null, x340Var, i & 14, 2)));
        }
        x340Var.r(false);
        x340Var.i0(-1219398998);
        boolean zG = ((((i & 14) ^ 6) > 4 && x340Var.g(riveFile)) || (i & 6) == 4) | x340Var.g(viewModelInstanceSource);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = ViewModelInstance.INSTANCE.fromFile(riveFile, viewModelInstanceSource);
            x340Var.s0(objT);
        }
        ViewModelInstance viewModelInstance = (ViewModelInstance) objT;
        x340Var.r(false);
        qxd0.i(viewModelInstance, new AnonymousClass1(viewModelInstance), x340Var);
        x340Var.r(false);
        return viewModelInstance;
    }

    public static final Result<ViewModelInstance> rememberViewModelInstanceResult(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, b0k b0kVar, int i, int i2) {
        Result<ViewModelInstance> resultRememberViewModelInstanceResultFromSource;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-607783436);
        if ((i2 & 2) != 0) {
            viewModelInstanceSource = null;
        }
        x340Var.i0(1026198000);
        if (viewModelInstanceSource != null) {
            Result<ViewModelInstance> resultRememberViewModelInstanceResultFromSource2 = rememberViewModelInstanceResultFromSource(riveFile, viewModelInstanceSource, x340Var, i & 126);
            x340Var.r(false);
            x340Var.r(false);
            return resultRememberViewModelInstanceResultFromSource2;
        }
        x340Var.r(false);
        int i3 = i & 14;
        Result<Artboard> resultRememberArtboardResult = ArtboardKt.rememberArtboardResult(riveFile, null, x340Var, i3, 2);
        if (resultRememberArtboardResult instanceof Result.Loading) {
            resultRememberViewModelInstanceResultFromSource = Result.Loading.INSTANCE;
        } else if (resultRememberArtboardResult instanceof Result.Error) {
            resultRememberViewModelInstanceResultFromSource = new Result.Error(((Result.Error) resultRememberArtboardResult).getThrowable());
        } else {
            if (!(resultRememberArtboardResult instanceof Result.Success)) {
                eg.o();
                return null;
            }
            Result.Success success = (Result.Success) resultRememberArtboardResult;
            Artboard artboard = (Artboard) success.getValue();
            x340Var.i0(1026209079);
            boolean zG = x340Var.g(artboard);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = ViewModelSource.DefaultForArtboard.m161defaultInstanceimpl(ViewModelSource.DefaultForArtboard.m160constructorimpl((Artboard) success.getValue()));
                x340Var.s0(objT);
            }
            x340Var.r(false);
            resultRememberViewModelInstanceResultFromSource = rememberViewModelInstanceResultFromSource(riveFile, (ViewModelInstanceSource) objT, x340Var, i3);
        }
        x340Var.r(false);
        return resultRememberViewModelInstanceResultFromSource;
    }

    private static final Result<ViewModelInstance> rememberViewModelInstanceResultFromSource(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(153215119);
        x340Var.f0(-907808120, x340Var.K(riveFile, viewModelInstanceSource));
        Result<ViewModelInstance> result = (Result) yto.q(Result.Loading.INSTANCE, x340Var, new C00721(riveFile, viewModelInstanceSource, null)).getValue();
        x340Var.r(false);
        x340Var.r(false);
        return result;
    }

    /* JADX INFO: renamed from: requireCompatibleWith-gj6um3I, reason: not valid java name */
    public static final void m141requireCompatibleWithgj6um3I(ViewModelInstanceSource viewModelInstanceSource, CommandQueue commandQueue, long j) {
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Blank) {
            m142requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Blank) viewModelInstanceSource).m150unboximpl(), commandQueue, j);
            return;
        }
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Default) {
            m142requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Default) viewModelInstanceSource).m157unboximpl(), commandQueue, j);
            return;
        }
        if (viewModelInstanceSource instanceof ViewModelInstanceSource.Named) {
            m142requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Named) viewModelInstanceSource).getVmSource(), commandQueue, j);
        } else if (viewModelInstanceSource instanceof ViewModelInstanceSource.Reference) {
            ((ViewModelInstanceSource.Reference) viewModelInstanceSource).getParentInstance().requireOwnedBy$kotlin_release(commandQueue);
        } else if (viewModelInstanceSource instanceof ViewModelInstanceSource.ReferenceListItem) {
            ((ViewModelInstanceSource.ReferenceListItem) viewModelInstanceSource).getParentInstance().requireOwnedBy$kotlin_release(commandQueue);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstanceKt$rememberViewModelInstanceResultFromSource$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.ViewModelInstanceKt$rememberViewModelInstanceResultFromSource$1", f = "ViewModelInstance.kt", l = {1247, 1256}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp/nsw0;", "Lapp/rive/Result;", "Lapp/rive/ViewModelInstance;", "Lp/rih1;", "<anonymous>", "(Lp/nsw0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00721 extends a8d1 implements vu30 {
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ ViewModelInstanceSource $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00721(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, lnm<? super C00721> lnmVar) {
            super(2, lnmVar);
            this.$file = riveFile;
            this.$source = viewModelInstanceSource;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            C00721 c00721 = new C00721(this.$file, this.$source, lnmVar);
            c00721.L$0 = obj;
            return c00721;
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
                    ViewModelInstance.Companion companion = ViewModelInstance.INSTANCE;
                    RiveFile riveFile = this.$file;
                    ViewModelInstanceSource viewModelInstanceSource = this.$source;
                    this.L$0 = nsw0Var;
                    this.label = 1;
                    obj = companion.create(riveFile, viewModelInstanceSource, this);
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
                ViewModelInstance viewModelInstance = (ViewModelInstance) obj;
                psw0 psw0Var = (psw0) r0;
                psw0Var.setValue(new Result.Success(viewModelInstance));
                C00121 c00121 = new C00121(viewModelInstance);
                this.L$0 = null;
                this.label = 2;
                psw0Var.d(c00121, this);
                return d9nVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ((psw0) r0).setValue(new Result.Error(e2));
                return rih1.a;
            }
        }

        /* JADX INFO: renamed from: app.rive.ViewModelInstanceKt$rememberViewModelInstanceResultFromSource$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C00121 extends hab0 implements Function0 {
            final /* synthetic */ ViewModelInstance $instance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(ViewModelInstance viewModelInstance) {
                super(0);
                this.$instance = viewModelInstance;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m143invoke();
                return rih1.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m143invoke() {
                this.$instance.close();
            }
        }
    }

    public static final void checkOpen(ViewModelSource viewModelSource) {
        if (viewModelSource instanceof ViewModelSource.DefaultForArtboard) {
            ((ViewModelSource.DefaultForArtboard) viewModelSource).m167unboximpl().checkOpen$kotlin_release();
        }
    }

    /* JADX INFO: renamed from: requireCompatibleWith-gj6um3I, reason: not valid java name */
    public static final void m142requireCompatibleWithgj6um3I(ViewModelSource viewModelSource, CommandQueue commandQueue, long j) {
        if (viewModelSource instanceof ViewModelSource.DefaultForArtboard) {
            ((ViewModelSource.DefaultForArtboard) viewModelSource).m167unboximpl().m2requireFromFilen824lvY$kotlin_release(commandQueue, j);
        }
    }
}
