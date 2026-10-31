package p;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hb90 implements a3k {
    public final gw70 a;
    public final woa b;
    public final ti31 c;
    public final kj31 d;
    public final pe e;
    public final tjs0 f;
    public final cxc g;
    public final xgm1 h;

    public hb90(gw70 gw70Var, woa woaVar, ti31 ti31Var, kj31 kj31Var, pe peVar, tjs0 tjs0Var, cxc cxcVar, xgm1 xgm1Var) {
        this.a = gw70Var;
        this.b = woaVar;
        this.c = ti31Var;
        this.d = kj31Var;
        this.e = peVar;
        this.f = tjs0Var;
        this.g = cxcVar;
        this.h = xgm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0231 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0232 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(g7m1 g7m1Var, lnm lnmVar) {
        ta90 ta90Var;
        SceneTemplate.IntroTrackContent.Card1 card1;
        bju bjuVar;
        boolean z;
        ck41 ck41Var;
        yj41 yj41Var;
        boolean z2;
        Function0 function0;
        ck41 ck41Var2;
        boolean z3;
        g7m1 g7m1Var2;
        ck41 ck41Var3;
        boolean z4;
        Function0 function1;
        yj41 yj41Var2;
        boolean z5;
        SceneTemplate.IntroTrackContent.Card1 card2;
        Bitmap bitmap;
        g7m1 g7m1Var3;
        yj41 yj41Var3;
        SceneTemplate.IntroTrackContent.Card1 card3;
        g7m1 g7m1Var4;
        boolean z6;
        Function0 function2;
        Object objA;
        Object objA2;
        g7m1 g7m1Var5 = g7m1Var;
        if (lnmVar instanceof ta90) {
            ta90Var = (ta90) lnmVar;
            int i = ta90Var.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta90Var.X = i - Integer.MIN_VALUE;
            } else {
                ta90Var = new ta90(this, (onm) lnmVar);
            }
        } else {
            ta90Var = new ta90(this, (onm) lnmVar);
        }
        ta90 ta90Var2 = ta90Var;
        Object obj = ta90Var2.i;
        int i2 = ta90Var2.X;
        u3k u3kVar = u3k.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            SceneTemplate.IntroTrackContent.Card1 card1V = g7m1Var5.a.q().v();
            bju bjuVar2 = g7m1Var5.b;
            boolean zV = pwo1.v(this.e, this.f);
            bb90 bb90Var = new bb90(card1V, this, null, (byte) 0);
            ta90Var2.a = g7m1Var5;
            ta90Var2.b = card1V;
            ta90Var2.c = bjuVar2;
            ta90Var2.g = zV;
            ta90Var2.X = 1;
            Object objE = bjuVar2.e("albumArt", bb90Var, ta90Var2);
            if (objE != d9nVar) {
                card1 = card1V;
                obj = objE;
                bjuVar = bjuVar2;
                z = zV;
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z6 = ta90Var2.h;
                z = ta90Var2.g;
                ck41Var = ta90Var2.f;
                function2 = ta90Var2.e;
                yj41Var3 = ta90Var2.d;
                card3 = ta90Var2.b;
                g7m1Var4 = ta90Var2.a;
                hm5.M(obj);
                g7m1 g7m1Var6 = g7m1Var4;
                bitmap = (Bitmap) obj;
                card2 = card3;
                ck41Var3 = ck41Var;
                yj41Var2 = yj41Var3;
                function1 = function2;
                z5 = z;
                g7m1Var3 = g7m1Var6;
                z4 = z6;
                xa90 xa90Var = new xa90(this, card2, g7m1Var3, yj41Var2, z5, function1, ck41Var3, bitmap, (lnm) null);
                ta90Var2.a = null;
                ta90Var2.b = null;
                ta90Var2.c = null;
                ta90Var2.d = null;
                ta90Var2.e = null;
                ta90Var2.f = null;
                ta90Var2.g = z5;
                ta90Var2.h = z4;
                ta90Var2.X = 3;
                objA = u3kVar.a(xa90Var, ta90Var2);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                return objA;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return obj;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z7 = ta90Var2.h;
            boolean z8 = ta90Var2.g;
            ck41 ck41Var4 = ta90Var2.f;
            Function0 function3 = ta90Var2.e;
            yj41 yj41Var4 = ta90Var2.d;
            SceneTemplate.IntroTrackContent.Card1 card4 = ta90Var2.b;
            g7m1 g7m1Var7 = ta90Var2.a;
            hm5.M(obj);
            z2 = z7;
            yj41Var = yj41Var4;
            ck41Var2 = ck41Var4;
            z3 = z8;
            g7m1Var2 = g7m1Var7;
            card1 = card4;
            function0 = function3;
            xa90 xa90Var2 = new xa90(this, card1, g7m1Var2, z3, new rkj1(yj41Var, new db90(card1), new eb90(card1), new did(Uri.parse(card1.o().getUrl()), (Bitmap) obj, null), new fb90(card1), 24.0f, 8.0f), ck41Var2, function0, yj41Var, (lnm) null);
            ta90Var2.a = null;
            ta90Var2.b = null;
            ta90Var2.c = null;
            ta90Var2.d = null;
            ta90Var2.e = null;
            ta90Var2.f = null;
            ta90Var2.g = z3;
            ta90Var2.h = z2;
            ta90Var2.X = 5;
            objA2 = u3kVar.a(xa90Var2, ta90Var2);
            if (objA2 != d9nVar) {
                return d9nVar;
            }
            return objA2;
        }
        boolean z9 = ta90Var2.g;
        bju bjuVar3 = ta90Var2.c;
        SceneTemplate.IntroTrackContent.Card1 card5 = ta90Var2.b;
        g7m1 g7m1Var8 = ta90Var2.a;
        hm5.M(obj);
        z = z9;
        g7m1Var5 = g7m1Var8;
        card1 = card5;
        bjuVar = bjuVar3;
        yj41 yj41Var5 = (yj41) obj;
        cb90 cb90Var = new cb90(card1);
        h290 h290VarN = card1.q().n();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarN.iterator();
        while (it.hasNext()) {
            pq20 pq20VarA = jb90.a((SceneTemplate.IntroTrackContent.Card1.FlipSegment) it.next());
            if (pq20VarA != null) {
                arrayList.add(pq20VarA);
            }
        }
        h290<SceneTemplate.IntroTrackContent.Card1.FlipSegment> h290VarP = card1.q().p();
        ArrayList arrayList2 = new ArrayList();
        for (SceneTemplate.IntroTrackContent.Card1.FlipSegment flipSegment : h290VarP) {
            flipSegment.getClass();
            pq20 pq20VarA2 = jb90.a(flipSegment);
            if (pq20VarA2 != null) {
                arrayList2.add(pq20VarA2);
            }
        }
        mq20 mq20Var = new mq20(cb90Var, arrayList, arrayList2);
        boolean zT = card1.t();
        Function0 nd70Var = new nd70(this, (byte) 28);
        ck41Var = z ? new ck41(new j2i(2139743693, new wv60(mq20Var, (byte) 20), true)) : null;
        if (zT) {
            bb90 bb90Var2 = new bb90(card1, this, null, (byte) 1);
            ta90Var2.a = g7m1Var5;
            ta90Var2.b = card1;
            ta90Var2.c = null;
            ta90Var2.d = yj41Var5;
            ta90Var2.e = nd70Var;
            ta90Var2.f = ck41Var;
            ta90Var2.g = z;
            ta90Var2.h = zT;
            ta90Var2.X = 4;
            Object objC = bjuVar.c("canvasFallback", bb90Var2, ta90Var2);
            if (objC != d9nVar) {
                yj41Var = yj41Var5;
                z2 = zT;
                obj = objC;
                function0 = nd70Var;
                ck41Var2 = ck41Var;
                z3 = z;
                g7m1Var2 = g7m1Var5;
                xa90 xa90Var3 = new xa90(this, card1, g7m1Var2, z3, new rkj1(yj41Var, new db90(card1), new eb90(card1), new did(Uri.parse(card1.o().getUrl()), (Bitmap) obj, null), new fb90(card1), 24.0f, 8.0f), ck41Var2, function0, yj41Var, (lnm) null);
                ta90Var2.a = null;
                ta90Var2.b = null;
                ta90Var2.c = null;
                ta90Var2.d = null;
                ta90Var2.e = null;
                ta90Var2.f = null;
                ta90Var2.g = z3;
                ta90Var2.h = z2;
                ta90Var2.X = 5;
                objA2 = u3kVar.a(xa90Var3, ta90Var2);
                if (objA2 != d9nVar) {
                    return objA2;
                }
            }
        } else if (z) {
            bb90 bb90Var3 = new bb90(card1, this, null, (byte) 2);
            ta90Var2.a = g7m1Var5;
            ta90Var2.b = card1;
            ta90Var2.c = null;
            ta90Var2.d = yj41Var5;
            ta90Var2.e = nd70Var;
            ta90Var2.f = ck41Var;
            ta90Var2.g = z;
            ta90Var2.h = zT;
            ta90Var2.X = 2;
            Object objC2 = bjuVar.c("albumArtFallback", bb90Var3, ta90Var2);
            if (objC2 != d9nVar) {
                yj41Var3 = yj41Var5;
                obj = objC2;
                card3 = card1;
                g7m1Var4 = g7m1Var5;
                z6 = zT;
                function2 = nd70Var;
                g7m1 g7m1Var9 = g7m1Var4;
                bitmap = (Bitmap) obj;
                card2 = card3;
                ck41Var3 = ck41Var;
                yj41Var2 = yj41Var3;
                function1 = function2;
                z5 = z;
                g7m1Var3 = g7m1Var9;
                z4 = z6;
                xa90 xa90Var4 = new xa90(this, card2, g7m1Var3, yj41Var2, z5, function1, ck41Var3, bitmap, (lnm) null);
                ta90Var2.a = null;
                ta90Var2.b = null;
                ta90Var2.c = null;
                ta90Var2.d = null;
                ta90Var2.e = null;
                ta90Var2.f = null;
                ta90Var2.g = z5;
                ta90Var2.h = z4;
                ta90Var2.X = 3;
                objA = u3kVar.a(xa90Var4, ta90Var2);
                if (objA == d9nVar) {
                    return objA;
                }
            }
        } else {
            ck41Var3 = ck41Var;
            z4 = zT;
            function1 = nd70Var;
            yj41Var2 = yj41Var5;
            z5 = z;
            card2 = card1;
            bitmap = null;
            g7m1Var3 = g7m1Var5;
            xa90 xa90Var5 = new xa90(this, card2, g7m1Var3, yj41Var2, z5, function1, ck41Var3, bitmap, (lnm) null);
            ta90Var2.a = null;
            ta90Var2.b = null;
            ta90Var2.c = null;
            ta90Var2.d = null;
            ta90Var2.e = null;
            ta90Var2.f = null;
            ta90Var2.g = z5;
            ta90Var2.h = z4;
            ta90Var2.X = 3;
            objA = u3kVar.a(xa90Var5, ta90Var2);
            if (objA == d9nVar) {
                return objA;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(RiveAnimation riveAnimation, g7m1 g7m1Var, onm onmVar) {
        gb90 gb90Var;
        if (onmVar instanceof gb90) {
            gb90Var = (gb90) onmVar;
            int i = gb90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb90Var.c = i - Integer.MIN_VALUE;
            } else {
                gb90Var = new gb90(this, onmVar);
            }
        } else {
            gb90Var = new gb90(this, onmVar);
        }
        gb90 gb90Var2 = gb90Var;
        Object objD = gb90Var2.a;
        int i2 = gb90Var2.c;
        if (i2 == 0) {
            hm5.M(objD);
            gb90Var2.c = 1;
            objD = u3k.d(riveAnimation, g7m1Var, this.c, this.d, this.g, null, null, gb90Var2, 224);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        return new bk41("introTrackRiveBackgroundLayer", Collections.singletonList((qj41) objD));
    }
}
