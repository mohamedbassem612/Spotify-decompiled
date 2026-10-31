package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ukz0 {
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object a(SceneTemplate.Quiz quiz, String str, String str2, gw70 gw70Var, pe peVar, tjs0 tjs0Var, qpj1 qpj1Var, bju bjuVar, sjf1 sjf1Var, onm onmVar) {
        lkz0 lkz0Var;
        Object obj;
        qpj1 qpj1Var2;
        sjf1 sjf1Var2;
        if (onmVar instanceof lkz0) {
            lkz0Var = (lkz0) onmVar;
            int i = lkz0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkz0Var.g = i - Integer.MIN_VALUE;
            } else {
                lkz0Var = new lkz0(onmVar);
            }
        } else {
            lkz0Var = new lkz0(onmVar);
        }
        lkz0 lkz0Var2 = lkz0Var;
        Object obj2 = lkz0Var2.f;
        int i2 = lkz0Var2.g;
        if (i2 == 0) {
            hm5.M(obj2);
            lkz0Var2.a = str;
            lkz0Var2.b = peVar;
            lkz0Var2.c = tjs0Var;
            lkz0Var2.d = qpj1Var;
            lkz0Var2.e = sjf1Var;
            lkz0Var2.g = 1;
            Object objC = c(quiz, str, str2, gw70Var, bjuVar, lkz0Var2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            obj = objC;
            qpj1Var2 = qpj1Var;
            sjf1Var2 = sjf1Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sjf1Var2 = lkz0Var2.e;
            qpj1 qpj1Var3 = lkz0Var2.d;
            tjs0Var = lkz0Var2.c;
            peVar = lkz0Var2.b;
            String str3 = lkz0Var2.a;
            hm5.M(obj2);
            qpj1Var2 = qpj1Var3;
            str = str3;
            obj = obj2;
        }
        return new kkz0((rhz0) obj, pwo1.v(peVar, tjs0Var), new j3y0((byte) 11, qpj1Var2, str), sjf1Var2);
    }

    public static ohz0 b(SceneTemplate.Quiz.AnswerDecoration answerDecoration, String str) {
        String strN = answerDecoration.n();
        long jE = z4p1.e(strN.length() > 0 ? Color.parseColor(strN) : Color.parseColor(str));
        String strO = answerDecoration.o();
        if (strO.length() <= 0) {
            strO = "#121212";
        }
        long jE2 = z4p1.e(Color.parseColor(strO));
        String strN2 = answerDecoration.q().n();
        if (strN2.length() <= 0) {
            strN2 = "#292929";
        }
        return new ohz0(jE, jE2, new gqb(z4p1.e(Color.parseColor(strN2)), answerDecoration.q().p()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(SceneTemplate.Quiz quiz, String str, String str2, gw70 gw70Var, bju bjuVar, onm onmVar) {
        mkz0 mkz0Var;
        SceneTemplate.Quiz quiz2;
        String str3;
        String str4;
        if (onmVar instanceof mkz0) {
            mkz0Var = (mkz0) onmVar;
            int i = mkz0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkz0Var.e = i - Integer.MIN_VALUE;
            } else {
                mkz0Var = new mkz0(onmVar);
            }
        } else {
            mkz0Var = new mkz0(onmVar);
        }
        Object obj = mkz0Var.d;
        int i2 = mkz0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            quiz2 = quiz;
            sew0 sew0Var = new sew0(quiz.w(), (lnm) null, gw70Var, bjuVar, quiz2, (byte) 6);
            mkz0Var.a = quiz2;
            mkz0Var.b = str;
            str3 = str2;
            mkz0Var.c = str3;
            mkz0Var.e = 1;
            Object objS = smo1.s(sew0Var, mkz0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            str4 = str;
            obj = objS;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = mkz0Var.c;
            String str5 = mkz0Var.b;
            SceneTemplate.Quiz quiz3 = mkz0Var.a;
            hm5.M(obj);
            quiz2 = quiz3;
            str4 = str5;
        }
        String str6 = str3;
        List list = (List) obj;
        boolean zS = quiz2.s();
        String url = quiz2.o().getUrl();
        AudioPreview audioPreviewO = quiz2.o();
        boolean zW = audioPreviewO.w();
        tal1 tal1Var = sal1.a;
        rx7 rx7Var = new rx7(url, zW ? new tal1(audioPreviewO.t().p(), audioPreviewO.t().n()) : tal1Var, null);
        String url2 = quiz2.x().getUrl();
        AudioPreview audioPreviewX = quiz2.x();
        if (audioPreviewX.w()) {
            tal1Var = new tal1(audioPreviewX.t().p(), audioPreviewX.t().n());
        }
        return new rhz0(str4, str6, new nkz0(quiz2, (byte) 0), new nkz0(quiz2, (byte) 1), new nkz0(quiz2, (byte) 2), list, (String) null, zS, rx7Var, new rx7(url2, tal1Var, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object d(SceneTemplate.Quiz.Item item, int i, gw70 gw70Var, bju bjuVar, ohz0 ohz0Var, ohz0 ohz0Var2, String str, Outline outline, onm onmVar) {
        okz0 okz0Var;
        ohz0 ohz0Var3;
        String str2;
        Outline outline2;
        ohz0 ohz0Var4;
        SceneTemplate.Quiz.Item item2 = item;
        if (onmVar instanceof okz0) {
            okz0Var = (okz0) onmVar;
            int i2 = okz0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okz0Var.g = i2 - Integer.MIN_VALUE;
            } else {
                okz0Var = new okz0(onmVar);
            }
        } else {
            okz0Var = new okz0(onmVar);
        }
        Object objC = okz0Var.f;
        int i3 = okz0Var.g;
        if (i3 == 0) {
            hm5.M(objC);
            iu30 tkz0Var = new tkz0(item2, gw70Var, null);
            okz0Var.a = item2;
            ohz0Var3 = ohz0Var;
            okz0Var.b = ohz0Var3;
            okz0Var.c = ohz0Var2;
            str2 = str;
            okz0Var.d = str2;
            outline2 = outline;
            okz0Var.e = outline2;
            okz0Var.g = 1;
            objC = bjuVar.c("item_" + i, tkz0Var, okz0Var);
            Object obj = d9n.a;
            if (objC == obj) {
                return obj;
            }
            ohz0Var4 = ohz0Var2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Outline outline3 = okz0Var.e;
            String str3 = okz0Var.d;
            ohz0 ohz0Var5 = okz0Var.c;
            ohz0Var3 = okz0Var.b;
            SceneTemplate.Quiz.Item item3 = okz0Var.a;
            hm5.M(objC);
            outline2 = outline3;
            item2 = item3;
            str2 = str3;
            ohz0Var4 = ohz0Var5;
        }
        String str4 = str2;
        return new phz0(item2.getUri(), new yj41((Bitmap) objC, null, u3k.h(item2.s().p())), new pkz0(item2), new qkz0(item2), new rkz0(item2), new skz0(item2), item2.r(), ohz0Var3, ohz0Var4, z4p1.e(str4.length() > 0 ? Color.parseColor(str4) : Color.parseColor("#292929")), u3k.h(outline2), item2.o(), item2.n());
    }
}
