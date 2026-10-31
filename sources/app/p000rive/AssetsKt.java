package app.p000rive;

import app.p000rive.core.CommandQueue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.b0k;
import p.d9n;
import p.eg;
import p.fkj0;
import p.hab0;
import p.hm5;
import p.j2h1;
import p.l1d;
import p.lnm;
import p.nla0;
import p.nsw0;
import p.psw0;
import p.q8r;
import p.rih1;
import p.vu30;
import p.x340;
import p.xu30;
import p.yto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\r\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\r\u001a1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0010\u001ay\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00010\u0018\"\u0004\b\u0001\u0010\u001a2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\b2,\u0010\u001e\u001a(\b\u0001\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "", "tag", "Lapp/rive/AcquiredWorkerReference;", "acquireForAsset", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;)Lapp/rive/AcquiredWorkerReference;", "riveWorker", "", "bytes", "Lapp/rive/Result;", "Lapp/rive/ImageAsset;", "rememberImage", "(Lapp/rive/core/CommandQueue;[BLp/b0k;I)Lapp/rive/Result;", "key", "rememberRegisteredImage", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;[BLp/b0k;I)Lapp/rive/Result;", "Lapp/rive/AudioAsset;", "rememberAudio", "rememberRegisteredAudio", "Lapp/rive/FontAsset;", "rememberFont", "name", "rememberRegisteredFont", "Lapp/rive/Asset;", "T", "H", "Lkotlin/Function3;", "Lp/lnm;", "", "constructFn", "rememberAsset", "(Lapp/rive/core/CommandQueue;[BLp/xu30;Ljava/lang/String;Lp/b0k;II)Lapp/rive/Result;", "IMAGE_TAG", "Ljava/lang/String;", "AUDIO_TAG", "FONT_TAG", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AssetsKt {
    private static final String AUDIO_TAG = "Rive/Audio";
    private static final String FONT_TAG = "Rive/Font";
    private static final String IMAGE_TAG = "Rive/Image";

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcquiredWorkerReference acquireForAsset(CommandQueue commandQueue, String str) {
        commandQueue.acquire(str);
        return new AcquiredWorkerReference(commandQueue);
    }

    private static final <T extends Asset<H>, H> Result<T> rememberAsset(CommandQueue commandQueue, byte[] bArr, xu30 xu30Var, String str, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1948076516);
        if ((i2 & 8) != 0) {
            str = null;
        }
        String str2 = str;
        x340Var.f0(584207715, x340Var.K(x340Var.K(commandQueue, bArr), str2));
        Result<T> result = (Result) yto.q(Result.Loading.INSTANCE, x340Var, new AnonymousClass1(xu30Var, commandQueue, bArr, str2, null)).getValue();
        x340Var.r(false);
        x340Var.r(false);
        return result;
    }

    public static final Result<AudioAsset> rememberAudio(CommandQueue commandQueue, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-172942467);
        AudioAsset.Companion companion = AudioAsset.INSTANCE;
        x340Var.i0(627589952);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberAudio$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<AudioAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, null, x340Var, 584, 8);
        x340Var.r(false);
        return resultRememberAsset;
    }

    public static final Result<FontAsset> rememberFont(CommandQueue commandQueue, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1828927668);
        FontAsset.Companion companion = FontAsset.INSTANCE;
        x340Var.i0(574649384);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberFont$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<FontAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, null, x340Var, 584, 8);
        x340Var.r(false);
        return resultRememberAsset;
    }

    public static final Result<ImageAsset> rememberImage(CommandQueue commandQueue, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(230115522);
        ImageAsset.Companion companion = ImageAsset.INSTANCE;
        x340Var.i0(-1094253787);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberImage$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<ImageAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, null, x340Var, 584, 8);
        x340Var.r(false);
        return resultRememberAsset;
    }

    public static final Result<AudioAsset> rememberRegisteredAudio(CommandQueue commandQueue, String str, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1549342040);
        AudioAsset.Companion companion = AudioAsset.INSTANCE;
        x340Var.i0(-2131054146);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberRegisteredAudio$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<AudioAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, str, x340Var, ((i << 6) & 7168) | 584, 0);
        x340Var.r(false);
        return resultRememberAsset;
    }

    public static final Result<FontAsset> rememberRegisteredFont(CommandQueue commandQueue, String str, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(2020117749);
        FontAsset.Companion companion = FontAsset.INSTANCE;
        x340Var.i0(208600010);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberRegisteredFont$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<FontAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, str, x340Var, ((i << 6) & 7168) | 584, 0);
        x340Var.r(false);
        return resultRememberAsset;
    }

    public static final Result<ImageAsset> rememberRegisteredImage(CommandQueue commandQueue, String str, byte[] bArr, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(762656195);
        ImageAsset.Companion companion = ImageAsset.INSTANCE;
        x340Var.i0(442069571);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new AssetsKt$rememberRegisteredImage$1$1(companion);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<ImageAsset> resultRememberAsset = rememberAsset(commandQueue, bArr, (nla0) objT, str, x340Var, ((i << 6) & 7168) | 584, 0);
        x340Var.r(false);
        return resultRememberAsset;
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1, reason: invalid class name */
    @q8r(c = "app.rive.AssetsKt$rememberAsset$1", f = "Assets.kt", l = {668, 699}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lapp/rive/Asset;", "T", "H", "Lp/nsw0;", "Lapp/rive/Result;", "Lp/rih1;", "<anonymous>", "(Lp/nsw0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ xu30 $constructFn;
        final /* synthetic */ String $key;
        final /* synthetic */ CommandQueue $riveWorker;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xu30 xu30Var, CommandQueue commandQueue, byte[] bArr, String str, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$constructFn = xu30Var;
            this.$riveWorker = commandQueue;
            this.$bytes = bArr;
            this.$key = str;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constructFn, this.$riveWorker, this.$bytes, this.$key, lnmVar);
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
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final Object invokeSuspend(Object obj) {
            ?? r0 = this.label;
            rih1 rih1Var = rih1.a;
            d9n d9nVar = d9n.a;
            try {
                if (r0 == 0) {
                    hm5.M(obj);
                    nsw0 nsw0Var = (nsw0) this.L$0;
                    xu30 xu30Var = this.$constructFn;
                    CommandQueue commandQueue = this.$riveWorker;
                    byte[] bArr = this.$bytes;
                    this.L$0 = nsw0Var;
                    this.label = 1;
                    obj = xu30Var.invoke(commandQueue, bArr, this);
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
                Asset asset = (Asset) obj;
                String str = this.$key;
                if (str != null) {
                    try {
                        asset.register(str);
                    } catch (CancellationException e) {
                        try {
                            asset.close();
                        } catch (Exception e2) {
                            j2h1.h(e, e2);
                        }
                        throw e;
                    } catch (Exception e3) {
                        try {
                            asset.close();
                        } catch (Exception e4) {
                            j2h1.h(e3, e4);
                        }
                        ((psw0) r0).setValue(new Result.Error(e3));
                        return rih1Var;
                    }
                }
                psw0 psw0Var = (psw0) r0;
                psw0Var.setValue(new Result.Success(asset));
                C00001 c00001 = new C00001(this.$key, asset);
                this.L$0 = null;
                this.label = 2;
                psw0Var.d(c00001, this);
                return d9nVar;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                ((psw0) r0).setValue(new Result.Error(e6));
                return rih1Var;
            }
        }

        /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lapp/rive/Asset;", "T", "H", "Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C00001 extends hab0 implements Function0 {

            /* JADX INFO: Incorrect field signature: TT; */
            final /* synthetic */ Asset $asset;
            final /* synthetic */ String $key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;)V */
            public C00001(String str, Asset asset) {
                super(0);
                this.$key = str;
                this.$asset = asset;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
                String str = this.$key;
                Asset asset = this.$asset;
                if (str == null) {
                    asset.close();
                    return;
                }
                try {
                    asset.unregister(str);
                } finally {
                    this.$asset.close();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return rih1.a;
            }
        }
    }
}
