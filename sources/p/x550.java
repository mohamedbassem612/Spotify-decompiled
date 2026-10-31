package p;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import app.rive.Artboard;
import app.rive.FontAsset;
import app.rive.ImageAsset;
import app.rive.Result;
import app.rive.RiveFile;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x550 {
    public final ExecutorService a;
    public final hm00 b;
    public CommandQueue c;
    public RiveFile d;
    public Artboard e;
    public StateMachine f;
    public ViewModelInstance g;
    public final LinkedHashMap h;
    public final ArrayList i;
    public yzu j;
    public efe1 k;
    public SurfaceTexture l;
    public RiveSurface m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77p;
    public final Semaphore q;
    public final Handler r;
    public final float[] s;

    public x550() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(t550.b);
        this.a = executorServiceNewSingleThreadExecutor;
        this.b = new hm00(executorServiceNewSingleThreadExecutor);
        this.h = new LinkedHashMap();
        this.i = new ArrayList();
        this.q = new Semaphore(0);
        this.r = new Handler(Looper.getMainLooper());
        this.s = new float[16];
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(uj31 uj31Var, ViewModelInstance viewModelInstance, CommandQueue commandQueue, onm onmVar) throws NoWhenBranchMatchedException {
        r550 r550Var;
        LinkedHashMap linkedHashMap = this.h;
        if (onmVar instanceof r550) {
            r550Var = (r550) onmVar;
            int i = r550Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r550Var.e = i - Integer.MIN_VALUE;
            } else {
                r550Var = new r550(this, onmVar);
            }
        } else {
            r550Var = new r550(this, onmVar);
        }
        Object objFromBytes = r550Var.c;
        int i2 = r550Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objFromBytes);
                if (uj31Var instanceof rj31) {
                    viewModelInstance.setNumber(((rj31) uj31Var).a, ((rj31) uj31Var).b);
                } else if (uj31Var instanceof nj31) {
                    viewModelInstance.setBoolean(((nj31) uj31Var).a, ((nj31) uj31Var).b);
                } else if (uj31Var instanceof sj31) {
                    viewModelInstance.setString(((sj31) uj31Var).a, ((sj31) uj31Var).b);
                } else if (uj31Var instanceof oj31) {
                    viewModelInstance.setColor(((oj31) uj31Var).a, ((oj31) uj31Var).b);
                } else if (uj31Var instanceof pj31) {
                    viewModelInstance.setEnum(((pj31) uj31Var).a, ((pj31) uj31Var).b);
                } else if (uj31Var instanceof tj31) {
                    viewModelInstance.fireTrigger(((tj31) uj31Var).a);
                } else {
                    if (!(uj31Var instanceof qj31)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ImageAsset.Companion companion = ImageAsset.Companion;
                    byte[] bArr = ((qj31) uj31Var).b;
                    r550Var.a = (qj31) uj31Var;
                    r550Var.b = viewModelInstance;
                    r550Var.e = 1;
                    objFromBytes = companion.fromBytes(commandQueue, bArr, r550Var);
                    d9n d9nVar = d9n.a;
                    if (objFromBytes == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            viewModelInstance = r550Var.b;
            uj31Var = r550Var.a;
            hm5.M(objFromBytes);
            Result.Success success = (Result) objFromBytes;
            if (success instanceof Result.Success) {
                ImageAsset imageAsset = (ImageAsset) linkedHashMap.get(((qj31) uj31Var).a);
                if (imageAsset != null) {
                    imageAsset.close();
                }
                linkedHashMap.put(((qj31) uj31Var).a, success.getValue());
                viewModelInstance.setImage(((qj31) uj31Var).a, (ImageAsset) success.getValue());
            } else if (success instanceof Result.Error) {
                Logger.d("Failed to create image asset: ".concat(((qj31) uj31Var).a), new Object[0]);
            } else {
                if (!u890.j(success, Result.Loading.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                Logger.k("Image asset loading stuck: ".concat(((qj31) uj31Var).a), new Object[0]);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, l1d.m("Failed to apply input: ", uj31Var.getPath()), new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        s550 s550Var;
        CommandQueue commandQueue;
        if (onmVar instanceof s550) {
            s550Var = (s550) onmVar;
            int i = s550Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s550Var.c = i - Integer.MIN_VALUE;
            } else {
                s550Var = new s550(this, onmVar);
            }
        } else {
            s550Var = new s550(this, onmVar);
        }
        Object obj = s550Var.a;
        int i2 = s550Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj);
            RiveSurface riveSurface = this.m;
            if (riveSurface != null && (commandQueue = this.c) != null) {
                commandQueue.destroyRiveSurface(riveSurface);
            }
            this.m = null;
            n3s n3sVar = new n3s((Object) this, lnmVar, (byte) 21);
            s550Var.c = 1;
            Object objY = fn31.Y(this.b, n3sVar, s550Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.a.shutdown();
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FontAsset) it.next()).close();
        }
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.h;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((ImageAsset) it2.next()).close();
        }
        linkedHashMap.clear();
        StateMachine stateMachine = this.f;
        if (stateMachine != null) {
            stateMachine.close();
        }
        ViewModelInstance viewModelInstance = this.g;
        if (viewModelInstance != null) {
            viewModelInstance.close();
        }
        Artboard artboard = this.e;
        if (artboard != null) {
            artboard.close();
        }
        RiveFile riveFile = this.d;
        if (riveFile != null) {
            riveFile.close();
        }
        this.f = null;
        this.g = null;
        this.e = null;
        this.d = null;
        this.c = null;
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(iac0 iac0Var, byte[] bArr, Map map, Map map2, List list, Size size, Surface surface, onm onmVar) {
        u550 u550Var;
        Surface surface2;
        float f;
        if (onmVar instanceof u550) {
            u550Var = (u550) onmVar;
            int i = u550Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                u550Var.e = i - Integer.MIN_VALUE;
            } else {
                u550Var = new u550(this, onmVar);
            }
        } else {
            u550Var = new u550(this, onmVar);
        }
        Object objY = u550Var.c;
        int i2 = u550Var.e;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                surface2 = u550Var.a;
                hm5.M(objY);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f = u550Var.b;
                hm5.M(objY);
            }
            return new Float(f);
        }
        hm5.M(objY);
        this.o = size.getWidth();
        this.f77p = size.getHeight();
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        w550 w550Var = new w550(map2, bArr, map, list, this, iac0Var, (lnm) null);
        surface2 = surface;
        u550Var.a = surface2;
        u550Var.e = 1;
        objY = fn31.Y(bs50Var, w550Var, u550Var);
        if (objY != d9nVar) {
        }
        return d9nVar;
        float fFloatValue = ((Number) objY).floatValue();
        h210 h210Var = new h210(surface2, this, (lnm) null, (byte) 27);
        u550Var.a = null;
        u550Var.b = fFloatValue;
        u550Var.e = 2;
        if (fn31.Y(this.b, h210Var, u550Var) != d9nVar) {
            f = fFloatValue;
            return new Float(f);
        }
        return d9nVar;
    }
}
