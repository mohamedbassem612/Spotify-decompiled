package p;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yys implements toj1 {
    public boolean a;
    public ks40 b;
    public ExecutorService c;
    public ts40 d;
    public byte e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public yys(boolean z, ks40 ks40Var, ExecutorService executorService, ts40 ts40Var, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = ks40Var;
        this.c = executorService;
        this.d = ts40Var;
        this.e = i;
        this.f = z2;
        this.g = z3;
    }

    public yys a() {
        yys yysVar = new yys();
        yysVar.c = this.c;
        yysVar.b = this.b;
        yysVar.d = this.d;
        yysVar.e = this.e;
        yysVar.a = !this.a;
        yysVar.f = this.f;
        yysVar.g = this.g;
        return yysVar;
    }

    public azs b(final Context context, final x8h x8hVar, final boolean z, final Executor executor, final uoj1 uoj1Var) throws VideoFrameProcessingException {
        ExecutorService executorServiceNewSingleThreadExecutor;
        ExecutorService executorService = this.c;
        if (executorService == null) {
            String str = zoi1.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ask("Effect:DefaultVideoFrameProcessor:GlThread", (byte) 1));
        } else {
            executorServiceNewSingleThreadExecutor = executorService;
        }
        final roj1 roj1Var = new roj1(executorServiceNewSingleThreadExecutor, executorService == null, new sys(uoj1Var, (byte) 1));
        hur hurVar = this.b;
        final boolean z2 = hurVar == null || executorService == null;
        if (hurVar == null) {
            hurVar = new hur((byte) 4);
        }
        final hur hurVar2 = hurVar;
        try {
            return (azs) executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: p.xys
                /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
                @Override // java.util.concurrent.Callable
                public final Object call() throws GlUtil.GlException {
                    Pair pairCreate;
                    ks40 ks40Var = hurVar2;
                    yys yysVar = this.a;
                    ts40 ts40Var = yysVar.d;
                    byte b = yysVar.e;
                    boolean z3 = yysVar.a;
                    boolean z4 = yysVar.f;
                    boolean z5 = yysVar.g;
                    int i = azs.y;
                    EGLDisplay eGLDisplayN = fn31.N();
                    x8h x8hVar2 = x8hVar;
                    boolean zH = x8h.h(x8hVar2);
                    int[] iArr = zH ? fn31.b : fn31.a;
                    try {
                        EGLContext eGLContextG = ks40Var.g(eGLDisplayN, 3, iArr);
                        pairCreate = Pair.create(eGLContextG, ks40Var.f(eGLContextG, eGLDisplayN));
                    } catch (GlUtil.GlException unused) {
                        EGLContext eGLContextG2 = ks40Var.g(eGLDisplayN, 2, iArr);
                        pairCreate = Pair.create(eGLContextG2, ks40Var.f(eGLContextG2, eGLDisplayN));
                    }
                    Pair pair = pairCreate;
                    w8h w8hVarA = x8hVar2.a();
                    w8hVarA.c = 1;
                    w8hVarA.e = null;
                    x8h x8hVarA = w8hVarA.a();
                    if (!zH) {
                        x8hVarA = x8hVar2;
                    }
                    uoj1 uoj1Var2 = uoj1Var;
                    sys sysVar = new sys(uoj1Var2, (byte) 0);
                    Context context2 = context;
                    roj1 roj1Var2 = roj1Var;
                    Executor executor2 = executor;
                    zj80 zj80Var = new zj80(context2, x8hVarA, ks40Var, roj1Var2, executor2, sysVar, z3, z4, z5);
                    EGLContext eGLContext = (EGLContext) pair.first;
                    EGLSurface eGLSurface = (EGLSurface) pair.second;
                    boolean z6 = z;
                    return new azs(context2, ks40Var, z2, eGLDisplayN, zj80Var, roj1Var2, uoj1Var2, executor2, new cg20(context2, eGLDisplayN, eGLContext, eGLSurface, x8hVar2, roj1Var2, executor2, uoj1Var2, ts40Var, b, z6), z6, x8hVar2, null);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new VideoFrameProcessingException(e);
        } catch (ExecutionException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
