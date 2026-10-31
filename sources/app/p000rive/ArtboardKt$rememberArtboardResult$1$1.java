package app.p000rive;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.ArtboardKt$rememberArtboardResult$1$1", f = "Artboard.kt", l = {357, 366}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp/nsw0;", "Lapp/rive/Result;", "Lapp/rive/Artboard;", "Lp/rih1;", "<anonymous>", "(Lp/nsw0;)V"}, k = 3, mv = {1, 9, 0})
public final class ArtboardKt$rememberArtboardResult$1$1 extends a8d1 implements vu30 {
    final /* synthetic */ String $artboardName;
    final /* synthetic */ RiveFile $file;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtboardKt$rememberArtboardResult$1$1(RiveFile riveFile, String str, lnm<? super ArtboardKt$rememberArtboardResult$1$1> lnmVar) {
        super(2, lnmVar);
        this.$file = riveFile;
        this.$artboardName = str;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        ArtboardKt$rememberArtboardResult$1$1 artboardKt$rememberArtboardResult$1$1 = new ArtboardKt$rememberArtboardResult$1$1(this.$file, this.$artboardName, lnmVar);
        artboardKt$rememberArtboardResult$1$1.L$0 = obj;
        return artboardKt$rememberArtboardResult$1$1;
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
                Artboard.Companion companion = Artboard.INSTANCE;
                RiveFile riveFile = this.$file;
                String str = this.$artboardName;
                this.L$0 = nsw0Var;
                this.label = 1;
                obj = companion.create(riveFile, str, this);
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
            Artboard artboard = (Artboard) obj;
            psw0 psw0Var = (psw0) r0;
            psw0Var.setValue(new Result.Success(artboard));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(artboard);
            this.L$0 = null;
            this.label = 2;
            psw0Var.d(anonymousClass1, this);
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ((psw0) r0).setValue(new Result.Error(e2));
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.ArtboardKt$rememberArtboardResult$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Artboard $artboard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Artboard artboard) {
            super(0);
            this.$artboard = artboard;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            this.$artboard.close();
        }
    }
}
