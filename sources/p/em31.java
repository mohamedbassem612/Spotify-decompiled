package p;

import com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.RiveFont;
import com.spotify.wrapped.v1.proto.ShareAsset;
import com.spotify.wrapped.v1.proto.ShareAssetItemResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class em31 {
    public final by61 a;
    public final cxc b;
    public final ico0 c;

    public em31(by61 by61Var, cxc cxcVar, ico0 ico0Var) {
        this.a = by61Var;
        this.b = cxcVar;
        this.c = ico0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[LOOP:0: B:45:0x00be->B:47:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws TerminalParamsException, HttpException {
        cm31 cm31Var;
        ejw0 ejw0Var;
        RiveAnimation riveAnimation;
        RiveAnimation riveAnimation2;
        ArrayList arrayList;
        Iterator<E> it;
        if (onmVar instanceof cm31) {
            cm31Var = (cm31) onmVar;
            int i = cm31Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm31Var.e = i - Integer.MIN_VALUE;
            } else {
                cm31Var = new cm31(this, onmVar);
            }
        } else {
            cm31Var = new cm31(this, onmVar);
        }
        Object obj = cm31Var.c;
        int i2 = cm31Var.e;
        Serializable serializable = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ejw0Var = cm31Var.a;
                hm5.M(obj);
                riveAnimation = (RiveAnimation) obj;
            } else if (i2 == 2) {
                ejw0Var = cm31Var.a;
                hm5.M(obj);
                riveAnimation = (RiveAnimation) obj;
            } else {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                riveAnimation2 = cm31Var.b;
                hm5.M(obj);
            }
            List list = (List) obj;
            Map map = dj31.a;
            h290 h290VarP = riveAnimation2.p();
            arrayList = new ArrayList(q7h.U(h290VarP, 10));
            it = h290VarP.iterator();
            while (it.hasNext()) {
                arrayList.add(((RiveFont) it.next()).getName());
            }
            return new bm31(riveAnimation2.getUrl(), list, nln.y(arrayList));
        }
        hm5.M(obj);
        nkw0 nkw0VarA = cm31Var.getContext().A(nkw0.c);
        ejw0 ejw0VarH = nkw0VarA != null ? nkw0VarA.h() : null;
        if (ejw0VarH != null) {
            ob01 ob01Var = new ob01(this, str, (lnm) null, (byte) 12);
            cm31Var.a = ejw0VarH;
            cm31Var.e = 1;
            Object objE = ejw0VarH.e(ob01Var, cm31Var);
            if (objE != serializable) {
                ejw0 ejw0Var2 = ejw0VarH;
                obj = objE;
                ejw0Var = ejw0Var2;
                riveAnimation = (RiveAnimation) obj;
            }
        } else {
            cm31Var.a = ejw0VarH;
            cm31Var.e = 2;
            Object objB = b(str, cm31Var);
            if (objB != serializable) {
                ejw0 ejw0Var3 = ejw0VarH;
                obj = objB;
                ejw0Var = ejw0Var3;
                riveAnimation = (RiveAnimation) obj;
            }
        }
        return serializable;
        if (riveAnimation == null) {
            return null;
        }
        if (ejw0Var != null) {
            ejw0Var.f(riveAnimation.getUrl());
        }
        if (ejw0Var == null) {
            ejw0Var = this.c;
        }
        cm31Var.a = null;
        cm31Var.b = riveAnimation;
        cm31Var.e = 3;
        Serializable serializableN = mym.n(riveAnimation, this.b, ejw0Var, cm31Var);
        if (serializableN != serializable) {
            RiveAnimation riveAnimation3 = riveAnimation;
            obj = serializableN;
            riveAnimation2 = riveAnimation3;
            List list2 = (List) obj;
            Map map2 = dj31.a;
            h290 h290VarP2 = riveAnimation2.p();
            arrayList = new ArrayList(q7h.U(h290VarP2, 10));
            it = h290VarP2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RiveFont) it.next()).getName());
            }
            return new bm31(riveAnimation2.getUrl(), list2, nln.y(arrayList));
        }
        return serializable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) throws TerminalParamsException, HttpException {
        dm31 dm31Var;
        if (onmVar instanceof dm31) {
            dm31Var = (dm31) onmVar;
            int i = dm31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dm31Var.c = i - Integer.MIN_VALUE;
            } else {
                dm31Var = new dm31(this, onmVar);
            }
        } else {
            dm31Var = new dm31(this, onmVar);
        }
        Object objA = dm31Var.a;
        int i2 = dm31Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                by61 by61Var = this.a;
                dm31Var.c = 1;
                objA = by61Var.a(str, dm31Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            ShareAsset shareAssetN = ((ShareAssetItemResponse) objA).n();
            if (shareAssetN.n() != 2) {
                return null;
            }
            return shareAssetN.p();
        } catch (HttpException e) {
            int i3 = e.a;
            if (400 > i3 || i3 >= 500) {
                throw e;
            }
            throw new TerminalParamsException(gvg.e(i3, "Share asset not found (HTTP ", ")"), e);
        }
    }
}
