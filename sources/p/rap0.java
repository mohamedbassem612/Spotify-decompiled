package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.coremediarenderer.bridge.CmrBridge;
import com.spotify.language.eventreporter.events.proto.ClientLanguageRaw;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rap0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new ai8((zh8) ((xap0) obj2).invoke(), ((vap0) obj).b.p());
            case 1:
                return new bia((Context) ((bcp0) obj2).invoke(), (uha) ((bcp0) obj).invoke());
            case 2:
                return new km0((Set) ((qbp0) obj2).invoke(), (njr) ((qbp0) obj).invoke());
            case 3:
                return new ggb((q8n) ((mdp0) obj).invoke(), ((qdp0) obj2).b.d);
            case 4:
                return new kbd((add) ((edp0) obj2).invoke(), (ov20) ((edp0) obj).invoke());
            case 5:
                return new iqd((rqd) ((y52) obj2).invoke(), (em4) ((tap0) obj).invoke());
            case 6:
                return new q((crd) ((sbp0) obj2).invoke(), ((obp0) obj).b.v);
            case 7:
                return new km0((a3e) ((y52) obj2).invoke(), (y2g0) ((vcp0) obj).invoke());
            case 8:
                xz11 xz11Var = (xz11) ((yap0) obj2).invoke();
                dma1 dma1Var = (dma1) ((cbp0) obj).invoke();
                we4 we4Var = new we4(false, xz11Var);
                s9e s9eVar = new s9e((byte) 0);
                boolean zA = we4Var.a();
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(t9e.a, zA);
                hma1VarEdit.g();
                return s9eVar;
            case 9:
                Context context = (Context) ((sbp0) obj2).invoke();
                t2j0 t2j0Var = (t2j0) ((sbp0) obj).invoke();
                hjg hjgVar = new hjg((byte) 0);
                gjg gjgVarO = ClientLanguageRaw.o();
                List listQ0 = ihc1.Q0(yoi1.A(context.getResources().getConfiguration()).a.a.toLanguageTags(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
                Iterator it = listQ0.iterator();
                while (it.hasNext()) {
                    arrayList.add(ihc1.e1((String) it.next()).toString());
                }
                gjgVarO.n(arrayList);
                gjgVarO.q(upn1.n(context));
                t2j0Var.a(gjgVarO.build());
                return hjgVar;
            case 10:
                gkp gkpVar = ((obp0) obj2).b.s3;
                d5n d5nVarB = ((rbp0) obj).b.b();
                vsg vsgVar = (vsg) gkpVar.a.B;
                c8o.l(vsgVar);
                return new w(vsgVar, (CmrBridge) d5nVarB.a().cmrBridge());
            case 11:
                return new w((ttz) ((tap0) obj2).invoke(), (q8n) ((abp0) obj).invoke());
            case 12:
                xz11 xz11VarJ = ((yap0) obj2).b.j();
                dma1 dma1Var2 = (dma1) ((cbp0) obj).invoke();
                ab4 ab4Var = new ab4(false, false, false, xz11VarJ);
                s9e s9eVar2 = new s9e((byte) 1);
                ab4Var.c();
                boolean zC = ab4Var.c();
                hma1 hma1VarEdit2 = dma1Var2.edit();
                hma1VarEdit2.a(hbl.a, zC);
                hma1VarEdit2.g();
                return s9eVar2;
            case 13:
                return new mwq((q8n) ((fdp0) obj).invoke(), ((ucp0) obj2).b.c);
            case 14:
                return new mtt((Context) ((xcp0) obj2).invoke(), (ax4) ((xcp0) obj).invoke());
            case 15:
                return new mc00((xb00) ((bbp0) obj2).invoke(), (t2j0) ((bbp0) obj).invoke());
            case 16:
                return new km0(((sap0) obj2).b.d(), (c3n0) ((sbp0) obj).invoke(), (byte) 11);
            case 17:
                return new km0((d48) ((sbp0) obj2).invoke(), (u38) ((ubp0) obj).invoke());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new i250((c3s) ((fdp0) obj2).invoke(), (n1u0) ((hbp0) obj).invoke());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                jb4 jb4Var = ((obp0) obj2).b.R2;
                au71 au71Var = ((obp0) obj).b.U2;
                s9e s9eVar3 = new s9e((byte) 3);
                String str = jb4Var.a().a;
                hma1 hma1VarEdit3 = au71Var.a.edit();
                hma1VarEdit3.d(q270.a, str);
                hma1VarEdit3.g();
                return s9eVar3;
            case 20:
                return new mtt((x84) ((ubp0) obj2).invoke(), ((obp0) obj).b.z1);
            case 21:
                return new ild0((Flowable) ((ccp0) obj2).invoke(), (uq4) ((ccp0) obj).invoke());
            case 22:
                return new thg0((glg) ((bbp0) obj2).invoke(), ((ry9) obj).b.K);
            case 23:
                return new g9r((zce0) ((xbp0) obj2).invoke(), ((rbp0) obj).b.h());
            case 24:
                return new km0((Context) ((xbp0) obj2).invoke(), ((sap0) obj).b.d(), (byte) 18);
            case 25:
                return new mg5(((yap0) obj2).b.f(), ((gbp0) obj).b.l);
            case 26:
                return new tiq0((q8n) ((bbp0) obj2).invoke(), ((ry9) obj).b.r);
            case 27:
                return new km0((Context) ((adp0) obj2).invoke(), (ax4) ((adp0) obj).invoke());
            case 28:
                return new km0((juq0) ((adp0) obj2).invoke(), (y2g0) ((adp0) obj).invoke());
            default:
                return new km0((i4s0) ((adp0) obj2).invoke(), (y2g0) ((adp0) obj).invoke());
        }
    }
}
