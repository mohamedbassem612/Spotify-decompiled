package p;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import io.reactivex.rxjava3.core.MaybeEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class syf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syf(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        tv80 tv80VarM;
        String string;
        String string2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 3;
        boolean z = false;
        elb0 elb0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new azf((cir0) obj, (lyf) ((wzn) ((vyf) obj2).b.a.c).a, z ? (byte) 1 : (byte) 0);
            case 1:
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) obj2;
                choiceScreenUcActivity.v1 = (View) obj;
                choiceScreenUcActivity.m0().U(d7g.a);
                return rih1Var;
            case 2:
                u84 u84VarP = ((DrawScope) obj).a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawBitmap((Bitmap) obj2, 0.0f, 0.0f, (Paint) null);
                return rih1Var;
            case 3:
                return new cdg(((mdg) ((cce) obj2).d).a);
            case 4:
                kby kbyVar = ((wsc0) obj).f;
                String str = kbyVar.b;
                x4i1 x4i1Var = kbyVar.e;
                if (x4i1Var == null) {
                    x4i1Var = new x4i1(127, (Integer) null, (String) null, (String) null, (String) null, (String) null);
                }
                x7i1 x7i1Var = (x7i1) obj2;
                return new ddg(str, x4i1Var, kbyVar.d.a(1), x7i1Var != null ? x7i1Var.b : false);
            case 5:
                jdg jdgVar = (jdg) obj2;
                bdg bdgVar = (bdg) jdgVar.e;
                if (idg.a[((vku0) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                boolean z2 = bdgVar.c;
                cfd cfdVar = (cfd) jdgVar.c;
                i8h1 i8h1Var = (i8h1) cfdVar.b;
                fjl0 fjl0Var = (fjl0) cfdVar.c;
                if (z2) {
                    x6h1 x6h1VarC = fjl0Var.c.c();
                    x6h1VarC.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("find_playlists_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC2.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (z2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = fjl0Var.c.c();
                    x6h1VarC3.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC4.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                }
                boolean z3 = bdgVar.c;
                if (z3) {
                    ((lzn0) jdgVar.b).a("spotify:home", tv80VarM, (Bundle) null);
                } else {
                    if (z3) {
                        eg.o();
                        return null;
                    }
                    pzn0 pzn0Var = (pzn0) jdgVar.d;
                    pzn0Var.b.f(new dwn0(pzn0Var.a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, new bwn0(tv80VarM)));
                }
                return rih1Var;
            case 6:
                return new lo8((ldg) obj2, (cir0) obj, b2);
            case 7:
                pdg pdgVar = (pdg) obj2;
                lzn0 lzn0Var = pdgVar.a;
                cfd cfdVar2 = pdgVar.b;
                int iOrdinal = ((tdg) obj).ordinal();
                if (iOrdinal == 0) {
                    cfdVar2.r();
                    lzn0Var.e();
                } else if (iOrdinal == 1) {
                    String str2 = pdgVar.f.a;
                    fjl0 fjl0Var2 = (fjl0) cfdVar2.c;
                    x6h1 x6h1VarC5 = fjl0Var2.c.c();
                    x6h1VarC5.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    tv80 tv80VarM2 = ((i8h1) cfdVar2.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC5.a(), fjl0Var2.b, System.currentTimeMillis()), (xj61) null);
                    vdg vdgVar = pdgVar.h;
                    Button button = vdgVar.O0;
                    vdgVar.N0.setEnabled(false);
                    button.setCompoundDrawablesWithIntrinsicBounds(vdgVar.f, (Drawable) null, (Drawable) null, (Drawable) null);
                    button.setOnClickListener(null);
                    ((Animator) vdgVar.h.getValue()).start();
                    xab1 xab1Var = pdgVar.j;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    pdgVar.j = fn31.T(pdgVar.i, (o8n) null, 0, new wt(pdgVar, tv80VarM2, (lnm) null, (byte) 23), 3);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    fjl0 fjl0Var3 = (fjl0) cfdVar2.c;
                    x6h1 x6h1VarC6 = fjl0Var3.c.c();
                    x6h1VarC6.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    lzn0Var.a("spotify:home", ((i8h1) cfdVar2.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC6.a(), fjl0Var3.b, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                }
                return rih1Var;
            case 8:
                ((bhx) obj2).a();
                return rih1Var;
            case 9:
                b07 b07Var = (f07) obj;
                vdg vdgVar2 = (vdg) obj2;
                ArtworkShadow artworkShadow = vdgVar2.Z;
                ArtworkView artworkView = vdgVar2.t;
                if (b07Var instanceof b07) {
                    View view = vdgVar2.d;
                    Integer num = b07Var.a;
                    view.setBackground(num != null ? new ColorDrawable(num.intValue()) : vdgVar2.g);
                } else if (b07Var instanceof c07) {
                    artworkView.setVisibility(0);
                    artworkShadow.setVisibility(0);
                } else {
                    if (!(b07Var instanceof e07)) {
                        eg.o();
                        return null;
                    }
                    artworkView.setVisibility(8);
                    artworkShadow.setVisibility(8);
                }
                return rih1Var;
            case 10:
                ((cfg) obj2).n.invoke(Integer.valueOf(((Number) obj).intValue()), Boolean.TRUE);
                return rih1Var;
            case 11:
                CharSequence charSequence = ((feo) obj).a;
                if (charSequence == null || (string = charSequence.toString()) == null || (string2 = ihc1.e1(string).toString()) == null) {
                    return null;
                }
                String str3 = string2.length() > 0 ? string2 : null;
                if (str3 == null) {
                    return null;
                }
                bfo bfoVar = (bfo) obj2;
                return new rlg(bfoVar.b, bfoVar.d, str3);
            case 12:
                return new dmg(false, false, false, ((amg) obj).c ? ((fmg) obj2).e.h(gmg.a, true) : false, false, false, false);
            case 13:
                z710.d(((bng) obj2).e, (String) obj, false, 6);
                return rih1Var;
            case 14:
                f720 f720Var = (f720) obj;
                xpg xpgVar = (xpg) obj2;
                uha1 uha1Var = f720Var.a;
                llm llmVar = xpgVar.i;
                q8n q8nVar = xpgVar.c;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                llm llmVarE = smo1.e(q8nVar);
                fn31.T(llmVarE, (o8n) null, 0, new bag(xpgVar, uha1Var, elb0Var, (byte) 5), 3);
                xpgVar.i = llmVarE;
                List list = f720Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((qa20) obj3).b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((qa20) it.next()).c);
                }
                smc0 smc0VarN = k4p1.n();
                if (arrayList2.contains(new ma20())) {
                    if (arrayList2.contains(new na20())) {
                        smc0VarN.add(drc0.a);
                    } else {
                        smc0VarN.add(crc0.a);
                    }
                } else if (arrayList2.contains(new na20())) {
                    smc0VarN.add(krc0.a);
                }
                if (arrayList2.contains(new la20())) {
                    smc0VarN.add(brc0.a);
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                xab1 xab1Var2 = xpgVar.j;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                xpgVar.j = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new tc1(xpgVar, smc0VarK, (lnm) null, (byte) 15), 3);
                return rih1Var;
            case 15:
                return new ik((mgb) obj2, (byte) 29);
            case 16:
                return new mgb((mr20) obj, (uqg) obj2, (byte) 25);
            case 17:
                return new rxc0(((h82) obj2).b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((j2h) obj2).c;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Exception exc = (Exception) obj;
                MaybeEmitter maybeEmitter = (MaybeEmitter) obj2;
                if (exc != null) {
                    maybeEmitter.tryOnError(exc);
                } else {
                    maybeEmitter.onComplete();
                }
                return rih1Var;
            case 20:
                ne5 ne5Var = (ne5) obj;
                float f = ne5Var.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = ne5Var.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = ne5Var.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = ne5Var.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new u7h(u7h.a(z4p1.d(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, kah.x), (hah) obj2));
            case 21:
                b261.n((e261) obj, ((ljh) obj2).c);
                return rih1Var;
            case 22:
                xnb xnbVar = (xnb) obj2;
                return d3p1.F(xnbVar.b, xnbVar.c, (zjh) obj);
            case 23:
                cas casVar = (a7m0) obj;
                casVar.a = rng.Y0;
                casVar.b = (c0c) obj2;
                return rih1Var;
            case 24:
                Reply reply = (Reply) obj;
                return new mmr0(Boolean.valueOf(reply.s()), Boolean.valueOf(((tkh) obj2).j.contains(reply.o())));
            case 25:
                ((x9k1) obj2).c(new n9k1((String) obj));
                return rih1Var;
            case 26:
                return new rm((j1r0) obj2, (byte) 23);
            case 27:
                return new wz0(((krh) obj2).c((ql10) obj), (byte) 1);
            case 28:
                elb0 elb0Var2 = (elb0) obj;
                ajq0 ajq0Var = (ajq0) obj2;
                elb0 elb0Var3 = (elb0) ajq0Var.e;
                if (elb0Var3 != null) {
                    if (elb0Var3.a() && elb0Var2.a()) {
                        elb0Var = elb0Var3;
                    }
                    if (elb0Var != null) {
                        ((hrr0) ajq0Var.d).setValue(new Offset(elb0Var.K(elb0Var2, 0L)));
                    }
                }
                return rih1Var;
            default:
                return d3p1.F(((nvh) obj2).a, pvh.a, ((jvh) obj).a);
        }
    }
}
