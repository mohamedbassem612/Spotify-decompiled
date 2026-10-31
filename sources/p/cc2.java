package p;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Notification;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cc2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc2(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = 6;
        byte b2 = 3;
        byte b3 = 11;
        boolean z = false;
        byte b4 = 2;
        switch (this.a) {
            case 0:
                cir0 cir0Var = (cir0) this.b;
                ec2 ec2Var = (ec2) this.c;
                cir0Var.j(ec2Var);
                return new rm(ec2Var, (byte) 3);
            case 1:
                ek2 ek2Var = new ek2((iu30) this.c, (byte) 0);
                iac0 iac0Var = (iac0) this.b;
                iac0Var.getLifecycle().a(ek2Var);
                return new ht0(iac0Var, ek2Var, (byte) 2);
            case 2:
                p5t0 p5t0Var = (p5t0) obj;
                int iC = ((mih1) this.b).c(p5t0Var);
                for (q5t0 q5t0Var : (ArrayList) this.c) {
                    p5t0Var.f(q5t0Var, 0, iC, 0.0f);
                    iC += q5t0Var.b;
                }
                return rih1.a;
            case 3:
                z33 z33Var = (b43) obj;
                iu30 iu30Var = (iu30) this.b;
                if (z33Var.equals(y33.a)) {
                    iu30Var.invoke(c43.a);
                } else if (z33Var instanceof z33) {
                    iu30Var.invoke(new d43(z33Var.a));
                } else {
                    if (!(z33Var instanceof a43)) {
                        eg.o();
                        return null;
                    }
                    ((iu30) ((tm) this.c).e).invoke(((a43) z33Var).a);
                }
                return rih1.a;
            case 4:
                ((v7h) this.b).a(((mgc) this.c).b, true);
                return rih1.a;
            case 5:
                x83 x83Var = (x83) this.b;
                qlb qlbVarA = ((d2q) x83Var.c.B.get()).a(igu.a, (d0r) obj);
                o3r o3rVar = (o3r) this.c;
                return new w83(new xzq(qlbVarA, new t6(o3rVar, x83Var, qlbVarA, (byte) 19)), o3rVar);
            case 6:
                p53 p53Var = (p53) obj;
                hvl1 hvl1Var = new hvl1(((x83) this.b).a.getString(2131952170), 254, (String) null, (String) null, false, (String) null);
                List list = p53Var.a;
                boolean z2 = p53Var.b;
                uto utoVar = (uto) this.c;
                return new xek(hvl1Var, list, z2, utoVar != null ? utoVar.a : null);
            case 7:
                return new wcm((String) obj, (String) null, (String) null, (ucm) this.b, (Function0) null, new g83((x83) this.c, b4), false, (String) null, (String) null, 982);
            case 8:
                kc3 kc3Var = (kc3) ((e93) this.b).b;
                qtw qtwVarA = f6o1.A(new ijv0((s4w0) kc3Var.a.get(), (od3) kc3Var.b.get(), kc3Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                x83 x83Var2 = (x83) this.c;
                jpg0 jpg0Var = new jpg0(qtwVarA, new j83(x83Var2, b2));
                jpg0 jpg0Var2 = new jpg0(f6o1.A(new xho(new elo((y1c1) obj, (byte) 0)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), q83.e);
                fqg0 fqg0VarU = q1o1.u(jpg0Var, (qim0) null, (FrameLayout.LayoutParams) null, 7);
                fqg0 fqg0VarU2 = q1o1.u(jpg0Var2, (qim0) null, (FrameLayout.LayoutParams) null, 7);
                xe01 xe01Var = x83Var2.t.h;
                return f6o1.A(new umf0(fqg0VarU, fqg0VarU2, xe01Var, ((Boolean) xe01Var.a.getValue()).booleanValue()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 9:
                CreatorButtonView creatorButtonView = (CreatorButtonView) obj;
                nzn nznVar = (nzn) this.b;
                creatorButtonView.n(new ib2((iu30) this.c, (byte) 11));
                creatorButtonView.y(nznVar);
                return rih1.a;
            case 10:
                id3 id3Var = (id3) ((fd3) this.b);
                return new x010(t5p1.i(t5p1.j(rqt0.u(new gk(id3Var.k, id3Var, (byte) 21)), 3)), (mr20) this.c, new l2(3, (lnm) null, (byte) 6), (byte) 1);
            case 11:
                ((qtr) obj).b(new vc3((dx0) this.b, (fd3) this.c, (lnm) null));
                return rih1.a;
            case 12:
                pp ppVar = (pp) this.b;
                di4 di4Var = (di4) this.c;
                boolean zX = di4Var.X();
                ai4 ai4VarG0 = di4Var.g0();
                wfx wfxVar = ppVar.b;
                return new afr(wfxVar.b, wfxVar.a, zX, ai4VarG0, (byte) 0);
            case 13:
                if (ih3.a[((kf3) obj).ordinal()] == 1) {
                    ((ym) this.b).invoke(new qc7((bh90) this.c));
                    return rih1.a;
                }
                eg.o();
                return null;
            case 14:
                return ((bl3) this.b).e((nk3) this.c);
            case 15:
                List list2 = ((hb51) this.b).e;
                ((rtb0) obj).e(list2.size(), new qf1(list2, (byte) 11), new qf1(list2, (byte) 12), new j2i(2039820996, new ot(list2, (umf0) this.c, (byte) 1), true));
                return rih1.a;
            case 16:
                ((kt91) ((yu3) this.b).c).i((xu3) this.c);
                return rih1.a;
            case 17:
                p5t0.u((p5t0) obj, (q5t0) this.b, 0, 0, new ve3((my3) this.c, b), 4);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                Notification notification = (Notification) obj;
                if (notification.e()) {
                    Object objD = notification.d();
                    objD.getClass();
                    List list3 = (List) ((mmr0) objD).b;
                    b74 b74Var = (b74) this.b;
                    String str = (String) this.c;
                    b74Var.w.put(str, list3);
                    b74Var.v.onNext(str);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((ec4) this.b).d = null;
                ((ec4) this.b).e = null;
                ec4 ec4Var = (ec4) this.b;
                ec4Var.d(new nx2(ec4Var, (cc4) this.c, (byte) 11));
                return rih1.a;
            case 20:
                p5t0.u((p5t0) obj, (q5t0) this.b, 0, 0, new ve3((ub5) this.c, b3), 4);
                return rih1.a;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!((gh5) this.b).b) {
                    ((iu30) this.c).invoke(new bh5(zBooleanValue));
                }
                return rih1.a;
            case 22:
                if (in5.a[((cy51) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                m42 m42Var = ((hv41) this.b).g;
                if (m42Var != null) {
                    m42Var.invoke(((u01) this.c).a);
                }
                return rih1.a;
            case 23:
                ((sy5) this.b).invoke();
                ((nx2) this.c).invoke();
                return rih1.a;
            case 24:
                ez20 ez20Var = (ez20) obj;
                if (!((Boolean) ((ven0) this.c).getValue()).booleanValue() && ((rz5) this.b).g()) {
                    z = true;
                }
                ez20Var.c(z);
                return rih1.a;
            case 25:
                return new hp0(((los) ((pt) this.b).f).c(new ib2((iu30) this.c, (byte) 16)), (byte) 2);
            case 26:
                ((iu30) this.b).invoke("https://support.spotify.com/article/ai-persona-badge/");
                ((f65) this.c).a("https://support.spotify.com/article/ai-persona-badge/");
                return rih1.a;
            case 27:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(((Number) ((tob1) this.b).getValue()).floatValue());
                kd31Var.C(((Number) ((Function0) this.c).invoke()).floatValue());
                return rih1.a;
            case 28:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.E((kd31Var2.T0.h() * ((p3v) ((tob1) this.c).getValue()).a) + (Float.intBitsToFloat((int) (kd31Var2.R0 & 4294967295L)) - (kd31Var2.T0.h() * ((cfs0) this.b).b)));
                return rih1.a;
            default:
                kd31 kd31Var3 = (kd31) obj;
                float fFloatValue = ((Number) ((tob1) this.b).getValue()).floatValue();
                c21 c21Var = (c21) this.c;
                kd31Var3.b(fFloatValue * (c21Var != null ? ((Number) ((tob1) c21Var.b).getValue()).floatValue() : 1.0f));
                kd31Var3.i(2);
                return rih1.a;
        }
    }
}
