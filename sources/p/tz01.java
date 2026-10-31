package p;

import android.net.Uri;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto$EntityViewUriResponse;
import com.spotify.assistedcuration.v1.RecommendationsProto$RecommendationUrisResponse;
import com.spotify.campfire.datasource.impl.proto.ActivityRequest;
import com.spotify.campfire.datasource.impl.proto.DeleteActivity;
import com.spotify.campfire.datasource.impl.proto.EmojiReaction;
import com.spotify.campfire.datasource.impl.proto.MessageRequest;
import com.spotify.campfire.datasource.impl.proto.NodeRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.socialrecs.v1.GetSessionRecsForUserResponse;
import com.spotify.socialrecs.v1.Track;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import j$.net.URLEncoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tz01 implements Function, qq70, SingleOnSubscribe, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public tz01(byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = new t7y((byte) 0);
                break;
            default:
                this.b = vvt.a.m(ExtraCroppingQuirk.class);
                break;
        }
    }

    public void a(fm61 fm61Var) {
        dj41 dj41Var = (dj41) this.b;
        fn31.T(cto1.q(dj41Var.a), dj41Var.i, 0, new lc41(dj41Var, fm61Var, null, (byte) 4), 2);
    }

    public boolean accept(Object obj) {
        return ((oqa1) this.b).a;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((vz01) obj2).b.a(((RecommendationsProto$RecommendationUrisResponse) obj).getUrisList());
            case 1:
                return new CompletableFromCallable(new e71((z211) obj2, (List) obj, (byte) 18));
            case 2:
                yc80 yc80Var = (yc80) obj2;
                return yc80Var.e.take(1L).flatMap(new hyy0(yc80Var, (tqx0) obj, (byte) 17)).onErrorReturnItem(atx0.a);
            case 7:
                return ((v5n) ((kdy0) obj2).c).a((String) obj);
            case 13:
                return new vy41(((SearchProto$EntityViewUriResponse) obj2).getPageToken(), (List) obj);
            case 14:
                return new CompletableFromAction(new tt60((zr51) obj2, (as51) obj, (byte) 21)).w();
            case 20:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (l4o1.D(contextTrack)) {
                    return Flowable.I(l4m.a);
                }
                if (l4o1.K(contextTrack)) {
                    return Flowable.I(l4m.b);
                }
                r481 r481Var = (r481) obj2;
                return yoi1.h(new wzv0(new mpy0(r481Var.a.c(contextTrack), r481Var, contextTrack, (byte) 13), (byte) 23), o6xVar);
            case 21:
                f7h f7hVar = (f7h) ((Map) obj).get((String) ((r961) obj2).c);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 22:
                crx0 crx0Var = (crx0) obj;
                qfl1 qfl1Var = (qfl1) obj2;
                long j = crx0Var.a;
                if (crx0Var.b) {
                    return new htx0(j + 2, hwb.x(), qfl1Var.b(2131963482, new Object[0]), true);
                }
                return new htx0(j + 2, hwb.x(), qfl1Var.b(2131963481, new Object[0]), false);
            case 24:
                return rqt0.F(o6xVar, new b751((ar81) obj2, (lnm) null, (byte) 23)).map(f2x0.N0).onErrorReturn(h2x0.Z);
            case 26:
                String str = (String) obj;
                hj91 hj91Var = (hj91) ((qm91) obj2).e;
                str.getClass();
                return hj91Var.d(str).toFlowable(BackpressureStrategy.d).x(f2x0.O0);
            default:
                GetSessionRecsForUserResponse getSessionRecsForUserResponse = (GetSessionRecsForUserResponse) obj;
                sp01 sp01Var = (sp01) obj2;
                sjj0 sjj0Var = (sjj0) sp01Var.e;
                List tracksList = getSessionRecsForUserResponse.getTracksList();
                ArrayList arrayList = new ArrayList(q7h.U(tracksList, 10));
                Iterator it = tracksList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Track) it.next()).getUri());
                }
                return sjj0Var.a(arrayList).map(new n381(sp01Var, getSessionRecsForUserResponse, (byte) 24));
        }
    }

    public kj81 b() {
        return new kj81(this);
    }

    public jj11 c(ij11 ij11Var) {
        dg30 dg30VarZ = ((ynq) ((xnq) this.b).a.c).a.Z();
        c8o.l(dg30VarZ);
        return new jj11(dg30VarZ, ij11Var);
    }

    public xaz0 d() {
        return new xaz0(((xtb0) this.b).h(), (byte) 11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(gxz0 gxz0Var, boolean z, onm onmVar) {
        m461 m461Var;
        if (onmVar instanceof m461) {
            m461Var = (m461) onmVar;
            int i = m461Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m461Var.d = i - Integer.MIN_VALUE;
            } else {
                m461Var = new m461(this, onmVar);
            }
        } else {
            m461Var = new m461(this, onmVar);
        }
        Object obj = m461Var.b;
        int i2 = m461Var.d;
        rih1 m231Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bfd bfdVar = (bfd) this.b;
                m461Var.a = gxz0Var;
                m461Var.d = 1;
                nad nadVar = bfdVar.b;
                MessageRequest.Builder deleteActivity = MessageRequest.newBuilder().setDeleteActivity(DeleteActivity.newBuilder().setNodePathId(gxz0Var.a).setRequest(ActivityRequest.newBuilder().setEmojiReaction(EmojiReaction.newBuilder().setEmojiUtf8(gxz0Var.b))));
                deleteActivity.getClass();
                NodeRequest.Builder messageRequest = NodeRequest.newBuilder().setMessageRequest(deleteActivity);
                messageRequest.getClass();
                boolean z2 = !z;
                Object objD = nadVar.D(new NodeRequest.Builder[]{messageRequest}, z2, z2, m461Var);
                d9n d9nVar = d9n.a;
                if (objD != d9nVar) {
                    objD = m231Var;
                }
                if (objD != d9nVar) {
                    objD = m231Var;
                }
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gxz0Var = m461Var.a;
                hm5.M(obj);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return !(m231Var instanceof m231) ? gxz0Var : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, hz00 hz00Var, vu30 vu30Var, onm onmVar) {
        xn71 xn71Var;
        if (onmVar instanceof xn71) {
            xn71Var = (xn71) onmVar;
            int i = xn71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn71Var.e = i - Integer.MIN_VALUE;
            } else {
                xn71Var = new xn71(this, onmVar);
            }
        } else {
            xn71Var = new xn71(this, onmVar);
        }
        Object objC = xn71Var.c;
        int i2 = xn71Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            qa00 qa00Var = (qa00) this.b;
            xn71Var.a = str;
            xn71Var.b = (a8d1) vu30Var;
            xn71Var.e = 1;
            objC = qa00Var.c(str, hz00Var, xn71Var);
            if (objC != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objC);
                return objC;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vu30Var = (vu30) xn71Var.b;
        str = xn71Var.a;
        hm5.M(objC);
        ymj0 ymj0Var = (ymj0) objC;
        if ((ymj0Var instanceof vmj0) || u890.j(ymj0Var, xmj0.a)) {
            eg.m(l1d.m("Failed to resolve the entityUri: ", str));
            return null;
        }
        if (!(ymj0Var instanceof wmj0)) {
            eg.o();
            return null;
        }
        xn71Var.a = null;
        xn71Var.b = null;
        xn71Var.e = 2;
        Object objInvoke = vu30Var.invoke(ymj0Var, xn71Var);
        return objInvoke == d9nVar ? d9nVar : objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, String str2, String str3, onm onmVar) throws IOException {
        ic31 ic31Var;
        if (onmVar instanceof ic31) {
            ic31Var = (ic31) onmVar;
            int i = ic31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic31Var.c = i - Integer.MIN_VALUE;
            } else {
                ic31Var = new ic31(this, onmVar);
            }
        } else {
            ic31Var = new ic31(this, onmVar);
        }
        Object objA = ic31Var.a;
        int i2 = ic31Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                String strW = nhc1.W(URLEncoder.encode(str, "UTF-8"), "+", "%20");
                tig tigVar = (tig) this.b;
                ic31Var.c = 1;
                objA = tigVar.a(str3, str2, strW, ic31Var);
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
            sy21 sy21Var = (sy21) objA;
            try {
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    throw new HttpException(sy21Var);
                }
                String str4 = ry21Var.a.a.i;
                uz21 uz21Var = (uz21) sy21Var.b;
                if (uz21Var != null) {
                    uz21Var.close();
                }
                uz21 uz21Var2 = sy21Var.c;
                if (uz21Var2 != null) {
                    uz21Var2.close();
                }
                return str4;
            } catch (Throwable th) {
                uz21 uz21Var3 = (uz21) sy21Var.b;
                if (uz21Var3 != null) {
                    uz21Var3.close();
                }
                uz21 uz21Var4 = sy21Var.c;
                if (uz21Var4 != null) {
                    uz21Var4.close();
                }
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("Cue audio request failed", e2);
        }
    }

    public Object h(String str, t4e0 t4e0Var) {
        Set set = s4b1.f;
        return !uic.k(str, new b3i1[]{nyu0.e, wyu0.f}) ? str : f(str, hz00.d2, new uk71(this, str, (lnm) null, (byte) 3), t4e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, String str2, onm onmVar, boolean z) {
        n461 n461Var;
        if (onmVar instanceof n461) {
            n461Var = (n461) onmVar;
            int i = n461Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n461Var.c = i - Integer.MIN_VALUE;
            } else {
                n461Var = new n461(this, onmVar);
            }
        } else {
            n461Var = new n461(this, onmVar);
        }
        Object objE = n461Var.a;
        int i2 = n461Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                bfd bfdVar = (bfd) this.b;
                n461Var.c = 1;
                objE = bfdVar.b.E(str, str2, n461Var, z);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            return (gxz0) objE;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public void j(Uri uri) {
        ((t7y) this.b).c = uri;
    }

    public void k(mxa1 mxa1Var) {
        ((aqq0) this.b).a(new nkx0((byte) 20));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        zs61 zs61Var = (zs61) this.b;
        luk lukVar = zs61Var.d;
        if (lukVar == null || !lukVar.i("settings-quickaccess.show_quick_access_settings_in_settings")) {
            lukVar = zs61Var.e;
        }
        if (lukVar != null) {
            lukVar.e(new p54(singleEmitter, zs61Var, (byte) 12));
        }
    }

    public /* synthetic */ tz01(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public /* synthetic */ tz01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public tz01(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = (byte) 28;
        this.b = textView5;
    }
}
