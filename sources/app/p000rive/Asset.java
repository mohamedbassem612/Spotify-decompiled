package app.p000rive;

import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.gvg;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001'B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0003()*¨\u0006+"}, d2 = {"Lapp/rive/Asset;", "H", "Lapp/rive/core/CheckableAutoCloseable;", "handle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/AssetOps;", "ops", "<init>", "(Ljava/lang/Object;Lapp/rive/core/CommandQueue;Lapp/rive/AssetOps;)V", "Lp/rih1;", "close", "()V", "checkOpen$kotlin_release", "checkOpen", "worker", "requireOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)V", "requireOwnedBy", "", "key", "register", "(Ljava/lang/String;)V", "unregister", "Ljava/lang/Object;", "getHandle", "()Ljava/lang/Object;", "Lapp/rive/core/CommandQueue;", "getRiveWorker", "()Lapp/rive/core/CommandQueue;", "Lapp/rive/AssetOps;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "", "getClosed", "()Z", "closed", "Companion", "Lapp/rive/AudioAsset;", "Lapp/rive/FontAsset;", "Lapp/rive/ImageAsset;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Asset<H> implements CheckableAutoCloseable {
    private final CloseOnce closer;
    private final H handle;
    private final AssetOps<H, ? extends Asset<H>> ops;
    private final CommandQueue riveWorker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0010\u001a\u00028\u0002\"\u0004\b\u0001\u0010\u0004\"\u000e\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lapp/rive/Asset$Companion;", "", "<init>", "()V", "H", "Lapp/rive/Asset;", "A", "Lapp/rive/AssetOps;", "ops", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "", "bytes", "createAsset$kotlin_release", "(Lapp/rive/AssetOps;Lapp/rive/core/CommandQueue;[BLp/lnm;)Ljava/lang/Object;", "createAsset", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 1951. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
            */
        public final <H, A extends app.p000rive.Asset<H>> java.lang.Object createAsset$kotlin_release(app.p000rive.AssetOps<H, A> r5, app.p000rive.core.CommandQueue r6, byte[] r7, p.lnm<? super A> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof app.p000rive.Asset$Companion$createAsset$1
                if (r0 == 0) goto L13
                r0 = r8
                app.rive.Asset$Companion$createAsset$1 r0 = (app.p000rive.Asset$Companion$createAsset$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.rive.Asset$Companion$createAsset$1 r0 = new app.rive.Asset$Companion$createAsset$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r4 = r0.result
                int r8 = r0.label
                r1 = 0
                r2 = 1
                if (r8 == 0) goto L3c
                if (r8 != r2) goto L36
                int r2 = r0.I$0
                java.lang.Object r5 = r0.L$1
                r6 = r5
                app.rive.core.CommandQueue r6 = (app.p000rive.core.CommandQueue) r6
                java.lang.Object r5 = r0.L$0
                app.rive.AssetOps r5 = (app.p000rive.AssetOps) r5
                p.hm5.M(r4)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                goto L6a
            L31:
                r4 = move-exception
                goto L7d
            L33:
                r4 = move-exception
                goto La0
            L36:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                p.eg.m(r4)
                return r1
            L3c:
                p.hm5.M(r4)
                java.lang.String r4 = r5.getTag()
                app.rive.Asset$Companion$createAsset$2 r8 = new app.rive.Asset$Companion$createAsset$2
                r8.<init>(r5)
                app.rive.RiveLog r3 = app.p000rive.RiveLog.INSTANCE
                app.rive.RiveLog$Logger r3 = r3.getLogger()
                r3.d(r4, r8)
                r4 = 0
                java.lang.String r8 = r5.getTag()     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
                r6.acquire(r8)     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
                r0.L$0 = r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                r0.L$1 = r6     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                r0.I$0 = r2     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                r0.label = r2     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                java.lang.Object r4 = r5.decode(r6, r7, r0)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
                p.d9n r7 = p.d9n.a
                if (r4 != r7) goto L6a
                return r7
            L6a:
                app.rive.Asset r4 = r5.construct(r4, r6)     // Catch: java.lang.Exception -> L6f java.util.concurrent.CancellationException -> L73
                return r4
            L6f:
                r7 = move-exception
                r1 = r4
            L71:
                r4 = r7
                goto L7d
            L73:
                r7 = move-exception
                r1 = r4
            L75:
                r4 = r7
                goto La0
            L77:
                r7 = move-exception
                r2 = r4
                goto L71
            L7a:
                r7 = move-exception
                r2 = r4
                goto L75
            L7d:
                java.lang.String r7 = r5.getTag()
                app.rive.Asset$Companion$createAsset$5 r8 = new app.rive.Asset$Companion$createAsset$5
                r8.<init>(r5)
                app.rive.RiveLog r0 = app.p000rive.RiveLog.INSTANCE
                app.rive.RiveLog$Logger r0 = r0.getLogger()
                r0.e(r7, r4, r8)
                if (r2 == 0) goto L9f
                if (r1 == 0) goto L96
                r5.delete(r6, r1)
            L96:
                java.lang.String r5 = r5.getTag()
                java.lang.String r7 = "Decode error"
                r6.release(r5, r7)
            L9f:
                throw r4
            La0:
                java.lang.String r7 = r5.getTag()
                app.rive.Asset$Companion$createAsset$3 r8 = new app.rive.Asset$Companion$createAsset$3
                r8.<init>(r5)
                app.rive.RiveLog r0 = app.p000rive.RiveLog.INSTANCE
                app.rive.RiveLog$Logger r0 = r0.getLogger()
                r0.d(r7, r8)
                if (r2 == 0) goto Lc2
                if (r1 == 0) goto Lb9
                r5.delete(r6, r1)
            Lb9:
                java.lang.String r5 = r5.getTag()
                java.lang.String r7 = "Cancellation"
                r6.release(r5, r7)
            Lc2:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: app.p000rive.Asset.Companion.createAsset$kotlin_release(app.rive.AssetOps, app.rive.core.CommandQueue, byte[], p.lnm):java.lang.Object");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.Asset$register$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "H", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ String $key;
        final /* synthetic */ Asset<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Asset<H> asset, String str) {
            super(0);
            this.this$0 = asset;
            this.$key = str;
        }

        public final String invoke() {
            String label = ((Asset) this.this$0).ops.getLabel();
            String str = this.$key;
            H handle = this.this$0.getHandle();
            StringBuilder sbN = gvg.n("Registering ", label, " with key: ", str, " and handle: ");
            sbN.append(handle);
            return sbN.toString();
        }
    }

    /* JADX INFO: renamed from: app.rive.Asset$unregister$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "H", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00301 extends hab0 implements Function0 {
        final /* synthetic */ String $key;
        final /* synthetic */ Asset<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00301(Asset<H> asset, String str) {
            super(0);
            this.this$0 = asset;
            this.$key = str;
        }

        public final String invoke() {
            return gvg.h("Unregistering ", ((Asset) this.this$0).ops.getLabel(), " with key: ", this.$key);
        }
    }

    private Asset(H h, CommandQueue commandQueue, AssetOps<H, ? extends Asset<H>> assetOps) {
        this.handle = h;
        this.riveWorker = commandQueue;
        this.ops = assetOps;
        this.closer = new CloseOnce(String.valueOf(h), new Asset$closer$1(this));
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final H getHandle() {
        return this.handle;
    }

    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final void register(String key) {
        this.closer.checkOpen();
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new AnonymousClass1(this, key));
        this.ops.register(this.riveWorker, key, this.handle);
    }

    public final void requireOwnedBy$kotlin_release(CommandQueue worker) {
        if (this.riveWorker == worker) {
            return;
        }
        throw new RiveIncompatibleResourceException(this.ops.getLabel() + " asset " + this.handle + " is not owned by the required RiveWorker");
    }

    public final void unregister(String key) {
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new C00301(this, key));
        this.ops.unregister(this.riveWorker, key);
    }

    public /* synthetic */ Asset(Object obj, CommandQueue commandQueue, AssetOps assetOps, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, commandQueue, assetOps);
    }
}
