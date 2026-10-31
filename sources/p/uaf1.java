package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class uaf1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(SceneTemplate.TopFiveSongsContent.Card1 card1, String str, gw70 gw70Var, pe peVar, tjs0 tjs0Var, bju bjuVar, ard1 ard1Var, nda1 nda1Var, k7b1 k7b1Var, String str2, onm onmVar) {
        oaf1 oaf1Var;
        nda1 nda1Var2;
        k7b1 k7b1Var2;
        String str3;
        if (onmVar instanceof oaf1) {
            oaf1Var = (oaf1) onmVar;
            int i = oaf1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaf1Var.h = i - Integer.MIN_VALUE;
            } else {
                oaf1Var = new oaf1(onmVar);
            }
        } else {
            oaf1Var = new oaf1(onmVar);
        }
        Object obj = oaf1Var.g;
        int i2 = oaf1Var.h;
        if (i2 == 0) {
            hm5.M(obj);
            int size = card1.r().size();
            if (3 > size || size >= 6) {
                hhg1.f(f4i1.c(card1.r().size(), "TopFiveSongs expects 3-5 items but got "));
                return null;
            }
            oaf1Var.a = peVar;
            oaf1Var.b = tjs0Var;
            oaf1Var.c = ard1Var;
            oaf1Var.d = nda1Var;
            oaf1Var.e = k7b1Var;
            oaf1Var.f = str2;
            oaf1Var.h = 1;
            Object objB = b(card1, str, gw70Var, bjuVar, oaf1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
            obj = objB;
            nda1Var2 = nda1Var;
            k7b1Var2 = k7b1Var;
            str3 = str2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = oaf1Var.f;
            k7b1 k7b1Var3 = oaf1Var.e;
            nda1 nda1Var3 = oaf1Var.d;
            ard1Var = oaf1Var.c;
            tjs0Var = oaf1Var.b;
            peVar = oaf1Var.a;
            hm5.M(obj);
            str3 = str4;
            k7b1Var2 = k7b1Var3;
            nda1Var2 = nda1Var3;
        }
        return new naf1((kaf1) obj, pwo1.v(peVar, tjs0Var), ard1Var, nda1Var2, k7b1Var2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(SceneTemplate.TopFiveSongsContent.Card1 card1, String str, gw70 gw70Var, bju bjuVar, onm onmVar) {
        paf1 paf1Var;
        if (onmVar instanceof paf1) {
            paf1Var = (paf1) onmVar;
            int i = paf1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                paf1Var.d = i - Integer.MIN_VALUE;
            } else {
                paf1Var = new paf1(onmVar);
            }
        } else {
            paf1Var = new paf1(onmVar);
        }
        Object objS = paf1Var.c;
        int i2 = paf1Var.d;
        if (i2 == 0) {
            hm5.M(objS);
            u9f1 u9f1Var = new u9f1(card1.r(), null, bjuVar, gw70Var, (byte) 1);
            paf1Var.a = card1;
            paf1Var.b = str;
            paf1Var.d = 1;
            objS = smo1.s(u9f1Var, paf1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = paf1Var.b;
            card1 = paf1Var.a;
            hm5.M(objS);
        }
        return new kaf1(str, new gsc1(card1, (byte) 28), (List) objS, card1.p());
    }
}
