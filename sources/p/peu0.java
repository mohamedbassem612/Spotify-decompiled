package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class peu0 {
    public final Flowable a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, String str, onm onmVar) {
        neu0 neu0Var;
        if (onmVar instanceof neu0) {
            neu0Var = (neu0) onmVar;
            int i2 = neu0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neu0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                neu0Var = new neu0(this, onmVar);
            }
        } else {
            neu0Var = new neu0(this, onmVar);
        }
        Object objK = neu0Var.a;
        int i3 = neu0Var.c;
        geu0 geu0Var = geu0.a;
        try {
            if (i3 == 0) {
                hm5.M(objK);
                FlowableFilter flowableFilterX = this.a.x(new njp1(str, (byte) 14));
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableFilterX);
                ytw0 ytw0Var = jfv.b;
                huz huzVarV = r4p1.v(kgeVar, fdg1.k0(i, ngv.MILLISECONDS));
                neu0Var.c = 1;
                objK = b5p1.k(huzVarV, neu0Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            return ((PlayerState) objK) != null ? eeu0.a : geu0Var;
        } catch (TimeoutCancellationException unused) {
            return geu0Var;
        } catch (Throwable th) {
            return new feu0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        oeu0 oeu0Var;
        if (onmVar instanceof oeu0) {
            oeu0Var = (oeu0) onmVar;
            int i = oeu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oeu0Var.c = i - Integer.MIN_VALUE;
            } else {
                oeu0Var = new oeu0(this, onmVar);
            }
        } else {
            oeu0Var = new oeu0(this, onmVar);
        }
        Object objK = oeu0Var.a;
        int i2 = oeu0Var.c;
        keu0 keu0Var = keu0.a;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                FlowableFilter flowableFilterX = this.a.x(new yjp1(str, (byte) 15));
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableFilterX);
                ytw0 ytw0Var = jfv.b;
                huz huzVarV = r4p1.v(kgeVar, fdg1.l0(60000L, ngv.MILLISECONDS));
                oeu0Var.c = 1;
                objK = b5p1.k(huzVarV, oeu0Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            return ((PlayerState) objK) != null ? jeu0.a : keu0Var;
        } catch (TimeoutCancellationException unused) {
            return keu0Var;
        } catch (Throwable th) {
            return new ieu0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(onm onmVar) {
        wji1 wji1Var;
        if (onmVar instanceof wji1) {
            wji1Var = (wji1) onmVar;
            int i = wji1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wji1Var.c = i - Integer.MIN_VALUE;
            } else {
                wji1Var = new wji1(this, onmVar);
            }
        } else {
            wji1Var = new wji1(this, onmVar);
        }
        Object objJ = wji1Var.a;
        int i2 = wji1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleZ = this.a.x(y1x0.V0).J(a2x0.W0).z();
            wji1Var.c = 1;
            objJ = fc11.j(singleZ, wji1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}
