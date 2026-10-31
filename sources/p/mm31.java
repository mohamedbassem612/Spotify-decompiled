package p;

import app.rive.ImageAsset;
import app.rive.Result;
import app.rive.ViewModelInstance;
import app.rive.core.CommandQueue;
import com.spotify.base.java.logging.Logger;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mm31 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(uj31 uj31Var, ViewModelInstance viewModelInstance, CommandQueue commandQueue, Map map, onm onmVar) throws NoWhenBranchMatchedException {
        im31 im31Var;
        if (onmVar instanceof im31) {
            im31Var = (im31) onmVar;
            int i = im31Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                im31Var.f = i - Integer.MIN_VALUE;
            } else {
                im31Var = new im31(this, onmVar);
            }
        } else {
            im31Var = new im31(this, onmVar);
        }
        Object objFromBytes = im31Var.d;
        int i2 = im31Var.f;
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
                    im31Var.a = (qj31) uj31Var;
                    im31Var.b = viewModelInstance;
                    im31Var.c = map;
                    im31Var.f = 1;
                    objFromBytes = companion.fromBytes(commandQueue, bArr, im31Var);
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
            map = im31Var.c;
            viewModelInstance = im31Var.b;
            uj31Var = im31Var.a;
            hm5.M(objFromBytes);
            Result.Success success = (Result) objFromBytes;
            if (!(success instanceof Result.Loading)) {
                if (success instanceof Result.Error) {
                    Logger.d("RiveMachine failed to create image asset: ".concat(((qj31) uj31Var).a), new Object[0]);
                } else {
                    if (!(success instanceof Result.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ImageAsset imageAsset = (ImageAsset) map.get(((qj31) uj31Var).a);
                    if (imageAsset != null) {
                        imageAsset.close();
                    }
                    map.put(((qj31) uj31Var).a, success.getValue());
                    viewModelInstance.setImage(((qj31) uj31Var).a, (ImageAsset) success.getValue());
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, l1d.m("RiveMachine failed to apply input: ", uj31Var.getPath()), new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(mr20 mr20Var, ven0 ven0Var, String str, onm onmVar) {
        jm31 jm31Var;
        if (onmVar instanceof jm31) {
            jm31Var = (jm31) onmVar;
            int i = jm31Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm31Var.d = i - Integer.MIN_VALUE;
            } else {
                jm31Var = new jm31(this, onmVar);
            }
        } else {
            jm31Var = new jm31(this, onmVar);
        }
        Object obj = jm31Var.b;
        int i2 = jm31Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                mp0 mp0Var = new mp0(ven0Var, (byte) 27);
                jm31Var.a = str;
                jm31Var.d = 1;
                Object objCollect = mr20Var.collect(mp0Var, jm31Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = jm31Var.a;
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, l1d.m("RiveMachine failed to observe property: ", str), new Object[0]);
        }
        return rih1.a;
    }

    public final void c(ViewModelInstance viewModelInstance, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            viewModelInstance.setImage((String) entry.getKey(), (ImageAsset) entry.getValue());
        }
    }
}
