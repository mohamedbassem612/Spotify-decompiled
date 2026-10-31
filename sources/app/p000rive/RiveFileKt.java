package app.p000rive;

import app.p000rive.core.CommandQueue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.b0k;
import p.d9n;
import p.eg;
import p.hab0;
import p.hm5;
import p.l1d;
import p.lnm;
import p.nsw0;
import p.psw0;
import p.q8r;
import p.rih1;
import p.vu30;
import p.x340;
import p.yto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/rive/RiveFileSource;", "source", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/Result;", "Lapp/rive/RiveFile;", "rememberRiveFile", "(Lapp/rive/RiveFileSource;Lapp/rive/core/CommandQueue;Lp/b0k;I)Lapp/rive/Result;", "", "FILE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RiveFileKt {
    private static final String FILE_TAG = "Rive/File";

    public static final Result<RiveFile> rememberRiveFile(RiveFileSource riveFileSource, CommandQueue commandQueue, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1107398644);
        x340Var.f0(-101246241, x340Var.K(riveFileSource, commandQueue));
        Result<RiveFile> result = (Result) yto.q(Result.Loading.INSTANCE, x340Var, new AnonymousClass1(riveFileSource, commandQueue, null)).getValue();
        x340Var.r(false);
        x340Var.r(false);
        return result;
    }

    /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveFileKt$rememberRiveFile$1", f = "RiveFile.kt", l = {386, 395}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp/nsw0;", "Lapp/rive/Result;", "Lapp/rive/RiveFile;", "Lp/rih1;", "<anonymous>", "(Lp/nsw0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ RiveFileSource $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveFileSource riveFileSource, CommandQueue commandQueue, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$source = riveFileSource;
            this.$riveWorker = commandQueue;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$source, this.$riveWorker, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                    RiveFile.Companion companion = RiveFile.INSTANCE;
                    RiveFileSource riveFileSource = this.$source;
                    CommandQueue commandQueue = this.$riveWorker;
                    this.L$0 = nsw0Var;
                    this.label = 1;
                    obj = companion.load(riveFileSource, commandQueue, this);
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
                RiveFile riveFile = (RiveFile) obj;
                psw0 psw0Var = (psw0) r0;
                psw0Var.setValue(new Result.Success(riveFile));
                C00041 c00041 = new C00041(riveFile);
                this.L$0 = null;
                this.label = 2;
                psw0Var.d(c00041, this);
                return d9nVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ((psw0) r0).setValue(new Result.Error(e2));
                return rih1.a;
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C00041 extends hab0 implements Function0 {
            final /* synthetic */ RiveFile $file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(RiveFile riveFile) {
                super(0);
                this.$file = riveFile;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m57invoke();
                return rih1.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m57invoke() {
                this.$file.close();
            }
        }
    }
}
